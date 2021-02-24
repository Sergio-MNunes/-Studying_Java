package br.com.caelum.leilao.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Leiloeiro {
	private double maiorLance;
	private double menorLance;
	
	public void avaliaLeilao(Leilao leilao) {
		
		if (leilao.getLances().size() == 0) {
			throw new RuntimeException("Leil�o n�o possui lances para avaliar");
		} else {
		
		menorLance = leilao.getLances().stream()
				.mapToDouble(lance -> lance.getValor())
				.min()
				.orElseThrow(() -> new NoSuchElementException("Valor m�nimo n�o encontrado."));
		
		maiorLance = leilao.getLances().stream()
				.mapToDouble(lance -> lance.getValor())
				.max()
				.orElseThrow(() -> new NoSuchElementException("Valor m�ximo n�o encontrado."));
		}
	}
	
	public double getMenorLance() {
		return menorLance;
	}
	
	public double getMaiorLance() {
		return maiorLance;
	}
	
	public List<Lance> getCincoMaioresLances(Leilao leilao) {
		
		List<Lance> cincoMaioresLances = new ArrayList<>(leilao.getLances());
		cincoMaioresLances.sort((lance1, lance2) -> Double.compare(lance1.getValor(), lance2.getValor()));
		Collections.reverse(cincoMaioresLances);
		
		if (cincoMaioresLances.size() < 5) return cincoMaioresLances;
		
		return cincoMaioresLances.subList(0, 5);
	}
	
	public double mediaDosLances(Leilao leilao) {
		return leilao.getLances().stream()
			.mapToDouble(Lance::getValor)
			.average()
			.orElse(0);	
	}
}
