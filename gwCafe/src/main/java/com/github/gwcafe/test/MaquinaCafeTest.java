package com.github.gwcafe.test;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

import com.github.gwcafe.sut.MaquinaCafeSUT;

//@GraphWalker(value = "random(edge_coverage(100))")
//@GraphWalker(value = "random(never)")
@GraphWalker(value = "random(edge_coverage(100))")
public class MaquinaCafeTest extends ExecutionContext implements MaquinaCafe {

	MaquinaCafeSUT sut;

	
	//--------------------------STATES------------------------------------------//
	@Override
	public void inicial() { }
	
	@Override
	public void sem_moedas() {
		if (sut.getSaldo() != 0)
			throw new RuntimeException();
	}

	@Override
	public void um_real() {
		if (sut.getSaldo() != 1)
			throw new RuntimeException();		
	}

	@Override
	public void dois_reais() {
		if (sut.getSaldo() != 2)
			throw new RuntimeException();		
	}

	@Override
	public void cafe_liberado() {
		if (sut.getSaldo() != 0)
			throw new RuntimeException();
	}


	//--------------------------EVENTS------------------------------------------//
	@Override
	public void iniciar() {
		sut = new MaquinaCafeSUT();
	}

	@Override
	public void moeda_diferente_erro() {
		try {
			sut.adicionarMoeda(2);
			throw new RuntimeException(); 
		} catch (Exception e) { }		
	}

	@Override
	public void pedir_cafe_sucesso() {
		if (sut.pedirCafe() != true)
			throw new RuntimeException();		
	}


	@Override
	public void moeda_1_erro() {
		try {
			sut.adicionarMoeda(1);
			throw new RuntimeException(); 
		} catch (Exception e) { }		
	}

	@Override
	public void moeda_1() throws Exception {
		sut.adicionarMoeda(1);
	}


	@Override
	public void pedir_cafe_erro() {
		if (sut.pedirCafe() != false)
			throw new RuntimeException();
	}
}
