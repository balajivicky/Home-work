class LinearRecursion {

    static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }

        return linearSearch(arr, target, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 20, 25, 31, 43, 64};
        int target = 43;

        int ans = linearSearch(arr, target, 0);

        if (ans != -1) {
            System.out.println("Index value is: " + ans);
        } else {
            System.out.println("Not found");
        }
    }
}