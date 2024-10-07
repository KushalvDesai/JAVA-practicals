import java.io.*;
public class FileHandlingIN{
    public static void main(String[] args) {
        try{
            int i = 0;
            FileInputStream fin = new FileInputStream("C:\\23CS019\\source.txt");
            while((i = fin.read()) != -1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch(Exception e){}
    }
}