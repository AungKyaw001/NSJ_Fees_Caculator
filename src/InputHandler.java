import java.util.Scanner;

public class InputHandler {
    public String requestAthleteName() { /* Validation for Athlete Name*/
        Scanner sc = new Scanner(System.in);
        String name = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter Athlete Name :: ");
            String inp = sc.nextLine().trim();
            if (inp.isEmpty()) {
                System.out.println("!!! Empty Value, Pls Enter Again !!!");
            } else {
                try {
                    name = inp;
                    isValid = true;
                } catch (Exception e) {
                    System.out.println("!!! Invalid Input, Pls Enter Again !!!");
                }
            }
        }
        return name;
    }

    public int requestOperation() {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter the operation number (1 or 2 or 3) :: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("!!! Input is Empty, Pls Try Again !!!");
            } else {
                try {
                    if (Integer.parseInt(input) == 1 || Integer.parseInt(input) == 2 || Integer.parseInt(input) == 3) {
                        op = Integer.parseInt(input);
                        if (op == 1) {
                            Main.isRegister = true;
                        }
                        isValid = true;
                    } else {
                        System.out.println("!!! Invalid input, Pls enter 1 or 2 or 3 only, Try Again !!!");
                    }
                } catch (Exception e) {
                    System.out.println(e + " : Try Again");
                }
            }

        }
        return op;
    }

    public String requestTrainingPlan() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String tp = "";
            System.out.print("\nChoose the training plan :: ");
            tp = sc.nextLine();
            if (!(tp.isEmpty()) || !(tp.isBlank())) {
                if (tp.equalsIgnoreCase("Beginner") || tp.equalsIgnoreCase("Intermediate") || tp.equalsIgnoreCase("Elite")) {
                    return tp;
                }
                System.out.println("!!! \"" + tp + "\" is not a valid string - Pleas enter (Beginner, Intermediate, Elite) only!!!");
            }else {
                System.out.println("!!! Empty String, Pls try again");
            }
        }
    }

    public double requestCurrentWeight() {
        Scanner sc = new Scanner(System.in);
        double weight = 0.0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter your current weight :: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Invalid Input: Try Again");
            } else {
                try {
                    weight = Double.parseDouble(input);
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println(e + " : Try Again");
                }
            }
        }

        return weight;
    }

    public int requestCompetitionEntered() {
        Scanner sc = new Scanner(System.in);
        int numOfCom = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter the number of competition entered :: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Invalid Input: Try Again");
            } else {
                try {
                    numOfCom = Integer.parseInt(input);
                    isValidInput = true;
                } catch (NumberFormatException e) {
                    System.out.println(e + " : Try Again");
                }
            }
        }
        return numOfCom;
    }

    public String hasCoachingHour() {
        Scanner sc = new Scanner(System.in);
        String ans = "";
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Have you taken private coaching hour? (y/n)");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Invalid Input, Pls enter (y,n) only, Try Again");
            } else if (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes") ||
                    input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Input, Pls enter (y,n) only, Try Again");
            } else {
                try {
                    ans = input;
                    isValidInput = true;
                } catch (Exception e) {
                    System.out.println(e.toString() + " : Try Again");
                }
            }
        }
        return ans;
    }


    public int requestCoachingHour() {
        Scanner sc = new Scanner(System.in);
        int cHour = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter the number of private coaching hour :: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Invalid Input: Try Again");
            } else {
                try {
                    // only accpet if hour is less than or equal to 20
                    if (Integer.parseInt(input) <= 20) {
                        cHour = Integer.parseInt(input);
                        isValidInput = true;
                    } else {
                        System.out.println("!! Invalid Input, Athlete can't take more than 20 private coaching hour !!, Try Again !!!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(e + " : Try Again");
                }
            }
        }
        return cHour;
    }

    public String askRunAgain() {
        Scanner sc = new Scanner(System.in);
        String runAgain = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Do you want to run again (y/n) :: ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("!!! Empty Input, Pls Enter Again !!!");
            } else {
                try {
                    if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("Yes") ||
                            input.equalsIgnoreCase("n") || input.equalsIgnoreCase("No")) {
                        runAgain = input;
                        isValid = true;
                    } else {
                        System.out.println("!!! Invalid Input, Pls enter Yes or No only, Try Again !!!");
                    }
                } catch (Exception e) {
                    System.out.println(e + ", Try Again");
                }
            }

        }
        return runAgain;
    }
}


