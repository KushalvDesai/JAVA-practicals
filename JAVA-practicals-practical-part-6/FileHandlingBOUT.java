import java.io.*;
public class FileHandlingBOUT{
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("C:\\23CS019\\source.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s = "Kushal Desai";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success... ");
        }
        catch(Exception e){
            System.out.println("failed..."+e.getMessage());  
        }
    }
}