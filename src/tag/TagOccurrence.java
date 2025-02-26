package tag;

import java.lang.*;

public class TagOccurrence {
    private String tag;
    private int beginIndex;
    private int endIndex;

    public TagOccurrence(String tag, int beginIndex, int endIndex) {
        this.tag = tag;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

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

        TagOccurrence ret = new TagOccurrence("", 0, 0);

        if (line.indexOf("<") == -1) {
            return null;
        } else {
            ret.beginIndex = line.indexOf("<", start);
            ret.endIndex = line.indexOf(">", ret.beginIndex);
            ret.tag = line.substring(ret.beginIndex, ret.endIndex + 1);
            return ret;
        }
    }
}