package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square moat;
    private Circle sun;
    private Square wall;
    private Square foundation;
    private Square hidewall;
    private Square topbrick1;
    private Square topbrick2;
    private Square topbrick3;
    private Square topbrick4;
    private Triangle roofleft;
    private Triangle roofright;
    private Circle doortop;
    private Square door;
    private Square bridge1;
    private Square bridge2;
    private Square bridge3;
    private Square leftbrick1;
    private Square leftbrick2;
    private Square leftbrick3;
    private Square rightbrick1;
    private Square rightbrick2;
    private Square rightbrick3;
    private Square window1;
    private Square window2;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("cyan");
        sky.moveVertical(-50);
        sky.moveHorizontal(-60);
        sky.changeSize(500);
        sky.makeVisible();

        moat = new Square();
        moat.changeColor("blue");
        moat.moveVertical(250);
        moat.moveHorizontal(-60);
        moat.changeSize(500);
        moat.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(40);
        sun.moveVertical(30);
        sun.changeSize(60);
        sun.makeVisible();

        foundation = new Square();
        foundation.changeColor("green");
        foundation.moveVertical(100);
        foundation.moveHorizontal(100);
        foundation.changeSize(200);
        foundation.makeVisible();

        wall = new Square();
        wall.changeColor("pink");
        wall.moveVertical(80);
        wall.moveHorizontal(100);
        wall.changeSize(200);
        wall.makeVisible();

        hidewall = new Square();
        hidewall.changeColor("cyan");
        hidewall.moveVertical(0);
        hidewall.moveHorizontal(130);
        hidewall.changeSize(150);
        hidewall.makeVisible();

        leftbrick1 = new Square();
        leftbrick1.changeColor("pink");
        leftbrick1.moveVertical(200);
        leftbrick1.moveHorizontal(50);
        leftbrick1.changeSize(80);
        leftbrick1.makeVisible();

        leftbrick2 = new Square();
        leftbrick2.changeColor("pink");
        leftbrick2.moveVertical(120);
        leftbrick2.moveHorizontal(50);
        leftbrick2.changeSize(80);
        leftbrick2.makeVisible();

        leftbrick3 = new Square();
        leftbrick3.changeColor("pink");
        leftbrick3.moveVertical(80);
        leftbrick3.moveHorizontal(50);
        leftbrick3.changeSize(80);
        leftbrick3.makeVisible();

        rightbrick1 = new Square();
        rightbrick1.changeColor("pink");
        rightbrick1.moveVertical(200);
        rightbrick1.moveHorizontal(280);
        rightbrick1.changeSize(80);
        rightbrick1.makeVisible();

        rightbrick2 = new Square();
        rightbrick2.changeColor("pink");
        rightbrick2.moveVertical(120);
        rightbrick2.moveHorizontal(280);
        rightbrick2.changeSize(80);
        rightbrick2.makeVisible();

        rightbrick3 = new Square();
        rightbrick3.changeColor("pink");
        rightbrick3.moveVertical(80);
        rightbrick3.moveHorizontal(280);
        rightbrick3.changeSize(80);
        rightbrick3.makeVisible();

        topbrick1 = new Square();
        topbrick1.changeColor("pink");
        topbrick1.moveHorizontal(145);
        topbrick1.moveVertical(130);
        topbrick1.changeSize(20);
        topbrick1.makeVisible();

        topbrick2 = new Square();
        topbrick2.changeColor("pink");
        topbrick2.moveHorizontal(180);
        topbrick2.moveVertical(130);
        topbrick2.changeSize(20);
        topbrick2.makeVisible();

        topbrick3 = new Square();
        topbrick3.changeColor("pink");
        topbrick3.moveHorizontal(215);
        topbrick3.moveVertical(130);
        topbrick3.changeSize(20);
        topbrick3.makeVisible();

        topbrick4 = new Square();
        topbrick4.changeColor("pink");
        topbrick4.moveHorizontal(250);
        topbrick4.moveVertical(130);
        topbrick4.changeSize(20);
        topbrick4.makeVisible();

        roofleft = new Triangle();
        roofleft.changeSize(60, 90);
        roofleft.moveHorizontal(99);
        roofleft.moveVertical(60);
        roofleft.makeVisible();

        roofright = new Triangle();
        roofright.changeSize(60, 90);
        roofright.moveHorizontal(330);
        roofright.moveVertical(60);
        roofright.makeVisible();

        doortop = new Circle();
        doortop.changeColor("yellow");
        doortop.moveHorizontal(210);
        doortop.moveVertical(180);
        doortop.changeSize(60);
        doortop.makeVisible();

        door = new Square();
        door.changeColor("yellow");
        door.moveHorizontal(170);
        door.moveVertical(220);
        door.changeSize(60);
        door.makeVisible();

        bridge1 = new Square();
        bridge1.changeColor("gray");
        bridge1.moveHorizontal(170);
        bridge1.moveVertical(280);
        bridge1.changeSize(60);
        bridge1.makeVisible();

        bridge2 = new Square();
        bridge2.changeColor("gray");
        bridge2.moveHorizontal(170);
        bridge2.moveVertical(330);
        bridge2.changeSize(60);
        bridge2.makeVisible();

        bridge3 = new Square();
        bridge3.changeColor("gray");
        bridge3.moveHorizontal(170);
        bridge3.moveVertical(390);
        bridge3.changeSize(60);
        bridge3.makeVisible();

        window1 = new Square();
        window1.changeColor("yellow");
        window1.moveVertical(100);
        window1.moveHorizontal(70);
        window1.changeSize(40);
        window1.makeVisible();

        window2 = new Square();
        window2.changeColor("yellow");
        window2.moveVertical(100);
        window2.moveHorizontal(300);
        window2.changeSize(40);
        window2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            topbrick1.changeColor("white");
            roofleft.changeColor("black");
            doortop.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            topbrick1.changeColor("black");
            roofleft.changeColor("green");
            doortop.changeColor("yellow");
        }
    }

}
