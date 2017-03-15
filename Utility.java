public class Utility extends Property{
   
   private int currentMultiplier;
   private Dice di;
   
   public Utility(int p, Dice d, String n){
      super(p, n);
      currentMultiplier = 4;
      di = d;
   }
   
   public int getRent(){
      if(this.getOwner().getUtility() == 1)
         return di.getTotal()*4;
      else
         return di.getTotal()*10;
   }
}
      