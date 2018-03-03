hii git
jjj
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class calc extends Applet implements ActionListener 
{
String s,s1,s2,s3,s4;
Button one,two,three,four,five,six,seven,eight,nine,zero,sub,Add,div,mul,equ;
TextField t1;
int a,b,c;
public void init()
{
one=new Button("1");
two=new Button("2");
three=new Button("3");
four=new Button("4");
five=new Button("5");
six=new Button("6");
seven=new Button("7");
eight=new Button("8");
nine=new Button("9");
zero=new Button("0");
Add=new Button("+");
sub=new Button("-");
div=new Button("/");
mul=new Button("*");
equ=new Button("=");

t1=new TextField(20);

add(one);
add(two);
add(three);
add(four);
add(five);
add(six);
add(seven);
add(eight);
add(nine);
add(zero);
add(Add);
add(sub);
add(mul);
add(div);
add(t1);
add(equ);
one.addActionListener(this);

two.addActionListener(this);

three.addActionListener(this);

four.addActionListener(this);

five.addActionListener(this);

six.addActionListener(this);

seven.addActionListener(this);

eight.addActionListener(this);

nine.addActionListener(this);

zero.addActionListener(this);
equ.addActionListener(this);
Add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{

s=ae.getActionCommand();
  if(s.equals("0")||s.equals("1")||s.equals("2")||
s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||
s.equals("9")||s.equals("0"))
  {
   s1=t1.getText()+s;
   t1.setText(s);
  }
  if(s.equals("+"))
  {
     s2=t1.getText();
     t1.setText("");
     s3="+";
  }
  if(s.equals("-"))
  {
     s2=t1.getText();
     t1.setText("");
     s3="-";
  }
  if(s.equals("*"))
  {
     s2=t1.getText();
     t1.setText("");
     s3="*";
  }
  if(s.equals("/"))
  {
     s2=t1.getText();
     t1.setText("");
     s3="/";
  }
  if(s.equals("="))
  {
   s4=t1.getText();
   a=Integer.parseInt(s2);
   b=Integer.parseInt(s4);
   if(s3.equals("+"))
    c=a+b;
   if(s3.equals("-"))
    c=a-b;
	if(s3.equals("*"))
    c=a*b;
	if(s3.equals("/"))
    c=a/b;
   
   t1.setText(String.valueOf(c));
  }
  if(s.equals("Clear"))
  {
   t1.setText("");
  }
 }

}
