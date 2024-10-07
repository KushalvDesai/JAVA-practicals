import java.io.*;
public class FileHandlingOUT {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\23CS019\\source.txt");
            String s = "Kushal Desai";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success... ");
        }
        catch(Exception e){
            System.out.println("failed..."+e.getMessage());
        }
    }
}
