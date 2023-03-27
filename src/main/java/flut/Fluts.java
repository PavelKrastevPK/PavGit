package flut;

public class Fluts {
    public static void main(String[] args) {

        int[] nums = {12,3,10,7};

        float sum = 0;

        int i=0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }

        float average = (sum / nums.length);

        System.out.println("Average : "+average);

        }
    }

