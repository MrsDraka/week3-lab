package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] intArray = {1, 5, 2, 8, 13};
		
		// 2. Print out the first element in the array
	
		System.out.println("The first element in the array is: " + intArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println("The last element in the array is: " + intArray[intArray.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?

		// System.out.println(intArray[6]);
		
		//Index 6 is out of bounds for the array which is of length 5
		
		// 5. Print out the element in the array at position -1, what happens?

		// System.out.println("This is the element at position -1 of the arraay: " + intArray[-1]);
		
		// -1 is also out of bounds
		
		// 6. Write a traditional for loop that prints out each element in the array
		
		System.out.println("Print each element in the array with traditional for loop: ");
	
		for (int i = 0; i < intArray.length ; i++) {
			System.out.println(intArray[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		
		System.out.println("Print each element in the array with enhanced for loop: ");
		
		for (int num : intArray) {
			System.out.println(num);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

		double sum = 0;
		
		for (int num : intArray) {
			sum += num;
		}
		
		System.out.println("Sum of teach element in the array: " +sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it

		double average = sum/intArray.length;
		int testLen = intArray.length;
		System.out.println("The number of elements in the array are: " +testLen);
		System.out.println("The average of the array values is: " + average);
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		System.out.println("Odd numbers in the array: ");
		
		for (int num : intArray) {
			if (num%2 != 0) {
				System.out.println(num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		
		String[] namesA = {"Sam", "Sally", "Thomas", "Robert"};
		
		
		
		// 12. Calculate the sum of all the letters in the new array

		int sumLetters = 0;
		
		for (String name : namesA) {
			sumLetters += name.length();
		}
		
		System.out.println("This is the sum of all the letters in the array: " + sumLetters);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		sayGreeting("Ana");
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		System.out.println("Testing the method that returns a greeting: " + giveGreeting("Isabel"));
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		// When creating the methods I always have to define what is being returned, or if there's nothing
		// to be returned I also must define it with "void" so it's known that it won't return anything.
		// The fact that method 13 doesn't return anything limits the ways in which I can use it, as it
		// will only print what it was told to. 
		// Method 14 in the other hand returns a value I can use in different ways, I can store in a variable, 
		// or as an element of an array, or I can print it. So it's more flexible and useful, over having a method
		// the won't return anything and whatever it does is more specific.
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		System.out.println("The string 'EMANCIPATE' has a larger length than 3. " + isGreater("EMANCIPATE", 3));
		System.out.println("The string 'JAVA' has a larger length that 10. " + isGreater("JAVA", 10));
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		String [] testArray = {"Hi", "Hola", "Salut", "Ciao", "Oi", "Shalom"};
		String helloTest = "Shalom";
		
		System.out.println("Is the word 'Shalom' in the array? " + isInArray(testArray, helloTest));
		System.out.println("Is the word 'Privet' in the array? " + isInArray(testArray, "Privet"));
		System.out.println("Is the word 'Hi' in the array? " + isInArray(testArray, "Hi"));
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		
		int [] numbersArray = {6, 90, 5, 8, 1, 14, 3, 89, 18, 15};
		
		System.out.println("The smallest number in the array is: " + smallestNum(numbersArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double [] myGrades = {90.20, 86.5, 77.75, 95.50, 80.99};
		
		System.out.println("This my grade average: " + String.format("%.2f", averageNum(myGrades)));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		//lengthOfStrings(String [] x)
		String [] stringArray = {"Java", "Array", "Method", "Instance", "Scope", "Type", "Declare"};
		int [] lenPosition = lengthOfStrings(stringArray);
		
		for (String word : stringArray) {
			System.out.println(word);
		}
		
		for (int len : lenPosition) {
			System.out.println(len);
		}
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		
		System.out.println("The sum of letters for all strings with even amount of letters is greater than"
		+ " the sum of those with an odd amount of letters. " + sumIsEven(stringArray));
	
		System.out.println("The sum of letters for all strings with even amount of letters is greater than"
				+ " the sum of those with an odd amount of letters. " + sumIsEven(testArray));
		
		String [] wordsArray = {"Trip", "Sugar", "Fun", "Leisure", "Games", "Reunion", "Forever"};
		
		System.out.println("The sum of letters for all strings with even amount of letters is greater than"
				+ " the sum of those with an odd amount of letters. " + sumIsEven(wordsArray));
		
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		//isPalindrome(String pal)
		System.out.println("alula is a palindrome. " + isPalindrome("alula"));
		System.out.println("Ana is a palindrome. " + isPalindrome("Ana"));
		System.out.println("Rake is a palindrome. " + isPalindrome("Rake"));
		System.out.println("rotator is a palindrome. " + isPalindrome("rotator"));
		System.out.println("deed is a palindrome. " + isPalindrome("deed"));
		System.out.println("Draka is a palindrome. " + isPalindrome("Draka"));
		System.out.println("kayak is a palindrome. " + isPalindrome("kayak"));
	
	
	}
	
	
	// Method 13:
	
	public static void sayGreeting(String name) {
		System.out.println("Welcome, " + name + "!");
	}

	// Method 14:

	public static String giveGreeting(String name) {
		return "Welcome, " + name + "!" ;
	}
	// Method 15:
	
	public static boolean isGreater(String word, int num) {
		return word.length()> num;
	}

	
	// Method 16:
	
	public static boolean isInArray(String [] array, String string) {
		for (String elem : array) {
			if (elem == string) {
				return true;
			}
		}
		return false;
		
	}
	// Method 17:

	public static int smallestNum(int [] numArray) {
		int numSmall = numArray[0];
		
		for (int num : numArray) {
			if (numSmall > num) {
				numSmall = num;
			}
		}
		return numSmall;
	}
	
	
	// Method 18:

	public static double averageNum(double [] doubArray) {
		double average = 0;
		for (double num : doubArray) {
			average += num;
		}
		return average/doubArray.length;
	}
	
	
	// Method 19:

	public static int [] lengthOfStrings(String [] x) {
		int lenArray [] = new int[x.length];
		int i = 0;
		
		for (String word : x) {
			lenArray[i] = word.length();
			i += 1;
		}
		return lenArray;
	}
	
	// Method 20:
	
	public static boolean sumIsEven(String [] letters) {
		int even = 0;
		int odd = 0;
		for (String word : letters) {
			if (word.length()%2==0) {
				even += word.length();
			} else {
				odd += word.length();
			}
		}
		return even >odd;
	}
	
	// Method 21:
	
	public static boolean isPalindrome(String pal) {
		pal = pal.toLowerCase();
		for (int i = 0; i < pal.length() / 2; i++) {
			if (pal.charAt(i) != pal.charAt(pal.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
