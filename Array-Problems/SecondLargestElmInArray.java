
public class SecondLargestElmInArray {

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int secLargest = -9999;
        int larg = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > larg) {
                secLargest = larg;
                larg = arr[i];
            } else if (arr[i] > secLargest && arr[i] != larg) {
                secLargest = arr[i];
            }

        }

        if (secLargest == -9999) {
            secLargest = -1;
        }

        return secLargest;

    }

  public static void main(String args[]){
    int[] arr = {2,5,3,9,4};
    int inSecLargest = findSecondLargest(5,arr);
    System.out.println(inSecLargest);

  }

   
}
