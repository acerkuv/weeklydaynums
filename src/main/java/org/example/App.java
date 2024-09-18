package org.example;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.println("Введите номер дня недели");
        int dayNum = scanner.nextInt();
        out.println(checkDayNum(dayNum));
    }

    public static String checkDayNum(int d) {
        if (d == 1) return "Понедельник";
        else if (d == 2) {
            return "Вторник";
        } else if (d == 3) {
            return "Среда";
        } else if (d == 4) {
            return "Четверг";
        } else if (d == 5) {
            return  "Пятница";
        } else if (d == 6) {
            return "Суббота";
        } else if (d == 7) {
            return "Воскресенье";
        }
        else return "Неправильный день недели";


    }
}


