public class MultidimensionalArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[][] matrice = {
                {1,2,3},
                numbers,
                {3,2,1}
        };
        System.out.println(matrice[1][2]);
        for (int i = 0; i<matrice.length;i++){
            for (int j = 0; j<matrice[i].length; j++){
                System.out.print(matrice[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
