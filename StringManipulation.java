public class StringManipulation{
    public String trimAndConcat (String first, String second){
        return first.trim().concat(second.trim());
        }
    public Integer getIndexOrNull(String sentence, char ind){
        int index = sentence.indexOf(ind);
        return (index > 0) ? index : null;
    }
    public Integer getIndexOrNull(String sentence1, String subStr){ 
        int index = sentence1.indexOf(subStr);
        return (index > 0) ? index : null;
    }
    public String concatSubstring (String subStr, int start, int end, String secStr){
        return subStr.substring(start, end).concat(secStr);
    }

}
