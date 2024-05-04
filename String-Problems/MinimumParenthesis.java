
import java.util.ArrayList;
import java.util.List;

/*
https://www.naukri.com/code360/problems/mnfrj_1075018?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
 */


public class MinimumParenthesis {
    	
    public static void main(String[] args) {
        int in = minimumParentheses(")((()");
        System.out.println("Min Parn: " +in );

        /*
        2
)((()
((
     */
    }
    
    public static int minimumParentheses(String pattern) {
		// Write your code here.
		int inCount = 0;
		List<Character> list =  new ArrayList<>();
		for(char a : pattern.toCharArray()){
			if(a=='('){
				list.add(a);	
			}
			if(a==')'){
				if(!list.isEmpty()){
					    list.remove(list.size() - 1);
				}
				else{
					inCount++;
				}
			}
		}

		inCount +=list.size();
		return inCount;
	}
}
