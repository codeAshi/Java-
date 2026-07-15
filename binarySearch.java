class BinarySearch {

    int findBFSearch(int[] arr, int s, int end, int f) {

        if (s > end) {
            return -1;
        }

        int mid = s + (end - s) / 2;

        if (arr[mid] == f) {
            return mid;
        }

        if (f < arr[mid]) {
            return findBFSearch(arr, s, mid - 1, f);
        }

        return findBFSearch(arr, mid + 1, end, f);
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        BinarySearch b = new BinarySearch();

        int res = b.findBFSearch(nums, 0, nums.length - 1, 6);

        System.out.println(res);
    }
}