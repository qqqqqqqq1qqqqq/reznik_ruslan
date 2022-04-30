package ex03;

import ex02.ViewableResult;
import ex02.View;

/** ConcreteCreator
 * (������ ������������
 * Factory Method)<br>
 * ��'����� �����,
 * "����������" ��'����
 * @author Danylo_Donets
 * @version 1.0
 * @see ViewableResult
 * @see ViewableTable#getView()
 */

public class ViewableTable extends ViewableResult 
{
	/** ������� ����������� ��'��� {@linkplain ViewTable} */
	@Override
	public View getView() 
	{
		return new ViewTable();
	}
}