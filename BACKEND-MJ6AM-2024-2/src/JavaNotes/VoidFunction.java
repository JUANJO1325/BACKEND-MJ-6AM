package JavaNotes;

import java.util.Scanner;

public class VoidFunction {

    static int costumerId;

     static String costumerName;

     static String email;

    static String password;

    static String status;
    static Scanner sc = new Scanner(System.in);

   // static StatusCustumer status = new StatusCustumer();

    public static void main(String[] args) {
        createCostumer();
        printCostumerData();

    }
    public static void createCostumer(){
        System.out.println("Ingrese el id");
        costumerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Name");
        costumerName = sc.nextLine();
        System.out.println("Email");
        email = sc.nextLine();
        System.out.println("Password");
        password = sc.nextLine();
        System.out.println("Seleccione un estado:");
        int selection = sc.nextInt();
        status = selectStatus(selection);

    }
    public static void printCostumerData(){

        System.out.println("Id" + costumerId + "\n" +
                "Name" + costumerName + "\n" +
                "Email" + email + "\n" +
                "Status" + status);
    }

    public static void selectStatus(int selection){
        String active = null;

        if (selection == 1){

            active = String.valueOf(StatusCustumer.TRUE);

        }else if (selection == 2){
            active = String.valueOf(StatusCustumer.FALSE);
        }else{
            System.out.println("Seleccion no valida");
        }
        return active;

    }
}
