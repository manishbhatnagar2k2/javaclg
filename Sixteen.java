public class Sixteen
{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int aadd[][]=new int[3][3];
        int mult[][]=new int[3][3];
        System.out.println("Addition of two matrices");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                aadd[i][j]=a[i][j]+b[i][j];
                System.out.print(aadd[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                mult[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    mult[i][j]=mult[i][j]+a[i][k]*b[k][j];
                }
                System.out.println("Multiplication of two matrices");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        System.out.print(mult[i][j]+" ");
                    }
                    System.out.println();
                }
            }

        }
    }
}