/* This is a stub for the House class */
public class House extends Building {

  //need to use the building constructor 
  //use super inside the constructor to say before you can make a house make a building
  //add the extra functionality and attributes for the house class 
  //in the house constructor need to initilza the array list of residents and a boolean rrepresenting if it has a dining room 
  //dining room boolean willbe passed in to the constructor 
  //when someone is moving in check to make sure they live there fist and that there is enough room 
  //resident array list is private so need a method to check is someone lives in a house use array list methods 
  public House() {
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }

}