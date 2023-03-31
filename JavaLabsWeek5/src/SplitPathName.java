public class SplitPathName {

    //components[0] == "/home/bill/work/"
    //components[1] == "weedfertilisers.pdf"
    //components[2] == "weedfertilisers"
    //components[3] == ".pdf"

    public static String findOptExt(String fileN) {

        String[] optExt = new String[2];
        String[] splitFile = fileN.split("\\.", -1);

        if (splitFile.length > 2 || splitFile.length == 1) {
            optExt[0] = null;
            optExt[1] = null;
            return null;
        } else {
            optExt[0] = splitFile[0];
            optExt[1] = splitFile[1];
        }

        return optExt[1];

    }

    public static String findBaseName(String fileN) {
        String base = null;
        int lastSlashIndex = fileN.lastIndexOf("/");
        int fullStopIndex = fileN.lastIndexOf("\\.");

        if (lastSlashIndex == -1) {
            if (fullStopIndex == -1) {
                return fileN;
            } else {
                return fileN.substring(0, fullStopIndex);
            }
        } else {
            if (fullStopIndex == -1) {
                return fileN.substring(lastSlashIndex+1);
            } else {
                return fileN.substring(lastSlashIndex+1, fullStopIndex);
            }
        }
    }

    public static String findDirectory(String fileN) {
        String directory = null;
        int lastSlashIndex = fileN.lastIndexOf("/");
        if (lastSlashIndex == -1) {
            directory = null;
            return directory;
        } else {
            directory = fileN.substring(0, lastSlashIndex + 1);
            return directory;
        }
    }

    public static String[] splitPath(String filename) {
        String[] allImpData = new String[4];
        String dir = allImpData[0] = findDirectory(filename);
        String base = allImpData[1] = findBaseName(filename);
        String ext = allImpData[2] = findOptExt(filename);
        return allImpData;
    }
    public static void main(String[] files) {

        for (String file : files) {

            // String baseWExt = allImpData[3] = base + findOptExt(file);

            System.out.printf("File: %s Type: .%s [%s]", splitPath(file)[1],
                    splitPath(file)[2], splitPath(file)[0]);

            System.out.println();
        }
    }
}


