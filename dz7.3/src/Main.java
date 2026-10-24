//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     String product = "Молоко";
     int count = 3;
    double price = 89.99;
       String formatted = String.format ( "Вы купили %s, количество: %d, итоговая стоимость: %.1f", product, count, count*price);
        System.out.println(formatted);
    }
    }