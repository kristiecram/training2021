package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTrapArray {
	
	private TrapArray1 trap;

	@BeforeEach
	public void setup() {
		trap = new TrapArray1();
	}
	
	@Test
	public void testArrayTransact() {
		trap.arrayTransact();
	}
	
	@AfterEach
	public void teardown() {
		trap = null;
	}
}
