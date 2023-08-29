import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        SortedSet<Integer> numSet = new TreeSet<>();
        for(int num: nums){
            numSet.add(num);
        }
        List<Integer> setArr = numSet.stream().toList();
        for(int i=0;i<numSet.size();i++){
            nums[i]=setArr.get(i);
        }

        return numSet.size();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,7};
        RemoveDuplicates obj = new RemoveDuplicates();
        int k = obj.removeDuplicates(nums);
        System.out.println(k);

        System.out.println();
        for(int i = 0; i < k; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

    }
}