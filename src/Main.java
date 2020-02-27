public class Main {

    public static void Bart(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
    public static void main(String string[]){
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*(100));
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
        Bart(array, N);
    }

}
