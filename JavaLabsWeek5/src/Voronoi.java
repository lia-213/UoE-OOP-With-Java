import java.awt.Color;

public class Voronoi {
    public static double pointDist(Point2D point1, Point2D point2) {
        double distance =
                Math.sqrt(Math.pow((point1.getX()-point2.getX()),2) + Math.pow((point1.getY()-point2.getY()),2));
        return distance;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        double smallestDist = pointDist(point, sites[0]);
        int closestSiteIndex = 0;
        for (int siteClosestToPoint = 0; siteClosestToPoint < sites.length; siteClosestToPoint++) {
            double siteToPoint = pointDist(point, sites[siteClosestToPoint]);
            if (siteToPoint < smallestDist) {
                smallestDist = siteToPoint;
                closestSiteIndex = siteClosestToPoint;
            }
        }

        System.out.printf("The smallest distance between the given point (%d," +
                        " %d) and a site is (%.3f) and the index of the site " +
                        "is %d", point.getX(), point.getY(), smallestDist,
                closestSiteIndex);

        return closestSiteIndex;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] voronoiMap = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Point2D pointToCheck = new Point2D(i, j);
                voronoiMap[i][j] = findClosestPoint(pointToCheck, sites);
            }
        }
        return voronoiMap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int index = indexMap[i][j];
                StdDraw.setPenColor(colors[index]);
                StdDraw.point(i, j);

            }

        }

        for (int i = 0; i < sites.length; i++) {
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledCircle(sites[i].getX(), sites[i].getY(), 3);
        }

        StdDraw.show();

    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;

        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        /* CHECKING findClosestPoint

        Point2D checkSite = new Point2D(52, 90);
        findClosestPoint(checkSite, sites);*/

         int[][] indexmap = buildVoronoiMap(sites, width, height);
         plotVoronoiMap(sites, colors, indexmap);

    }
}
