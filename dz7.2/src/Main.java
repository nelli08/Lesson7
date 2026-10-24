//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  String text = "я очень хочу спать";
  String substr = text.substring(7);
  String upper = text.toUpperCase();
   int index = text.indexOf("спать");
        System.out.println(substr + "; " +upper+"; " + index);
        }
    }