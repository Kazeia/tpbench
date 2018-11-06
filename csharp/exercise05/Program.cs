using System;
using System.Numerics;

namespace exercise05
{
    class Program
    {
        static void Main(string[] args)
        {
           BigInteger res = new BigInteger(1);

           for(int z=2;z<599999;++z){
               res*=z;
           } 
            Console.WriteLine(res);
        }
    }
}
