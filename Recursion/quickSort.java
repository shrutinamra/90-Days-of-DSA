class Solution {
    public int[] sortArray(int[] nums) {
         quickSort(nums,0,nums.length-1);
        return nums;
    }
    public static void quickSort(int[]nums,int lowerIndex,int higherIndex)
    {
        if(lowerIndex >= higherIndex)
            return;
        int pivotPos = partition(nums,lowerIndex,higherIndex);
        quickSort(nums,lowerIndex,pivotPos-1);
        quickSort(nums,pivotPos+1,higherIndex);
    }
    public static int partition(int[]nums,int li,int hi)
    {
        int pivot = nums[li];
        int count = 0;
        for(int i = li+1;i<=hi;i++)
        {
            if(nums[i]<=pivot)
                count++;
        }
        int pivotPos = li+count;
        int temp = nums[pivotPos];
        nums[pivotPos] = nums[li];
        nums[li] = temp;
        int start = li;
        int end = hi;
        while(start < pivotPos && end > pivotPos)
        {
            while(nums[start] <= pivot && start <= hi )
                start++;
            while(nums[end] > pivot  && end > li)
                end--;
            if(start < pivotPos && end > pivotPos)
            {
                int temp1 = nums[start];
                nums[start] = nums[end];
                nums[end] = temp1;
            }
        }
        return pivotPos;
    }
}
