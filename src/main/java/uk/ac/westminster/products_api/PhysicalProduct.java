package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {

    private double weightKG;
    private String dimensions;
    private double discountedPrice;


    public PhysicalProduct(){
    }


    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions){

        super(id,name,price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }


    public double getWeightKG(){
        return weightKG;
    }
    public String getDimensions(){
        return dimensions;
    }


    public void setWeightKG(double weightKG){
        this.weightKG = weightKG;
    }
    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }


    @Override
    public String getSummary(){
        return "Physical " + getName() + " | Weight " + getWeightKG();
    }

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }


}
