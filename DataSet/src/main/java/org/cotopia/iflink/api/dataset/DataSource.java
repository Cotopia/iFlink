package org.cotopia.iflink.api.dataset;

import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;
import org.cotopia.iflink.api.operators.Operator;

import java.util.Collection;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */

public class DataSource<OUT> extends Operator<OUT, DataSource<OUT>> {

    private final Collection<OUT> inputFormat;

    public DataSource(ExecutionEnvironment context, Collection<OUT> inputFormat) {
        super(context);
        if (inputFormat == null) {
            throw new IllegalArgumentException("The input format may not be null.");
        }
        this.inputFormat = inputFormat;
    }
}
