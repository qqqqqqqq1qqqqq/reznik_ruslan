package ex01;

import java.io.Serializable;

/**
 * Зберігає вихідні данні та результат обчислень Хранит.
 * 
 * @author Danylo_Donets
 * @version 1.0
 */

public class Item2d implements Serializable 
{

	/** Аргумент обчислювальної функції. */
	// transient
	private int x;

	/** Результат обчислення функції. */
	private int []y = new int [10];

	/** Автоматично згенерована константа */
	private static final long serialVersionUID = 1L;

	/** Ініціалізує поля {@linkplain Item2d#x}, {@linkplain Item2d#y} */
	public Item2d()
	{
		x = 0;
		for(int i=0; i<10;i++) 
		{
			y[i]=0;
		}
	}

	/**
	 * Встановлює значення полей: аргумента и результата обчислення функції.
	 * 
	 * @param x - значення для ініціалізації поля {@linkplain Item2d#x}
	 * @param y - значення для ініціалізації поля {@linkplain Item2d#y}
	 */
	public Item2d(int x, int []y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * Встановлення значення поля {@linkplain Item2d#x}
	 * 
	 * @param x - значення для {@linkplain Item2d#x}
	 * @return Значення {@linkplain Item2d#x}
	 */
	public int setX(int x)
	{
		return this.x = x;
	}

	/**
	 * Отримання значення поля {@linkplain Item2d#x}
	 * 
	 * @return Значення {@linkplain Item2d#x}
	 */
	public int getX() 
	{
		return x;
	}

	/**
	 * Встановлення значення поля {@linkplain Item2d#y}
	 * 
	 * @param y - значення для {@linkplain Item2d#y}
	 * @return Значення {@linkplain Item2d#y}
	 */
	public int[] setY(int []y)
	{
		return this.y = y;
	}

	/**
	 * Отримання значення поля {@linkplain Item2d#y}
	 * 
	 * @return значение {@linkplain Item2d#y}
	 */
	public int[] getY()
	{
		return y;
	}

	/**
	 * Встановлення значення {@linkplain Item2d#x} і {@linkplain Item2d#y}
	 * 
	 * @param x - значення для {@linkplain Item2d#x}
	 * @param y - значення для {@linkplain Item2d#y}
	 * @return this
	 */
	public Item2d setXY(int x, int []y) 
	{
		this.x = x;
		this.y = y;
		return this;
	}

	/**
	 * Представляє результат обчислення в вигляді рядка.<br>
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		String text = "x= "+x+"\ny:\n";
		for(int i=0;i<10;i++) 
		{
			text = text+i+" -> "+y[i]+"\n";
		}
		
		return text;
	}

	/**
	 * Автоматично сгенерований метод.<br>
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item2d other = (Item2d) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		
		return true;
	}
}