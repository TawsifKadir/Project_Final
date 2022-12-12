package helpers;

public class Compare {
	
	//Compare two strings in lexical order. If equal returns 0. Otherwise returns
	//the difference of the two strings.
	public int compare(String s1,String s2) {
		if(s1.equals(s2)) {
			return 0;
		}
		else if(s1.length() != s2.length()){
			return s1.length()-s2.length();
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) != s2.charAt(i))
				return s1.charAt(i)-s2.charAt(i);
		}
		return 0;
	}
}
