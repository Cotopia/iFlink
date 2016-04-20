package org.cotopia.iflink.api.driver;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public interface Visitable<T extends Visitable<T>> {
    void accept(Visitor<T> visitor);
}
