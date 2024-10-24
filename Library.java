import java.util.Hashtable;
public class Library extends Building{
//have a collection of titles but need to use a hashtable instead of array list (hastable 
//isnt organized but it is retrievable by name sort of like a dictionary the key is the title)
//when add title dont need a boolean value 
//when remove a title check if the title is checked out (use put and remove)
//checkout a title make sure its there and that no one already has it 
//change the status of the book when you check it out use (replace)


  //atributes
  private Hashtable<String, Boolean> collection;

  //constructor 
  public Library(String name, String address, int nFloors) {
    super(name, address,nFloors);
    this.collection= new Hashtable<String, Boolean>(0);
    System.out.println("You have built a library: 📖");
  }

  //methods for the library class
  public void addTitle(String title){
    this.collection.put(title,true);
  }

  public String removeTitle(String title){
    if (containsTitle(title) && isAvailable(title)){
      this.collection.remove(title);
    } else{
      System.out.println("this book cannot be removed");
    }
    return title;
  } 
  
  public void checkOut(String title){
    if (containsTitle(title) && isAvailable(title)){
      this.collection.replace(title,false);
    } else{
      System.out.println("this book cannot be checked out");
    }
  }

  public void returnBook(String title){
    if (containsTitle(title) && this.collection.get(title)==false){
      this.collection.replace(title,true);
    } else{
      System.out.println("this book cannot be returned");
    }
  }

  public boolean containsTitle(String title){
    return this.collection.containsKey(title);
  } 

  // returns true if the title is currently available, false otherwise
  public boolean isAvailable(String title){
    return this.collection.get(title)==true;

  } 

  // prints out the entire collection in an easy-to-read way (including checkout status)
  public void printCollection(){
    for (String key : this.collection.keySet()){
      boolean is=isAvailable(key);
      if (is){
        String isit= " is avaliable";
        System.out.println(key+isit);
      } else {
        String isit= " is not avaliable";
        System.out.println(key+isit);
      }
    }
  } 

  public static void main(String[] args) {
    Library mylib= new Library("nielson","123 lane",4);
    mylib.addTitle("meow");
    System.out.println(mylib.collection);
    // mylib.removeTitle("meow");
    mylib.checkOut("meow");
    System.out.println(mylib.collection.get("meow"));
    mylib.returnBook("meow");
    mylib.addTitle("arf");
    mylib.checkOut("arf");
    System.out.println(mylib.collection.get("meow"));
    System.out.println(mylib.containsTitle("meowy"));
    mylib.printCollection();
  }
  
}