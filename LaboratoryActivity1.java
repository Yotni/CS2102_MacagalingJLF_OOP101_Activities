import java.util.*;

public class LaboratoryActivity1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char isOrdering;
        char isStudent;
        int foodInput = -1;
        int foodQuantity =-1;

        int totalItems = 0;
        double totalDiscount = 0;
        double totalSubtotal = 0;
        double finalAmount = 0;


        System.out.println("=======      Menu      =======");

        System.out.printf("%-21s - $%.2f \n", "1. Hungarian Sandwich", 80.00);
        System.out.printf("%-21s - $%.2f \n", "2. Pizza ", 120.00);
        System.out.printf("%-21s - $%.2f \n", "3. Porksilog ", 100.00);
        System.out.printf("%-21s - $%.2f \n", "4. Spaghetti ", 70.00);
        System.out.printf("%-21s - $%.2f \n", "5. Chicksilog ", 90.00);

        while (true) {
            double Subtotal = 0;
            double Discount_Amount = 0;
            double Order_total = 0;

            
            System.out.print("\nEnter item number: ");
            foodInput = scanner.nextInt();
            System.out.print("Enter quantity: ");
            foodQuantity = scanner.nextInt();

            if ((foodInput >= 1 && foodInput <=5) && (foodQuantity >=1 && foodQuantity <=10)) {

                System.out.print("Are you a student? (Y/N): ");
                isStudent = scanner.next().charAt(0);
    
                switch (foodInput) {
                    case 1:
                        Subtotal += 80.00*(foodQuantity);
                        break;
                    case 2:
                        Subtotal += 120.00*(foodQuantity);
                        break;
                    case 3:
                        Subtotal += 100.00*(foodQuantity);
                        break;
                    case 4:
                        Subtotal += 70.00*(foodQuantity);
                        break;
                    case 5:
                        Subtotal += 90.00*(foodQuantity);
                        break;
                
                    default:
                        break;
                }

                totalItems += foodQuantity;

                if (isStudent == 'Y') {
                    if (Subtotal < 500) {
                        Discount_Amount = (int)(0.10 * Subtotal);
                        
                    }
                    else if (Subtotal >= 500) {
                         Discount_Amount = (int)(0.15 * Subtotal);
                        
                    }
                }
                else if (isStudent == 'N'){
                    if (Subtotal >= 500){
                        Discount_Amount = (int)(0.05 * Subtotal);

                    }
                   
                }

                Order_total = Subtotal - Discount_Amount;

                System.out.printf("\nSubtotal: $%.2f\n",  Subtotal);
                System.out.printf("Discount: $%.2f\n",  Discount_Amount);
                System.out.printf("Order Total: $%.2f\n", Order_total);

            }
            else {
                System.out.println("\nInvalid order! Please enter a valid item and quantity");   
            }

            totalSubtotal += Subtotal;
            totalDiscount += Discount_Amount;
            finalAmount += Order_total;

            System.out.print("\nDo you want to order again? (Y/N): ");
            isOrdering = scanner.next().charAt(0);

            if (isOrdering == 'Y'){
                continue;
            }
            else if (isOrdering == 'N'){
                break;
            }
            else{
                continue; 
            }

        }    

        System.out.println("\n======= Order Summary  =======");

        System.out.println("Total Items: " + totalItems);
        System.out.printf("Total before discount: $%.2f\n", totalSubtotal);
        System.out.printf("Total discount: $%.2f\n", totalDiscount);
        System.out.printf("Final amount: $%.2f", finalAmount);
        
        scanner.close();

    }
}
