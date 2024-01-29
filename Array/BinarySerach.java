public class BinarySerach {
    public static int binarySearch (int numbers[],int key) {
        int s=numbers[0];
        int e=numbers.length-1;
        int mid=(s+e)/2;
        while(s<=e){
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
     int numbers[]={2,4,6,8,10,12,14};
     int key=10;
        System.out.println("key is at index:"+binarySearch(numbers,key));
    }
}
