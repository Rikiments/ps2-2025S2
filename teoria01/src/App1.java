import java.util.Scanner;

public class App1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Boa noite!");
        System.out.print("Seu Nome: ");
        String nome = sc.nextLine();
        System.out.println("Prazer em conhecê-lo," + nome + "!");
        
        boolean sucesso = false;
        while (!sucesso) {
            System.out.print("Sua idade: ");
            try {
                int idade = Integer.parseInt(sc.nextLine());
                System.out.println("daqui a " + (100 - idade) + " anos voce sera centenario!");
                sucesso = true;
            } catch(NumberFormatException ex) {
                System.out.println("Por favor, entre apenas numeros para idade");
                System.out.println("Mensagem de erro: " + ex.getMessage());
            }
        }



    }
}