package DecoratorDesignPattern;

public class ChocolateFlavour implements IceCream{

  IceCream iceCream;
   
  public ChocolateFlavour(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    return 80 + iceCream.getPrice();
  }
}
