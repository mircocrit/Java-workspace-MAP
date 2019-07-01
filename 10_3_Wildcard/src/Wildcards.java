import java.util.*;

class Fruit{};

class Melon extends Fruit{};
class Apple extends Fruit{};
class Jonathan extends Apple{};
class Orange extends Jonathan{};

public class Wildcards {
  static void add(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan());
    apples.add(new Orange());
    //apples.add(new Melon());
    //apples.add(new Fruit()); // Error
  }
  //
  static void add2(List<? extends Apple> apples) {
	  //apples.add(new Apple());
	  //apples.add(new Fruit());
	  //apples.add(new Orange());
	  //apples.add(new Melon());
	  //apples.add(new Fruit()); // Error
	  }
} 