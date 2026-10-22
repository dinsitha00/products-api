package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadURL;
    private double filesizeMB;


    public DigitalProduct(){
    }


    public DigitalProduct(Long id, String name, double price, String downloadURL, double filesizeMB){

        super(id,name,price);
        this.downloadURL = downloadURL;
        this.filesizeMB = filesizeMB;
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

}

