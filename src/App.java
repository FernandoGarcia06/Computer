
import java.util.ArrayList;

public class App {

public static void main(String[]args) throws Exception {

    Laptop l1 = new Laptop("2015","DELL" , "Windows", 89,20);
    Laptop l2 = new Laptop("2015","ASUS" , "Linux", 89,20);
    Laptop l3 = new Laptop("2018","HP" , "Windows", 95,18);
    Desktop d1 = new Desktop ("2020","ACER", "Windows", 45.5);
    Desktop d2 = new Desktop ("2019","SAMSUNG", "Linux", 50.0);
    Desktop d3 = new Desktop ("2021","LG", "Windows", 40.0);
    Notebook n1 = new Notebook ("2022","MACBOOK", "MacOS", 100, 15);
    Notebook n2 = new Notebook ("2023","DELL", "Windows", 98, 17);
    Notebook n3 = new Notebook ("2021","ASUS", "Linux", 95, 16);


    ArrayList<Computer> computers = new ArrayList<>();
    computers.add(l1);  
    computers.add(l2);
    computers.add(l3);
    computers.add(d1);
    computers.add(d2);
    computers.add(d3);
    computers.add(n1);
    computers.add(n2);
    computers.add(n3);

    for(Computer compu : computers){
        System.out.println(compu);
    }

    
    }

}








