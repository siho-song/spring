package decorator;

public class Test {

    public static void main(String[] args) {
        ICar audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audiA3 = new A3(audi,"a3");
        audiA3.showPrice();
        //a4
        ICar audiA4 = new A4(audi,"a4");
        audiA4.showPrice();
        //a5
        ICar audiA5 = new A5(audi,"a5");
        audiA5.showPrice();
    }
}
