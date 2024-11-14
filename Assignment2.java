public class Assignment2 {
        public static void main(String[] args) {
            
            int[] arrayNumbers = {34, 56, 23, 89, 12, 78, 55, 21, 90, 11};
    
            int largest = arrayNumbers[0];
            int smallest = arrayNumbers[0];
    
            for (int i = 1; i < arrayNumbers.length; i++) {
                if (arrayNumbers[i] > largest) {
                    largest = arrayNumbers[i];
                }
                if (arrayNumbers[i] < smallest) {
                    smallest = arrayNumbers[i];
                }
            }
    
            System.out.println("Largest number in the array: " + largest);
            System.out.println("Smallest number in the array: " + smallest);
        }
    }
    