package ex04;

/** ���������
 * ��������� �������;
 * ������ Command
 * @author Danylo_Donets
 * @version 1.0
 */
public interface ConsoleCommand extends Command {
	/** ������ ������ �������;
	 * ������ Command
	 * @return ������ ������ ������
	 */
	public char getKey();
}