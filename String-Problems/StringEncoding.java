
/*
https://www.naukri.com/code360/problems/encode-the-message_699836?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
*/

public class StringEncoding {

    public static void main(String[] args) {
        String st = encode("Moosa");
        System.out.println("Encoded Msg:"+st);
    }

    public static String encode(String message) {
		// Write your code here.
		int counter = 0;
		char d = message.charAt (0);
		char c;
		StringBuilder stEncoded= new StringBuilder();
		for (int i = 0; i < message.length(); i++){
           // System.out.println (message.charAt (i));
            c = message.charAt (i);
			if(d==c){
				counter++;
			}else{
				stEncoded.append(d);
				stEncoded.append(counter);
				d=c;
				counter = 1; 
			}
		}
		//laast character entry was missing in the for loop
		stEncoded.append(d);
		stEncoded.append(counter);
		//System.out.println(stEncoded);
		return stEncoded.toString();
	}
}
