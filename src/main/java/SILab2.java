import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        List<String> numMines = new ArrayList<>();//C
        for (int i = 0; i < list.size(); i++) {//D
            if (!list.get(i).equals("#")) {//E
                int num = 0;//F
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//G
                    num++;//H
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//I
                    num++;//J
                }
                numMines.add(String.valueOf(num));//K
            } else {
                numMines.add(list.get(i));//L
            }
        }
        return numMines;//M
    }//N
}