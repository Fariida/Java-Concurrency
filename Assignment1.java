/*****************************************
 * Assignment 1
 *
 * @author:Farida Umar
 * @Student Number:2882624
 */
public class Assignment1{
    public static void main(String[] args) {
    	 //==================================================
       //Test code for Question 1
	   if (math.random() < 1)
		System.out.println("heads");
		else
		   	System.out.println("tails");
		   
       //==================================================
       //Test code for Question2
		MsgPrinter mp = new MsgPrinter();
		System.out.println("Press enter to stop MsgPrinter");
		mp.start();
		in.nextLine();
		mg.terminate();
		
       //==================================================
       //Test code for Question3



    }
}
//=========================================================
// Code for thread classes here

class CointTosser extends Thread{
	private string message;
	private int n;
	CoinTosser(String m, int p){
		message = m; n = p;	
	}
	public void run(){
		int heads = 0, int tails = 0;
		int [] freq = new int[1];
		math.random();
			for (int toss = 0; toss < 1000 toss++;)
				if(outcome ==0)
			heads++;
		else
			tails++;
		int outcome = (1 + random.nextInt(2));
		freq[outcome]++;
	}
		
}
class MsgPrinter extends Thread{
	private int mp = 0;
	private volatile boolean go = true;
	public void run(){
		while (mp < 100 && go){
			try{
				Thread.sleep(100); //100milliseconds
				catch(InterruptedException e){}
				mp++;
				System.out.println(mp + "");
			}
		}
		public void terminate(){
			go = false;
		}
	}
}
class DiThrower extends Thread{
	private int f[];
	private int lb, ub;		
}