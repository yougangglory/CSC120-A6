import java.util.Hashtable;

/* This is a stub for the Library class */
  public class Library extends Building {
    Hashtable<String,Boolean> HashTable = new Hashtable <>(); 
    
    public Library(String name, String address,int nFloors) {
      super( name,address,nFloors);
     Hashtable<String,Boolean> HashTable = new Hashtable <>(); 
      
      System.out.println("You have built a library: 📖");
    }
   
    public void addTitle(String title){
      HashTable.put(title,true);
      System.out.println("succesfully added");
      
    }

    public String removeTitle(String title){
      HashTable.remove(title, true);
     System.out.println(title + "removed succesfully");//for testing
     return title;

    }

    public void checkOut(String title){
    HashTable.replace(title, true, false);
    System.out.println("checkout done"); //for testing
    }

    public void Return(String title){
    HashTable.replace(title, false, true);
    System.out.println("return succesful"); //for testing
    }

    public Boolean containsTitle(String title){
      
      System.out.println(HashTable.containsKey(title));
      return HashTable.containsKey(title);
      
    }

    public boolean isAvailable(String title){
      System.out.println(HashTable.get(title));
     return HashTable.get(title);
     
    }

    public void printCollection(){
    System.out.println(HashTable);
    }

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson library","200 Street drive 1 chapin way", 4);
    System.out.println(Neilson);
    /* For testing the methods
    Neilson.addTitle("redeemer");
    Neilson.addTitle("beautiful");
    Neilson.removeTitle("beautiful");
    Neilson.addTitle("nicer");
    Neilson.checkOut("redeemer");
    Neilson.Return("redeemer");
    Neilson.checkOut("nicer");
    Neilson.containsTitle("beautiful");
    Neilson.containsTitle("nicer");
    Neilson.isAvailable("nicer");
    Neilson.isAvailable("redeemer");
    Neilson.printCollection();*/
    }
  
  }