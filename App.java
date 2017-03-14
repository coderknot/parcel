import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();
    boolean stillShipping = true;
    List<Parcel> allItems = new ArrayList<Parcel>();
    while (stillShipping) {
      System.out.println("\n"+"1-Add an item to ship?"+"\n"+"2-Calculate total cost"+"\n");
      int userChoice = Integer.parseInt(myConsole.readLine());

      if (userChoice == 1) {
        System.out.println("\n"+"Ship it here! Height of your item?");
        int itemHeight = Integer.parseInt(myConsole.readLine());
        System.out.println("Width of your item?");
        int itemWidth = Integer.parseInt(myConsole.readLine());
        System.out.println("Depth of your item?");
        int itemDepth = Integer.parseInt(myConsole.readLine());
        System.out.println("Weight of your item in lbs?");
        int itemWeight = Integer.parseInt(myConsole.readLine());

        Parcel userParcel = new Parcel (itemWeight,itemHeight,itemWidth,itemDepth);
        userParcel.calculateVolume();
        userParcel.calculateArea();
        System.out.println("How fast do you want to ship it?"+"\n"+"1-Economy"+"\n"+"2- Next Day"+"\n");
        String itemShipSpeed = myConsole.readLine();
        System.out.println("How far in miles is it going?");
        int itemShipMiles = Integer.parseInt(myConsole.readLine());
        userParcel.costToShip(itemShipSpeed, itemShipMiles);

          System.out.println("This package will cost $"+userParcel.mCostToShip+" to ship.");

        allItems.add(userParcel);


      } else if (userChoice == 2) {
        stillShipping = false;
        int totalCost=0;
        for (int i=0; i<allItems.size();i++){
          totalCost += allItems.get(i).mCostToShip;
          System.out.println("Package #"+(i+1)+" costs $"+allItems.get(i).mCostToShip);
        }
        System.out.println("Your total shipping cost is $"+totalCost);

      } else {
        System.out.println("Sorry, not an option!");
      }
    }
  }

}
