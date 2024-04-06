
public class Practice {

    static int array[] = { 0, 3, 2 };

    public static int[] ReverseArray(int inputArray[]) {
        int temp[] = new int[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            for (int j = 0; j >= 0; j++) {
                // System.out.print(inputArray[i] + " ");
                temp[j] = inputArray[i]; // Assigning the value of inputArray[i] to temp[j]
            }

        }
        return temp;
    }

    public static void main(String[] args) {
        int reversedArray[] = ReverseArray(array);
        System.out.println("Reversed array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
