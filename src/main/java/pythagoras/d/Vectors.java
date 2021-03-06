//
// Pythagoras - a collection of geometry classes
// http://github.com/samskivert/pythagoras

package pythagoras.d;

/**
 * Vector-related utility methods.
 */
public class Vectors
{
    /** A unit vector in the X+ direction. */
    public static final IVector UNIT_X = new Vector(1f, 0f);

    /** A unit vector in the Y+ direction. */
    public static final IVector UNIT_Y = new Vector(0f, 1f);

    /** The zero vector. */
    public static final IVector ZERO = new Vector(0f, 0f);

    /** A vector containing the minimum doubleing point value for all components
     * (note: the components are -{@link Float#MAX_VALUE}, not {@link Float#MIN_VALUE}). */
    public static final IVector MIN_VALUE = new Vector(-Float.MAX_VALUE, -Float.MAX_VALUE);

    /** A vector containing the maximum doubleing point value for all components. */
    public static final IVector MAX_VALUE = new Vector(Float.MAX_VALUE, Float.MAX_VALUE);

    /**
     * Returns the magnitude of the specified vector.
     */
    public static final double length (double x, double y) {
        return Math.sqrt(lengthSq(x, y));
    }

    /**
     * Returns the square of the magnitude of the specified vector.
     */
    public static final double lengthSq (double x, double y) {
        return (x*x + y*y);
    }

    /**
     * Transforms a point as specified, storing the result in the point provided.
     * @return a reference to the result vector, for chaining.
     */
    public static Vector transform (double x, double y, double sx, double sy, double rotation,
                                   Vector result) {
        return transform(x, y, sx, sy, Math.sin(rotation), Math.cos(rotation), result);
    }

    /**
     * Transforms a vector as specified, storing the result in the vector provided.
     * @return a reference to the result vector, for chaining.
     */
    public static Vector transform (double x, double y, double sx, double sy, double sina, double cosa,
                                    Vector result) {
        return result.set((x*cosa - y*sina) * sx, (x*sina + y*cosa) * sy);
    }

    /**
     * Inverse transforms a point as specified, storing the result in the point provided.
     * @return a reference to the result vector, for chaining.
     */
    public static Vector inverseTransform (double x, double y, double sx, double sy, double rotation,
                                           Vector result) {
        double sinnega = Math.sin(-rotation), cosnega = Math.cos(-rotation);
        double nx = (x * cosnega - y * sinnega); // unrotate
        double ny = (x * sinnega + y * cosnega);
        return result.set(nx / sx, ny / sy); // unscale
    }

    /**
     * Returns a string describing the supplied vector, of the form <code>+x+y</code>,
     * <code>+x-y</code>, <code>-x-y</code>, etc.
     */
    public static String vectorToString (double x, double y) {
        return MathUtil.toString(x) + MathUtil.toString(y);
    }
}
