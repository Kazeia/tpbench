using System;

namespace exercise06
{
    class Program
    {
        static int MatrixChainOrder(int[] p, int i, int j) 
        { 
            
            if (i == j) 
                return 0; 
    
            int min = int.MaxValue; 
    
            // place parenthesis at different places  
            // between first and last matrix, recursively  
            // calculate count of multiplications for each 
            // parenthesis placement and return the  
            // minimum count 
            for (int k = i; k < j; k++) { 
                int count = MatrixChainOrder(p, i, k) + 
                MatrixChainOrder(p, k + 1, j) + p[i - 1]  
                                        * p[k] * p[j]; 
    
                if (count < min) 
                    min = count; 
            } 
    
            // Return minimum count 
            return min; 
        } 
    
        // Driver program to test above function 
        public static void Main() 
        { 
            int[] arr = new int[]{ 54,66,39,46,12,87,61,24,36,28,13,4,73,84,25,62,67 }; 
            int n = arr.Length; 
    
            Console.Write("Minimum number of multiplications is "
                            + MatrixChainOrder(arr, 1, n - 1)); 
        } 
    }
}
