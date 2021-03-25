public class Calculator1 {

    public void thisCalculator1(){
        int num1 = 5;
        int num2 = 3;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        float result = Calculator1.add(num1,num2);
        System.out.println(num1 + num2 + "=" + result);
        System.out.println(num1 - num2 + "=" + result);
        System.out.println(num1 * num2 + "=" + result);
        System.out.println(num1 / num2 + "=" + result);

    }

    public static int add(float num1, int num2) {
        return num2;

    }
    public static void add(){
        int num1 = 5;
        int num2 = 3;
        int result = Calculator1.add(num1,num2);
    }
    public void thatCalculator1(int thisCalculator1) {
        thisCalculator1 += 12;
        int num1 = 5;
        int num2 = 3;
        float result = Calculator1.add(num1, num2);
        System.out.println(num1 + num2 + "=" + result);
    }
}
