public class BinarySearch{
    
    public static void main(String args[])
    {
        int arr[] = {-10, 1, 3, 6,9, 10, 14, 23};
        int target = 10;
        int ans = binarSearch(arr, target);
        System.out.println(ans);

    }

    static int binarSearch(int arr[], int target)
    {
        // sorted array
        //find the mid ele of the array and then see if the mid is > target or < target or == targer
        int start = 0;
        int end = arr.length - 1;
       

        while (start <= end)
        {
            int mid = start + (end - start)/2;
            
            if (target < arr[mid])
            {
                end = mid -1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }






}