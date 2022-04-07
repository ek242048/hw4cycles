package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
       int i = 0;
       while (i<=10) {
           System.out.print(i++ + " ");
       }
        System.out.println("\n");
       for (int f = 10; f >= 0; f--) {
           System.out.print(f + " ");
       }
        System.out.print("\n");

    //Задание 2
       int friday = 4;
       for (; friday <= 31; friday = friday + 7  ) {
           System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
       }

    //Задание 3
       int y = 0;
       for (y = 0; y <= 2122; y = y + 79 ) {
           if (y >= 1822) {
               System.out.println("Комета видна на небе в " + y + "году");
           }
       }


    }

}
