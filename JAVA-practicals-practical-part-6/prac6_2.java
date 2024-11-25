import java.io.*;
public class prac6_2{
    public static void main(String[] args) {
        char cmp = args[0].charAt(0);
        for(int i=0; i<args.length; i++){
            int count = 0;
            try{
                BufferedReader reader = new BufferedReader(new FileReader("C:\\23CS019\\source.txt"));
                while(reader.read() != -1){
                    if(reader.read() == cmp){
                        count++;
                    }
                }
                reader.close();
                System.out.println("file has "+count+" repititions of character "+cmp);
            }catch(Exception e){}
        }
    }
}
