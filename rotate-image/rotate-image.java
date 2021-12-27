class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
               int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int k=matrix[0].length-1;
            int j=0;
            for(;k>=matrix[0].length/2;k--)
            {
            int temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                j++;
                
                }
        }
        
        
        
        
        
        
        
        
    }
}