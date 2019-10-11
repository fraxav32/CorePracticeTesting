package PracticeExtra;

public class FindLongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder firstString=new StringBuilder("congratulations");
		StringBuilder secondString=new StringBuilder("gratitude");
		System.out.println("First string is "+ firstString);
		System.out.println("Second string is "+ secondString);
		
		StringBuilder resultSet=findLongestSubStringMethod(firstString,secondString);
		System.out.println("Longest substring of above two string is "+ resultSet);
		
	}
	
	public static StringBuilder findLongestSubStringMethod(StringBuilder first,StringBuilder second) {
		StringBuilder longestSubString= new StringBuilder();
		int longString=0;
		int tempLongString=0;
		StringBuilder tempLongestSubString=new StringBuilder();
		for(int i=0;i<first.length()-1;i++) {
			for(int j=0;j<second.length()-1;j++) {
				if(first.charAt(i)==second.charAt(j) && first.charAt(i+1)==second.charAt(j+1)) {
					tempLongestSubString=new StringBuilder();
					int tempi=i+2;
					int tempj=j+2;
					tempLongString=2;
					tempLongestSubString.append(first.charAt(i));
					tempLongestSubString.append(first.charAt(i+1));
					while(first.charAt(tempi)==second.charAt(tempj)) {
						tempLongestSubString.append(first.charAt(tempi));
						tempLongString++;
						tempi++;
						tempj++;
					}
				}
			}
			if(longString<tempLongString) {
				longString=tempLongString;
				longestSubString=tempLongestSubString;
			}
		}
		
		return longestSubString;
		
	}
}
