public class Desktop extends Computer{

    private Double caseHeight;

    public Desktop(String model, String manufacturer, String operatingSystem, Double caseHeigt){
        super (model, manufacturer, operatingSystem);
        this.caseHeight = caseHeigt;
    }


    public String getComputerType(){
        return "Computadora-escritorio: DESKTOP";
    }

    public int calculatePortabilityScore(){
        return (int) (5 + caseHeight/20);
    
    }



}