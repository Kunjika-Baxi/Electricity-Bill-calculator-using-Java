import java.util.Scanner;
import java.util.*;
public class Electricity_Bill
{
    public static Scanner sc=new Scanner(System.in);
    public static int ch,k=-1,d=-1,prevu=-1,pu=-1,u=-1, prevunits[]=new int[10],punits[]=new int[10],c=-1,ct=-1;
    public static String cname[]=new String[10];
    public static int cid[]=new int[10],units[]= new int[10],category[]=new int[10];
    public static int connection[]=new int[10],id;
    public static char ans,dans;
    public static double amt=0,phase=0,fca=120,gst=0,eduty=88,mrent=200,discount=0;
    public static void details()
    {
        System.out.println("Enter Consumer Name : ");
        k++;
        sc.nextLine();
        cname[k]=sc.nextLine();
        System.out.println("Enter Consumer ID : ");
        d++;
        cid[d]=sc.nextInt();
        System.out.println("Enter Consumer Category :- \n1.Residential\n2.Commercial\n3.Industrial\n4.Agriculatural");
        ct++;
        category[ct]=sc.nextInt();
        System.out.println("Enter Type of Connection :-\n1.Single Phase \n2.Three Phase");
        c++;
        connection[c]=sc.nextInt();
        System.out.println("Enter Previous Meter Readings (Units) : ");
        prevu++;
        prevunits[prevu]=sc.nextInt();
        System.out.println("Enter Present Meter Readings (Units) : ");
        pu++;
        punits[pu]=sc.nextInt();
        u++;
        units[u]=punits[pu]-prevunits[prevu];
        System.out.println("\nData Stored Successfully !!\n ");
        System.out.println("Do you want to Display Details ? (y/n) : ");
        ans=sc.next().charAt(0);
        if(ans=='y')
        {
            System.out.println("----------Details----------");
            System.out.println("Consumer Name : "+cname[k]);
            System.out.println("Consumer ID : "+cid[d]);
            System.out.println("Previous Meter Reading : "+prevunits[prevu]+" Units");
            System.out.println("Present Meter Reading : "+punits[pu]+" Units");
            if(category[ct]==1)
            System.out.println("Consumer Category : Residential");
            else if(category[ct]==2)
            System.out.println("Consumer Category : Commercial");
            else if(category[ct]==3)
            System.out.println("Consumer Category : Industrial");
            else 
            System.out.println("Consumer Category : Agricultural");
            if(connection[c]==1)
            System.out.println("Type of Connection : Single Phase");
            else 
            System.out.println("Type of Connection : Three Phase");
            System.out.println("---------------------------");
        }
    }
    public static void bill()
    {
          System.out.println("Enter Customer ID : ");
          id=sc.nextInt();int flag=0;
          for(int i=0;i<10;i++)
          {
              if(cid[i]==id)
              {
                  flag=1;
                if(units[i]==0)
                {
                amt=120;
                gst=0;
                eduty=0;
                fca=0;
                phase=0;
                mrent=0;
                System.out.println("____________________________________________________________________");
            System.out.println("\t   Ahmedabad Electricity Limited");
            System.out.println("\n--------------------------Electricity Bill--------------------------");
            System.out.println("Customer Name               : "+cname[i]);
            System.out.println("Customer ID                 : "+cid[i]);
            if(category[i]==1)
            System.out.println("Consumer Category           : Residential");
            else if(category[i]==2)
            System.out.println("Consumer Category           : Commercial");
            else if(category[i]==3)
            System.out.println("Consumer Category           : Industrial");
            else  
            System.out.println("Consumer Category           : Agricultural");
            if(connection[i]==1)
            System.out.println("Type of Connection          : Single Phase");
            else 
            System.out.println("Type of Connection          : Three Phase");
            System.out.println("Previous Meter Reading      : "+prevunits[i]+" Units");
            System.out.println("Present Meter Reading       : "+punits[i]+" Units");
            System.out.println("Units                       : "+units[i]);
            System.out.println("____________________________________________________________________");
            System.out.println("Amount                      : "+amt);
            break;
                }
                else if(units[i]>0 && units[i]<=100)
                amt+=5*units[i];
                else if(units[i]<=300)
                amt+=(units[i]-100)*7;
                else if(units[i]<=500)
                amt+=(units[i]-300)*9;
                else 
                amt+=12*(units[i]-500);
            if(connection[i]==1)
            phase=100;
            else 
            phase=300;
            gst=(0.12*amt);
            System.out.println("Want to Avail Early Payment Discount ? (y/n) : ");
            dans=sc.next().charAt(0);
            if(dans=='y')
            discount=(amt*0.1);
            else 
            discount=0;
            System.out.println("____________________________________________________________________");
            System.out.println("\t   Ahmedabad Electricity Limited");
            System.out.println("\n--------------------------Electricity Bill--------------------------");
            System.out.println("Customer Name               : "+cname[i]);
            System.out.println("Customer ID                 : "+cid[i]);
            if(category[i]==1)
            System.out.println("Consumer Category           : Residential");
            else if(category[i]==2)
            System.out.println("Consumer Category           : Commercial");
            else if(category[i]==3)
            System.out.println("Consumer Category           : Industrial");
            else  
            System.out.println("Consumer Category           : Agricultural");
            if(connection[i]==1)
            System.out.println("Type of Connection          : Single Phase");
            else 
            System.out.println("Type of Connection          : Three Phase");
            System.out.println("Previous Meter Reading      : "+prevunits[i]+" Units");
            System.out.println("Present Meter Reading       : "+punits[i]+" Units");
            System.out.println("Units                       : "+units[i]);
            System.out.println("____________________________________________________________________");
            System.out.println("Amount                                   : "+amt);
            if(category[i]==1)
            {
                System.out.println("Consumer Category Charges                : 0%");
            }
            else if(category[i]==2)
            {
                System.out.println("Consumer Category Charges                : 18%");
                amt+=(0.18*amt);
            }
            else if(category[i]==3)
            {
                System.out.println("Consumer Category Charges                : 22%");
                amt+=(0.22*amt);
            }
            else 
            {
                System.out.println("Consumer Category Charges                : 5%");
                amt+=(0.05*amt);
            }
            if(connection[i]==1)
            System.out.println("Connection Charges                       : 100/-");
            else 
            System.out.println("Connection Charges                       : 300/-");
            System.out.println("Fuel Cost Adjustment (FCA)               : 120/-");
            System.out.println("Electricity Duty                         : 88/-");
            System.out.println("Meter Rent                               : 200/-");
            System.out.println("GST and other Taxes                      : 12%");
            System.out.println("Discount                                 : "+discount);
            gst=(0.12*amt);
            System.out.println("Total Charges                            : "+(amt+phase+fca+gst+eduty+mrent-discount));
            System.out.println("____________________________________________________________________");
            break;
         }
        }
        if(flag==0)
        System.out.println("Data Not Found !! ");
    }
    public static void main()
    {
        System.out.println("-----Ahmedabad Electricity Limited-----");
        while(true)
        {
        System.out.println("\nEnter : \n1.Enter Details\n2.Generate Electricity Bill\n3.Exit");
        System.out.println("Enter Your Choice : ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1 : details();break;
            case 2 : bill();break;
            case 3 : System.exit(0);break;
            default : System.out.println("Invalid Choice");
        }
        }
    }
}