package pl.poradniausmiech.dao;

import pl.poradniausmiech.Utils.UserImageNotFoundException;

import javax.servlet.http.Part;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public interface ImageUpload {

    String getUploadImageFilesPath() throws IOException;

    File uploadImageFile(Part file) throws IOException, UserImageNotFoundException;

    BufferedImage resize(BufferedImage img, int height, int width);

}
