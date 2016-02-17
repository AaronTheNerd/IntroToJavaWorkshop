package day3;

import javax.swing.JOptionPane;

public class nameAsker {
public static void main(String[] args) {
	String name = "deadpool";
	name = JOptionPane.showInputDialog("what is your name");
	JOptionPane.showMessageDialog(null, "Your name is " + name);
name = JOptionPane.showInputDialog("What is your age");
JOptionPane.showMessageDialog(null, "your age is "+name);
name = JOptionPane.showInputDialog("");
JOptionPane.showMessageDialog(null, " "+name);
}
}
//this is a comment