public class LargestAndSmallest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int numbers[]) {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;

    }
    public static void main(String args[]){
        int numbers[]={2,4,5,78,7};
        int largestNumber=getLargest(numbers);
        int smallestNumber=getSmallest(numbers);
        System.out.println("Largest Number Number:"+" "+largestNumber);
        System.out.println("Smallest Number:"+" "+smallestNumber);


    }
}
