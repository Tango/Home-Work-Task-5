

	import javax.swing.JOptionPane;
	public class whoWants {

			public static void main(String[] args) {

				JOptionPane.showMessageDialog(null, "Welcome to the Game!\nPress ok to continue");
				double ans;
				String input;
				int bonus=0, ran;
				double i = Math.random();
				ran = (i <= 0.3) ? 1 : ((i > 0.3) && (i < 0.66)) ? 2 : 3; // рандом от 1 до 3
				switch(ran){  
				case 1:
				//Case 1------------------------------------
							input = JOptionPane.showInputDialog("The capital of Great Britain is:\n"
							+ "\n1) Dublin             3) London "
							+ "\n2) Rotterdam     4) Kishinev "
							);
							ans = Double.parseDouble(input);
							// проверка на ввод числа в диапазоне
								while (ans < 1 || ans > 4 || ans%(int)ans>0){
								input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
								ans = Byte.parseByte(input);
								}	
								// вопрос №1 
								switch((int)ans){
									case 1:
									case 2:
										JOptionPane.showMessageDialog(null, "Wrong answer :(");
										bonus=0;
									break;
									case 3:
										bonus =+ 100;
										JOptionPane.showMessageDialog(null, "Definitely! You've got "+bonus+" $");
									break;
									case 4:
										JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
									break;
								}
								if (bonus > 0) {} else break;
								// вопрос № 2
								input = JOptionPane.showInputDialog("The capital of Norway is:\n"
										+ "\n1) Helsinki        3) Stockholm "
										+ "\n2) Oslo           4) Bergen "
										);
										ans = Double.parseDouble(input);
										// проверка на ввод числа в диапазоне
											while (ans < 1 || ans > 4 || ans%(int)ans>0){
											input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
											ans = Byte.parseByte(input);
											}	
											switch((int)ans){
												case 1:
													JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
													bonus = 0;
													break;
												case 2:
													bonus = bonus + 100;
													JOptionPane.showMessageDialog(null, "Great! Your balance is "+bonus+" $");
													break;
												case 3:
												case 4:
													JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
													bonus = 0;
												break;
											}
											if (bonus > 0) {} else break;
								//  вопрос № 3
								input = JOptionPane.showInputDialog("The capital of Indonesia is:\n"
													+ "\n1) Singapore        3) HongKong "
													+ "\n2) Hanoi       4) Jakarta "
													);
													ans = Double.parseDouble(input);
													// проверка на ввод числа в диапазоне
														while (ans < 1 || ans > 4 || ans%(int)ans>0){
														input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
														ans = Byte.parseByte(input);
														}	
														switch((int)ans){
															case 1:
															case 2:
															case 3:
																JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
																bonus=0;
															break;
															case 4:
																bonus = bonus + 100;
																JOptionPane.showMessageDialog(null, "Perfect! Your balance is "+bonus+" $");
															break;
														}
					// ----- End CASE 1  -----
					break;
				case 2:
					// Case 2------------------------------------
					// вопрос №1
					input = JOptionPane.showInputDialog("The capital of Spain is:\n"
					+ "\n1) Pamplona             3) Barselona "
					+ "\n2) Roma                     4) Madrid "
					);
					ans = Double.parseDouble(input);
					// проверка на ввод числа в диапазоне
						while (ans < 1 || ans > 4 || ans%(int)ans>0){
						input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
						ans = Byte.parseByte(input);
						}	
						// вопрос №1 
						switch((int)ans){
							case 1:
							case 2:
							case 3:
								bonus = 0;
								JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
							break;
							case 4:
								bonus =+ 100;
								JOptionPane.showMessageDialog(null, "Definitely! You've got "+bonus+" $");
							break;
						}

						if (bonus > 0) {} else break;
						//  вопрос № 2
						input = JOptionPane.showInputDialog("Jave's type 'long' has \n"
								+ "\n1) 32-bit        3) 8-bit "
								+ "\n2) 64-bit       4) 64-byte "
								);
								ans = Double.parseDouble(input);
								// проверка на ввод числа в диапазоне
									while (ans < 1 || ans > 4 || ans%(int)ans>0){
									input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
									ans = Byte.parseByte(input);
									}	
									switch((int)ans){
										case 1:
											bonus = 0;
											JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
											break;
										case 2:
											bonus = bonus + 100;
											JOptionPane.showMessageDialog(null, "Perfect! Your balance is "+bonus+" $");
											break;
										case 3:
										case 4:
											bonus = 0;
											JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
										break;
									}
									if (bonus > 0) {} else break;

						// вопрос № 3
						input = JOptionPane.showInputDialog("What is the smallest country in the world\nafter Vatican?\n"
								+ "\n1) Liechtenstein        3) Seychelles "
								+ "\n2) Monaco     4) Nauru "
								);
								ans = Double.parseDouble(input);
								// проверка на ввод числа в диапазоне
									while (ans < 1 || ans > 4 || ans%(int)ans>0){
									input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
									ans = Byte.parseByte(input);
									}	
									switch((int)ans){
										case 1:
											JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
											bonus = 0;
											break;
										case 2:
											bonus = bonus + 100;
											JOptionPane.showMessageDialog(null, "Great! Your balance is "+bonus+" $");
											break;
										case 3:
										case 4:
											JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
											bonus = 0;
										break;
									}
			    break;
		//----- End CASE 2 -----
					
				case 3:
				//Case 3------------------------------------
							input = JOptionPane.showInputDialog("What is the 4-th biggest country in the world?\n"
							+ "\n1) Brasil      3) China"
							+ "\n2) India        4) Australia "
							);
							ans = Double.parseDouble(input);
							// проверка на ввод числа в диапазоне
								while (ans < 1 || ans > 4 || ans%(int)ans>0){
								input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
								ans = Byte.parseByte(input);
								}	
								// вопрос №1 
								switch((int)ans){
									case 1:
									case 2:
										bonus=0;
										JOptionPane.showMessageDialog(null, "Wrong answer :(");
									break;
									case 3:
										bonus =+ 100;
										JOptionPane.showMessageDialog(null, "Definitely! You've got "+bonus+" $");
									break;
									case 4:
										bonus=0;
										JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
									break;
								}
								if (bonus > 0) {} else break;
								// вопрос № 2
								input = JOptionPane.showInputDialog("What country Java belongs to?:\n"
										+ "\n1) Australia        3) India "
										+ "\n2) Indonesia     4) Vietnam "
										);
										ans = Double.parseDouble(input);
										// проверка на ввод числа в диапазоне
											while (ans < 1 || ans > 4 || ans%(int)ans>0){
											input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
											ans = Byte.parseByte(input);
											}	
											switch((int)ans){
												case 1:
													JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
													bonus = 0;
												break;
												case 2:
													bonus = bonus + 100;
													JOptionPane.showMessageDialog(null, "Great! Your balance is "+bonus+" $");
												break;
												case 3:
												case 4:
													JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
													bonus = 0;
												break;
											}
											if (bonus > 0) {} else break;
								//  вопрос № 3
								input = JOptionPane.showInputDialog("The capital of Canada in 1869:\n"
													+ "\n1) Toronto        3) Montreal "
													+ "\n2) Ontario       4) Ottawa "
													);
													ans = Double.parseDouble(input);
													// проверка на ввод числа в диапазоне
														while (ans < 1 || ans > 4 || ans%(int)ans>0){
														input = JOptionPane.showInputDialog("Error! \nThere is no "+ans+" here.\nMake your choice again please!\n1 - 4");
														ans = Byte.parseByte(input);
														}	
														switch((int)ans){
															case 1:
															case 2:
															case 3:
																bonus=0;
																JOptionPane.showMessageDialog(null, "Wrong answer :(\nGame over.\nTry to play again");
																break;
															case 4:
																bonus = bonus + 100;
																JOptionPane.showMessageDialog(null, "Perfect! Your balance is "+bonus+" $");
															break;
														}
					// ----- End CASE 3  -----
					break;	
				}
				if(bonus>0)
					JOptionPane.showMessageDialog(null, "Game over\nWow!\nYou won " + bonus + " $\nCongradulation$!");
							else
								JOptionPane.showMessageDialog(null, "Good luck!");
			}	
	}
