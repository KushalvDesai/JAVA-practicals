import java.io.*;
public class prac6_1{
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            int count = 0;
            try{
                BufferedReader reader = new BufferedReader(new FileReader(args[i]));
                while(reader.readLine() != null){
                    count++;
                }
                reader.close();
                System.out.println(args[i]+" has "+count+" lines");
            }catch(Exception e){}
        }
    }
}