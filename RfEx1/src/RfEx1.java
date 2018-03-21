public class RfEx1 {
	private static final int DEFAULT_AMOUNT = 0;

	public void printAmount() {
	  int amount = DEFAULT_AMOUNT;
		amount = getAmount(amount);
		  printDetails(amount);
		}

	/**
	 * @param amount
	 * @return
	 */
	private int getAmount(int amount) {
		for (int i=1; i<5; i++) {
		    amount += i;
		  }
		return amount;
	}

	private void printDetails(int amount) {
		// TODO Auto-generated method stub
		
	}
}