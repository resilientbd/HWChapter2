import galapagos.Turtle;

public class Solution36 {
    Turtle turtle = new Turtle();
    public static void main(String[] args) {
        int height = 150;
        int width = 120;
        int speed = 1000;

        Solution36 object = new Solution36();
        object.drawOuterRectangle(height, width, speed);
        object.drawDoorRectangle(-17,-width/2-52,height-80,30,1000);
        object.drawWindowRectangle(27,0-52,30,30,1000);
        object.drawWindowRectangle(-58,30-52,30,30,1000);
        object.drawRoofTriangle(-102,60-52,150,212.132,1000);
    }

    private void drawOuterRectangle(int height, int width, int speed) {
        turtle.jumpTo(-(height / 2-2), -width / 2-52);
        turtle.hide();
        turtle.speed(speed);
        turtle.move(height); //move 50 pixels
        turtle.turn(90); //turn 90 deg counterclockwise
        turtle.move(width);
        turtle.turn(90);
        turtle.move(height);
        turtle.turn(90);
        turtle.move(width);

    }



    private void drawDoorRectangle(int positionX, int positionY, int height, int width, int speed) {
        turtle.jumpTo(positionX, positionY);
        turtle.speed(speed);
        turtle.turn(180);
        turtle.move(height); //move 50 pixels
        turtle.turn(-90); //turn 90 deg counterclockwise
        turtle.move(width);
        turtle.turn(-90);
        turtle.move(height);


    }

    private void drawWindowRectangle(int positionX, int positionY, int height, int width, int speed) {
        turtle.jumpTo(positionX, positionY);
        turtle.speed(speed);
        turtle.turn(180);
        turtle.move(height); //move 50 pixels
        turtle.turn(-90); //turn 90 deg counterclockwise
        turtle.move(width);
        turtle.turn(-90);
        turtle.move(height);
        turtle.turn(-90);
        turtle.move(width);


    }

    private void drawRoofTriangle(int positionX, int positionY, int height, double width, int speed)
    {

        turtle.jumpTo(positionX,positionY);
        turtle.speed(speed);
        turtle.turn(-90);
        turtle.turn(45);
        turtle.move( height );
        turtle.turn( -90 );
        turtle.move( height );
        turtle.turn( -135 );
        turtle.move( width );
    }




}
