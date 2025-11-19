public class Laptop extends Computer{
    private int batterycapacity;
    private double weight;

    public Laptop(String model,String manufacturer, String operatingSystem, int batterycapacity, double weight){
        super(model, manufacturer, operatingSystem);
        this.batterycapacity = batterycapacity;
        this.weight = weight;   
    }

    public String getComputerType(){
        return "Computadora portatil";
    }
    
    public int calculatePortabilityScore(){
        return (int) weight;
    }

}
