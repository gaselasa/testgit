/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1project;

/**
 *
 * @author gasela
 */
import java.util.ArrayList;
import java.util.List;

public class Level1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //List k={1,5};
        List k = new ArrayList<>();
        k.add(4);
        k.add(5);
        k.add(78);
        k.add(9);
        k.add(8);
        List o = new ArrayList<>();
        o.add(2);
        o.add(8);
        o.add(95);
        o.add(7);
        o.add(95);
        o.add(7);
        //[4,5,78,9,8] [2,8,95,7]

        combineList(k, o);

        System.out.println("===================Task 1 ==================");
        sumOfNumbers();
        System.out.println("===================Task 2 ==================");
        System.out.println("This two 73,5 number contains 3 " + checkNumberContain_3(73, 5));

        System.out.println("===================Task 3 ==================");
        System.out.println("check  two 73,5 number have  65 " + checkNumberContain_65(73, 56));

        System.out.println("===================Task 4 ==================");
        square(6);
        System.out.println("===================Task 5 ==================");
        triangle(-6);
        System.out.println("===================Task 6 ==================");
        String[] listWord = {"sanele", "gaselaghg", "horse", "chickens"};
        longest(listWord);
    }


   private  static void sumOfNumbers() {

        int sum = 0;
        for (int j = 1; j < 1000; j++) {
            if (j % 3 == 0 || j % 5 == 0) {
                sum = sum + j;
            }

        }
        System.out.println("The sum of natural numbers<1000 " + sum);

    }
  private   static boolean checkNumberContain_3(int num1, int num2) {
        int number = 0;

        int sum = num1 + num2;

        while (sum > 0) {

            number = sum % 10;

            if (num1 == 3 || num2 == 3 && number == 3) {
                return true;
            }

            sum = sum / 10;

        }

        return false;

    }


   private  static boolean checkNumberContain_65(int n1, int n2) {

        int sum = n1 + n2;

        if (n1 == 65 || n2 == 65 && sum == 65) {
            return true;
        }

        return false;

    }


   private  static void square(int sides) {

        for (int j = 0; j < sides; j++) {
            for (int i = 0; i < sides; i++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }

   private  static void triangle(int number) {

        if (number > 0) {
            for (int i = 0; i < number; i++) {

                for (int j = 0; j <= i; j++) {
                    System.out.print("#" + " ");
                }

                System.out.println();
            }

        } else {

            for (int j = number; j < 0; j++) {

                for (int i = j; i < 0; i++) {
                    System.out.print("#" + " ");
                }

                System.out.println();
            }

        }

    }

    private static void longest(String[] listWords) {

        int lengthWord = listWords[0].length();

        for (int i = 1; i < listWords.length; i++) {

            if (listWords[i].length() > lengthWord) {
                lengthWord = listWords[i].length();
            }

        }

        System.out.println(lengthWord);

        for (int i = 0; i < listWords.length; i++) {

            if (listWords[i].length() == lengthWord) {
                System.out.println(listWords[i]);
            }

        }

    }

   private  static void combineList(List firstList, List secontList) {

        List newArray = new ArrayList();

        int pos = 0;

        int index = 0;

        do {

            if (index < firstList.size()) {
                newArray.add(pos, firstList.get(index));
            }

            if (index < secontList.size()) {
                newArray.add(pos + 1, secontList.get(index));
            }

            pos += 2;

            index++;

        } while (index < firstList.size() && index < secontList.size());

        System.out.println(newArray);

    }
    

}
