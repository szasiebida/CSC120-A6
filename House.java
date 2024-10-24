import java.util.ArrayList;
public class House extends Building {

  //new attributes for the house class
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;
  //need to use the building constructor 
  //use super inside the constructor to say before you can make a house make a building
  //add the extra functionality and attributes for the house class 
  //in the house constructor need to initilza the array list of residents and a boolean rrepresenting if it has a dining room 
  //dining room boolean willbe passed in to the constructor 
  //when someone is moving in check to make sure they live there fist and that there is enough room 
  //resident array list is private so need a method to check is someone lives in a house use array list methods 
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address,nFloors);
    this.hasDiningRoom=hasDiningRoom;
    this.residents=new ArrayList<String>(0);
    System.out.println("You have built a house: 🏠");
  }

  //accesors for the house class
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
    
  public int nResidents(){
    return this.residents.size();
  }

  public static void main(String[] args) {
    House myhouse= new House("sofias house","1 chapin way",5, true);
    System.out.println(myhouse.hasDiningRoom());
    System.out.println();
  }

}