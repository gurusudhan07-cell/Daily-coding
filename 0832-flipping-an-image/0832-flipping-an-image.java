class Solution {

    public static void flip(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0 ; i < image.length ; i++){
            flip(image[i]);
            for(int j = 0 ; j < image.length ; j++){
                image[i][j]  = (image[i][j] == 1) ? 0 : 1;
            }
        }
        return image;

    }
}