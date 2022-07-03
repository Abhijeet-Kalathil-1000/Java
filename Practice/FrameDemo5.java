import java.lang.*;

import javax.swing.Action;

import java.awt.*;
import java.awt.event.*;


class Demo
{
    public int Addition(int iNo1, int iNo2)
    {
        int ans = 0;

        ans = iNo1 + iNo2;
        return ans;
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj1,tobj2;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj1 = new TextField();
        tobj2 = new TextField();

        tobj1.setBounds(60,60,100,20);
        tobj2.setBounds(80,80,130,20);
        bobj.setBounds(100,130,90,20);

        fobj.add(bobj);
        fobj.add(tobj1);
        fobj.add(tobj2);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        Demo dobj = new Demo();
        int iret = 0;
  
        int ino1 = Integer.parseInt(tobj1.getText());
        int ino2 = Integer.parseInt(tobj2.getText());

        iret = dobj.Addition(ino1, ino2);
        System.out.println("Addtion is "+iret);
        
    }
}


class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}





















/*import java.lang.*;

import javax.swing.Action;

import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,100,20);
        bobj.setBounds(100,130,90,20);

        fobj.add(bobj);
        fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent obj)
    {
        tobj.setText("Jai Ganesh");
    }
}


class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}
*/