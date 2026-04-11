
import java.io.*;

public class bufferedReader {


    //	bufferedReader
    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(
//                new FileReader("C:\\Users\\rishabh yadav\\eclipse-workspace\\CoreJava\\basic.txt"))) {
//
//            String lineString;
//            while ((lineString = br.readLine()) != null) {
//                System.out.println(lineString);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//    	buffered Writer
        FileWriter fw = new FileWriter("C:\\Users\\rishabh yadav\\eclipse-workspace\\CoreJava\\basic.txt");

        BufferedWriter bw =new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("Rishabh");

        System.out.println("Data Write Succ");

        bw.close();




    }
}