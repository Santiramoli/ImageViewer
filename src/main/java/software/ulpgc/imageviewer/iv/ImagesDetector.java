package software.ulpgc.imageviewer.iv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImagesDetector {
    public List<String> getPaths(File directory, String image) {
        List<String> otrasImagenes = new ArrayList<>();
        if (directory != null && directory.isDirectory()) {
            File[] archivos = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png"));
            if (archivos != null && archivos.length > 1) {
                for (File archivo : archivos) {
                    if (!archivo.getAbsolutePath().equals(image)) {
                        otrasImagenes.add(archivo.getAbsolutePath());
                    }
                }
            }
        }
        return otrasImagenes;
    }
}