package javabank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         //declaracion de variables
    double balance = 1500.7;
    String accountNumber = "123456789";
    int pin = 1234;
    boolean isActive = true;
    char initial = 'A';
    byte age =28;
    short smallNumber = 32000;
    long bigNumber = 10000000000L;
    float temperature = 36.6f;

    //array de montos de transacciones
    int[] transactionAmounts = {100, 200, -50};

    //opraciones con variables
        /*balance += transactionAmounts [0];//deposito
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso concedido");            
        }

        balance++;
        String status = (balance < 0) ? "deuda": "credito";
        System.out.println("Estado de cuenta: " + status);
        System.out.println("saldo: " + balance);*/

        //verifica si hay fondos suficientes y si el pin es valido
       /* boolean hastFunds = balance > amountRequested;
        if (hastFunds && pin.equals(inputPin)) {
            System.out.println("Transaccion autorizada");

        } else {
            System.out.println("Error en transaccion");
        }*/


// manejo de transacciones bancarias
  
    ArrayList<String> transactions = new ArrayList<>();
    transactions.add("deposito");

 
   
    }
    //metodo autenticacion usuario
    public boolean authenticateUser(String inputPin){
        int attemps = 0;
        while (attemps < 3) {
            if (this.pin.equals(inputPin)) {
                return true;
            } else {
                attemps++;
                System.err.println("Pin incorrecto. Intento "+ attemps);
            }
        }
        return false;
    }
   //metodo menu cajero
    public void displayMenu(){

        System.err.println("Opciones del ATM");
        System.err.println("1. Consultar saldo");
        System.err.println("2. Depositar dinero");
        System.err.println("3. Retirar Dinero");
        System.err.println("Selecciona una opcion:");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                    checkBalance();
                
            break;

            case 2:
                    depositMoney():
            break;

            case 3 :

                    withdrawmoney();
            break;

                    
            default:
                System.err.println("Opcion no valida");
            
        }
    } 
}