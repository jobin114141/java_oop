import java.util.Scanner; 
import java.lang.Math;
class HelloWorld
{
    public static void main(String [] args)
    {
    
        int a,b,c;
        double sol,rootsol,flo,a1,b1; 
        Scanner obj=new Scanner(System.in);
        System.out.println("emter 3 inputs");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
   
        sol=(b*b)-(4*a*c);
        rootsol=Math.sqrt(sol);
       if(rootsol<0)
       {
           System.out.println("not possible");
       }
       else
       {
       
     flo=Math.floor(rootsol);
     if(flo*flo==sol)
     {
         a1=(-b+rootsol)/2*a;
         b1=(-b-rootsol)/2*a;
         System.out.println(a1);
         System.out.println(b1);
     }
         
     }
     }
    }        
        
    
