package codingassigment;

public class ShuffleArray {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};

	        
	        shuffleArray(array);

	       
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int n = array.length;


	        for (int i = n - 1; i > 0; i--) {
	            int j = (int) (Math.random() * (i + 1));

	          
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}



