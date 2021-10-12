public class LessonTwo {
    public static void main(String[] args)
    {
        System.out.println("Part 1");
        int a = 0;
        int b = 1;
        System.out.println(sum10and20(a, b));

        System.out.println("Part 2");
        printSignOf(7);

        System.out.println("Part 3");
        System.out.println(isNegative(-2));

        System.out.println("Part 4");
        print("Делал по аналогии", 4);

        System.out.println("Part 5");
        System.out.println(isLeapYear(2021));
    }
    public static boolean sum10and20(int x, int y)     // Part 1
    {
        int sum = x + y;
        return 10 < sum && sum <= 20;
    }
    public static void printSignOf(int number)      //Part 2
    {
        if (number >= 0)
        {
            System.out.println("Число положительное!");
        }
        else
        {
            System.out.println("Число отрицательное!");
        }
    }
    public static boolean isNegative(int number)     //Part 3
    {
        return number < 0;
    }
    public static void print(String message, int count)       //Part 4
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(message);
        }
    }
    public static boolean isLeapYear(int year)       //Part 5
    {
        if (year % 4 == 0 && year % 100 != 0)
        {
            return true;
        }
        else if (year % 400 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

