package AdvancedDataStructureInJava;

public class RemoveTheElement {
    public static void main(String[] args) {
        int arr[]= {3,2,2,3};
        int val=3;
       int remove= removeElement(arr, val);
        System.out.println(remove);


    }
    public  static  int removeElement(int nums[], int val){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

}
