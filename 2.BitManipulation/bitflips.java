// Minimum bitflips to convert a number
// Provided with a number and a goal
// We need to count the number of the bits it will take to convert from the original number to the goal

public class bitflips {
    static int bitflips(int start,int goal){

        int flips = start ^ goal;
        int count = 0;

        while(flips > 0){
            if(flips % 2 == 1){
                count += 1;
            }
            flips = flips / 2;
        }

        return count;

    }

    public static void main(String[] args) {

        int start = 10;
        int goal = 4;

        int result = bitflips(start, goal);

        System.out.println("Number of bits to be flipped: "+result);
 
    }
}
