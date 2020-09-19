import java.util.ArrayList;
import java.util.List;

public class SortColumns {

    public List<Integer> minDeletionSize(List<String> A){
        List<Integer> deletionIndices = new ArrayList<Integer>();

        // loops through all the cols
        for (int col=0; col<A.get(0).length(); ++col)
        {
            for (int row=0; row<A.size()-1; ++row)
            {
                //finds cols not in order
                if (A.get(row).charAt(col) > A.get(row+1).charAt(col))
                {
                    deletionIndices.add(col);
                }
            }
        }

        return deletionIndices;
    }

    public static void main(String [] args){
        List<String> stringList = new ArrayList<String>();
        stringList.add("abcdef");
        stringList.add("bcdefg");

        SortColumns sort = new SortColumns();
        List<Integer> delIDX = sort.minDeletionSize(stringList);

    }
}
