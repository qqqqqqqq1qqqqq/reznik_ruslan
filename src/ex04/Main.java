package ex04;

/** ���������� � �����������
 * ����������; ������ � ���� ���������
 * ���������� ������ main()
 * @author Danylo_Donets
 * @version 4.0
 * @see Main#main
 */
public class Main {
	
	/** ���������� ��� ������� ��������;
	 * ������� ����� {@linkplain Application#run()}
	 * @param args ��������� ������� ��������
	 */
	public static void main(String[] args) {
		Application app = Application.getInstance();
		app.run();
	}
}