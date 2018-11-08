package Lesson2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File {

    private final String filePath;

    public File(String path) {
        this.filePath = path;
    }

    public String readToString() {
        try {
            InputStream inputStream = new FileInputStream(this.filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String content = "";
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            return content;

        } catch (Exception e) {
            System.out.print("读取文件失败");
            return "";
        }
    }

}
