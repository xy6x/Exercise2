import javax.net.ssl.SNIHostName;
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
       // System.out.println("Please write your role in the company ");
       // String position = s.next();
//        if(position.equalsIgnoreCase("boss")){
//            System.out.println( "welcome admin");
//        } else if (position.equalsIgnoreCase("president")) {
//            System.out.println("welcome superuser");
//
//        }else System.out.println("welcome user");
        // 2
//        System.out.println("Please first numbers ");
//        int first =s.nextInt();
//        System.out.println("Please second numbers ");
//        int second =s.nextInt();
//        System.out.println("Please third numbers ");
//        int third =s.nextInt();
//        if (first>second){
//            System.out.println(first);
//        } else if (second>third) {
//            System.out.println(second);
//
//        }else System.out.println(third);
        //3

//        Random rand = new Random();
//        int rand_int1 = rand.nextInt(7);
//        if (rand_int1==1){
//            System.out.println(" Today is  Saturday");
//        }else if(rand_int1==2){
//            System.out.println(" Today is Sunday");
//        }else if(rand_int1==3){
//            System.out.println("Today is Monday");
//        }else if(rand_int1==4){
//            System.out.println("  Today is Tuesday");
//        }else if(rand_int1==5){
//            System.out.println(" Today is Wednesday");
//        }else if(rand_int1==6){
//            System.out.println(" Today is Thursday");
//        }
//        else  System.out.println(" Today is Friday");
        //4

//        System.out.println("Please enter  greed");
//        double greed = s.nextDouble();
//        if(greed<=100&&greed>=90){
//            System.out.println('A');
//        }else if(greed<=89&&greed>=80) {
//            System.out.println('B');
//        }
//        else if(greed<=79&&greed>=70) {
//            System.out.println('C');
//        }
//        else if(greed<=69&&greed>=60) {
//            System.out.println('D');
//        }
//        else System.out.println('F');

        ///5
        System.out.println("Please enter  age");
        double age = s.nextDouble();
        if(age>=20){
            System.out.println("You are an Adult");
        }else if(age<=19&&age>=13) {
            System.out.println("You are an Teenager");
        }
        else System.out.println("You are an Child");

    }
}
