class ThreeDMatrix
{

    public static void main(String[] args)

    {

        int threeD[][][] = new int[3][4][5]; //3 section, 4 rows, 5 cells in a row OR element, row, column (5,4,3)
        int i,j,k;
        int sum = 0;
        for (i=0; i<3; i++)

            for(j=0; j<4; j++)
            for (k=0; k<5; k++)
            threeD[i][j][k]= i*j*k;

        {

            for(i=0; i<3; i++)
            //{

                for(j=0; j<4; j++)

                {

                    for (k=0; k<5; k++ )
                    
                    {
                        //this is missing line. Each dimenssion multiplying by itself
                        //and this generated that output we see.
                        //we have only 0s while in multipication we have 0
                        //when in multiplication we got non-negotive numbers 
                        //we see the Integer numbers 
                        threeD[i][j][k] = i * j * k; //missing line
                        //sum += threeD[i][j][k];//to sum all generated numbers
                        //threeD[i][j][k] = (i + 1) * (j + 1) * (k + 1); //remooving 0
                        System.out.print(threeD[i][j][k]+ " ");
                        //System.out.println("Sum: " + sum[w]); //sum each row

                    }

                    System.out.println();

                }

        }

    }

}
/*
//main module with 3D array. 
main(); 
//Create 3D array
Constant Integer CELLS = 3
Constant Integer ROWS = 4
Constant Integer COLUMN = 5
Declare Integer threeD [DELLS][ROWS][COLUMN]

Declare Integer i, j, k

//Get values to store in the array
For i = o To CELLS - 1
   For j = 0 To ROWS - 1
      For k = 0 to COLUMN - 1
      End For
   End For
End For
      
//Display the values
For i = o To CELLS - 1
   For j = 0 To ROWS - 1
      For k = 0 to COLUMN - 1
         Display threeD [DELLS][ROWS][COLUMN], " ",
      End For
      //Display the empty line to print structure
      Display()
   End For
   //Display the empty line to print structure
   Display()
End For
*/