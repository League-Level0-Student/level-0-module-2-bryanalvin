package extra;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class RollerCoaster{

public static void main(String[] args) {
String Sash	= JOptionPane.showInputDialog("Are you over 48 inches tall ");
int Smash=Integer.parseInt(Sash);
if (Smash>48) {

	JOptionPane.showMessageDialog(null, "Go in");
	

}
if (Smash<48);
 
JOptionPane.showMessageDialog(null, "You need to grow a little taller but dont worry you will get there");
}
}