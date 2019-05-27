package pl.poradniausmiech.dao;

import pl.poradniausmiech.Utils.UserImageNotFoundException;
import pl.poradniausmiech.Utils.UserImageNotFoundException;

import javax.enterprise.context.RequestScoped;
import javax.imageio.ImageIO;
import javax.servlet.http.Part;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

@RequestScoped
public class ImageUploadBean implements ImageUpload {

    private static final String SETTINGS_FILE = "/imageSettings.properties";

    @Override
    public String getUploadImageFilesPath() throws IOException {
        Properties settings = new Properties();
        try (InputStream is = this.getClass().getResourceAsStream(SETTINGS_FILE)) {
            settings.load(is);
            return settings.getProperty("uploadsPath");
        }
    }

    @Override
    public File uploadImageFile(Part filePart) throws IOException, UserImageNotFoundException {
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        if (fileName == null || fileName.isEmpty()) {
            throw new UserImageNotFoundException("No user image has been uploaded");
        }

        File file = new File(getUploadImageFilesPath() + fileName);
        InputStream originalFileContent = filePart.getInputStream();


        Files.copy(originalFileContent, file.toPath());

        // save picture with height 250
        File input = new File(getUploadImageFilesPath() + fileName);
        File input2 = new File(getUploadImageFilesPath() + fileName);
        File input3 = new File(getUploadImageFilesPath() + fileName);
        BufferedImage image = ImageIO.read(input);
        BufferedImage image2 = ImageIO.read(input2);

        double widthFitForHeight250 = ((250) * ((double) image.getWidth() / (double) image.getHeight()));
        double heightFitForWidth450 = ((450) * ((double) image.getHeight() / (double) image.getWidth()));

        BufferedImage resized = resize(image, 250, (int) widthFitForHeight250);
        BufferedImage resized2 = resize(image2, (int) heightFitForWidth450, 450);

        File output = new File(getUploadImageFilesPath() + "250_height_" + fileName);
        File output2 = new File(getUploadImageFilesPath() + "450_width_" + fileName);

        ImageIO.write(resized, "jpg", output);
        ImageIO.write(resized2, "jpg", output2);

        return file;
    }

    @Override
    public BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.SCALE_REPLICATE);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }


}
