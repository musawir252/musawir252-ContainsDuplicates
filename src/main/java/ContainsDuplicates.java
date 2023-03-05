import java.util.*;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
    Set<Integer> it = new HashSet<Integer>();
    //Creating a set because set cant have duplicate values
    //Looping through array nums length
        for(int i = 0; i < nums.length;i++){
            //if the set contains a duplicate value return true
            if(it.contains(nums[i])){
                return true;
            }
            //If it does not return true add it to the set and continue to the next element
            it.add(nums[i]);
        }
        //return false otherwise
       return false;
    }
}
