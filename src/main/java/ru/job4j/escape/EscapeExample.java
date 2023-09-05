package ru.job4j.escape;

/**
 * 14. Экранирование символов. Управляющие последовательности. [#504916 #376737]
 */
public class EscapeExample {
    public static void main(String[] args) {
        String str = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(str);
        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        String str1 = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(str1);
        String str2 = "C:\\projects\\job4j\\File.java";
        System.out.println(str2);
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print("Первая строка\nВторая строка");
        System.out.println();
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.println("Job4jjj\b\b");
    }
}
