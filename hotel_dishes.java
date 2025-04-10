package conditionalstatement;
import java.util.Scanner;

public class hotel_dishes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        long reg_contact = 9876543210l;
        System.out.print("Enter the contact: ");
        long contact = sc.nextLong();

        if (reg_contact == contact) {
            System.out.println("Generate OTP");
            System.out.println("Processing...");
            int sys_otp = (int) (Math.random() * 9999 + 9999); // generating OTP
            Thread.sleep(2000);
            System.out.println("System OTP: " + sys_otp);

            System.out.print("Enter the OTP: ");
            int entered_otp = sc.nextInt();

            if (sys_otp == entered_otp) {
                System.out.println("OTP entered is correct");
                System.out.println("Login Successful");
                System.out.println("Wait a moment...");
                System.out.println("Select the Hotel\n1. Buhari\n2. A2\n3. SS Hyderabad Briyani");

                String hotel = sc.next();
                switch (hotel) {
                    case "Buhari":
                        System.out.println("Welcome to Buhari");
                        System.out.println("Select your favorite food");
                        System.out.println("1. Mutton Briyani\n2. Chicken Briyani\n3. Prawn Briyani");

                        System.out.print("Select your favorite food: ");
                        String fav_food = sc.nextLine();

                        switch (fav_food) {
                            case "Mutton Briyani":
                                int price = 380;
                                System.out.print("Enter the Quantity: ");
                                int quantity = sc.nextInt();
                                int bill = price * quantity;
                                System.out.println("The bill amount is: " + bill);
                                System.out.println("Redirect to Payment Mode");
                                System.out.println("Select your payment mode\n1. Gpay\n2. Phonepay\n3. Paypal");

                                System.out.print("Select the payment mode: ");
                                String pay_mode = sc.next();

                                switch (pay_mode) {
                                    case "Gpay":
                                        int entered_mpin = 1234;
                                        System.out.print("Enter the MPIN: ");
                                        int user_mpin = sc.nextInt();

                                        if (entered_mpin == user_mpin) {
                                            System.out.println("MPIN Successfully Activated");
                                            System.out.println("Entered Bill Amount: " + bill);
                                            System.out.print("User Bill Amount: ");
                                            int user_billamount = sc.nextInt();

                                            if (user_billamount == bill) {
                                                System.out.println("Order placed");
                                                System.out.println("Thank you for coming... order again.");
                                            } else {
                                                System.out.println("Order not placed");
                                            }
                                        }
                                        break;

                                    case "Phonepay":
                                    case "Paypal":
                                        // You can add logic for other payment modes here
                                        System.out.println("Payment mode selected: " + pay_mode);
                                        break;

                                    default:
                                        System.out.println("Invalid payment mode selected.");
                                        break;
                                }
                                break;

                            // You can add cases for Chicken Briyani and Prawn Briyani similarly
                            case "Chicken Briyani":
                                // Add logic here
                                break;

                            case "Prawn Briyani":
                                // Add logic here
                                break;

                            default:
                                System.out.println("Invalid food option selected.");
                        }
                        break;

                    case "A2":
                    case "SS Hyderabad Briyani":
                        // You can add logic for other hotels if needed
                        System.out.println("Hotel not implemented in this example.");
                        break;

                    default:
                        System.out.println("Invalid hotel selected.");
                }
            } else {
                System.out.println("Incorrect OTP entered");
            }
        } else {
            System.out.println("Incorrect contact number");
        }

        sc.close();
    }
}
