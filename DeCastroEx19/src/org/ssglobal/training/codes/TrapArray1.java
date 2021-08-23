package org.ssglobal.training.codes;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TrapArray1 {
	
	private static Logger logger = LogManager.getLogger("trapLogger");
	Scanner scan = new Scanner(System.in);
	
	public void arrayTransact() {
		logger.info("Execute arrayTransact");
		String str;
		logger.info("Entering the loop");
		while (true) {
			int size = 0;
			// enter array size
			logger.info("Executing the loop for the array size");
			while (true) {
				System.out.print("Enter array size: ");
				str = scan.nextLine();
				if (str.equalsIgnoreCase("E")) {
					logger.info("Exiting the loop");
					break;
				}
				try {
					size = checkInt(str);
					break;
				} catch (InvalidSizeException e) {
					System.out.println(e.getMessage());
					logger.error("Invalid size. Asking for another input");
					continue;
				} catch (LetterSizeException e) {
					System.out.println(e.getMessage());
					logger.error("Letter input. Asking for another input");
					continue;
				} catch (Exception e) {
					logger.error("Entered wrong input. Asking for another input");
				}
			}
			if (str.equalsIgnoreCase("E")) {
				logger.info("Exiting the loop");
				break;
			}
			
			int[] arrayInt = new int[size];
			
			// enter value for the array
			int i = 0;
			while (i < size) {
				logger.info("Executing the loop for the value");
				System.out.print("Enter value: ");
				str = scan.nextLine();
				if (str.equalsIgnoreCase("E")) {
					logger.info("Exiting the loop");
					break;
				}
				try {
					int value = inputValues(str);
					arrayInt[i] = value;
				} catch (NumberFormatException e) {
					logger.error("Invalid input. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				} catch (ElementCharException e) {
					logger.error("CharSeq. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				} catch (ElementDecimalException e) {
					logger.error("Double. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				} catch (Exception e) {
					logger.error("Entered wrong input. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				}
				i++;
			}
			if (str.equalsIgnoreCase("E")) {
				break;
			}
			
			while (true) {
				logger.info("Executing the loop for value viewing");
				System.out.print("Enter the index you want to view: ");
				str = scan.nextLine();
				if (str.equalsIgnoreCase("E")) {
					logger.info("Exiting the index loop");
					break;
				}
				try {
					int index = viewIndex(str, arrayInt);
					System.out.println(arrayInt[index]);
				} catch (BadIndexException e) {
					logger.error("Bad index. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				} catch (Exception e) {
					logger.error("Entered wrong input. Asking for another input");
					System.out.println(e.getMessage());
					continue;
				}
			}
			if (str.equalsIgnoreCase("E")) {
				logger.info("Exiting the loop");
				break;
			}
			
			System.out.println();
		}
		
		scan.close();
	}
	
	// check if integer
	public int checkInt(String str) throws InvalidSizeException, 
										   LetterSizeException,
										   Exception{
		int num = 0;
		if (str.matches("\\d+")) {
			num = Integer.parseInt(str);
		} else if (str.matches("-?\\d+")) {
			throw new InvalidSizeException();
		} else {
			throw new LetterSizeException();
		}
		return num;
	}
	
	public int inputValues(String str) throws ElementCharException, 
											  ElementDecimalException,
											  Exception {
		int value = 0;
		if (str.matches("-?\\d+")) {
			value = Integer.parseInt(str);
		} else if (str.contains(".")) {
			throw new ElementDecimalException();
		} else if (str.length() > 1) {
			throw new ElementCharException("Invalid value: [String]");
		} else {
			throw new ElementCharException("Invalid value: [character]");
		}
		return value;			
	}
	
	public int viewIndex(String str, int[] array) throws BadIndexException, 
														 Exception{
		int index = 0;
		if (str.matches("\\d+")) {
			index = Integer.parseInt(str);
			if (index > array.length - 1) {
				throw new BadIndexException();
			}
		} else {
			throw new BadIndexException();
		}
		return index;
	}
	
}
