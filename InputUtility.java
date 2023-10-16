import java.io.*;
import java.util.Random;
/**
 * Questa classe contiene i metodi con il controllo delle eccezioni per l'inserimento di diversi tipi di variabili
 * @author STUDENTE
 *
 */
 public class InputUtility {

//attributi 
	static int intero;
	static String stringa;
	static double doppio;
	static float piatto;
	static boolean siNo;
	static boolean errore = false;
	static BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
	
	//metodi 
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un intero 
	 * @return intero
	 */
	public static int readInt()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String nLetto = tastiera.readLine();
				intero=Integer.valueOf(nLetto).intValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
		}while (errore);
		return intero;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un intero positivo
	 * @return intero
	 */
	public static int readPositiveInt()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String nLetto = tastiera.readLine();
					intero=Integer.valueOf(nLetto).intValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
			if(intero<0)
			{
				System.out.println("Inserimento negativo non valido, rieffettuare l'inserimento");
				errore = true;
			}
		}while (errore);
		return intero;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un double 
	 * @return doppio
	 */
	public double readDouble()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String dLetto = tastiera.readLine();
				doppio=Double.valueOf(dLetto).doubleValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
		}while (errore);
		return doppio;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un double positivo
	 * @return doppio
	 */
	public static double readPositiveDouble()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String dLetto = tastiera.readLine();
				doppio=Double.valueOf(dLetto).doubleValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
			if(doppio<0)
			{
				System.out.println("Inserimento negativo non valido, rieffettuare l'inserimento");
				errore = true;
			}
		}while (errore);
		return doppio;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un float
	 * @return piatto
	 */
	public static float readFloat() 
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String fLetto = tastiera.readLine();
				piatto=Float.valueOf(fLetto).floatValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
		}while (errore);
		return piatto;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un float
	 * @return piatto
	 */
	public static float readPositiveFloat() 
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String fLetto = tastiera.readLine();
				piatto=Float.valueOf(fLetto).floatValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
			if(piatto<0)
			{
				System.out.println("Inserimento negativo non valido, rieffettuare l'inserimento");
				errore = true;
			}
		}while (errore);
		return piatto;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di una stringa
	 * @return stringa
	 */
	public static String readString()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{
				stringa = tastiera.readLine();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
		}while (errore);
		return stringa;
	}
	/**
	 * Questo metodo permette l'inserimento con il controllo do while di un boolean
	 * @return siNO
	 */
	public static boolean readBoolean()
	{//apro il ciclo do while per il controllo delle eccezioni
		do
		{//porto la variabile di controllo a false
			errore = false;
			try 
			{//prendo in input il valore
				String bLetto = tastiera.readLine();
				siNo=Boolean.valueOf(bLetto).booleanValue();
			} 
			catch (Exception e1) 
			{//gestisco l'eccezione
				System.out.println("Input errato, rieffettuare l'inserimento");
				errore=true;
				continue;
			}
		}while (errore);
		return siNo;
	}
	
	/**
	 * Questo metodo permette di generare un numero randomico intero che va da  max a min
	 * tipo numero intero
	 * 
	 * @param min
	 * @param range
	 * @return randomNum 
	 */
	public static int randInt(int min, int range) 
	{	
		//creo e inizializzo l'oggetto rand della classe Random 
		Random rand = new Random();
		//genero un numero randomico compreso tra i parametri presi 
		int randomNum = rand.nextInt(range) + min;
		//stampo il numero generato 
		return randomNum;
	}
}
