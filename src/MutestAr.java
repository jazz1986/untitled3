import java.util.Arrays;

public class MutestAr {

    public static void main (String[] args) {



 int [] nums={2,7, 11, 15};
 int target=18;
 int [] temp = new int[2];


 for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; nums.length > j; j++) {

                if (nums[j] == target - nums[i]) {


                    temp[0] = i;
                    temp[1] = j;}
            }}
                        System.out.println(Arrays.toString(temp));

                    }




}











