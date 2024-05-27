package exemploEnum;

import java.util.Iterator;

public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
			//System.out.println(e.getSigla() + " - " + e.getNome());
		}
		EstadoBrasileiro eBrasileiro = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println(eBrasileiro.getNome());
		System.out.println(eBrasileiro.getSigla());
		System.out.println(eBrasileiro.getNomeMaiusculo());
		System.out.println(eBrasileiro.getIbge());
	}
}
