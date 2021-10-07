public class LessonOne {
    public static void main(String[] args) {
        printThreeWords();    // Втророе задание
        checkSumSign();       // Третье задание
        printColor();         // Четвертое задание
        compareNumbers();     // Пятое задиние
    }

    public static void printThreeWords() {      // метод printThreeWords() #2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {      //метод checkSumSign() #3
        int a = 9;
        int b = 7;
        if (a + b <=0){
            System.out.println("Сумма отрицательная");
        }else if (a + b >=0){
            System.out.println("Сумма положительная");
        }
    }
    public static void printColor() {        //метод printColor() #4
        int value = 26;
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {     //метод compareNumbers() #5
        int a = 8, b = 26;
        if (a >= b){
            System.out.println("a >= b");
        }else if (a < b){
            System.out.println("a < b");
        }
    }
}

