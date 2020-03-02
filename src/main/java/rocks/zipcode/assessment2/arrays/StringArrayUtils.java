package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if(endingIndex < startingIndex) {

            throw new IllegalArgumentException("Out of Bounds, not a valid index");

        }

        String[] result = new String[endingIndex-startingIndex];

        for(int i = startingIndex, j = 0; i < endingIndex; i++, j++){

            result[j] = arrayToBeSpliced[i];

        }

        return result;

    }

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        return null;
    }
}
