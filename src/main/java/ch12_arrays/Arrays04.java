package ch12_arrays;

import java.util.Scanner;

public class Arrays04 {

    public void writeNames(String[] names) {
        Scanner scanner = new Scanner(System.in); //지역변수
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + "번 학생 : ");
            names[i] = scanner.nextLine();

        }

    }

    public void printNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
            }
        }


        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            Arrays04 arrays04 = new Arrays04();

            System.out.println("몇명의 학생을 입력하시겠습니까?");
            int indexNum = scanner.nextInt();

            scanner.nextLine();
            String[] names = new String[indexNum];


            arrays04.writeNames(names);
            arrays04.writeNames(names);


        }
    }

