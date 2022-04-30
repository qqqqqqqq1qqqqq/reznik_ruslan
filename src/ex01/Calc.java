package ex01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Включає реалізацію методів для обчислення та відображення результатів.
 * 
 * @author Danylo_Donets
 * @version 1.0
 */
public class Calc 
{

	/** Ім'я файлу, яке використавується під час серіалізації. */
	private static final String FNAME = "Item2d.bin";

	/** Зберугає результат обчислень. Об'єкт класа {@linkplain Item2d} */
	private Item2d result;

	/** Ініціалізує {@linkplain Calc#result} */
	public Calc() 
	{
		result = new Item2d();

	}

	/**
	 * Втановлює значення {@linkplain Calc#result}
	 * 
	 * @param result - нове значення посилання на об'єкт {@linkplain Item2d}
	 */
	public void setResult(Item2d result) 
	{

		this.result = result;
	}

	/**
	 * Отримати значення  {@linkplain Calc#result}
	 * 
	 * @return Теперішнє занчення посилання на об'єкт {@linkplain Item2d}
	 */
	public Item2d getResult() 
	{
		return result;
	}

	/**
	 * Обраховує значення функції.
	 * 
	 * @param x - аргумент обчислюваної функції.
	 * @return результат обчислюваної функциї.
	 */
	private int[] calc(int x)
	{
        int [] numbers = new int[10];
        while (x > 0) {
            numbers[x%10]++;
            x /= 10;
        }
        
		return numbers;
	}

	/**
	 * Обраховує значенн функції і зберігає його в об'єкті 
	 * {@linkplain Calc#result}
	 * 
	 * @param x - аргумент обчислюваної функциї.
	 */
	public int[] init(int x)
	{
		result.setX(x);
		return result.setY(calc(x));
	}

	/** Виводить результат обчислення. */
	public void show()
	{
		System.out.println(result);
	}

	/**
	 *Зберігає {@linkplain Calc#result} в файлі {@linkplain Calc#FNAME}
	 * 
	 * @throws IOException
	 */
	public void save() throws IOException
	{
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
		os.writeObject(result);
		os.flush();
		os.close();
	}

	/**
	 * Відновлює {@linkplain Calc#result} із файлу {@linkplain Calc#FNAME}
	 * 
	 * @throws Exception
	 */
	public void restore() throws Exception 
	{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
		result = (Item2d) is.readObject();
		is.close();
	}
}