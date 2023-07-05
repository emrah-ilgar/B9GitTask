package Einkaufen;

import java.util.Scanner;

public class Einkaufen {
    public void einkaufen(){
        String []einKaufList=new String[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte schreiben dass,was möchten Sie kaufen");


        for (int i=0; i < einKaufList.length; i++) {
            einKaufList[i]=scanner.nextLine();
            System.out.println("einKaufList[i] = " + einKaufList[i]);

        }
        for (int i = 0; i < einKaufList.length; i++) {
            System.out.println(i+1+"."+einKaufList[i]);
        }

    }





}
