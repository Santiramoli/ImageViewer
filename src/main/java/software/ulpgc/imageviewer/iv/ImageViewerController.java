package software.ulpgc.imageviewer.iv;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ImageViewerController implements Initializable {

    int i = 0;
    private List<String> dir_images;
    @FXML
    private ImageView viewer;


    public void leftAction(){
        if(dir_images != null && dir_images.size() > 1){
            if(i == 0){
                i = dir_images.size()-1;
                loadAndDisplayImage(dir_images.get(i));
            }else{
                loadAndDisplayImage(dir_images.get(i-1));
                i-=1;
            }
        }
    }

    public void rightAction(){
        if(dir_images != null && dir_images.size() > 1){
            if(i == dir_images.size()-1){
                i = 0;
                loadAndDisplayImage(dir_images.get(i));
            }else{
                loadAndDisplayImage(dir_images.get(i+1));
                i += 1;
            }
        }
    }
    public void ChooserAction(){
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        if(selectedFile != null){
            String image = selectedFile.getAbsolutePath();
            loadAndDisplayImage(image);
            ImagesDetector imagesDetector = new ImagesDetector();
            dir_images = imagesDetector.getPaths(selectedFile.getParentFile(), image);
            dir_images.add(image);
            i = dir_images.size()-1;
        }
    }
    private void loadAndDisplayImage(String image) {
        File file = new File(image);
        Image img = new Image(file.toURI().toString());
        viewer.setImage(img);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
