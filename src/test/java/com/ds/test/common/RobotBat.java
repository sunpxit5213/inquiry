package com.ds.test.common;

import java.awt.*;
import java.awt.event.InputEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @ClassName: RobotBat
 * @Author: sunpxit
 * @Description: 鼠标脚本
 * @Date: 2020/2/15 12:39
 */
public class RobotBat {

    public static void main(String[] args) throws Exception {
        Robot robot=new Robot();
        Scanner in=new Scanner(System.in);
        System.out.println("====请输入结束时间:例如(20:00:00)====");
        String dateStr = in.next();
        System.out.println("====请将鼠标箭头放在抢购按钮上(5秒后开始执行)=====");
        Thread.currentThread().sleep(5000);
        System.out.println(new Date());

       while (true){

           SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
           String dateString = formatter.format(new Date());
            if (dateStr.equals(dateString)){
                break;
            }

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
