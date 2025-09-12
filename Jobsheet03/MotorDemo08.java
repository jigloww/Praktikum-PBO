package Jobsheet03;

public class MotorDemo08 {
    public static void main(String[] args) {
        Motor08 motor1 = new Motor08();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        motor1.displayStatus();

        Motor08 motor2 = new Motor08();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinOn = true;
        motor2.kecepatan = 40;
        motor2.displayStatus();

        Motor08 motor3 = new Motor08();
        motor1.platNomor = "D 8343 CV";
        motor1.kecepatan = 60;
        motor1.displayStatus();
    }
}
