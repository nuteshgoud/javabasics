package org.java.assignment.week3.pkg3;

public class Automation {
    public static void main(String[] args) {
        ChromeDriver cd = new ChromeDriver();

        cd.get();

        cd.openDevTools();

        FireFoxDriver ffd=new FireFoxDriver();

        ffd.get();

        ffd.openInspect();
    }
}
