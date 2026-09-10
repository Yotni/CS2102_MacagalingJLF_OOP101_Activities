import java.util.*;

public class LaboratoryActivity1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char isOrdering;
        char isStudent;
        int FoodInput = -1;
        int FoodQuantity =-1;

        int Total_Items = 0;
        int Total_Amount = 0;




        while(true){
            System.out.println("=======      Menu      =======");
            System.out.printf("%-21s - $%.2f \n", "1. Burger", 20.00);
            System.out.printf("%-21s - $%.2f \n", "2. Pizza Slize", 25.00);
            System.out.printf("%-21s - $%.2f \n", "3. Siaomai Rice", 45.00);
            System.out.printf("%-21s - $%.2f \n", "4. Spaghetti", 50.00);
            System.out.printf("%-21s - $%.2f \n", "5. Chicksilog", 65.00);


            System.out.print("Enter item number: ");
            FoodInput = scanner.nextInt();
            System.out.print("Enter quantity: ");
            FoodQuantity = scanner.nextInt();
            System.out.print("Are you a student? (Y/N): ");
            isStudent = scanner.next().charAt(0);

            System.out.println(FoodInput + " " + FoodQuantity);


            if((FoodInput >= 1 && FoodInput <=5) && (FoodQuantity >=1 && FoodQuantity <=10)){
                    switch (FoodInput) {
                        case 1:
                            Total_Amount += 20*(FoodQuantity);
                            break;
                        case 2:
                            Total_Amount += 25*(FoodQuantity);
                            break;
                        case 3:
                            Total_Amount += 45*(FoodQuantity);
                            break;
                        case 4:
                            Total_Amount += 50*(FoodQuantity);
                            break;
                        case 5:
                            Total_Amount += 65*(FoodQuantity);
                            break;
                    
                        default:
                            break;
                    }

                Total_Amount ++;
            }
            else;
                System.out.println("Invalid Order! Please enter a valid items and quantity");
    
            
            do {
                System.out.print("Do you want to oder again? (Y/N): ");
                isOrdering = scanner.next().charAt(0);
            }
            while (isOrdering != 'Y' || isOrdering != 'N');
                
            if (isOrdering == 'Y'){
                continue;
            }
            else if (isOrdering == 'N'){
                break;
            }
    

        }

        System.out.println("==== Oder Summary ====");
        

     
        
        scanner.close();


    }
}
