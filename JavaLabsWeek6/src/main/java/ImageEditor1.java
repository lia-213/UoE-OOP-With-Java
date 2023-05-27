import java.awt.*;

public class ImageEditor1 {
    public static double luminance(Color color) {
        int red = color.getRed(), green = color.getGreen(), blue = color.getBlue();
        return 0.299*red + 0.587*green + 0.114*blue;
    }

    public static Color toGrey(Color color) {
        int y = (int) Math.round(luminance(color));
        return new Color(y,y,y);
    }

    public static Picture makeGreyscale(Picture pic) {
        int width = pic.width();
        int height = pic.height();
        Picture greyedPic = new Picture(width, height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                greyedPic.set(i, j, toGrey(pic.get(i, j)));
            }
        }

        return greyedPic;
    }

    public static void main(String[] args) {
        Picture p = new Picture("lion2.jpg"); // or use any other colour image
        Picture greyscale = makeGreyscale(p);
        greyscale.show();
    }
}
