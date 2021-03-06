//
// Pythagoras - a collection of geometry classes
// http://github.com/samskivert/pythagoras

package pythagoras.d;

/**
 * Provides read-only access to a {@link Point}.
 */
public interface IPoint extends Cloneable
{
    /** Returns this point's x-coordinate. */
    double x ();

    /** Returns this point's y-coordinate. */
    double y ();

    /** Returns the squared Euclidian distance between this point and the specified point. */
    double distanceSq (double px, double py);

    /** Returns the squared Euclidian distance between this point and the supplied point. */
    double distanceSq (IPoint p);

    /** Returns the Euclidian distance between this point and the specified point. */
    double distance (double px, double py);

    /** Returns the Euclidian distance between this point and the supplied point. */
    double distance (IPoint p);

    /** Multiplies this point by a scale factor.
     * @return a new point containing the result. */
    Point mult (double s);

    /** Multiplies this point by a scale factor and places the result in the supplied object.
     * @return a reference to the result, for chaining. */
    Point mult (double s, Point result);

    /** Translates this point by the specified offset.
     * @return a new point containing the result. */
    Point add (double x, double y);

    /** Translates this point by the specified offset and stores the result in the object provided.
     * @return a reference to the result, for chaining. */
    Point add (double x, double y, Point result);

    /** Rotates this point around the origin by the specified angle.
     * @return a new point containing the result. */
    Point rotate (double angle);

    /** Rotates this point around the origin by the specified angle, storing the result in the
     * point provided.
     * @return a reference to the result point, for chaining. */
    Point rotate (double angle, Point result);

    /** Returns a mutable copy of this point. */
    Point clone ();
}
