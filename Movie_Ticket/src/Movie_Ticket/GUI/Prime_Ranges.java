/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie_Ticket.GUI;

/**
 *
 * @author ankitjain
 */
public class Prime_Ranges {
    
    public static boolean isPrime(int n)
    {
       // boolean res = true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
         
    public static void primeInRange(int m)
    {
        for(int i=2;i<=m;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        primeInRange(20);
    }
}

