public class Main {
    public static void main(String[] args) {
        // Код из задания 4
        MathCalculable mc = new MathFunc();
        System.out.println("2^3 = " + mc.power(2, 3));
        System.out.println("Модуль 3 + 4i = " + mc.complexModulus(3, 4));
        System.out.println("Число PI = " + MathCalculable.PI);

        // Код из задания 5
        ProcessStrings ps = new ProcessStrings();
        String testString = "Hello, World!";
        System.out.println("Количество символов: " + ps.countCharacters(testString));
        System.out.println("Символы на нечетных позициях: " + ps.oddPositionCharacters(testString));
        System.out.println("Инвертированная строка: " + ps.reverseString(testString));

        // Код из задания 7
        Printable[] printables = {
                new Magazine("Tech Today"),
                new Magazine("Science Weekly"),
                new Magazine("Daily News")
        };
        Magazine.printMagazines(printables);
    }
}