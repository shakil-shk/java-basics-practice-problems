package shk.practice.Arrays;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val) continue;
            else{
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Remove_Element obj = new Remove_Element();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int k = obj.removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
