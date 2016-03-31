package dataset;

import java.util.Collection;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public abstract class DataSet<T> {
    private Collection<T> context;

    public DataSet(Collection<T> context) {
        this.context = context;
    }

    public Collection<T> getContext() {
        return context;
    }
}
