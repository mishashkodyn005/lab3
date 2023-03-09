/*

// Завдання 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 25 && n < 100){
            System.out.printf("Число %d міститься в проміжку (25; 100)", n);
        }else{
            System.out.printf("Число %d не міститься в проміжку (25; 100)", n);
        }
    }
}

 */

/*

// Завдання 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0;
        if (n % 10 > max) max = n % 10;
        if (n / 10 % 10 > max) max = n / 10 % 10;
        if (n / 100 % 10 > max) max = n / 100 % 10;
        System.out.println(max);
    }
}
*/

/*

// Завдання 3
public class Main {
    public static void main(String[] args) {
        String dir = "До низу";
        int a = 9;
        if (dir.equals("До верху")){
            if (a == 2 || a == 3) System.out.println("Ви піднялись на 3 поверх");
            else if (a <= 9 && a > 0) System.out.printf("Ви піднялись на %d поверх", a);
            else System.out.println("Ви вказали неіснуючий поверх!");
        }
        if (dir.equals("До низу")){
            if (a == 2 || a == 1) System.out.println("Ви спустились на 1 поверх");
            else if (a <= 9 && a > 0) System.out.printf("Ви спустились на %d поверх", a);
            else System.out.println("Ви вказали неіснуючий поверх!");
        }

    }
}
 */


/*

// Завдання 4
public class Main {
    public static void main(String[] args){
        String option = "-";
        switch (option){
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляють!");
        }
    }
}

 */

/*

// Завдання 5
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int num;
        if (a > b) {
            num = b;
            b = a;
            a = num;
        }
        if (b > c) {
            num = c;
            c = b;
            b = num;
            if (a > b) {
                num = b;
                b = a;
                a = num;
            }
        }
        System.out.printf("%d %d %d", a, b, c);

    }
}

 */


/*

// Завдання 6
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n / 3660 == 0){
            System.out.println("До кінця робочого дня залишилось менше 1 годин");
        }else{
            System.out.printf("До кінця робочого дня залишилось %d години", n / 3600);
        }
    }
}

 */
