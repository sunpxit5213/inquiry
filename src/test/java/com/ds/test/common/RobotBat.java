package com.ds.test.common;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * @ClassName: RobotBat
 * @Author: sunpxit
 * @Description: 鼠标脚本
 * @Date: 2020/2/15 12:39
 */
public class RobotBat {

    public static void main(String[] args) throws Exception {
        Robot robot=new Robot();
        Thread.currentThread().sleep(5000);

       while (true){
           click(robot);
       }






    }

    public static void click(Robot robot) throws Exception{

        Thread.currentThread().sleep(10);


        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.currentThread().sleep(10);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
