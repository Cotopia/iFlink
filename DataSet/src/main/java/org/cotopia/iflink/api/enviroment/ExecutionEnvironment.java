package org.cotopia.iflink.api.enviroment;

import org.cotopia.iflink.api.JobExecutionResult;
import org.cotopia.iflink.api.dataset.DataSource;
import org.cotopia.iflink.api.operators.DataSink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public abstract class ExecutionEnvironment {

    protected final List<DataSink<?>> sinks = new ArrayList<>();

    private static ExecutionEnviromentFactory contextEnvironmentFactory;

    ExecutionEnvironment() {
    }

    public static ExecutionEnvironment getExecutionEnvironment() {
        return contextEnvironmentFactory == null ?
                new LocalEnvironment() : contextEnvironmentFactory.createExecutionEnvironment();
    }

    public final <T> DataSource<T> fromCollection(Collection<T> data) {
        return new DataSource<T>(this, data);
    }

    public final <T> DataSource<T> fromElements(T... data) {
        if (data == null) {
            throw new IllegalArgumentException("the data must not be null.");
        }
        if (data.length == 0) {
            throw new IllegalArgumentException("the number of elements must not be null");
        }
        return fromCollection(Arrays.asList(data));
    }

    public abstract JobExecutionResult execute(String jobName) throws Exception;

    public void registerDataSink(DataSink<?> sink) {
        this.sinks.add(sink);
    }
}