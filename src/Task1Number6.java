import java.io.*;
public class Task1Number6 {
    public static void main(String[] args) {
        try{
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input number: ");
            int num = Integer.parseInt(r.readLine());
            System.out.println("Even numbers:");
            for (int i=1;i <=num ; i++){
                if(i%2==0 ){
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }catch(IOException e){
            System.out.println("IO Error");
        }catch(NumberFormatException e){
            System.out.println("Wrong number");
        }finally{
            System.out.println("");
        }
    }
}


