/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill.of.sale;

/**
 * Nicolas Lei,
 * September 17
 * To print receipt for a blue T-Shirt
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cost = 12.49;
        double payed = 20;
        double HST = 0.13;
        double total = 0.0;
        double tax = 0.0;
        double change = 0.0;
        tax = cost * HST;
        total = cost + tax;
        change = payed - total;
        
        //Receipt for blue T-Shirt
        //Price plus tax, and change for the amount they payed
        System.out.println("\t" + "Bill of sale" + "\n");
        System.out.println("T-Shirt               " + "$" + cost );
        System.out.println("HST(13%)              " + "$" + tax);
        System.out.println("Payed                 " + "$" + payed);
        System.out.println("Change                " + "$" + change);
        System.out.println("Total                 " + "$" + total);
    }
    
}
