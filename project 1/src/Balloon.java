

public enum  Balloon {
//every enum convert in final object
    RED(0x971213),BLUE(0x070CE3),GREEN(0x2FE31E),BLACK(0x010501),YELLOW(0xD2C904),
    BROWN(0x55442A),NEON(0x3AFF36),PINK(0xFF51DB),WHITE(0xFEFDFF),PURPLE(0x8A21B9),
    GOLDEN(0xFFDB15),SILVER(0xDDD2DE), GRAY(0x847985),SKYBLUE(0x2999E3),HOTPINK(0xFF065A),ORANGE(0xFF2C0E);
int c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;


    Balloon(int a) {//perimeters constructor
        c1=a;c2=a;c3=a;c4=a;c5=a;c6=a;c7=a;c8=a;c9=a;c10=a;c11=a;c12=a;c13=a;c14=a;c15=a;c16=a;//creating a object for every enum
    }



    public int getC1() {
        return c1;
    }//method for getting enum RED

    public int getC2() {
        return c2;
    }//method for getting enum BLUE

    public int getC3() {
        return c3;
    }//method for getting enum GREEN

    public int getC4() {
        return c4;
    }//method for getting enum BLACK

    public int getC5() {
        return c5;
    }//method for getting enum YELLOW

    public int getC6() { return c6; }//method for getting enum BROWN

    public int getC7() {
        return c7;
    }//method for getting enum NEON

    public int getC8() {
        return c8;
    }//method for getting enum PINK

    public int getC9() {
        return c9;
    }//method for getting enum WHITE

    public int getC10() { return c10; }//method for getting enum PURPLE

    public int getC11() {
        return c11;
    }//method for getting enum GOLDEN

    public int getC12() {
        return c12;
    }//method for getting enum SILVER

    public int getC13() {
        return c13;
    }//method for getting enum GRAY

    public int getC14() {
        return c14;
    }//method for getting enum SKYBLUE

    public int getC15() {
        return c15;
    }//method for getting enum HOTPINK

    public int getC16() {
        return c16;
    }//method for getting enum ORANGE
}

