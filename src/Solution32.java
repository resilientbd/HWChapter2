import galapagos.Turtle;

public class Solution32 {
    private Turtle turtle = new Turtle();

    public static void main(String[] args) {
        int height = 130;
        int width = 200;
        int speed = 500;
        int noOfReact = 3;
        int positionX = 0;
        int positionY = 0;

        Solution32 object = new Solution32();
        object.initTurtle();
        for (int i=0;i<noOfReact;i++)
        {
            if(i>0)
            {
                object.turnTitle(90);
                object.drawDoorRectangle(positionX=positionX+20,positionY=positionY+20,height=height-40,width=width-40,speed);
            }
            else {
                object.drawDoorRectangle(0,0,height,width,speed);
            }
        }

    }

    private void initTurtle()
    {
        turtle.hide();
    }

    private void turnTitle(int degree)
    {
        turtle.turn(degree);
    }

    private void drawDoorRectangle(int positionX, int positionY, int height, int width, int speed) {
        turtle.jumpTo(positionX, positionY);
        turtle.speed(speed);
        turtle.move( width ); //move 50 pixels
        turtle.turn( 90 ); //turn 90 deg counterclockwise
        turtle.move( height );
        turtle.turn( 90 );
        turtle.move( width );
        turtle.turn( 90 );
        turtle.move( height );


    }

}
