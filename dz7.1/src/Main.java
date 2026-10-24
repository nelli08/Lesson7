//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "Java - язык программирования ";
        System.out.println("Длина строки: " + str.length());
        System.out.println("Первый символ строки: " + str.charAt(0));
        int java = str.indexOf("Java");
        if (java == -1) {
            System.out.println("Строчка не содержит Java");
        } else {
            System.out.println("Строчка содержит Java");
        }
    }
}