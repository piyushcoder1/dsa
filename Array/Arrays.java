import java.util.*;
public class Arrays{
    public static void update(int m[]){
        for(int i=0;i<m.length;i++){
            m[i]=m[i]+1;

        }
    }
public static void main(String[] args) {
    // int[] mark=new int[3];
    // mark[0]=1;
    // mark[1]=2;
    // mark[2]=3;
    // System.out.println(mark[0]);
    
    // int marks[]={1,2,3};


//    Scanner sc=new Scanner(System.in);
//    int size=sc.nextInt();
//    int numbers[]=new int [size];
//    for(int i=0;i<size;i++){
//        numbers[i]=sc.nextInt();
//    }
//    for(int i=0;i<size;i++){
//        System.out.println(numbers[i]);
//    }

int m[]={97,98,99};
    update(m);
    for(int i=0;i<m.length;i++){
    System.out.println(m[i]+ " ");
    }

}
}