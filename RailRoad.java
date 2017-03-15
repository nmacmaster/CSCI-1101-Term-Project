public class RailRoad extends Property{
   
   private static int[] rents = {25, 50, 100, 200};
   private int rent;
   
   public RailRoad(int p, String n){
      super(p, n);
      rent = 25;
   }
   
   public int getRent(){
      return rent;
   }
   public void setRent(){
      rent = rents[this.getOwner().getRails() -1];//Picks rent acording to number of railroads owned
   }
}