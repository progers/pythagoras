//
// Pythagoras - a collection of geometry classes
// http://github.com/samskivert/pythagoras

package pythagoras.f;

/**
 * Provides read-only access to a {@link Vector}.
 */
public interface IVector
{
    /** Returns the x-component of this vector. */
    float x ();

    /** Returns the y-component of this vector. */
    float y ();

    /** Computes and returns the dot product of this and the specified other vector. */
    float dot (IVector other);

    /** Negates this vector.
     * @return a new vector containing the result. */
    Vector negate ();

    /** Negates this vector, storing the result in the supplied object.
     * @return a reference to the result, for chaining. */
    Vector negate (Vector result);

    /** Normalizes this vector.
     * @return a new vector containing the result. */
    Vector normalize ();

    /** Normalizes this vector, storing the result in the object supplied.
     * @return a reference to the result, for chaining. */
    Vector normalize (Vector result);

    /** Returns the angle between this vector and the specified other vector. */
    float angle (IVector other);

    /** Returns the direction of a vector pointing from this point to the specified other point. */
    float direction (IVector other);

    /** Returns the length of this vector. */
    float length ();

    /** Returns the squared length of this vector. */
    float lengthSq ();

    /** Returns the distance from this vector to the specified other vector. */
    float distance (IVector other);

    /** Returns the squared distance from this vector to the specified other. */
    float distanceSq (IVector other);

    /** Multiplies this vector by a scalar.
     * @return a new vector containing the result. */
    Vector mult (float v);

    /** Multiplies this vector by a scalar and places the result in the supplied object.
     * @return a reference to the result, for chaining. */
    Vector mult (float v, Vector result);

    /** Multiplies this vector by another.
     * @return a new vector containing the result. */
    Vector mult (IVector other);

    /** Multiplies this vector by another, storing the result in the object provided.
     * @return a reference to the result vector, for chaining. */
    Vector mult (IVector other, Vector result);

    /** Adds a vector to this one.
     * @return a new vector containing the result. */
    Vector add (IVector other);

    /** Adds a vector to this one, storing the result in the object provided.
     * @return a reference to the result, for chaining. */
    Vector add (IVector other, Vector result);

    /** Adds a vector to this one.
     * @return a new vector containing the result. */
    Vector add (float x, float y);

    /** Adds a vector to this one and stores the result in the object provided.
     * @return a reference to the result, for chaining. */
    Vector add (float x, float y, Vector result);

    /** Adds a scaled vector to this one.
     * @return a new vector containing the result. */
    Vector addScaled (IVector other, float v);

    /** Adds a scaled vector to this one and stores the result in the supplied vector.
     * @return a reference to the result, for chaining. */
    Vector addScaled (IVector other, float v, Vector result);

    /** Subtracts a vector from this one.
     * @return a new vector containing the result. */
    Vector subtract (IVector other);

    /** Subtracts a vector from this one and places the result in the supplied object.
     * @return a reference to the result, for chaining. */
    Vector subtract (IVector other, Vector result);

    /** Rotates this vector by the specified angle.
     * @return a new vector containing the result. */
    Vector rotate (float angle);

    /** Rotates this vector by the specified angle, storing the result in the vector provided.
     * @return a reference to the result vector, for chaining. */
    Vector rotate (float angle, Vector result);

    /** Rotates this vector by the specified angle and adds another vector to it, placing the
     * result in the object provided.
     * @return a reference to the result, for chaining. */
    Vector rotateAndAdd (float angle, IVector add, Vector result);

    /** Rotates this vector by the specified angle, applies a uniform scale, and adds another
     * vector to it, placing the result in the object provided.
     * @return a reference to the result, for chaining. */
    Vector rotateScaleAndAdd (float angle, float scale, IVector add, Vector result);

    /** Linearly interpolates between this and the specified other vector by the supplied amount.
     * @return a new vector containing the result. */
    Vector lerp (IVector other, float t);

    /** Linearly interpolates between this and the supplied other vector by the supplied amount,
     * storing the result in the supplied object.
     * @return a reference to the result, for chaining. */
    Vector lerp (IVector other, float t, Vector result);

    /** Returns a mutable copy of this vector. */
    Vector clone ();
}
