public class exNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 10, num3 = 20;
        System.out.printf("Num1 = %d,  Num2 = %d,  Num3 = %d\n\n", num1, num2, num3);

        addThreeNumbers(num1, num2, num3);
        substrTwoNumbers(num1,num2);
    }

    public static void addThreeNumbers(int n1, int n2, int n3) {
        System.out.println("SUM = " + (n1 + n2 + n3));
    }

    public static void substrTwoNumbers(int a, int b) {
        System.out.println("DIFFERENCE = " + (a - b));
    }
}