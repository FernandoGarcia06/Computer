public final class Notebook extends Laptop  {

    public Notebook(String model, String manufacturer, String operatingSystem, int batterycapacity, double weight){
        super(model, manufacturer, operatingSystem, batterycapacity, weight);
    }

    public String computerType(){
        return "Computadora-laptop: NOTEBOOK";
    }

    public int calculatePortabilityScore(){
        return 1;
    }
    
    
}
