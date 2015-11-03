
package boletin7_1;
   
import javax.swing.JOptionPane;
public class Positivo {
    
    public int pedirNumEnteiro(){
    int num;
   String res = JOptionPane.showInputDialog("teclea numero");
   num = Integer.parseInt(res);
   return num;
    }
public void Positivo(int num1) {
    if(num1>= 0)
 JOptionPane.showMessageDialog(null,num1 + " é positivo");
}
}
