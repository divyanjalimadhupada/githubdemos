import java.util.Scanner;

    
public class one {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
                System.out.println("enter a num");
                int i=scan.nextInt();
                           
                        
                        
    
    if(i%3==0 && i%5==0){
        System.out.println("FizzBuzz");
    }
    if(i%3==0 && i%5!=0){
        System.out.println("Fizz");
    }
    if(i%3!=0 && i%5==0){
        System.out.println("Buzz");
    }if(i%3!=0 && i%5!=0){
        System.out.println(+i);
    }
    
    
}
}




