package com.github.simplembt.simplembt;

import org.junit.jupiter.api.Test;

class PilhaRestritaTestV_2 {

	private Adaptor adaptor = new Adaptor();
	
	@Test
	void testCT1() throws Exception {
		adaptor.new_x();
		adaptor.vazia_true();
		adaptor.empilhar();
		adaptor.vazia_false();
		adaptor.empilhar_x_menos_1();
		adaptor.vazia_false();
	}
	
}