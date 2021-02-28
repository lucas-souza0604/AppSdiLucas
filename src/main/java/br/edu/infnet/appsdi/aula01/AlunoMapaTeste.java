package br.edu.infnet.appsdi.aula01;

import java.util.HashMap;
import java.util.Map;

public class AlunoMapaTeste {

	public static void main(String[] args) {
		
		Map<Integer, String> mapaNomes = new HashMap<Integer, String>();
		mapaNomes.putIfAbsent(1, "Lucas");
		mapaNomes.putIfAbsent(2, "OK");
		mapaNomes.putIfAbsent(3, "Okk");
		
		
		String nome = mapaNomes.remove(1);
		
		System.out.println(nome);
		System.out.println(mapaNomes);
	}
}
