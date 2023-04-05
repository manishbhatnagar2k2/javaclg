import java.awt.*;
import java.awt.event.*;
class EventHandling extends Frame implements ActionListener
{
    TextField tf;
    EventHandling()
    {
        tf=new TextField();
        tf.setBounds(100,100,200,200);
        Button b=new Button("Click me");
        b.setBounds(100,300,100,50);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Hello Im MANISH");
    }
    public static void main(String ...args)
     {
        new EventHandling();
    }
}