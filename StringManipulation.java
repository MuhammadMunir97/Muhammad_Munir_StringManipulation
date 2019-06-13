public class StringManipulation{
    public String trimAndConcat (String first, String second){
        return first.trim().concat(second.trim());
        }
    public Integer getIndexOrNull(String sentence, char ind){
        return sentence.indexOf(ind);
    }
    public Integer getIndexOrNull(String sentence1, String subStr){ 
        return sentence1.indexOf(subStr);
    }
    public String concatSubstring (String subStr, int start, int end, String secStr){
        return subStr.substring(start, end).concat(secStr);
    }

}
