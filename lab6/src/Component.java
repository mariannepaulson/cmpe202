
/**
 * Write a description of interface Component here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Component
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    String printDescription();
    void addChild(Component c);
    void removeChild(Component c);
    Component getChild(int i);
    double getPrice();
}
