/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemsold;

/**
 *
 * @author JDC00
 */
public class ItemSoldDemo 
{
public static void main(String[] args)
{
ItemSold sale = new ItemSold(4, 10, 2.50); 
sale.registerSale(10);
sale.displaySales();  
}
}
