package Diziler;

public class IkıBoyutluDizi {
    public static void main(String[] args) {
//        int [][] matris =new int[3][4];
//        int number =1;
//        for(int i =0; i< matris.length; i++){
//            for (int j=0; j< matris[0].length;j++){
//
//                matris[i][j]=number++;
//            }
//        }
//        for (int i =0; i< matris.length;i++){
//            for (int j=0; j< matris[0].length;j++){
//                System.out.print(matris[i][j] + " ");
//            }
//            System.out.println();
//
//        }


//tek boyut for each
//        int[] list ={1,2,3,4};
//        for (int i = 0 ; i< list.length; i++){
//            System.out.println(list[i]);
//        }
//
//        for (int i: list) {
//            System.out.println(i);
//
//        }
        
   //çokboyut foreach      
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int[] row: matris) {
            for (int col:row) {
                System.out.print(col + " ");

            }
            System.out.println();
            
        }
    
    }


}
