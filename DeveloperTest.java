import java.util.ArrayList;

public class DeveloperTest{
  public static void main(String[]args){
    System.out.println("----Developer Test----");
    

    Developer dev1 = new Developer();
    System.out.println(dev1.name);
    System.out.println(dev1.happiness);
    System.out.println(dev1.hasLife);
    System.out.println(dev1.salary);
    System.out.println(dev1.languages);
    

    Developer dev2 = new Developer("Pepper");
    System.out.println(dev2.name);
    System.out.println(dev2.happiness);
    System.out.println(dev2.hasLife);
    System.out.println(dev2.salary);
    System.out.println(dev2.languages);
    
    Developer dev3 = new Developer("David", 150000);
    System.out.println(dev3.name);
    System.out.println(dev3.happiness);
    System.out.println(dev3.hasLife);
    System.out.println(dev3.salary);
    System.out.println(dev3.languages);
  }
}