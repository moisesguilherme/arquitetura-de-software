package com.gotocode.injecaodedependencias;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


public class InjecaoDeDependenciasApplication {


	public static void main(String[] args) {
		//SpringApplication.run(InjecaoDeDependenciasApplication.class, args);
		new MigracaoUsuario().migrar();
	}

}

class MigracaoUsuario {
	// MigracaoUsuario depende do FileReader e do FileWriter
	// Depende dos detalhes da implementacao (Auto acoplamento)
	// resolvendo com uso de abstracoes com uso de interface

	Reader reader = new FileReader();
	Writer writer = new DbWriter();

	void migrar() {
		// Criar o leitor e o escritor, criar os dois conceitos e
		// Separar a lógica para ter separacão de responsabilidades

		// Ler usuário de A
		List<User> user = reader.read();
		// Escrever usuário em B
		writer.write(user);
	}
}
record User(String email, String username, String password) {

}

interface Reader {
	//Tirar a dependência de User
	//List<User> read();
	List<User> read();

}

interface Writer {
	void write(List<User> users);
}

class FileReader implements Reader{
	public List<User> read() {
		// Foco em trabalhar com dependências de software
		System.out.println("Lendo usuários do arquivo...");
		return List.of(new User("email", "username", "password"));
	}
}

class DbWriter implements Writer {
	public void write(List<User> users) {
		System.out.println("Escrevendo usuários no banco...");
		System.out.println(users);
	}
}