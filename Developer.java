import java.util.ArrayList;

public class Developer{
  // member variable/attributes(what it has)
  public String name;
  public ArrayList<String> languages = new ArrayList<String>();
  public int happiness;
  public boolean hasLife;
  public double salary;

  // Constructor
  public Developer(){
    this.name = "A random developer";
    this.languages = new ArrayList<String>();
    this.happiness = 8;
    this.hasLife = false;
    this.salary = 100000;
  }

public Developer(String name, double salary){
    this.name = name;
    this.languages = new ArrayList<String>();
    this.languages.add("Java");
    this.languages.add("Python");
    this.happiness = 7;
    this.hasLife = true;
    this.salary = 120000;
}
}