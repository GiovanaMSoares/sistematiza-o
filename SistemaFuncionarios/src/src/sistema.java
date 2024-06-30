package src;

import java.util.Scanner;

public class sistema {
	  // Método main para interação com o usuário via console
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("Digite o identificador do funcionário que deseja buscar (ou digite '0' para sair): ");
            int identificadorBusca = scanner.nextInt();

            if (identificadorBusca == 0) {
                System.out.println("Saindo do programa...");
            }
            scanner.close();


            // Buscar funcionário pelo identificador
            funcionario funcEncontrado = funcionario.buscarPorIdentificador(identificadorBusca);

            if (funcEncontrado != null) {
                System.out.println("Funcionário encontrado:");
                funcEncontrado.exibirinformacoes();
            } 
            else {
                System.out.println("Funcionário não encontrado para o identificador: " + identificadorBusca);
            }
    }
}