/*
https://www.naukri.com/code360/problems/beautiful-string_1115625?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

*/
public class BeautifulStrings {

    public static void main(String[] args) {
        int in = makeBeautiful("000100");
        System.out.println("Beautiful String: " +in);
    }

    public static int calculateCount(String str,char c){

        //110101  0 1
            int count = 0;   
            for(int i = 0;i<str.length();i=i+2){
        
                if(str.charAt(i) != c){
        
                count++; ///1
        
            }
        
        }
        
            for(int i = 1;i<str.length();i=i+2){
        
                if(str.charAt(i) == c){ 
        
                count++;
        
            }   
        
        }
        
        return count;
        
         
        
        }
        
        public static int makeBeautiful(String str) {
        
         
        
        return Math.min(calculateCount(str,'0'), calculateCount(str,'1'));
        
        }
        
        


}


// str = 0 or 1
// alt 01

// 01011

// 01010

// 11010

// 10010
// 10110
// 10100
// 10101

// 01010
