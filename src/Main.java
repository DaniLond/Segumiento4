import java.util.Scanner;
public class Main {

    public static Scanner reader= new Scanner(System.in);;
    public static BST bst= new BST();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        System.out.println("Menu");

        boolean stopFlag = false;

        while (!stopFlag) {

            System.out.println("Type an option");
            System.out.println("1. Agregar registro");
            System.out.println("2. Buscar registro por puntaje");
            System.out.println("3. Jugadores por orden alfabetico");
            System.out.println("4. TOP5");
            System.out.println("0. Exit");

            int mainOption = reader.nextInt();

            switch (mainOption) {

                case 1:
                    addScoreRegister();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    System.out.println("Puntaje" + " "+ "Nombre");
                    bst.alphabeticalOrder();
                    break;
                case 4:
                    System.out.println("Puntaje" + " "+ "Nombre");
                    bst.top5();
                    break;
                case 0:
                    System.out.println("Thanks for using our system");
                    stopFlag = true;
                    break;
                default:
                    System.out.println("You must type a valid option");
                    break;

            }

        }

    }

    public static void addScoreRegister(){
        System.out.println("Ingrese el username");
        reader.nextLine();
        String username= reader.nextLine();

        System.out.println("Ingrese el puntaje");
        int score= reader.nextInt();

        bst.addScoreRegister(username , score);

    }

    public static void search(){
        System.out.println("Ingrese el puntaje a buscar");
        int score= reader.nextInt();

        ScoreRegistry scoreRegistry= bst.search(score);

        System.out.println("\nUsuario\n Nombre: " + scoreRegistry.getName() + "\n Puntaje: " + scoreRegistry.getScore());
    }

}