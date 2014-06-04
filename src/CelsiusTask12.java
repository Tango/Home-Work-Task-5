

	import javax.swing.JOptionPane;

	public class CelsiusTask12 {

		public static void main(String[] args) {
			String input = JOptionPane.showInputDialog("Hello!\n\nInput current temperature please\n(without decimal part)"),tomor;
			double tToday = Double.parseDouble(input),tTomor, tSea, tSea2;
			
	// проверка на ввод температуры в разумных рамках
				while (tToday < -70 || tToday > 60 || tToday%(int)tToday>0){
					input = JOptionPane.showInputDialog("Uncorrect input! \nTry again please!");
					tToday = Double.parseDouble(input);
			  	}
				double delta = (Math.random()*10);
				int windNow = (int)(11+(delta/2));
				delta = (int)(5-delta); // генерируем дельту в диапазоне от -5 до 5
				tTomor = (int)(tToday + delta + tToday/15); //температура на завтра
				tSea = (tToday<0)? 0: (int)Math.abs(tToday-Math.abs(delta/2));
				tSea2 = (tTomor-(delta/2)<0)?0:(int)Math.abs(tTomor-tToday/10-(delta/2));
				input = (tToday>22)? "Hot ":(tToday<=22&&tToday>=15)? //сегодня
						"Warm ":(tToday<15&&tToday>=0)?"Cool ":"Frost ";
				
				tomor = (tTomor>22)? "Hot ":(tTomor<=22&&tTomor>=15)? //завтра
						"Warm ":(tTomor<15&&tTomor>=0)?"Cool ":"Frost ";
				windNow = (tToday<0)? (int)windNow+windNow/10:(tToday>30)?(int)windNow-windNow/10:windNow; 
					JOptionPane.showMessageDialog(null,"Today\n"+input+tToday+"°C\n"
							+"Winds "+windNow+"km/h\n"
							+"Rainfall probability "+(int)(Math.random()*100)+"%\n"
							+"Seawater temperature "+tSea
							+"\n\nTomorrow\n"+tomor+ tTomor + "°C\n"
							+"Winds "+(int)(windNow-windNow/8-(Math.random()*3))+"km/h\n"
							+"Rainfall probability "+(int)(Math.random()*100)+"%\n"
							+"Seawater temperature "+tSea2);
		}	
	}
