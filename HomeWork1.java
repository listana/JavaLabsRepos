package homework1;


public class HomeWork1 {

    private static float g = 2.8f;

    HomeWork1() {
    }

    static void method1() {
    }

    // возвращает а*2ж
    static int method2(int a) {
        return (int) Math.round(a * 2 * g);
    }

    //выводит в консоль сумму
    static int method3(int a, int b) {
        return a + b;
    }

    // выодит в консоль сообщение о том что метод работате
    void method4() {
        System.out.println("I'm a method. And I'm working!");
    }

    //Выводит в консоль строку "s" "count" раз
    void method5(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

    // возвращает true если а больше 0, иначе false
    boolean method6(int a) {
        return a > 0 ? true : false;
    }

    // реализовать метод который будет выводить массив в консоль
    void printArray(Object[] objects) {
    }

    // реализовать методы, которые принимают числовые параметры (int)
    // проверят четность
    boolean isParity(int a) {
        return a % 2 == 0;
    }

    //    проверяют кратность для 3
    boolean canDivide3(int a) {
        return a % 3 == 0;
    }

    //    проверяют кратность для 5 -
    boolean canDivide5(int a) {
        return a % 5 == 0;
    }

    //    считают разрядность -
    int capacity(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        HomeWork1 obj = new HomeWork1();
        System.out.println(obj.capacity(412));


        Brick myBrick = new Brick("MyBrick", 2.8f, 3, 4);
        myBrick.PrintSumOfSquares();
        myBrick.PrintVolume();

        Champion Anna = new Champion("Anna", 1, 2, 3);
        Champion Sveta = new Champion("Sveta", 3, 1, -5);
        Champion Zhenya = new Champion("Zhenya", 5, 6, 1);
        Champion Roman = new Champion("Roman", 6, 0, 0);
        Anna.Fights(Sveta);
        Roman.Fights(Anna);
        Zhenya.Fights(Anna);

    }
}
