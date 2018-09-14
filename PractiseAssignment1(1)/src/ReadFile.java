import java.io.*;

public class ReadFile {

    public String readFile(String pathToFile) {

        // We need to provide file path as the parameter:
        // double backquote is to avoid compiler interpret words
        // like \test as \t (ie. as a escape sequence)
        File file = new File(pathToFile);
        StringBuilder fileData = new StringBuilder("");
        try {
            fileData.append(file.length() + "\n");
            BufferedReader br = null;

            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {

                fileData.append(st.toUpperCase());

            }
        } catch (FileNotFoundException e) {

            return fileData.append(e.getCause()).toString();


        } catch (IOException e) {

            return fileData.append(e.getCause()).toString();
        }
        return fileData.toString();

    }


}







