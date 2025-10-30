package Arrays.basic;

public class arrays {

    public static void printArray(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            System.out.println(nums[i]);
        }
    }

    //puclic means can be called from anywhere
    //static belongs to a class , not an instance , can be called without creating an object.
    //void returns nothing.
    public static void print2dArr(int[][] nums){
        System.out.println("--------------------");
        for(int n[] : nums){ //hold each row 1d array 1 at a time
            for(int m : n){ //hold each individual integer of that row one at a time where n is the row that is selected.
                System.out.println(m + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

        //--------------1D ARRAYS---------------------

        // int nums[] = new int[3];
        // int count = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        //     nums[i] = count;
        //     count++;
        // }

        // printArray(nums);

        //-----------------2D ARRAYS----------------------

        // int nums[][] = new int[3][4]; //cols * rows;
        // //cols -> 1 , rows -> 0;
        // //random returns <0 , and is double not int , so we convert it to int
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = 0 ; j < nums[0].length ; j++){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }
        // print2dArr(nums);

        //------------JAGGED ARRAYS--------------------------

        // int nums[][] = new int[3][];
        // nums[0] = new int[3];
        // nums[1] = new int[2];
        // nums[2] = new int[4];

        // //3 elements row 1
        // //2 elsmests row 2
        // //4 elements row 3

        // //put random values in the array
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = 0 ; j < nums[i].length ; j++){
        //         nums[i][j] = (int)(Math.random()*10); //convert double to int
        //     }
        // }

        // //print the 2d array
        // print2dArr(nums);

        //====================DRAWBACKS OF ARRAYS=========================================== >>>
        //array in java is an object.
        //to create an array we have to specify the size , so when we are creating an array with size
        //we are allocation heap space for that array in the heap memory
        //and if we want to expand the size of the array we cant

        //Arrays have diff use cases , but collections are much better which are covered later.
    }
}
