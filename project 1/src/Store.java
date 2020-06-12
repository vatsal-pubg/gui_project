import java.awt.*;

public class Store {
    public  int fw, fh;//variable for constuctor

    int y=400;//postsion of balloon
    int size=100;//size of balloon
    int size2=85;//size of balloon
    public Store(int frameWidth, int frameHeight) {//parameterised constuctor
        fw=frameWidth;
        fh=frameHeight;

    }


    public void move(){//method which balloon from down to up
        y--;//changing postion of balloon

        if (y==-50) {//if it is reached to top than it will reapit
            y =500;
        }
    }

    public void arry(){//method store balloon
        int arr[]=new int[99];
        for (int i=0;i<100;i++){
            System.out.println(i);
            if (i==99)
                System.out.println("its full");
        }

    }




    public void draw(Graphics g){//method which creat balloon

        g.setColor(new Color(Balloon.RED.c1));//color of balloon 1st by calling enum RED
        g.fillOval(50,y,size2,size);// balloon position and size 1st

        g.setColor(new Color(Balloon.BLUE.c2));//color of balloon 2sd by calling enum BLUE
        g.fillOval(150,y,size2,size);// balloon position 2d

        g.setColor(new Color(Balloon.GREEN.c3));//color of balloon 3rd by calling enum GREEN
        g.fillOval(250,y,size2,size);// balloon position and size 3rd

        g.setColor(new Color(Balloon.BLACK.c4));//color of balloon 4th by calling enum BLACK
        g.fillOval(350,y,size2,size);//balloon position and size 4th

        g.setColor(new Color(Balloon.YELLOW.c5));//color of balloon 5th by calling enum YELLOW
        g.fillOval(450,y,size2,size);// balloon position and size 5th

        g.setColor(new Color(Balloon.BROWN.c6));//color of balloon 6th by calling enum BROWN
        g.fillOval(550,y,size2,size);//balloon position and size 6th

        g.setColor(new Color(Balloon.NEON.c7));//color of balloon 7th by calling enum NEON
        g.fillOval(650,y,size2,size);// balloon position and size 7th

        g.setColor(new Color(Balloon.PINK.c8));//color of balloon 8th by calling enum PINK
        g.fillOval(750,y,size2,size);// balloon position and size 8th

        g.setColor(new Color(Balloon.WHITE.c9));//color of balloon 9th by calling enum WHITE
        g.fillOval(850,y,size2,size);// balloon position and size 9th

        g.setColor(new Color(Balloon.PURPLE.c10));//color of balloon 10th by calling enum PURPLE
        g.fillOval(950,y,size2,size);// balloon position and size 10th

        g.setColor(new Color(Balloon.GOLDEN.c11));//color of balloon 11th by calling enum GOLDEN
        g.fillOval(1050,y,size2,size);// balloon position and size 11th

        g.setColor(new Color(Balloon.SILVER.c12));//color of balloon 12th by calling enum SILVER
        g.fillOval(1150,y,size2,size);//balloon position and size 12th

        g.setColor(new Color(Balloon.GRAY.c13));//color of balloon 13th by calling enum GRAY
        g.fillOval(1250,y,size2,size);//balloon position and size 13th

        g.setColor(new Color(Balloon.SKYBLUE.c14));//color of balloon 14th by calling enum SKYBLUE
        g.fillOval(1350,y,size2,size);// balloon position and size 14th

        g.setColor(new Color(Balloon.HOTPINK.c15));//color of balloon 15th by calling enum HOTPINK
        g.fillOval(1450,y,size2,size);// 1balloon position and size 15th

        g.setColor(new Color(Balloon.ORANGE.c16));//color of balloon 16th by calling enum ORANGE
        g.fillOval(1500,y,size2,size);//balloon position and size 16th
    }

}
