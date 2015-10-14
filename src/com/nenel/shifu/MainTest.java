package com.nenel.shifu;

import org.junit.Assert;
import org.junit.Test;

import com.nenel.shifu.MainClass;

public class MainTest {

	@Test
	public void pierreVSpierre() {
		int result = 0;
		String player = "p";
		String computer = "p";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void feuilleVSfeuille() {
		int result = 0;
		String player = "f";
		String computer = "f";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void ciseauxVSciseaaux() {
		int result = 0;
		String player = "c";
		String computer = "c";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void pierreVSfeuille() {
		int result = -1;
		String player = "p";
		String computer = "f";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void feuilleVSciseaux() {
		int result = -1;
		String player = "f";
		String computer = "c";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void ciseauxVSpierre() {
		int result = -1;
		String player = "c";
		String computer = "p";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void feuilleVSpierre() {
		int result = 1;
		String player = "f";
		String computer = "p";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void ciseauxVSfeuille() {
		int result = 1;
		String player = "c";
		String computer = "f";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}
	
	@Test
	public void pierreVSciseaux() {
		int result = 1;
		String player = "p";
		String computer = "c";		
		
		MainClass main = new MainClass();
		Assert.assertNotNull(main);
		int r = MainClass.compareResult(player, computer);
		
		Assert.assertEquals(result, r);
	}

}
