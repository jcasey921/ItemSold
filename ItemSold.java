/*   *Justin Casey
     *Class and Methods
*/
package itemsold;

public class ItemSold {
//Setting variable names, public or private and whether they can use demimals or whole numbers.
private int sold, bulkQuantity;
private double cost, profit, discount, bulkDiscount;
public ItemSold(int bq, double bd, double c) {

    bulkQuantity = bq;
    bulkDiscount = bd;
    cost = c;
}
public void setCost(double c)
{
cost = c;
}
public void setBulkQuantity(int bq)
{
bulkQuantity = bq;
}
public void setDiscountPercentage(double bd)
{
 bulkDiscount = bd;
}
//Set cost bulk item and bulk discount for the below expression
 public double getCost()
{
      return cost;
}
 public void registerSale(int sold)
{
    if (sold > bulkQuantity) {
        cost = cost * (bulkDiscount / 100);
        this.sold+=sold;
    }
 //Computing and applying bulk discount, discount is not applying as I thought. I was unable to figure it out.
}
public double getDiscountPercentage()
     {
     return discount;
     }
public void displaySales() {
    getCost();
    double totalAmount = cost * sold;
    System.out.println("Total number of items sold: " + sold);
    System.out.println("Total sales: $" + totalAmount);
    System.out.println("Total discount: $"
            + getDiscountPercentage());
   }
//Total number of items sold, total sales, and total discount are displayed.
//Again I was unable to figure out why discount was not applying.
//I have loaded 2 java files in the submitted zip to test the program. Thanks for looking.
}
