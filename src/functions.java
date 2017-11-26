import java.util.Random;
import java.util.Scanner;

public class functions
{
    /*
        3. Составить функцию, которая рисует линию из символа symb, длиной count.
    */
    public static void symbol (int n)
    {
        char symb = '%';

        for (int i = 0; i < n; i++)
        {
            System.out.print(symb);
        }
    }
    /*
        4. Составить функцию, которая спросит число и степень, в которую необходимо необходимо возвести число.
    */
    public static int degree(int num, int deg)
    {
        int result = 1;

        for (int i = 0; i<deg; i++)
        {
            result *= num;
        }
        return result;
    }
    /*
        5. Составить функцию, которая определяет наибольший общий делитель двух натуральных чисел и привести пример использования.
    */
    public static int algOfEuclid (int a, int b)
    {
        while (a != 0 && b != 0)
        {
            if (a > b)
            {
                a %= b;
            } else
            {
                b %= a;
            }
        }
        return (a + b);
    }
    /*
        6. Составить функцию, которая определяет, верно ли, что сумма его цифр - четное число.
    */
    public static boolean isEven (int num)
    {
        int sum = 0;

        while (num != 0)
        {
            sum += num % 10;
            num /= 10;
        }

        if (sum % 2 == 0)
        {
            System.out.println("Число четное");
            return true;
        } else
        {
            System.out.println("Число не является четным");
            return false;
        }
    }
    /*
        7. Составить функцию, которая определяет, верно ли, что в заданном числе все цифры стоят по возрастанию.
    */
    public static boolean isGrowing(int num)
    {
        int max = (num/10) % 10;

        while (num != 0 && max != 0)
        {
            if (max < num % 10)
            {
                num /= 10;
                max = (num/10) % 10;
                continue;
            } else
            {
                System.out.println("Цифры HE стоят по возрастанию");
                return false;
            }
        }
        System.out.println("Цифры стоят по возрастанию");
        return true;
    }
    /*
        8. Написать программу с функциями для подсчета среднего арифметического массива для различных типов данных (int, float).
    */
    public static int average (int [] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        int avg = sum / arr.length;

        return avg;
    }
    public static float average (float [] arr)
    {
        float sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        float  avg = sum / arr.length;

        return avg;
    }
    /*
        9. Написать программу с функциями для подсчета суммы квадратов двух чисел для различных типов данных (int, float).
    */
    public static int summa (int a, int b)
    {
        return (a * a + b * b);
    }
    public static float summa (float a, float b)
    {
        return (a * a + b * b);
    }
    public static float summa (int a, float b)
    {
        return (a* a + b * b);
    }
    public static float summa (float a, int b)
    {
        return (a * a + b * b);
    }
    /*
        10*. Заполнить массив из 10 элементов случайными НЕповторяющимися числами.
                **Сгенерировать случайное число, выполнить проверку всех предыдущих элементов.
                  Если уже есть такое значение - генерировать новое значение для текущего элемента массива.
    */
    public static void noRepetition (int k, int [] arr) {
        Random r = new Random();

        int min = 0,
            max = 20;
        arr[k] = r.nextInt((max - min) + 1) + min;

        int last = k,
            prev = k - 1;
        for (; last > 0 && prev >= 0; prev--)
        {
            if (arr[last] == arr[prev])
            {
                noRepetition(last, arr);
            }
        }
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random  random = new Random();
        /*
        3. Составить функцию, которая рисует линию из символа symb, длиной count.
        */
        System.out.print("Введите количество символов %, которое необходимо вывести: ");
            int count = s.nextInt();
            symbol(count);
        System.out.println();
        /*
            4. Составить функцию, которая спросит число и степень, в которую необходимо необходимо возвести число.
        */
        System.out.println("\n\tВозведение числа в заданную степень");
        System.out.println("Введите число для возведения в степень: ");
            int num = s.nextInt();
        System.out.println("Введите степень: ");
            int degree_of_num = s.nextInt();
        System.out.println("Число " + num + " в степени " + degree_of_num + " = " + degree(num,degree_of_num));
        System.out.println();
        /*
            5. Составить функцию, которая определяет наибольший общий делитель двух натуральных чисел и привести пример использования.
        */
        System.out.println("\n\tПоиск НОД");
        System.out.println("Введите первое число: ");
            int a = s.nextInt();
        System.out.println("Введите второе число: ");
            int b = s.nextInt();
        System.out.println("Наибольший общий делитель (НОД) чисел " + a + " и " + b + " : " + algOfEuclid(a,b));
        System.out.println();
        /*
            6. Составить функцию, которая определяет, верно ли, что сумма его цифр - четное число.
        */
        System.out.println("\n\tПроверка суммы цифр чисел на четность");
        System.out.println("Введите число: ");
            num = s.nextInt();
        isEven(num);
        /*
            7. Составить функцию, которая определяет, верно ли, что в заданном числе все цифры стоят по возрастанию.
        */
        System.out.println("\n\tПроверка, стоят ли цифры числа по возрастанию");
        System.out.println("Введите число: ");
            num = s.nextInt();
        isGrowing(num);
        /*
            8. Написать программу с функциями для подсчета среднего арифметического массива для различных типов данных (int, float).
        */
        System.out.println("\n\tПодсчет среднего арифметического массива для различных типов данных (int, float)");

        int [] x = {1,2,54,678,213,12,167};

        System.out.println("Массив типа int:");

            for (int i = 0; i < x.length; i++)
            {
                System.out.print(x[i] + " ");
            }
        System.out.println();

            float [] y = {45.3F, 116.7F, 23.2F, 118.24F, 56.6F, 83.27F, 12.2F};
        System.out.println("Массив типа float:");

            for (int i = 0; i < y.length; i++)
            {
                System.out.print(y[i] + " ");
            }
        System.out.println();

        System.out.println("Среднее арифметическое чисел массива типа int: " + average(x));
        System.out.println("Среднее арифметическое чисел массива типа float: " + average(y));
        /*
            9. Написать программу с функциями для подсчета суммы квадратов двух чисел для различных типов данных (int, float).
        */
        System.out.println("\n\tПодсчет суммы квадратов двух чисел для различных типов данных (int, float)");
        System.out.println("Введите целое число: ");
            int num1 = s.nextInt();
        System.out.println("Введите число с плавающей точкой (например, 3,14): ");
            float num2 = s.nextFloat();

        System.out.println("Сумма квадратов чисел " + num1 + " и " + num1 + " = " + summa(num1,num1));
        System.out.println("Сумма квадратов чисел " + num2 + " и " + num2 + " = " + summa(num2,num2));
        System.out.println("Сумма квадратов чисел " + num1 + " и " + num2 + " = " + summa(num1,num2));
        System.out.println("Сумма квадратов чисел " + num2 + " и " + num1 + " = " + summa(num2,num1));
        /*
            10*. Заполнить массив случайными НЕповторяющимися числами.
                 **Сгенерировать случайное число, выполнить проверку всех предыдущих элементов.
                    Если уже есть такое значение - генерировать новое значение для текущего элемента массива.
        */
        System.out.println("\n\tЗаполнение массива случайными НЕповторяющимися числами");
        System.out.println("Введите размер массива: ");
            int size = s.nextInt();
            int [] array = new int [size];
                for (int i = 0; i < size; i++)
                {
                    noRepetition(i, array);
                    System.out.print(array[i] + " ");
                }
    }
}
