public class MoreLoopFun {
    public static void main(String[] args) {
        /*for(int outer = 1; outer < 5; outer++){
            for(int inner = 1; inner < 3; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }*/

        //clock demo
        /*for(int hours = 0; hours < 24; hours++){
            for(int minutes = 0; minutes < 60; minutes++){
                for(int seconds = 0; seconds < 60; seconds++){
                    System.out.println(hours + ":" + minutes + ":" + seconds);
                }
            }
        }*/

        //printing:
//        *
//        **
//        ***
//        ****
        for(int outer = 1; outer < 5; outer++){
            for(int inner = 0; inner < outer; inner++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("*****");

        //print:
/*      ****
        ***
        **
        *
*/
        for(int outer = 4; outer >= 0; outer--){
            for(int inner = 1; inner <= outer; inner++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}