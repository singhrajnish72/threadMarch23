package DecoratorDesignPattern;

public class GreenCone implements IceCream{

  IceCream iceCream;
  
  public GreenCone(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    return 50 + iceCream.getPrice();
  }

}
