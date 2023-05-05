public class Main {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        String[] parts = equation.split(" ");
        int q = -1, w = -1, e = -1;

        for (int i = 0; i < parts[0].length(); i++) {
