package Employee_Database;

import java.util.Scanner;

public class DocRepository {

    private Employee currentEmployee;

    public void menu() {
        Scanner scan = new Scanner(System.in);
        int mainMenu = 1;
        int employeeMenu = 1;
        int docMenu = 1;
        int y;
        int a;
        int b;
        while (mainMenu == 1) {
            System.out.println("Main Menu:");
            System.out.println("1. Create an Employee");
            System.out.println("2. End the Program");
            System.out.println("Enter Your Selection: ");
            y = scan.nextInt();
            if (y == 1) {
                currentEmployee = new Employee();
                System.out.println("Enter a name:");
                currentEmployee.setName(scan.next());
                while (employeeMenu == 1) {
                    System.out.println("Employee Menu:");
                    System.out.println("1. Create a Document");
                    System.out.println("2. Edit a Document");
                    System.out.println("3. View a Document");
                    System.out.println("4. Return to Main Menu");
                    System.out.println("5. End the Program");
                    a = scan.nextInt();
                    if (a == 1) {
                        if (currentEmployee.getCurrentDoc() == null) {
                            CompanyDoc empDoc = new CompanyDoc();
                            currentEmployee.setCurrentDoc(empDoc);
                            System.out.println("Enter a title:");
                            empDoc.setTitle(scan.next());
                        } else {
                            System.out.println("Would you like to replace the current doc? Yes or No");
                            String answer = scan.next();
                            if (answer.equals("Yes")) {
                                CompanyDoc empDoc = new CompanyDoc();
                                currentEmployee.setCurrentDoc(empDoc);
                                System.out.println("Enter a title:");
                                empDoc.setTitle(scan.next());
                            } else {
                                System.out.println("Current doc not replaced");
                            }
                        }
                    } else if (a == 2) {
                        if (currentEmployee.getCurrentDoc() != null) {
                            while (docMenu == 1) {
                                System.out.println("Document Menu:");
                                System.out.println("1. Add Words");
                                System.out.println("2. Remove Words");
                                System.out.println("3. Return to Employee Menu");
                                System.out.println("4. Return to Main Menu");
                                System.out.println("5. End the Program");
                                b = scan.nextInt();
                                if (b == 1) {
                                    System.out.println("How many words to be added?");
                                    int add = scan.nextInt();
                                    currentEmployee.getCurrentDoc().setLength(currentEmployee.getCurrentDoc().getLength() + add);
                                } else if (b == 2) {
                                    System.out.println("How many words to be subtracted?");
                                    int sub = scan.nextInt();
                                    if (currentEmployee.getCurrentDoc().getLength() >= sub) {
                                        currentEmployee.getCurrentDoc().setLength(currentEmployee.getCurrentDoc().getLength() - sub);
                                    } else {
                                        System.out.println("Not enough words in the document");
                                    }
                                } else if (b == 3) {
                                    System.out.println("Returning to Employee Menu");
                                    docMenu = 0;
                                } else if (b == 4) {
                                    System.out.println("Returning to Main Menu");
                                    docMenu = 0;
                                    employeeMenu = 0;
                                } else if (b == 5) {
                                    System.out.println("Program ended");
                                    docMenu = 0;
                                    employeeMenu = 0;
                                    mainMenu = 0;
                                }
                            }
                        } else {
                            System.out.println("No existing document");
                        }
                    } else if (a == 3) {
                        System.out.println(currentEmployee.getName() + "'s Document: " + currentEmployee.getCurrentDoc());
                    } else if (a == 4) {
                        System.out.println("Returning to Main Menu");
                        employeeMenu = 0;
                    } else if (a == 5) {
                        System.out.println("Program ended");
                        employeeMenu = 0;
                        mainMenu = 0;
                    }
                }
            } else if (y == 2) {
                System.out.println("Program ended");
                mainMenu = 0;
            }
        }
    }
}
