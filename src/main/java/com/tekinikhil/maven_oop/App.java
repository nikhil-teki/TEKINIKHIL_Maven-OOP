package com.tekinikhil.maven_oop;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Please enter the no. of gift:" );
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt(),iterator=0,total=0,wt,choc=0;
        String sweet_name;
        //scan.next(); //to read a string immediately after reading any other data type scan.next() is used before you read the string//;
        while(iterator<n)
        {
        	System.out.println("What is the name of gift no."+(iterator+1)+" ?");
        	sweet_name=scan.next();
        	Sweets newSweet;
        	if(sweet_name.equals("GulabJamun"))
        	{
        		newSweet=new GulabJamun();
        	}
        	else if(sweet_name.equals("BesanLaddu"))
        	{
        		newSweet=new BesanLaddu();
        	}
        	else if(sweet_name.equals("KajuBarfi"))
        	{
        		newSweet=new KajuBarfi();
        	}
        	else if(sweet_name.equals("Sandesh"))
        	{
        		newSweet=new Sandesh();
        	}
        	else if(sweet_name.equals("Petha"))
        	{
        		newSweet=new Petha();
        	}
        	else
        	{
        		System.out.println("Unknown sweet / It is a Chocolate");
        		choc++;
        		iterator++;
        		continue;
        	}
        	System.out.println("weight in kgs:");
        	wt=scan.nextInt();
        	total+=newSweet.getPrice()*wt;
        	iterator++;
        }
        scan.close();
        System.out.println("No. of Candies in the received gifts: "+choc);
        System.out.println("No. of Sweets in the received gifts : "+(n-choc));
        System.out.println("Total sweets cost: "+total);
    }
}
