package com.company.Lab_2_1.task_5;

public class Main {

    public static void main(String[] args) {

        System.out.println(task5(456436));

        System.out.println(task8("asddsa"));
        System.out.println(task8("badab"));
        System.out.println(task8("aghgfh"));

        System.out.println(task13(123456789));

    }

    /*
    5. Сумма цифр числа
    Дано натуральное число N. Вычислите сумму его цифр.
    При решении этой задачи нельзя использовать строки, списки, массивы (ну и
    циклы, разумеется).
     */
    public static int task5(int x) {
        if (x != 0)
            return x % 10 + task5(x / 10);
        else
            return 0;
    }

    /*
    8. Палиндром
    Дано слово, состоящее только из строчных латинских букв. Проверьте, является
    ли это слово палиндромом. Выведите YES или NO.
    При решении этой задачи нельзя пользоваться циклами, в решениях на питоне
    нельзя использовать срезы с шагом, отличным от 1.
     */
    public static boolean task8(String a) {
        if (a.length() % 2 != 0)
            a = a.substring(0, a.length() / 2) + a.substring(a.length() / 2 + 1, a.length());
        if (a.isEmpty())
            return true;
        if (a.charAt(0) != a.charAt(a.length() - 1))
            return false;
        return task8(a.substring(1, a.length() - 1));
    }

    /*
    10. Разворот числа
    Дано число n, десятичная запись которого не содержит нулей. Получите число,
    записанное теми же цифрами, но в противоположном порядке.
    При решении этой задачи нельзя использовать циклы, строки, списки, массивы,
    разрешается только рекурсия и целочисленная арифметика.
    Фунция должна возвращать целое число, являющееся результатом работы
    программы, выводить число по одной цифре нельзя.
     */
    public static int task13(int x) {
        return task13Step(x, 0);
    }

    public static int task13Step(int x, int a) {
        if (x != 0)
            return task13Step(x / 10, 10 * a + x % 10);
        else
            return a;
    }
}
