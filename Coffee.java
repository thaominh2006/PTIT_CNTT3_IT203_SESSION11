public class Coffee extends Drink {
    private boolean hasMilk;
    public Coffee(String id, String name, double price, boolean hasMilk){
        super(id, name, price);
        this.hasMilk = hasMilk;
    }
    @Override
    public double calculatePrice(){
        if(hasMilk){
            return
            price += 5000;
        }
        return price;
    }
    @Override
    public void displayInfo(){
        System.out.println("Ma: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Gia goc: " + price);
        if(hasMilk){
            System.out.println("Co sua");
        }else {
            System.out.println("Den da");
        }
    }
}
