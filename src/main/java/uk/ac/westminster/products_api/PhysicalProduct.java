package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKG;
    private String dimensions;


    public PhysicalProduct(){
    }

    public PhysicalProduct(Long id, String name, double price, double weightKG, String dimensions){

        super(id,name,price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
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
}
