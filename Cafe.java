/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    public Cafe(String name, String adress, int nFloors ) {
        super(name, adress, nFloors);
        this.nCoffeeOunces=50;
        this.nSugarPackets=50;
        this.nCreams=50;
        this.nCups=10;

        System.out.println("You have built a cafe: ☕");
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
    }

    public void sellCoffee(int numberCoffee, int numberSugar, int numberCream){
        if (numberCoffee >= nCoffeeOunces || numberSugar >= nSugarPackets || numberCream >= nCreams){
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);{
             this.nCoffeeOunces= nCoffeeOunces+100;
             this.nSugarPackets=nSugarPackets+100;
             this.nCreams=nCreams+100;
             this.nCups=nCups+5;
             System.out.println("Stock done");
            }
        }
      
        System.out.println("cofee"+ nCoffeeOunces + "Sugar"+nSugarPackets+ "cream" + nCreams+ "cup"+ nCups);
         nCoffeeOunces = nCoffeeOunces-numberCoffee;
         nSugarPackets= nSugarPackets-numberSugar;
         nCreams=nCreams-numberCream;
         nCups=nCups-1;
         System.out.println("remain " + nCoffeeOunces);
         System.out.println("remain "+ nCreams);
         System.out.println("the remaining cups are " + nCups);
         System.out.println("It is done! Your cafe is done");
        
    }
    

    public static void main(String[] args) {
       Cafe SmithCafe= new Cafe("SmithCafe", " 1 chapin way 100 newstreet" ,1);
       System.out.println(SmithCafe);
       SmithCafe.sellCoffee(20, 0, 6);
       SmithCafe.sellCoffee(100, 5, 3);
    }
    
}
