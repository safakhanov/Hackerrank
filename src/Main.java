import java.util.Scanner;

public class Main {
        static Scanner sc = new Scanner(System.in);
        public static void stdin_stdout(){


//        String st = sc.next();
//        int a=sc.nextInt();
//        System.out.println("myString is: "+ st);
//        System.out.println("myInt is: " + a);

    }
    public static void ifElse(){
            int k =sc.nextInt();
            if(k%2==1||(6<k&&k<20)){
                System.out.println("weird");

            }
            else if(k>=2&&k<=5||k>20){
                System.out.println("not weird");
            }

    }
    public static void main(String[] args) {
//        stdin_stdout();
        ifElse();

    }
}
