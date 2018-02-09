import java.util.Scanner;
import java.lang.*;


interface Airport
{ abstract void displaylist();
}


 class Airport1 implements Airport
{ public void displaylist()
 { System.out.println("         *****The following are the aeroplanes that are available****");
   System.out.println("1.Air India\n 2.Air Sahara\n 3.Goair Airline\n 4.Indian Airline\n 5.Indigo Airline\n ");
   System.out.println("6.Jagson Airline\n 7.Jet Airways\n 8.Kingfisher Airline\n 9.Spicejet Airlines\n 10.Jetlite\n");
   System.out.println("\n \n \n");
   
   Customer c=new Customer();
   c.options(); 
  }
 
}



class Airport2 extends Airport1
{ int opts;
  Scanner sc=new Scanner(System.in);
  public void displaylist1()
 { System.out.println("      *****The following are the aeroplanes that are available under ATC system are****");
   System.out.println("1.Air India\n 2.Air Sahara\n 3.Goair Airline\n 4.Indian Airline\n 5.Indigo Airline\n ");
   System.out.println("6.Jagson Airline\n 7.Jet Airways\n 8.Kingfisher Airline\n 9.Spicejet Airlines\n 10.Jetlite\n");
   System.out.println("\n \n ");
   System.out.println("Select from the following airlines that u are needed");  
   opts=sc.nextInt();
   switch(opts)
   {}
}
}



class Reservation extends Airport2
{ int a=1,z,count=0,k=1,mem;
  long cost;
  
  int ar[]=new int[10];
  int ar1[]=new int[50];
  int ar2[]=new int[50];
  int ar3[]=new int[50];
  int ar4[]=new int[50];
  int ar5[]=new int[50];
  int ar6[]=new int[30];
  int ar7[]=new int[30];
  int ar8[]=new int[50];
  int ar9[]=new int[70];
  int ar10[]=new int[50];
  
  
  public void reservation()
  { if(opts==1 || opts==2|| opts==3|| opts==4|| opts==5|| opts==8|| opts==10) 
   { 
     for(z=a;z<=50;z++)
     {count++;
     }
    System.out.println("The number of seats available are"+count);
    }
    else if(opts==6 || opts==7)
   {
   {for(z=a;z<=30;z++)
   { count++;
   }
   System.out.println("The number of seats available are"+count);
   }
   }
   else
  {
   for(z=a;z<=70;z++)
   {count++;
   }
  System.out.println("The number of seats available are"+count);
  }
  
  if(ar[opts]<=50)
  {
 
  System.out.println("Please enter the no of members");
  mem=sc.nextInt();
   if(mem<=50)
  {
  System.out.println("The following are the seats that being booked for u");
  for(z=a;z<=mem;z++)
  { System.out.println(z);
  }
  cost=mem*2500;
  System.out.println("The total cost of reservation is"+cost);
  }
 }
  
  else if(ar[opts]<=30)
   {
  System.out.println("Please enter the no of members");
  mem=sc.nextInt();
  if(mem<=30)
 {
  System.out.println("The following are the seats that being booked for u");
  for(z=a;z<=mem;z++)
  { System.out.println(z);
  }
  cost=mem*2500;
  System.out.println("The total cost of reservation is"+cost);
  }
 } 
  else if(ar[opts]<=70)
   {
  System.out.println("Please enter the no of members");
  mem=sc.nextInt();
  if(mem<=70) 
  {
  System.out.println("The following are the seats that being booked for u");
  for(z=a;z<=mem;z++)
  { System.out.println(z);
  }
  cost=mem*2500;
  System.out.println("The total cost of reservation is"+cost);
  }
 }
  
 else
{ System.out.println("The flight seats are not sufficient\n");
}
Customer q=new Customer();
q.menu();
}
}



class Customer extends Reservation
{ 
  
   int options,pw,j,opt,i=1;
   int a[]=new int[100];
   

   long l[]=new long[100];
   long d[]=new long[100];
   long p[]=new long[100];
 
   String s[]=new String[100];
   String c[]=new String[100];
    
   Scanner sc=new Scanner(System.in);


 public void menu()
{  
    
    int j,opt; 
    String name;
    System.out.println("           *********** Online Airport ATC System *********");
    System.out.println("\n \n ");
    System.out.println("1.create account\n2.Log in\n3.Exit\n");
    opt=sc.nextInt();
    switch(opt)
  { 
    case 1: Customerdetails();
            break;
    case 2: System.out.println("      \n \n****LOGIN SYSTEM****");
            System.out.println("Please enter ur username");
            name=sc.next();
            System.out.println("Enter ur password");
            pw=sc.nextInt();
            for(j=1;j<=100;j++)
           { 
            if(pw==a[j])
           { options();
            }
           
           else
           {System.out.println("Your password is not correct");
            System.exit(0);
            }
          }
           
            
           break;
   case 3: System.exit(0);
           break;
   default:System.out.println("Invalid option");
           break;
}
} 

 public void Customerdetails()
 { 
   
   System.out.println("Enter ur name");
   s[i]=sc.next();
   System.out.println("Enter ur password in 5digits");
   a[i]=sc.nextInt();
   System.out.println("Enter ur phone number");
   p[i]=sc.nextLong();
   System.out.println("Enter ur door no");
   d[i]=sc.nextLong();
   System.out.println("Enter ur location/city");
   c[i]=sc.next();
   i++;
   System.out.println("Ur account is created...please login again");
   menu();
  }   
 
 
 public void options()
{ 
  System.out.println("Here are the options for u");
  System.out.println("1.Display available flights\n 2.Update profile\n 3.Reservation\n 5.Log out\n");
  options=sc.nextInt();
  switch(options)
 {
   case 1: Airport1 a1=new Airport1();
           a1.displaylist();
           break;
   case 2: Update();
           break;
   case 3:Reservation r1=new Reservation();
          r1.displaylist1();
          r1.reservation();
          break;
   case 4:System.exit(0);  
          break;
   default:System.out.println("Invalid option");
           break; 
}
}

 public void Update()
{
  int update;
  Scanner sc=new Scanner(System.in);
  System.out.println("Please re-enter your password");
  pw=sc.nextInt();
  for(j=1;j<=100;j++)
  { 
    if(pw==a[j])
      { System.out.println("******UPDATE YOUR ACCOUNT****\n\n");
        System.out.println("Your details are");
        System.out.println("1.Name is"+s[j]);
        System.out.println("2.Password is"+a[j]);
        System.out.println("3.Phone number is"+p[j]);
        System.out.println("4.Door number is"+d[j]);
        System.out.println("5.City is"+c[j]);
        System.out.println("Select the number u want to update");
        update=sc.nextInt();
        switch(update)
        {case 1:System.out.println("enter the new name");
               s[j]=sc.next();
               break;
         case 2:System.out.println("enter the new password");
               a[j]=sc.nextInt();
               break;
         case 3:System.out.println("enter the new phone number");
               p[j]=sc.nextLong();
               break;
         case 4:System.out.println("enter the new door number");
               d[j]=sc.nextLong();
               break;
         case 5:System.out.println("enter the new city");
               c[j]=sc.next();
               break;
         default:System.out.println("Wrong option");
       }
  }
    else 
   { System.out.println("Your password is not correct");    
   }
   options();
   }     
 }
}
class Airportdemo
{ public static void main(String args[])
 { Customer c=new Customer();
   c.menu();
 }
}
    