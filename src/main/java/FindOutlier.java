import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class FindOutlier {
    public static int find(int[] integers){
        if (Arrays.stream(integers).filter(x -> x % 2 == 0).count()>1){
            return Arrays.stream(integers).filter(x->x%2!=0).findAny().getAsInt();
        }
        else if(Arrays.stream(integers).filter(x -> x % 2 != 0).count()>1){
            return Arrays.stream(integers).filter(x->x%2==0).findAny().getAsInt();
        }
        return 0;
    }

}