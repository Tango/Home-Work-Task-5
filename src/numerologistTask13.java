	import javax.swing.JOptionPane;
	public class numerologistTask13 {

			public static void main(String[] args) {
				String input = JOptionPane.showInputDialog("О, Великий Раджа!\nДжин в ожидании  вопроса Твоего"
						);
				while (input.length()==0 || input.length()<=5){
					input = JOptionPane.showInputDialog("Прости, Господин!\nВопрос я Твой не понял");
			  	}
	
				switch((int)Math.round((Math.random()*25))){
					case 1:
						JOptionPane.showMessageDialog(null, "Небеса баговолят Тебе");
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Конечно, Да!");
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Звезды молвят - Да!");
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Вероятно");
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "Скорее да, чем нет");
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "В погоде завтрашней ответ Твой будет найден,\nДА, - если солнце Ты увидишь до полудня.");
						break;
					case 7:
						JOptionPane.showMessageDialog(null, "Нет!");
						break;
					case 8:
						JOptionPane.showMessageDialog(null, "Вряд ли");
						break;
					case 9:
						JOptionPane.showMessageDialog(null, "Скорее 'Hет', чем 'Да'");
						break;
					case 10:
						JOptionPane.showMessageDialog(null, "Маловероятно");
						break;
					case 11:
						JOptionPane.showMessageDialog(null, "Ответ сокрыт в твоем вопросе");
						break;
					case 12:
						JOptionPane.showMessageDialog(null, "Ни да, ни нет, ответ посередине");
						break;
					case 13:
						JOptionPane.showMessageDialog(null, "Кое-кому этого очень хотелось бы");
						break;
					case 14:
						JOptionPane.showMessageDialog(null, "В свой день рождения ответ найдешь в подарке");
						break;
					case 15:
						JOptionPane.showMessageDialog(null, "В компьютере твоем давно ответ запрятан");
						break;
					case 16:
						JOptionPane.showMessageDialog(null, "Твой близкий человек об этом знает лучше");
						break;
					case 17:
						JOptionPane.showMessageDialog(null, "Искать ответ на это стоит завтра утром");
						break;
					case 18:
						JOptionPane.showMessageDialog(null, "Ты сам найдешь ответ через неделю");
						break;
					case 19:
						JOptionPane.showMessageDialog(null, "Ответ сокрыт в пивной бутылке ");
						break;
					case 20:
						JOptionPane.showMessageDialog(null, "Даже звезды всей вселенной\nне смогут ответить на этот вопрос");
						break;
					case 21:
						JOptionPane.showMessageDialog(null, "Однозначно");
						break;
					case 22:
						JOptionPane.showMessageDialog(null, "Абсолютно нет, даже и не думай об этом");
						break;
				}
			}	
		}
