package pl.poradniausmiech.dao;
import pl.poradniausmiech.Utils.UserImageNotFoundException;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

public interface ImageUpload {
    File uploadImageFile(Part file) throws IOException, UserImageNotFoundException;

    String getUploadImageFilesPath() throws IOException;

}
