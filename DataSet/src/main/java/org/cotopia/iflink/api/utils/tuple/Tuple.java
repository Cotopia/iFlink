

package org.cotopia.iflink.api.utils.tuple;

public abstract class Tuple implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public static final int MAX_ARITY = 25;


    /**
     * Gets the field at the specified position.
     *
     * @param pos The position of the field, zero indexed.
     * @return The field at the specified position.
     * @throws IndexOutOfBoundsException Thrown, if the position is negative, or equal to, or larger than the number of fields.
     */
    public abstract <T> T getField(int pos);

    public <T> T getFieldNotNull(int pos) {
        T field = getField(pos);
        if (field != null) {
            return field;
        } else {
            throw new NullPointerException("get field null in posotion : " + String.valueOf(pos));
        }
    }

    public abstract <T> void setField(T value, int pos);


    @SuppressWarnings("unchecked")
    public static Class<? extends Tuple> getTupleClass(int arity) {
        if (arity < 0 || arity > MAX_ARITY) {
            throw new IllegalArgumentException("The tuple arity must be in [0, " + MAX_ARITY + "].");
        }
        return (Class<? extends Tuple>) CLASSES[arity];
    }

    // --------------------------------------------------------------------------------------------
    // The following lines are generated.
    // --------------------------------------------------------------------------------------------

    // BEGIN_OF_TUPLE_DEPENDENT_CODE
    // GENERATED FROM org.apache.flink.api.java.tuple.TupleGenerator.
    private static final Class<?>[] CLASSES = new Class<?>[]{Tuple2.class};
    // END_OF_TUPLE_DEPENDENT_CODE
}
