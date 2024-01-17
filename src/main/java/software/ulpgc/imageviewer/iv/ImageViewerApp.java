package software.ulpgc.imageviewer.iv;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageViewerApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(ImageViewerApp.class.getResource("ImageViewerUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ImageViewer");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }

}
