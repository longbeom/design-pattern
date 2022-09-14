abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi this coffee is " + this.getPrice();
    }
}

class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType type, int price) {
        if (type == CoffeeType.LATTE) return new Latte(price);
        else if (type == CoffeeType.AMERICANO) return new Americano(price);
        else {
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee {
    private int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee {
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Americano extends Coffee {
    private int price;

    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

enum CoffeeType {
    LATTE,
    AMERICANO,
    DEFAULT
}


public class FactoryPattern {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee(CoffeeType.LATTE, 4000);
        Coffee americano = CoffeeFactory.getCoffee(CoffeeType.AMERICANO, 3000);
        System.out.println("Factory Latte : " + latte);
        System.out.println("Factory Americano : " + americano);
    }
}
