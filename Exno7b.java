/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exno7b;
/**
 *
 * @author shrimeenatchi.K
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exno7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {{
        scanner obj=new canner (system.in);
        ArrayList <double> list=new ArrayList<doule>();
        System.out.println("enter the bill amount for 12 month");
        
        double a[]=new doule[12];
        for(int i=0;i<12;i++)
        {
            a[i]=obj.nextDouble();
            list.add(a[i]);
        }
        double d=0;
        for(int j=0;j<12;j++)
        {
            d=d+a[j];
        }
        double ave=d/list.size();
        System.out.println("ave"+ave);
        System.out.println("minm"+Collections.min(list));
        System.out.println("maximum"+Collections.max(list));
        
            
        
        }
    }
        // TODO code application logic here
    }
    
}

