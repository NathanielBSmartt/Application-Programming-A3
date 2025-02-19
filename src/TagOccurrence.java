public class TagOccurrence {
    private String tag;
    private int beginIndex;
    private int endIndex;

    public TagOccurrence(String tag, int beginIndex, int endIndex) {}

    public String getTag() {
        return tag;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public int getEndIndex() {  
        return endIndex;
    }

    public static TagOccurrence nextOccurrence(String line, int start) {
        return null;
    }
}