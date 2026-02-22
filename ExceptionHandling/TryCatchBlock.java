package ExceptionHandling;
class TryCatchBlock {
	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println("Done! The result is : "+ result);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("You are in catch block!");
		}catch(Exception e) {
			System.out.println("You are in catch block!");
		}finally {
			System.out.println("ALWAYS EXECUTES FINALLY BLOCK!");
		}
	
		
		
	}
}