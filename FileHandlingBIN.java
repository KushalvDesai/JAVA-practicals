import java.io.*;
public class FileHandlingBIN{
    public static void main(String[] args) {
        try{
            int i = 0;
            FileInputStream fin = new FileInputStream("C:\\23CS019\\source.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            while((i = bin.read()) != -1){
                System.out.print((char)i);
            }
            bin.close();
        }
        catch(Exception e){}
    }
}