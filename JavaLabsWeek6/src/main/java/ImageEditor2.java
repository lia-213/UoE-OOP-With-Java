import java.awt.*;

public class ImageEditor2 {

    public static Picture threshold(Picture p, int thresh) {
        int width = p.width();
        int height = p.height();
        Picture threshedPic = new Picture(width, height);
        Color black = new Color(0);


        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color pixel = p.get(i, j);
                if (ImageEditor1.luminance(p.get(i, j)) < thresh) {
                    threshedPic.set(i, j, black);
                } else {
                    threshedPic.set(i, j, ImageEditor1.toGrey(pixel));
                }
            }
        }
        return threshedPic;
    }
}
