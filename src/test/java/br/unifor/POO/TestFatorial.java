package br.unifor.POO;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Fatorial.Fatorial;
 

public class TestFatorial {
	
	private Fatorial fatorial;
	
	@Before
	public void init(){
		Fatorial fatorial = new Fatorial();
	}
	
	@Test
	public void testFatorialZero(){
		Assert.assertEquals(1, fatorial.calcula(0));
	}
	
	@Test
	public void testFatorialUm(){
		Assert.assertEquals(1, fatorial.calcula(1));
	}
	
	@Test
	public void testFatorialN(){
		Assert.assertEquals(24, fatorial.calcula(4));
	}

}
