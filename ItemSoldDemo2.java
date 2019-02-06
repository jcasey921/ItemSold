package itemsold;

public class ItemSoldDemo2 {
    
public static void main(String[] args)
{
ItemSold sale = new ItemSold(20, 80, 100.25); 
sale.registerSale(110);
sale.displaySales();  
}
}