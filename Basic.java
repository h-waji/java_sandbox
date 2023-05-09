import java.util.ArrayList;
import java.util.List;

public class Basic {
  public static void main(String[] args) {
    String signal = "red";
    switch (signal) {
      case "blue":
        System.out.println("Go!");
        break;
      case "yellow":
        System.out.println("Caution");
        break;
      case "red":
        System.out.println("Stop!!");
        break;
      default:
        System.out.println("Error");
        break;
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 拡張for文
    int numbers[] = { 10, 20, 30, 40, 50 };
    for (int number : numbers) {
      System.out.println(number);
    }

    // forEach
    List<String> list = new ArrayList<>();
    list.add("味噌煮込みうどん");
    list.add("味噌カツ");
    list.add("手羽先");

    System.out.println(list.get(1));

    list.forEach(item -> System.out.println(item));

    list.set(0, "串カツ");
    System.out.println(list.get(0));

    System.out.println(list.size());
    list.remove(0);
    System.out.println(list.size());
  }
}
