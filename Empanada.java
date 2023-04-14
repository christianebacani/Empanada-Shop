// Empanada Shop
// Created by Christiane A. Bacani
import java.util.Scanner;
public class Empanada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int priceSolo[] = {55,65,60,80,90,90,120,130};
        int priceDouble[] = {100,120,110,150,170,170,230,240};
        boolean sell = true;
        int total = 0;
        
        System.out.print("Bacani`s Ilocos Original Empanada!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(sell){
        
        System.out.print("\t\t\tILOCOS EMPANADA\n");
        System.out.print("\t\t\tSOLO\t\tBUY 1 TAKE 1\n\n");
        System.out.print("1.) Ordinary\t\tP 55\t\tP 100\n\n");
        System.out.print("2.) Special \t\tP 65\t\tP 120\n\n");
        System.out.print("3.) Eggless \t\tP 60\t\tP 110\n\n");
        System.out.print("4.) Double Egg\t\tP 80\t\tP 150\n\n");
        System.out.print("5.) Double Longanissa\tP 90\t\tP 170\n\n");
        System.out.print("6.) Vegeless  \t\tP 90\t\tP 170\n\n");
        System.out.print("7.) Double Double\tP 120\t\tP 230\n\n");
        System.out.print("8.) Special w/ Cheese\tP 130\t\tP 240\n\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        System.out.print("1.) Solo\n");
        System.out.print("2.) Buy 1 Take 1\n");
        
        System.out.print("Enter your choice here : ");
        int userChoice = input.nextInt();
        
        switch(userChoice){
            case 1:
                System.out.print("Enter the quantity here : ");
                int quantity = input.nextInt();
                
                total += priceSolo[choice - 1] * quantity;
                
                System.out.print("Do you want to buy more ? (y/n) : ");
                input.nextLine();
                String buyMore = input.nextLine();
                
                if(buyMore.equalsIgnoreCase("n")){
                    sell = false;
                    
                    System.out.print("The total price is P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
                }
                break;
            case 2:
                System.out.print("Enter the quantity here : ");
                int quantityDouble = input.nextInt();
                
                total += priceDouble[choice - 1] * quantityDouble;
                
                System.out.print("Do you want to buy more ? (y/n) : ");
                input.nextLine();
                String buyMoreDouble = input.nextLine();
                
                if(buyMoreDouble.equalsIgnoreCase("n")){
                    sell = false;
                    
                    System.out.print("The total price is P " + total + "\n");
                    
                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();
                    
                    int change = payment - total;
                    
                    System.out.print("Change : P " + change + "\n");
                    System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");
                }
                break;
        }
        
        }
        
    }
}
