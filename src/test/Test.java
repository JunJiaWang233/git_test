package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            String s= scanner.nextLine();
            if (s.matches("[0-9]{0,9}a"))
                System.out.println(s);
        }

    }
}
