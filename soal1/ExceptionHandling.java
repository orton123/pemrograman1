public class ExceptionHandling {
	public static void main(String[]args) {
		int[] array = new int[3];
		try {
		
			array[5] = 1;
		} catch (ArrayIndexOUtOfBoundsException e)
{
		System.out.println("Error!!" + e.toString());
		}
	}
}