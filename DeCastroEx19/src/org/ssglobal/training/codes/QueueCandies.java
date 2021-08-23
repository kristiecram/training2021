package org.ssglobal.training.codes;

import java.util.Deque;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class QueueCandies {
	
	private static Logger logger = LogManager.getLogger("collectionLogger");

	public void getCandy(Queue dispenser, int day) throws DayOutofBoundsException, Exception {
		logger.info("Execute getCandy dispenser:{} day:{}", dispenser, day);
		logger.info("Verification of day input");
		if (day < 0 || day > 6) {
			logger.error("Exiting with errors getCandy");
			throw new DayOutofBoundsException();
		}
	
		Deque<String> queue = dispenser.getDispenser();
		logger.info("Determination of day");
		if (day == 0) {
			logger.info("Execute Mon");
			System.out.println("Monday");
			logger.info("Execute whole dispenser looping");
			while (true) {
				String candy = queue.peekFirst();
				logger.info("Exiting the loop if candy is null");
				if (candy == null) {
					break;
				}
				System.out.println(queue);
				System.out.printf("Pipi eats %s \n", candy);
				queue.removeFirst();
			}
			logger.info("Done dispenser looping");
			System.out.println();
		} else if (day == 1) {
			logger.info("Execute Tues");
			System.out.println("Tuesday");
			logger.info("Execute whole dispenser looping");
			while (true) {
				String candy = queue.peekFirst();
				if (candy == null) {
					break;
				}
				System.out.println(queue);
				System.out.printf("Pipi eats %s \n", candy);
				queue.removeFirst();
				candy = queue.peekFirst();
				queue.addLast(candy);
				queue.removeFirst();
			}
			logger.info("Done dispenser looping");
			System.out.println();
		} else if (day == 2) {
			logger.info("Execute Wed");
			System.out.println("Wednesday");
			logger.info("Execute whole dispenser looping");
			while (true) {
				String candy = queue.peekFirst();
				if (candy == null) {
					break;
				}
				System.out.println(queue);
				System.out.printf("Pipi eats %s \n", candy);
				queue.removeFirst();
				int i = 0;
				logger.info("Execute addition and removal of candies");
				while (i < 2) {
					candy = queue.peekFirst();
					queue.addLast(candy);
					queue.removeFirst();
					i++;
				}
			}	
			logger.info("Done dispenser looping");
			System.out.println();
		} else if (day == 3 || day == 4 || day == 5) {
			logger.info("Execute Thurs-Sat");
			String days = null;
			if (day == 3) {
				days = "Thursday";
			} else if (day == 4) {
				days = "Friday";
			} else {
				days = "Saturday";
			}
			System.out.println(days);
			logger.info("Execute whole dispenser looping");
			while (true) {
				String candy = queue.peekFirst();
				if (candy == null) {
					break;
				}
				System.out.println(queue);
				System.out.printf("Pipi eats %s \n", candy);
				queue.removeFirst();
				int i = 0;
				logger.info("Execute addition and removal of candies");
				while (i < 3) {
					candy = queue.peekFirst();
					queue.addLast(candy);
					queue.removeFirst();
					i++;
				}
			}	
			System.out.println();
			logger.info("Done dispenser looping");
		} else if (day == 6) {
			logger.info("Execute Sun");
			System.out.println("Sunday");
			logger.info("Execute whole dispenser looping");
			while (true) {
				String candy = queue.peekFirst();
				if (candy == null) {
					break;
				}
				System.out.println(queue);
				System.out.printf("Pipi eats %s \n", candy);
				queue.removeFirst();
				int i = 0;
				logger.info("Execute addition and removal of candies");
				while (i < 6) {
					candy = queue.peekFirst();
					queue.addLast(candy);
					queue.removeFirst();
					i++;
				}
			}	
			System.out.println();
			logger.info("Done dispenser looping");
		}
		
		logger.info("Exit without errors getCandy");
	}
}
