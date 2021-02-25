import javax.swing.*;  
public class Main {  
public static void main(String[] args) {  
JFrame f=new JFrame();  
          
JButton b=new JButton("click");  
b.setBounds(150,100,100, 30);  
          
f.add(b);  
          
f.setSize(400,500);  
f.setLayout(null);
f.setVisible(true);  
}  
}  
