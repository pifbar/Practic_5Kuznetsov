package MyPackage;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 20.0, "Белый"),
                new Pants(Size.L, 40.0, "Синий"),
                new Skirt(Size.S, 25.0, "Красный"),
                new Tie(Size.XS, 15.0, "Черный")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
