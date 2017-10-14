/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_19_stock_transaction_program;

/**
 *
 * @author bluebackdev
 * Last month Joe purchased some stock in Acme Software, Inc. Here are the 
 * details of the purchase:
 * 
 *  - The number of shares that Joe purchased was 1,000
 *  - When Joe purchased the stock, he paid $32.87
 *  - Joe paid his stockbroker a commission that amounted to 2% of the amount
 * .  he paid for the stock
 * 
 * Two weeks later Joe sold the stock. Here are the details of the sale:
 * 
 *  - The number of shares that Joe sold was 1,000
 *  - He sold the stock for $33.92 per share
 *  - He paid his stockbroker another commission that amounted to 2% of the
 *    amount he received for the sock
 * 
 * Write a program that displays the following information:
 * 
 *  - The amount of money Joe paid for the stock
 *  - The amount of commission Joe paid his broker when he bought the stock
 *  - The amount that Joe sold the stock for
 *  - The amount of commission Joe paid his broker when he sold the stock
 *  - Display the amount of profit that Joe made after selling his stock and
 *    paying the two commissions to his broker. (If the amount of profit that
 *    your program displays is a negative number, then Joe lost money on the
 *    transaction.)
 */
public class JAVA_PRG_02_19_Stock_Transaction_Program {

    /**
     * @param args the command line arguments
     * This method calculates information about a stock purchase
     */
    public static void main(String[] args) {
        // Declare constants
        final float FLT_COMMISSION_PERCENTAGE = 0.02f;
        final float FLT_STOCK_INITIAL = 32.87f;
        final float FLT_STOCK_FINAL = 33.92f;
        
        final int INT_STOCK_SHARES_TOTAL = 1000;
        
        // Declare variables to hold calculated values
        float fltCommissionPurchase;
        float fltCommissionSale;
        float fltCostPurchase;
        float fltCostSale;
        float fltCostTotal;
        
        // Calculate stock by multiplying initial price by total shares bought
        fltCostPurchase = FLT_STOCK_INITIAL * INT_STOCK_SHARES_TOTAL;
        // Calculate commission from percentage and total purchase cost
        fltCommissionPurchase = fltCostPurchase * FLT_COMMISSION_PERCENTAGE;
        // Calculate final purchase price by adding previous two values together
        fltCostPurchase = fltCostPurchase + fltCommissionPurchase;
        
        // Repeat process to calculate sale values
        fltCostSale = FLT_STOCK_FINAL * INT_STOCK_SHARES_TOTAL;
        fltCommissionSale = fltCostSale * FLT_COMMISSION_PERCENTAGE;
        fltCostSale = fltCostSale + fltCommissionSale;
        
        // Subtract purchase from sale to calculate total profit
        fltCostTotal = fltCostSale - fltCostPurchase;
        
        // Output result to console
        System.out.println("Joe made $" + fltCostTotal);
    }
    
}
