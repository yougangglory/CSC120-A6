import java.util.ArrayList;



/* This is a stub for the House class */
public class House extends Building {
  
    public ArrayList<String> residents;
    Boolean hasDiningRoom;
  
  public House(String name, String address,String residents, int nFloors,boolean hasDiningRoom) {
    super(name, address,nFloors);
    this.residents=new ArrayList<String>();
  }
   
  /* manipulator to set the information of if there is a dining hall in the house */
  public void sethasDiningRoom(){
      this.hasDiningRoom = true;

  }

   /* accessor to retrieve the information of if there is a dining hall in the house */
  public boolean gethasDiningRoom(){
   return this.hasDiningRoom;
  }

   /*accesor to know the number of residents in the house */
   public int nResidents;
  public int getnResidents(){
   return residents.size();
  }
 
  public void moveIn(String Studentname){
   this.residents.add(Studentname);
   System.out.println("The student was added succesfully. Welcome to " + Studentname);
   System.out.println(this.residents);
  }

  public String moveOut(String Studentname){
   this.residents.remove(Studentname);
   System.out.println(Studentname + "Goodbye");
   return Studentname;
  }
 
  public boolean isResident(String person){
    System.out.println(this.residents.contains(person));
    return this.residents.contains(person);
  }
  
    
   //System.out.println("the house has a dining room:" + get.hasDiningRoom );
   

  public static void main(String[] args) {
    
    //new House("Laura Scales", " 1 chapin way",3,true);
       House Laurascales = new House("Laurascales", "150 Neilson Street Northampton, MA 01063", "Joshua", 3,true );
        System.out.println(Laurascales );
    
       /*To test
       System.out.println("You have built a house: 🏠");
       Laurascales.moveIn("Glory Divine");
       Laurascales.moveIn("Ngono Pierre");
       Laurascales.moveOut("Glory Divine");
       Laurascales.moveIn("Christabelle");
       Laurascales.isResident("Glory Divine");
       Laurascales.isResident("Christabelle");*/ 
       
       
        
  }

}