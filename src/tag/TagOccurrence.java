package tag;

/**
 * This class holds the tag, beginIndex, and endIndex of a tag in a string
 * 
 * @author Nathaniel Bucknor-Smartt
 */

public class TagOccurrence {
    private String tag;
    private int beginIndex;
    private int endIndex;

    /**
     * Set the tag, beginIndex, and endIndex of a TagOccurrence
     * 
     * @param tag
     * @param beginIndex
     * @param endIndex
     */

    public TagOccurrence(String tag, int beginIndex, int endIndex) {
        this.tag = tag;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

    /**
     * Return the tag of a TagOccurrence
     * 
     * @return the contents of the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Return the beginIndex and endIndex of a TagOccurrence
     * 
     * @return the starting index of the tag
     */

    public int getBeginIndex() {
        return beginIndex;
    }

    /**
     * Return the endIndex of a TagOccurrence
     * 
     * @return the ending index of the tag
     */

    public int getEndIndex() {
        return endIndex;
    }

    /**
     * Return the next TagOccurrence in a string
     * 
     * @param line  the full string
     * @param start the starting index of the search
     * @return the next TagOccurrence
     */

    public static TagOccurrence nextOccurrence(String line, int start) {

        TagOccurrence ret = new TagOccurrence("", 0, 0);
        int startIndex = line.indexOf("<", start);

        if (startIndex == -1) {
            return null;
        } else {
            if (line.indexOf(">", startIndex) == -1) {
                return null;
            } else {

                if (line.charAt(startIndex + 1) == '<') {
                    ret.beginIndex = line.indexOf("<", startIndex + 1);
                } else {
                    ret.beginIndex = startIndex;
                }

                ret.endIndex = line.indexOf(">", ret.beginIndex);
                ret.tag = line.substring(ret.beginIndex, ret.endIndex + 1);
                return ret;
            }
        }
    }
}
