
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String bigWord = "";
        int longest = 0;
        // there is a for loop iterator for arrays
        for (String string : arr) {
            int clength = string.length();
            if ( clength > longest){
                bigWord = string;
                longest = string.length();
            }
        } 
        return bigWord;
    }
}
