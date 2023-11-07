import javax.swing.*;
public class a{
	public static void main(String [] args)
	{
		String name=JOptionPane.showInputDialog(null,"What is your  name?");
		int ch=JOptionPane.showConfirmDialog(null,"do you like me,"+name+"?");
		if(ch==JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null," ohhh cutee😍️ i too like youuu");
		}
		else
		{
		JOptionPane.showMessageDialog(null," ohh ok it's my bad🙂️");
		}
}
}
