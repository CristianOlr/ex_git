public class exNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10;
        System.out.printf("Num1 = %d,  Num2 = %d\n\n", num1, num2);

        addTwoNumbers(num1,num2);
        substrTwoNumbers(num1,num2);
    }

    public static void addTwoNumbers(int n1, int n2) {
        System.out.println("SUM = " + (n1 + n2));
    }

    public static void substrTwoNumbers(int a, int b) {
        System.out.println("DIFFERENCE = " + (a - b));
    }
}