package DecoratorDesignPattern;

public class BaseIceCreamCone implements IceCream {
 
  public BaseIceCreamCone() {
  }

  @Override
  public int getPrice() {
    return 20;
  }

}
