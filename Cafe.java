public class Cafe extends Building{

    //atributes 

    public Cafe(String name, String address, int nFloors) {
        super(name, address,nFloors);
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe mycafe= new Cafe("compass","library",6);
    }
    
}
