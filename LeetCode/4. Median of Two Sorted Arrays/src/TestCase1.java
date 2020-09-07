public class TestCase1 {

    static double findMedianSortedArrays(int[] A, int[] B){
        if(A.length > B.length){// to ensure we always working on the smaller array.
            return findMedianSortedArrays(B, A);
        }

        int m = A.length;
        int n = B.length;
        int low = 0;
        int high = m;

        while(low <= high){
            int partionA = (low + high)/2;// i
            int partionB = (m + n + 1)/2 - partionA;// j

            // check for edge cases as well
            int maxLeftA = (partionA == 0) ? Integer.MIN_VALUE : A[partionA - 1];
            int minRightA = (partionA == m) ? Integer.MAX_VALUE : A[partionA];

            int maxLeftB = (partionB == 0) ? Integer.MIN_VALUE : B[partionB - 1];
            int minRightB = (partionB == n) ? Integer.MAX_VALUE : B[partionB];

            // 3 conditions
            if(maxLeftA <= minRightB && maxLeftB <= minRightA){
                if((m + n) % 2 == 0){// check to see if the merged array is even or odd
                    return ((double)Math.max(maxLeftA, maxLeftB) + (double)Math.min(minRightA, minRightB))/2;
                }else{
                    return (double)Math.max(maxLeftA, maxLeftB);
                }
            }else if(maxLeftA > minRightB){
                high = partionA - 1;
            }else{
                low = partionA + 1;
            }
        }


        throw new IllegalArgumentException();
    }

    public static void main(String[] args){
        int[] arr1 = {1, 3, 8, 9, 15};
        int[] arr2 = {7, 11, 19, 21, 25};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
