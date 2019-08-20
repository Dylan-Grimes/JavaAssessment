package com.qa.javaAssessment;

public class Assessment {
	
	//git test change
	

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		int large = 0;
		int medium = 0;
		int small = 0;
		if (a > b && b > c) {
			large += a;
			medium += b;
			small += c;
		} else if (b > a && a > c) {
			large += b;
			medium += a;
			small += c;
		} else if (b > c && c > a) {
			large += b;
			medium += c;
			small += a;
		} else if (a > c && c > b) {
			large += a;
			medium += c;
			small += b;
		} else if (c > a && a > b) {
			large += c;
			medium += a;
			small += b;
		} else {
			large += c;
			medium += b;
			small += a;
		} 
		
		if (large - medium == medium - small) {
			return true;
		} else {
			return false;
		}
		
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		String word = "";
		
		for (int i = 0; i < input.length(); i++) {
			if(i == (input.length()/2) || i == (input.length()/2 - (a / 2)) || i == (input.length()/2 + (a / 2))) {
				word += "";
			}
			else {
				word += input.substring(i,i+1);
			}
		}
			
		return word;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		
		int count = 0;
		int length = input.length();
		int tempCount = 0;
		
		for (int i = 0; i < length; i++) {

			if (i < length - 1 && input.charAt(i) == input.charAt(i + 1)) {
			 	tempCount++;
			}
			
			if (tempCount > count) {
				count = tempCount;
				tempCount = 0;
			}
			
			
		}
		

		return count;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		int count = 0;
		int length = arg1.length();
		//String text = arg1.toLowerCase();
		for (int i = 0; i < length; i++) {
			//kl nint test = ;
			if (i < length - 2  && 
					(!(arg1.indexOf('a') == 0) && arg1.charAt(i) == ' ' && arg1.charAt(i+1) == 'a' && arg1.charAt(i+2) == 'm' && arg1.charAt(i+3) == ' ') || 
					(arg1.indexOf('A') == 0 && arg1.charAt(i) == 'A' && arg1.charAt(i+1) == 'm' && arg1.charAt(i+2) == ' ') 
				) {
				count++;
			}
			
			if (i > length - (length - 2) && 
					(arg1.indexOf('a') == 0 && arg1.charAt(i) == 'a' && arg1.charAt(i+1) == 'm' && arg1.charAt(i+2) == ' ')) {
				count++;
			}else if(i > length + 1 && (arg1.indexOf('a') == 0 && arg1.charAt(i) == ' ' && arg1.charAt(i+1) == 'a' && arg1.charAt(i+2) == 'm' && arg1.charAt(i+3) == ' ')) {
				count++;
			}
			
		}
//		int index = 0;
//		while (index != -1) {
//			index = arg1.indexOf("Am ", index);
//			if (index != -1) {
//				index++;
//				count++;
//			}
//		}
//		
//		int index1 = 0;
//		while (index1 != -1) {
//			index1 = arg1.indexOf(" am ", index);
//			if (index1 != -1) {
//				index1++;
//				count++;
//			}
		
		return count;

	}
	
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String output = "";
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			output += "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			output += "fizz";
		
		} else if (arg1 % 5 == 0) {
			output += "buzz";
		} else {
			output += "";
		}

		
		return output;
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		int length = arg1.length();
		int result = 0;
		int num = 0;
		int temp = 0;
		int finalInt = 0;
		for (int i = 0; i < length; i++) {
			char number = arg1.charAt(i);
			
			
			if (number == ' ') {
				num = 0;
			}
			
			else if (number == '0') {
				num = 0;
				result = temp + num;

			}

			else if (number == '1') {
				num = 1;
				result += num;
			}
			else if (number == '2') {
				num = 2;
				result += num;
			}
			else if (number == '3') {
				num = 3;
				result += num;
			}
			else if (number == '4') {
				num = 4;
				result += num;
			}
			else if (number == '5') {
				num = 5;
				result += num;
			}
			else if (number == '6') {
				num = 6;
				result += num;
			}
			else if (number == '7') {
				num = 7;
				result += num;
			}
			else if (number == '8') {
				num = 8;
				result += num;
			}
			else if (number == '9') {
				num = 9;
				result += num;
			}	
			
			
			if (result > finalInt) {
				finalInt = result;
				result = 0;
			}

			
		}
		
		return finalInt;
	}
				
		
		
	
}
