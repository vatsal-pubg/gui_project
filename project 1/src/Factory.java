import javax.swing.*;
import java.awt.*;
import java.awt.Color;

//s21778 vatsal patel
public class Factory  extends JFrame implements Runnable {
    public Store[] obj = new Store[50];//creating a object of arry
    public Factory() //default constructor
    {
        super("gui project");//title for frame
        setSize(1500, 500);//dimension of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop program or close

        for (int i=0;i<obj.length;i++)//loop which continuously make frame
            obj[i]=new Store(1500,500);

        new Thread(this).start();//wait for micro second
    }


    public void paint(Graphics g)//method for frame or background
    {

        g.setColor(new Color(0x24C2FF));//color of sky
        g.fillRect(0,0,1600,500);//shape of sky
        g.setColor(new Color(0x059422));//color of grass
        g.fillRect(10,400,1600,100);//size of grass
        g.setColor(new Color(0xF88F07));//color of sun
        g.fillOval(500,100,100,100);//size of sun

        for (int i=0;i<obj.length;i++)//loop which create balloons
            obj[i].draw(g);
        }


    public static void main(String[] args) {
        Factory gw = new Factory();//creating object gw
        gw.setVisible(true);//calling method for visible whole frame
        Store s=new Store(2000,500);//creating object s
        s.arry();//calling method arry

    }




    @Override//implement runnable method
    public void run() {//method for moving balloon
        while (true) {//infinte loop for balloon
            for (int i=0;i<obj.length;i++)//loop which calls method move()
                obj[i].move();

            repaint();//repaint balloon and fram wherver its changes position
            try {
                Thread.sleep(10);//speed of thread or speed of balloon as per seconds
            } catch (Exception e) {// to catch an error
                System.out.println("error");
            }

        }
    }
}




