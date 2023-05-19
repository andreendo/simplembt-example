package com.github.simplembt.simplembt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Adaptor {
	private PilhaRestrita p;
	
	public void new_x() throws Exception {
		p = new PilhaRestrita(3);
	}
	
	public void empilhar() throws Exception {
		p.empilhar("s1");
	}
	
	public void empilhar_x_menos_1() throws Exception {
		p.empilhar("s2");
		p.empilhar("s3");
	}
	
	public void vazia_true() throws Exception {
		assertTrue(p.vazia());
	}
	
	public void vazia_false() throws Exception {
		assertFalse(p.vazia());
	}
}
