import javax.swing.JOptionPane;
public class ChickenTask16 {
	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("Input the chickens' quantity");
		double n = Double.parseDouble(input);
// checking of the right chicken quantity's input
			while (n <= 0 || n%(int)n>0){
				input = JOptionPane.showInputDialog("Uncorrect input! \nTry again please!");
				n = Double.parseDouble(input);
			}	
				
		input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
				+ "Input the chicken's cost");
		double m = Double.parseDouble(input);
// checking of the right price input 
					while (m <= 0){
						input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
								+ "Uncorrect input! \nTry again please!");
						m = Double.parseDouble(input);
					}
						
		input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
				+ "M = " + m + "$ for 1 chicken\n"
				+ "Input the the eggs' quantity per week");
		double x = Double.parseDouble(input);
// checking of the right quantity's input 
					while (x <= 0 || x%(int)x>0){
						input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
								+ "M = " + m + "$ for 1 chicken\n"
								+ "Uncorrect input! \nTry again please!");
						x = Double.parseDouble(input);
					}

		input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
				+ "M = " + m + "$ for 1 chicken\n"
				+ "X = " + (int)x + " eggs make 1 chick per week\n"
				+ "Input the price for 10 eggs");
		double z = Double.parseDouble(input);
// checking of the right price input 
					while (z <= 0){
						input = JOptionPane.showInputDialog("N = " + (int)n + " chickens\n"
								+ "M = " + m + "$ for 1 chicken\n"
								+ "X = " + (int)x + " eggs make 1 chick per week\n"
								+ "Uncorrect input! \nTry again please!");
						z = Double.parseDouble(input);
					}

// breakeven point calculating and showing   
		JOptionPane.showMessageDialog(null,"N = " + (int)n + " chickens\n"
				+ "M = " + m + "$ for 1 chicken\n"
				+ "X = " + (int)x + " eggs make 1 chick per week\n"
				+ "Z = " + z + " $ for 10 eggs"
				+"\n\n" + "You need "+Math.round(m*n/(n*x/7*z/10))+" days for cover your outlay.");	  	
	}
}
