package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable{

    private String downloadURL;
    private double filesizeMB;
    private double discountedPrice;



    public DigitalProduct(){
    }


    public DigitalProduct(Long id, String name, double price, String downloadURL, double filesizeMB){

        super(id,name,price);
        this.downloadURL = downloadURL;
        this.filesizeMB = filesizeMB;
        this.discountedPrice = price;
    }


    public String getDownloadURL(){
        return downloadURL;
    }

    public double getFilesizeMB() {
        return filesizeMB;
    }


    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public void setFilesizeMB(double filesizeMB){
        this.filesizeMB = filesizeMB;
    }



    @Override
    public String getSummary(){
        return "Digital " + getName() + " | Download " + getDownloadURL();
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

}

