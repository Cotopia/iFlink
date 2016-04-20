package org.cotopia.iflink.api.driver;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public interface Visitor<T extends Visitable<T>> {
    /**
     * @param visitable
     * @return True, if the traversal should continue, false otherwise.
     */
    boolean preVisit(T visitable);

    /**
     * @param visitable
     */
    void postVisit(T visitable);
}
