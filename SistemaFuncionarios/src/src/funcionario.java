package src;

import java.util.ArrayList;
import java.util.List;

public class funcionario {
		//Informações
		private String nome;
		private String alergia;
		private String problemamedico;
		private String telefone;
		private String email;
		private int identificador;

		 // Lista estática para armazenar os funcionários (apenas para exemplo didático)
	    private static List<funcionario> funcionarios = new ArrayList<>();

	    //Contrutor
		public funcionario (String nome, String alergia, String problemamedico, String telefone, String email, int identificador) {
			this.nome = nome;
			this.alergia = alergia;
			this.problemamedico = problemamedico;
			this.telefone = telefone;
			this.email = email;
			this.identificador = identificador;
		
		// Adiciona o funcionário criado à lista estática
	        funcionarios.add(this);
		}
		
		// Getters
	    public int getIdentificador() {
	        return identificador;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    public String getAlergia() {
	        return alergia;
	    }

	    public String getProblemamedico() {
	        return problemamedico;
	    }
		
		//Metodo para exibir informações sobre os funcionários
		public void exibirinformacoes () {
		System.out.println ("\n--------------");
		System.out.println ("Nome: " + nome);
		System.out.println ("Alergia: " + alergia);
		System.out.println ("Problema médico: " + problemamedico);
		System.out.println ("Telefone: " + telefone);
		System.out.println ("Email: " + email);
		System.out.println ("Identificador: " + identificador);
		System.out.println ("--------------\n");
}
		// Método estático para buscar funcionário pelo identificador
	    public static funcionario buscarPorIdentificador(int identificador) {
	        for (funcionario func : funcionarios) {
	            if (func.getIdentificador() == identificador) {
	                return func;
	            }
	        }
	        return null; // Retorna null se não encontrar o funcionário com o identificador especificado
	    }
	    
		//Método main - apenas para teste rápido
	    public static void main(String[] args) {
	        funcionario func1 = new funcionario ("Antônio Marques", "Novalgina", "Diabetes", "+55 61 9999-8888", "antonio@marques.com", 6782);
	        func1.exibirinformacoes ();    
		    funcionario func2 = new funcionario ("Alice Machado", "Poeira", "Hipertensão", "+55 61 7777-3333", "alice@machado.com", 9237);
		    func2.exibirinformacoes ();    		    
		 // Buscando um funcionário pelo identificador
	        int identificadorBusca = 6782; // Identificador a ser buscado
	        funcionario funcEncontrado = funcionario.buscarPorIdentificador(identificadorBusca);

	        if (funcEncontrado != null) {
	            System.out.println("Funcionário encontrado:");
	            funcEncontrado.exibirinformacoes();
	        } else {
	            System.out.println("Funcionário não encontrado para o identificador: " + identificadorBusca);
	        }
	    }
}
