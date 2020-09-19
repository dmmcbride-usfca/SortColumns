# SortColumns

## Usage

```java
  public static void main(String [] args){
        List<String> stringList = new ArrayList<String>();
        stringList.add("abcdef");
        stringList.add("bcdefg");

        SortColumns sort = new SortColumns();
        List<Integer> delIDX = sort.minDeletionSize(stringList);

    }
```
## Analysis 

### Time Complexity
  minDeletionSize() loops through all columns and all rows once where it checks for order each time and, if the columns are not in order, it adds their column to a list of columns to be deleted. In the wors case scenario this is O(2n) operations, which comes out to O(n). 

### Space Complexity
  minDeletionSize() creates a list containing all columns to be deleted which in the worst case scenario is every column this will always be less than the total number of letters given but still grows with the size of the entry, this comes out to space complexity of O(n).
  
## Contributers
Dunham McBride
