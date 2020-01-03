
public class Loader {

  public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 305; // g
        int eggsCount = 4; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        if (milkAmount >= 1000 && powderAmount >= 400 && oilAmount >= 30 && sugarAmount >= 10) {
            //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Pancakes");
        }
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
        }
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");
        }
  }
}
