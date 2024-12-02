package MyPackage;

public abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Размер: " + size + " (" + size.getDescription() + ", " + size.getEuroSize() + "), "
                + "Цена: " + price + ", Цвет: " + color;
    }
}
