import java.util.*;

public class LaboratoryActivity1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char isOrdering;
        char isStudent;
        int FoodInput = -1;
        int FoodQuantity =-1;

        int Total_Items = 0;
        // int Subtotal = 0;
        // int Discount_Amount = 0;
        // int Order_total = 0;
        double Total_Discount = 0;
        double Total_Of_Subtotal = 0;
        double Final_Amount = 0;



        while(true){
            System.out.println("=======      Menu      =======");
            System.out.printf("%-21s - $%.2f \n", "1. Hungarian Sandwich", 80.00);
            System.out.printf("%-21s - $%.2f \n", "2. Pizza ", 120.00);
            System.out.printf("%-21s - $%.2f \n", "3. Porksilog ", 100.00);
            System.out.printf("%-21s - $%.2f \n", "4. Spaghetti ", 70.00);
            System.out.printf("%-21s - $%.2f \n", "5. Chicksilog ", 90.00);


            double Subtotal = 0;
            double Discount_Amount = 0;
            double Order_total = 0;

            System.out.print("Enter item number: ");
            FoodInput = scanner.nextInt();
            System.out.print("Enter quantity: ");
            FoodQuantity = scanner.nextInt();

            if((FoodInput >= 1 && FoodInput <=5) && (FoodQuantity >=1 && FoodQuantity <=10)){
                System.out.print("Are you a student? (Y/N): ");
                isStudent = scanner.next().charAt(0);

                System.out.println(FoodInput + " " + FoodQuantity);
    
                switch (FoodInput) {
                    case 1:
                        Subtotal += 80.00*(FoodQuantity);
                        break;
                    case 2:
                        Subtotal += 120.00*(FoodQuantity);
                        break;
                    case 3:
                        Subtotal += 100.00*(FoodQuantity);
                        break;
                    case 4:
                        Subtotal += 70.00*(FoodQuantity);
                        break;
                    case 5:
                        Subtotal += 90.00*(FoodQuantity);
                        break;
                
                    default:
                        break;
                }

                Total_Items += FoodQuantity;
                System.out.println("Subtotal: $" + Subtotal);

                // if (isStudent == 'Y'){
                //     if(Subtotal > 500){
                //         Discount_Amount = (int)(0.15 * Subtotal);
                //         Order_total = Subtotal - Discount_Amount;
                //     }else if (Subtotal < 500){
                //         Discount_Amount = (int)(0.05 * Subtotal);
                //         Order_total = Subtotal - Discount_Amount;
                //     }
                // }
                // else if (isStudent == 'N'){
                //     if (Subtotal > 500){
                //         Discount_Amount = (int)(0.05 * Subtotal);
                //         Order_total = Subtotal - Discount_Amount;
                //     }
                // }

                if (isStudent == 'Y'){
                    if(Subtotal < 500) {
                        Discount_Amount = (int)(0.10 * Subtotal);
                        Order_total = Subtotal - Discount_Amount;
                    }
                    else if (Subtotal > 500){
                         Discount_Amount = (int)(0.15 * Subtotal);
                        Order_total = Subtotal - Discount_Amount;
                    }
                }
                else if (isStudent == 'N'){
                    if (Subtotal > 500){
                        Discount_Amount = (int)(0.05 * Subtotal);
                        Order_total = Subtotal - Discount_Amount;
                    }
                   
                }


                System.out.println("Discount: $" + Discount_Amount);
                System.out.println("Order Total: $" + Order_total);


            }else{
                System.out.println("Invalid Order! Please enter a valid items and quantity");   
            }

            Total_Of_Subtotal += Subtotal;
            Total_Discount += Discount_Amount;
            Final_Amount += Order_total;

            
            System.out.print("Do you want to order again? (Y/N): ");
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

        
        System.out.println("==== Order Summary ====");
        System.out.println("Total Items: " + Total_Items);
        System.out.println("Total before discount: $" + Total_Of_Subtotal);
        System.out.println("Total discount: $" + Total_Discount);
        System.out.println("Final amount: $" + Final_Amount);
        
        scanner.close();

    }
}
