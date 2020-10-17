public class LabQuiz {
    public static void main(String[] args) {
        show(add(1, 1) + 0.5);
    }
    public static void show(double value){
        System.out.println(add((int)value, 2));
    }
    public static double add(int num1, int num2){
        return num1 + num2;
    }
    public static boolean checkOne(int num) {
        return (add(num, 1) < 10 || num > (100 / 0));
    }
    public static boolean checkTwo(int num) {
        return (num < 10 && num / 0 == 10);
    }
}
