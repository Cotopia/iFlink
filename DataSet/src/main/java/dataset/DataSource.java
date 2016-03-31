package dataset;

import java.util.Collection;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public class DataSource<T> extends DataSet<T> {

    public DataSource(Collection<T> context) {
        super(context);
    }
}
