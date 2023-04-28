package tw.org.iii.tutor;

import java.io.BufferedReader;
import java.io.FileReader;

public class Practice {

    public static void main(String[] args) {
        // 讀資料
        try {
            FileReader fr = new FileReader("dir1/fstdata.csv");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                System.out.println(row[1] + ":" + row[5] + ":" + row[7]);
                // (陣列第1個資料+陣列第5個資料+陣列第7個資料)
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
