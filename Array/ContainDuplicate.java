import java.util.*;
public class ContainDuplicate {
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={11,12,3,4,5};
        System.out.println(containsDuplicate(nums));
    }
}