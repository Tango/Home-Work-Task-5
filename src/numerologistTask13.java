	import javax.swing.JOptionPane;
	public class numerologistTask13 {

			public static void main(String[] args) {
				String input = JOptionPane.showInputDialog("�, ������� �����!\n���� � ��������  ������� ������"
						);
				while (input.length()==0 || input.length()<=5){
					input = JOptionPane.showInputDialog("������, ��������!\n������ � ���� �� �����");
			  	}
	
				switch((int)Math.round((Math.random()*25))){
					case 1:
						JOptionPane.showMessageDialog(null, "������ ��������� ����");
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "�������, ��!");
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "������ ������ - ��!");
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "��������");
						break;
					case 5:
						JOptionPane.showMessageDialog(null, "������ ��, ��� ���");
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "� ������ ���������� ����� ���� ����� ������,\n��, - ���� ������ �� ������� �� �������.");
						break;
					case 7:
						JOptionPane.showMessageDialog(null, "���!");
						break;
					case 8:
						JOptionPane.showMessageDialog(null, "���� ��");
						break;
					case 9:
						JOptionPane.showMessageDialog(null, "������ 'H��', ��� '��'");
						break;
					case 10:
						JOptionPane.showMessageDialog(null, "������������");
						break;
					case 11:
						JOptionPane.showMessageDialog(null, "����� ������ � ����� �������");
						break;
					case 12:
						JOptionPane.showMessageDialog(null, "�� ��, �� ���, ����� ����������");
						break;
					case 13:
						JOptionPane.showMessageDialog(null, "���-���� ����� ����� �������� ��");
						break;
					case 14:
						JOptionPane.showMessageDialog(null, "� ���� ���� �������� ����� ������� � �������");
						break;
					case 15:
						JOptionPane.showMessageDialog(null, "� ���������� ����� ����� ����� ��������");
						break;
					case 16:
						JOptionPane.showMessageDialog(null, "���� ������� ������� �� ���� ����� �����");
						break;
					case 17:
						JOptionPane.showMessageDialog(null, "������ ����� �� ��� ����� ������ �����");
						break;
					case 18:
						JOptionPane.showMessageDialog(null, "�� ��� ������� ����� ����� ������");
						break;
					case 19:
						JOptionPane.showMessageDialog(null, "����� ������ � ������ ������� ");
						break;
					case 20:
						JOptionPane.showMessageDialog(null, "���� ������ ���� ���������\n�� ������ �������� �� ���� ������");
						break;
					case 21:
						JOptionPane.showMessageDialog(null, "����������");
						break;
					case 22:
						JOptionPane.showMessageDialog(null, "��������� ���, ���� � �� ����� �� ����");
						break;
				}
			}	
		}
