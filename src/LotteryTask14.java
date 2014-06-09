import javax.swing.JOptionPane;
public class LotteryTask14 {

		public static void main(String[] args) {
			double match;
			String str0 = "WELCOME TO THE JAVALOTTERY!\n";
			String str1 = "\nPlease offer ";
			String str2  = " number from 5\nbetween 1 and 42";
			String strOffer ="Your    combination     is     "; 
			String strLot   ="The winning combination is "; 
			String seq [] = {"first","second","third","fourth","fifth"};

			int i = 0, j=0, val;
			int lot [] = new int [5];
			int offer [] = new int [5];
			
	//==== setting random unique members to array - присваиваем элементам массива уникальные значения 
			for(i=0; i<lot.length; i++){
				do{	match=0;
					val =(int)((Math.random()*42)+1); // the range including 42  			
							for(j=0;j<lot.length;j++){
								if (lot[j] == val) {
									match=1;
									break;
								}	else match=0;
							}
				} while (match==1);
				lot[i]=val;		
				strLot +="   "+val+"";
			}
		
	//=====================  request for user combination ==================================== 
			for(i=0; i<offer.length; i++){
				do{	match=0;
				String input = JOptionPane.showInputDialog(str0+str1 + seq[i] + str2);
					val =(int)Double.parseDouble(input);			
							for(j=0;j<offer.length;j++){
								if (offer[j] == val || val>42) {
									match=1;
									break;
								}	else match=0;
							}
				} while (match==1);
				offer[i]=val;
				str0 = "";
				strOffer +="   "+val+"";
			}
				
	//================== comparing for elements' matching - сравниваем массивы =============== 
			int scores = 0;
			for(i=0; i<offer.length; i++){
					for(j=0;j<lot.length;j++){
						if(offer[i]==lot[j]) {
							scores++;
							str0 += " "+offer[i]; // collecting winning numbers - собираем угаданные номера в строку
						}
					}
			}
			
	//================ Final message ========================================================= 				
			i = (scores == 3)? 300 : (scores == 4)? 4000 : (scores == 5)? 50000 : 0;
			if (i==0 && scores > 0) 		
				JOptionPane.showMessageDialog(null,strOffer+"\n"+strLot+"\nYou've guessed only"+str0+"\nBetter luck next time  buddy : )");
			else if (i>0)
				JOptionPane.showMessageDialog(null,"CONGRADULATIONS!\nYou've won "+i
					+"$\n"+strOffer+"\n"+strLot+"\nYou've guessed "+str0);
				 else 
					 JOptionPane.showMessageDialog(null,strOffer+"\n"+strLot+"\n"+str0+"\nBetter luck next time, buddy : )");
		}
	}
