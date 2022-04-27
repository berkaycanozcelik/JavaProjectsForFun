import java.util.Scanner;

public class llamas {
    public static void main(String[] args) {
        System.out.println("Welcome to the llamas population calculator!");

        int llamasEndPop;
        int llamasPop;
        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter llamas starting population: (min:9)");
            llamasPop = myObj.nextInt();
            if (llamasPop < 9)
                System.out.println("Lama size is less than 9");
            else
                System.out.println("Lama Start Population is: "+ llamasPop);
        } while (llamasPop < 9);

        do {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter llamas end population: (min: " + llamasPop + " )");
            llamasEndPop = myObj.nextInt();
            if (llamasEndPop < llamasPop)
                System.out.println("Lama size is less than llamas start pop. Start Pop is :" + (llamasPop));
            else
                System.out.println("Lama End Population is: "+ llamasEndPop);
        } while (llamasEndPop <= llamasPop);

        int years = 0;
         while(llamasPop < llamasEndPop){
             llamasPop = (llamasPop + (llamasPop / 3) - (llamasPop / 4));
             years++;
             System.out.println("after " + years + " year. Lama Pop size: " + llamasPop);
         }

        System.out.println("It takes " + years + " years");

    }
}
