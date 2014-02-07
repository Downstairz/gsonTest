import com.google.gson.Gson;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Main theMainDude = new Main();
        theMainDude.deserializeJson();
    }

    private Downstairz  deserializeJson() {
        System.out.println("Hello World!");
        String downstairzJson = getTestJson();
        Gson gson = new Gson();
        Downstairz downstairz = gson.fromJson(downstairzJson, Downstairz.class);
        System.out.println(downstairz.toString());

        return downstairz;
    }

    private String getTestJson() {
        FileInputStream fileInputStream;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("/Users/buddha/Documents/workspace/gsonTest/src/main/java/downstairz.json"));
            String line;

            try {
                while ((line = reader.readLine()) != null) {
                    stringBuffer.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return stringBuffer.toString();
    }
}
