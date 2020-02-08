/**
 * 
 */
package com.projeto.classes;

class ClassePrincipal {
	
	public static void main(String[] args) {
		
		Casa minhaCasa = new Casa();
		
		minhaCasa.cor = "Azul";
		minhaCasa.vagasGaragem = 10;
		
		System.out.println(minhaCasa.vagasGaragem);
		System.out.println(minhaCasa.cor);
		minhaCasa.abirGaragem();

	}

}
