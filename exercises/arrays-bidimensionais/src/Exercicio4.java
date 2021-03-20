
public class Exercicio4 {
	
	public static void main(String[] args) {
		Exercicio4 e4 = new Exercicio4();
		
		double[][] bidimensionalArray = new double[][] {{1.0, 0.0, 1.0, 0.0}, {2.0, 1.0, 2.0, 1.0}};
		System.out.println(e4.getElementsQuantityFromBidimensionalArray(bidimensionalArray));
		
	}
	
	public int getElementsQuantityFromBidimensionalArray(double[][] bidimensionalArray) {
		int counter = 0;
		for (int i = 0; i < bidimensionalArray.length; i++) {
			for (int j = 0; j < bidimensionalArray[i].length; j++) {
				counter++;
			}
		}
		return counter;
	}
}
