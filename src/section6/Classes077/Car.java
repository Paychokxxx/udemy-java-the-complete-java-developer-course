package section6.Classes077;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    public String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche") || validModel.equals("holden")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;

    }
}
