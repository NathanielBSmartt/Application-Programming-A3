package translate;

/**
 * This class holds the <TAG> and "Word" of a translation
 * 
 * @author Nathaniel Bucknor-Smartt
 */
public class Translation {
    private String source;
    private String target;

    /**
     * Translation holds the <TAG> and the "Word" it is translated to
     * 
     * @param source the <TAG>
     * @param target the "Word"
     */

    public Translation(String source, String target) {
        this.source = source;
        this.target = target;
    }

    /**
     * Return the <TAG> of a translation
     * 
     * @return the <TAG>
     */

    public String getSource() {
        return source;
    }

    /**
     * Return the "Word" of a translation
     * 
     * @return the "Word"
     */

    public String getTarget() {
        return target;
    }
}
