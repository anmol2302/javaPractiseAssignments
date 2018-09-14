import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public void readFile(String pathToFile) {
        HashMap<String, Integer> charOccurence = new HashMap<>();
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

                String[] sepWords = st.split(" ");

                for (int i = 0; i < sepWords.length; i++) {
                    if (!(sepWords[i].equalsIgnoreCase(",") || sepWords[i].equalsIgnoreCase("."))) {

                        if (charOccurence.containsKey(sepWords[i])) {
                            charOccurence.put(sepWords[i], charOccurence.get(sepWords[i]) + 1);

                        } else {

                            charOccurence.put(sepWords[i], 1);
                        }

                    }
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
        }
        for (Map.Entry<String, Integer> mp : charOccurence.entrySet()) {
            System.out.println(mp.getKey() + "- " + mp.getValue());
        }
    }

    public static void main(String[] args) {
        CharacterFrequency m = new CharacterFrequency();
        m.readFile("filedemo.txt");
    }
}
