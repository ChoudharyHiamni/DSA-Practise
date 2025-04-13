class Main {
    public static void mergeSort(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e - s + 1];
        int i = s;       // pointer for left part
        int j = mid + 1; // pointer for right part
        int k = 0;

        // Merge the two sorted parts
        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Add remaining elements from left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Add remaining elements from right
        while (j <= e) {
            temp[k++] = arr[j++];
        }

        // Copy temp array to original array
        for (int l = 0; l < temp.length; l++) {
            arr[s + l] = temp[l];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}

//Time Complexity;O(nlogn)
