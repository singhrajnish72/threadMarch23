package DecoratorDesignPattern;

public class VanillaFlavour implements IceCream{

  IceCream iceCream;
    
  public VanillaFlavour(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    return 60 + iceCream.getPrice();
  }

}
