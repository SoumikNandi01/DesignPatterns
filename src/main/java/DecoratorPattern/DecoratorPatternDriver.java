package DecoratorPattern;

public class DecoratorPatternDriver {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        LiquidDecorator liquidDecorator = new Caramel(coffee);
        liquidDecorator = new Chocolate(liquidDecorator);
        System.out.println(liquidDecorator.getCost());
        System.out.println(liquidDecorator.getIngredients());

    }

}
