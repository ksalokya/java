import java.util.Scanner;

class NegativeException extends Exception{
    int x;
    NegativeException(int x){
        this.x = x;
    }
    public String toString(){
        return "NegativeException("+x+")";
    }
}

public class exceptionBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        
        // try catch block
        try {
            System.out.println(10/x);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.err.println(e.toString());
            System.out.println(e);
        }
        finally{
            System.out.println("Final block");
        }

        // throw statement
        if(x == 0){
            throw new ArithmeticException("Not Valid");
        }
        else{
            System.out.println(x);
        }

        // custom exception
        try{
            if( x < 0){
                throw new NegativeException(x);
            }
        }
        catch(NegativeException e){
            System.out.println("Caught : "+e);
        }
    }
}