import javax.swing.text.html.HTML.Tag;
import translate.*;

import tag.*;

class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        TagOccurrence tag = new TagOccurrence("This is a <Test> message", 0, 0);

        tag = TagOccurrence.nextOccurrence("This is a <Test> message", 0);

    }
}