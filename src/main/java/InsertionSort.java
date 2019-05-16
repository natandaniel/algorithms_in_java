public class InsertionSort {

    public static int[] sort(int[] numbers) throws Exception{

        if(numbers == null || numbers.length == 0){
            throw new Exception("the input array should not be null or empty");
        }

        if(numbers.length == 1){
            return numbers;
        }

        for(int i = 0; i < numbers.length-1; i++){

            int j = i + 1;
            int pivot = numbers[j];

            while(j>0 && pivot < numbers[j-1]){

                numbers[j] = numbers[j-1];
                numbers[j-1] = pivot;
                j--;
            }
        }

        return numbers;
    }

    public static void main(String[] args) throws Exception {

        int[] numbers = {10,9,8,7,6,5,4,3,2,1};

        int[] sortedNumbers = sort(numbers);

        for(int i = 0; i < sortedNumbers.length;  i++) {
            System.out.print(sortedNumbers[i]);
        }
    }
}
