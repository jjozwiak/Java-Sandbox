import java.util.Scanner;

public class PlayerDemo
{
     public static void main(String[] args)
    {
        Draw drawing = new Draw();

        drawing.drawHangMan();

        drawing.addHead();
        drawing.drawHangMan();

        drawing.addBody();
        drawing.drawHangMan();

        drawing.addLeftArm();
        drawing.drawHangMan();

        drawing.addRightArm();
        drawing.drawHangMan();

        drawing.addPelvis();
        drawing.drawHangMan();

        drawing.addLeftLeg();
        drawing.drawHangMan();

        drawing.addRightLeg();
        drawing.drawHangMan();
    }
}