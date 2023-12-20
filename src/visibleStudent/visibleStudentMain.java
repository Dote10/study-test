package visibleStudent;

import java.util.ArrayList;
import java.util.Arrays;

public class visibleStudentMain{
    public static void main(String[] args) {

        ArrayList<Integer> tallerList =
                new ArrayList<>(Arrays.asList(130, 135, 148, 140, 145, 150, 150, 153));

        int visible = 1;

        int i;
        while (!tallerList.isEmpty()) {
            i = tallerList.size() - 1;
            for (int j = i - 1; j >= 0; --j) {
                if (tallerList.get(i) <= tallerList.get(j)) {
                    break;
                }else if(j == 0){
                    visible++;
                }
            }
            tallerList.remove(i);
        }
        System.out.println("visible = " + visible);

    }

}
