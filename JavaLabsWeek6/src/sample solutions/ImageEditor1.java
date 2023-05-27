import java.awt.Color;

public class ImageEditor1 {

    public static double luminance(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return 0.299 * r + 0.587 * g + 0.114 * b;
    }

    public static Color toGrey(Color color) {
        int y = (int) (Math.round(luminance(color)));
        return new Color(y, y, y);
    }

    public static Picture makeGreyscale(Picture p) {
        Picture pic = new Picture(p.width(), p.height());
        for (int i = 0; i < p.width(); i++) {
            for (int j = 0; j < p.height(); j++) {
                Color grey = toGrey(p.get(i, j));
                pic.set(i, j, grey);
            }
        }
        return pic;
    }

    public static void main(String[] args) {
        Picture p = new Picture("lion2.jpg");
        p.show();

        Picture greyscale = makeGreyscale(p);
        greyscale.show();
    }

}