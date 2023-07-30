package demo;

import java.security.Key;

public class Computer implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("打开设备");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭电脑");
    }
    public void powerOn() {
        System.out.println("");
    }
    public void powerOff() {
        System.out.println("");
    }


    public void useDevice(IUSB iusb) {
        iusb.openDevice();
        if (iusb instanceof Mouse){
            Mouse mouse = (Mouse) iusb;
            mouse.click();
        } else if (iusb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) iusb;
            keyBoard.inPut();
        }
        iusb.closeDevice();
    }


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();


        computer.useDevice(new Mouse());
        computer.useDevice(new KeyBoard());

        computer.powerOff();
    }
}


