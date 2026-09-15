package week2;

public class ExceptionHandling {
	
	public static void main(String[] args) {

        try {

            int[] arr = {10, 20, 30};

            // This causes ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);

            // This causes ArithmeticException
            int result = 10 / 0;

            System.out.println(result);
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is out of bounds.");
        }

        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }

        finally {

            System.out.println("Finally block always executes.");
        }
    }

}
