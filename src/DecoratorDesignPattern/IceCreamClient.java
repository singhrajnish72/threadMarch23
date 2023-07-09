package DecoratorDesignPattern;

public class IceCreamClient {

  public static void main(String[] args) {
    IceCream iceCream = new BaseIceCreamCone(); 
    
    
    System.out.println("Price of base iceCream:"+iceCream.getPrice());
    
    IceCream iceCreamWithOrangeConeAndChocholateflavour = new ChocolateFlavour(new OrangeCone(new BaseIceCreamCone())); 
    System.out.println("Price of special iceCream:"+iceCreamWithOrangeConeAndChocholateflavour.getPrice());   
  }
}
