public class exNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;
        System.out.printf("Num1 = %d,  Num2 = %d\n\n", num1, num2);

        addTwoNumbers(num1,num2);
        substractTwoNumbers(num1,num2);
    }

    public static void addTwoNumbers(int a, int b) {
        System.out.println("SUM = " + (a + b));
    }

    public static void substractTwoNumbers(int a, int b) {
        System.out.println("DIFFERENCE = " + (a - b));
    }
}