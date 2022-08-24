import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n;
        n = in.nextInt();
        int[] array = new int[n];
        showMenu(array);
    }

    public  static  void showMenu(int[] array)
    {
        int choice = 0;

        while (choice != 4)
        {
            System.out.println();
            System.out.println("Выберите пункт из меню: ");
            System.out.println("1 - заполнить массив ");
            System.out.println("2 - использовать пузырьковую сортировку ");
            System.out.println("3 - показать массив ");
            System.out.println("4 - выйти");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    fillArray(array);
                    break;
                case 2:
                    useBubbleSort(array);
                    break;
                case 3:
                    showArray(array);
                    break;
                case 4:
                    break;
            }
        }
    }


    public static void fillArray(int[] array)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения массива");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print((i + 1) + " - ");
            array[i] = in.nextInt();
        }
        useBubbleSort(array);
    }

    public static void useBubbleSort(int[] array)
    {
        int a;
        for (int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                if (array[j] > array[j + 1]) {
                    a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }
    }

    public static void showArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("[" + (i + 1) + "]" + " - " + array[i]);
        }
    }
}