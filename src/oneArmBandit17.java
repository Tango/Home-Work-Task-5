import javax.swing.JOptionPane;

public class oneArmBandit17 {  // YИ$
			public static void main(String[] args) {
				String line = "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][]\n";
				JOptionPane.showMessageDialog(null, line
						+ "<><><><><><>  | $ | $ | $ |  <><><><><><>\n"
						+ line
						+ "WELCOME TO THE ONE-ARM-BANDIT!\n"
						+ "\nAt this moment you have 5000 scores\n"
						+ "Every next combination costs 100 scores\n"
						+ "Press 'OK' to start the game\n"
						+ "and GOOD LUCK!");
				
				String strXXX ="";
								
				int i = 0, val, comb=0;
				int xxx [] = new int [3];
				

			double score=5000;	
			while(score>=100){
//==== setting random members to array - присваиваем элементам массива значени€ 
				for(i=0; i<xxx.length; i++){
					val = (int)Math.round(Math.random()*8);   			
					xxx[i]=val;
					strXXX = (i==0) ? "<><><><><><> | "+xxx[i]:(i==1)?strXXX+" | "+xxx[i]+" | ":strXXX+""+xxx[i]+" |  <><><><><><>";
				}				
				
//==== combination's checking ===================================================				
				if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==1) ||
					(xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==0) ||
					(xxx[0]==5      && xxx[1]!=5      && xxx[2]!=5)
				  ) comb = 1;
					else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==2) ||
							 (xxx[0]==5      && xxx[1]==5      && xxx[2]!=5) ||
							 (xxx[0]==7      && xxx[1]!=7      && xxx[2]!=7)
						  ) comb = 2;
						else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==3) ||
							     (xxx[0]==7      && xxx[1]==7      && xxx[2]!=7)
						       ) comb = 3;
							else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==4) 									 
								   ) comb = 4;
								else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==5) 									 
									   ) comb = 5;
									else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==6)									 
										   ) comb = 6;
										else if( (xxx[0]==xxx[1] && xxx[0]==xxx[2] && xxx[0]==7) ){
												comb = 7;
												strXXX = "<><><><><><> | $ | $ | $ | <><><><><><>"; 
											}
											 else comb = 8;				
		//	System.out.println("\n"+strXXX+ " comb " +comb);
					switch(comb){
						case 1:
							score+=50;
							JOptionPane.showMessageDialog(null,line
									+ strXXX+"\n"+line
									+ "\nCongradulations! \nYou're getting 150 scores"
									+ "\nTotal scores "+score);
						break;
						
						case 2:
						score+=100;
						JOptionPane.showMessageDialog(null,line
								+ strXXX+"\n"+line
								+ "\nCongradulations! \nYou're getting 200 scores"
								+ "\nTotal scores "+score);
						break;
						case 3:
						score+=200;
						JOptionPane.showMessageDialog(null,line
								+ strXXX+"\n"+line
								+ "\nCongradulations! \nYou're getting 300 scores"
								+ "\nTotal scores "+score);
						break;
						case 4:
						score+=300;
						JOptionPane.showMessageDialog(null,line
								+ strXXX+"\n"+line
								+ "\nCongradulations! \nYou're getting 400 scores"
								+ "\nTotal scores "+score);
						break;
						case 5:
							score+=4900;
							JOptionPane.showMessageDialog(null,line
									+ strXXX+"\n"+line
									+ "\nWow! \nYou're getting 5000 scores"
									+ "\nTotal scores "+score);
						break;
						case 6:
							score=0;
							JOptionPane.showMessageDialog(null,line
									+ strXXX+"\n"+line
									+ "\nOops! \nYou loose"
									+ "\nTotal scores "+score);
						break;
						case 7:
							score=10000;
							JOptionPane.showMessageDialog(null,line
									+ strXXX+"\n"+line
									+ "\nBINGO! \nYou're getting 10000 scores"
									+ "\nTotal scores "+score);
						break;
						case 8:
							score-=100;
							JOptionPane.showMessageDialog(null,line
									+ strXXX+"\n"+line
									+ "\nSorry! \nNo winning combination"
									+ "\nTotal scores "+score);
						break;
					}
					if (score == 10000) break;
			System.out.println(strXXX+ " comb " +comb);
			}
							
			if (score==10000)
				JOptionPane.showMessageDialog(null,line
						+ strXXX+"\n"+line
						+ "\nYou're the winner! \n"
						+ "\nPlease call our Administrator\n"
						+ "and receive 10 000$");
				else if (score<100)
					JOptionPane.showMessageDialog(null,line
							+ "<><><><><><> Game over <><><><><><> \n"+line
							+ "\nBetter luck next time, buddy! ;)");
				
			}
		}
