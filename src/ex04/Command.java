package ex04;

/** Інтерфейс команди
 * або задачі;
 * шаблони: Command,
 * Worker Thread
 * @author Danylo_Donets
 * @version 1.0
 */

public interface Command {
	/** Виконує команди; шаблони: Command, Worker Thread */
	public void execute();
}