package DecoratorDesignPattern;

public class MangoCone implements IceCream {

  IceCream iceCream;
   
  public MangoCone(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    return 30 + iceCream.getPrice();
  }

}
