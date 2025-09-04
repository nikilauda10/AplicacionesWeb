import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoCuenta cuenta1 = new BancoCuenta("Nicholas",15000);
        int opcion;
        do {
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Saldo");
            System.out.println("3. Retirar Saldo");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> System.out.println("Saldo actual: $" + cuenta1.consultar());
                    case 2 -> {
                        System.out.print("Cantidad a depositar: ");
                        double deposito = sc.nextDouble();
                        cuenta1.depositar(deposito);
                    }
                    case 3 -> {
                        System.out.print("Cantidad a retirar: ");
                        double retiro = sc.nextDouble();
                        cuenta1.retirar(retiro);
                    }
                    case 4 -> System.out.println("Gracias por usar el banco :)");
                    default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();


            }
        }
