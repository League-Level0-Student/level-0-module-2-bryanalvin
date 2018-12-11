package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
public static void main(String[] args) {
	int randomChoice = 1;
	Random Usless=new Random();
	randomChoice=Usless.nextInt(80);	
	
	int randomDudd = 2;
	
	randomChoice=Usless.nextInt(80);	
	
int randomIn = 3;
	
	randomChoice=Usless.nextInt(80);	
	
int randomBoy = 4;
	
	randomChoice=Usless.nextInt(80);	
	
int randomGirl = 5;
	
	randomChoice=Usless.nextInt(80);	
	
	
JOptionPane.showMessageDialog(null, randomChoice + "  " + randomDudd + "  " + randomIn + "   " + randomBoy + "  " + randomGirl + "  ")  ;
}
}

