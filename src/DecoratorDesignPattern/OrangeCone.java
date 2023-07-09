package DecoratorDesignPattern;

public class OrangeCone implements IceCream {

  IceCream iceCream;
  
  public OrangeCone(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    return 40 + iceCream.getPrice();
  }

}
