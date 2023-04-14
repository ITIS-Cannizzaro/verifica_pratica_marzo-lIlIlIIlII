import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Ottana
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				//aggiungere, togliere casi a seconda delle proprie scelte
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
					es3();
				break;
				case 4:
					es4();
					break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - Es n. 1 - Titolo es. MinimoDiArray");
		System.out.println("2 - Es n. 2 - Titolo es. ParoleMisteriose");
		System.out.println("3 - Es n. 3 - Titolo es. StampaPari");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	// Accordino: non ho capito perché hai diviso così i metodi ma va bene: 2pt
	public static void es1() 
	{
		int[] ArrayNumeri = new int[10];
        Ordinamento(ArrayNumeri, 0, 0);
	}
	
	static void Ordinamento(int[] array, int numero, int posizione) 
	{
        for(int i = 0; i <10; i++) 
        {
            array[i]= (int)(Math.random() * (5-(-5)+1)) + (-5);

        }
        for(int i = 0; i <10; i++) 
        {
            numero = array[0];
            if(array[i] < numero) 
            {
                numero = array[i];
                posizione = i;
            }
        }
        System.out.println("Il valore minore nell'array è: "+numero+" nella posizione: "+posizione);
    }
	
	// Accordino: c'eri quasi, ma l'idea è corretta: 1pt
	public static void es2() 
	{
		String[] ArrayStringhe ={"pizza","wawa","bloxy-cola","luigi","sasso"};
		System.out.println("Indovinare una delle parole in 3 tentativi");
		for (int i = 0; i>-3;i--)// Accordino: da 0 a -3 i tentativi sono 4, non 3!
		{
			String temp = in.nextLine();// Accordino: nextLine non next!!!!
			for (int j = 0; j<ArrayStringhe.length;j++) 
			{
				if (temp.equals(ArrayStringhe[j])) 
				{
					System.out.println("Corretto!");
					break;
				}
				else 
				{
					System.out.println("Incorretto");// Accordino: così ti scrive incorretto 4 volte anche se indovini
				}
			}
			if (i==3)// Accordino: i non arriva mai a 3, perché il ciclo lo hai fatto da 0 a -3 
			{
				System.out.println("Finito i tentativi");
				break;// Accordino: questo break ti fa uscire fuori dall'if ma resti ancora nel for!
			}
		}
	}
	
	// Accordino: i soliti errori fatti per la fretta: 1.8pt
	public static void es3()
    {
    	int[] ArrayNum = new int[100]; // Accordino: i numeri dovevano essere 20, non 100
    	for (int i = 0; i < ArrayNum.length; i++) 
    	{
    	    ArrayNum[i] = (int) (Math.random() * 100) + 1;// Accordino: *101) + 1 (sennò ti vengono fino a 99)

    	}
    	System.out.println("I numeri dell'array, sia pari che dispari, non ordinati:");
    	for (int k = 0; k < ArrayNum.length; k++) 
	    {
	    	System.out.println(ArrayNum[k]);
	    }
    	es3_Ordinamento(ArrayNum);
    	
    }

    public static void es3_Ordinamento(int[] arrayNum)
    {
        for (int i = 0; i < arrayNum.length-1; i++)
        {
            for (int j = 0; j < arrayNum.length-1-i; j++)
            {
                if (arrayNum[j+1]<arrayNum[j])
                {
                    int temp = (int) arrayNum[j+1];
                    arrayNum[j+1] = arrayNum[j];
                    arrayNum[j] = temp;
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("I numeri pari dal più piccolo al più grande:");
        for (int i = 0; i < arrayNum.length; i++)
        {
        	if (arrayNum[i] % 2 == 0) 
        	{
        		System.out.println(arrayNum[i]+";");
        	}
        }
    }
    
    // Accordino: corretto ma ti sei dimenticato di stampare! 2.8pt 
    public static void es4()
    {
        int[] numeriCasuali = new int[50];
        for (int i = 0; i < numeriCasuali.length; i++) {
            numeriCasuali[i] = (int) (Math.random() * 100) + 1;
        }

        int[] conteggio = new int[8];
        for (int numero : numeriCasuali) 
        {
            for (int i = 2; i <= 8; i++) 
            {
                if (numero % i == 0) 
                {
                    conteggio[i - 2]++;
                }
            }
        }
        
        // Accordino: ti sei dimenticato di stampare quello che hai fatto, come hai fatto a controllare???
        // Ti ho messo io le funzioni di stampa di entrambi gli array
    	System.out.println("\nArray: ");

        for(int n : numeriCasuali)
        	System.out.print(n + " ");

    	System.out.println("\nDivisori: ");
        for(int n : conteggio)
        	System.out.print(n + " ");
    }
}
