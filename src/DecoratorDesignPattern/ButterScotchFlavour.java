package DecoratorDesignPattern;

public class ButterScotchFlavour implements IceCream{

  IceCream iceCream;
    
  public ButterScotchFlavour(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public int getPrice() {
    // TODO Auto-generated method stub
    return 100 + iceCream.getPrice();
  }
  
}
