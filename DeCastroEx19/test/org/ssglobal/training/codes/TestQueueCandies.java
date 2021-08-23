package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestQueueCandies {
	
	private QueueCandies qc;
	private Queue queue1;

	@BeforeEach
	public void setup() {
		qc = new QueueCandies();
		queue1 = new Queue();
	}
	
	@Test
	public void testGetCandy() {
		queue1.addCandy("Raspberry");
		try {
			qc.getCandy(queue1, 1);
		} catch (DayOutofBoundsException e) {
			
		} catch (Exception e) {
			
		}
	}
	
	@AfterEach
	public void teardown() {
		qc = null;
		queue1 = null;
	}
}
