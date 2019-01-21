package pl.poradniausmiech.dao;

import pl.poradniausmiech.Utils.UserImageNotFoundException;
import pl.poradniausmiech.Utils.UserImageNotFoundException;

import javax.enterprise.context.RequestScoped;
import javax.servlet.http.Part;
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
    public File uploadImageFile(Part filePart) throws IOException, UserImageNotFoundException {
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

        if (fileName == null || fileName.isEmpty()) {
            throw new UserImageNotFoundException("No user image has been uploaded");
        }

        File file = new File(getUploadImageFilesPath() + fileName);
        InputStream fileContent = filePart.getInputStream();

        Files.copy(fileContent, file.toPath());

        return file;
    }

    @Override
    public String getUploadImageFilesPath() throws IOException {
        Properties settings = new Properties();
        try (InputStream is = this.getClass().getResourceAsStream(SETTINGS_FILE)) {
            settings.load(is);
            return settings.getProperty("uploadsPath");
        }
    }
}
