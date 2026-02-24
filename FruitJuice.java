public class FruitJuice extends Drink implements IMixable{
    int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    public double calculatePrice(){
        return price = price - (price * discountPercent / 100);
    }
    @Override void mix(){
        System.out.println("Dang ep trai cay tuoi...");
    }
}
