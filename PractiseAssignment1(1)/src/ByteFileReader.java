import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteFileReader {

    public String readFileSpecificExtension(String pathToFolder, String requiredExtension) {
        StringBuilder fileData = new StringBuilder();
        try {
            File folder = new File(pathToFolder);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String extension = file.getName().split("\\.")[1];
                    if (extension.equalsIgnoreCase(requiredExtension)) {
                        fileData.append(readUsingByte(file.getAbsolutePath()));
                    }
                }
            }


        } catch (Exception e) {

            fileData.append("file not found");
        }

        System.out.println(fileData.toString());
        return fileData.toString();
    }


    public static String readUsingByte(String pathToFile) {

        String fileData = "";
        File fileObj = new File(pathToFile);
        FileInputStream fin = null;
        try {

            fin = new FileInputStream(fileObj);

            byte fileContent[] = new byte[(int) fileObj.length()];
            fin.read(fileContent);

            fileData = new String(fileContent);

        } catch (Exception e) {
        } finally {

            // close the streams using close method

            try {

                if (fin != null) {

                    fin.close();

                }

            } catch (IOException ioe) {

                System.out.println("Error while closing stream: " + ioe);

            }


        }
        return fileData;

    }

    public static void main(String[] args) {

        ByteFileReader f = new ByteFileReader();
        f.readFileSpecificExtension("filesFolder", "txt");

    }


}
