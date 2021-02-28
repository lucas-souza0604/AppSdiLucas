package br.edu.infnet.appsdi.aula01;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		String[] nomes = {"Lucas", "Elaine", "Anderson"};
		String[] emails = {"Lucas@gmail.com", "Elaine@gmail.com", "Anderson@gmail.com"};
		
		List<Aluno> alunos= new ArrayList<Aluno>();
		
		for (int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setId(i);
			aluno.setNome(nomes[i]);
			aluno.setEmail(emails[i]);
			
			alunos.add(aluno);
		}
		
		for (Aluno item: alunos) {
			System.out.println(item);
		}
	}
}
