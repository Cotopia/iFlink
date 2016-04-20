package org.cotopia.iflink.api.enviroment;

import org.cotopia.iflink.api.JobExecutionResult;
import org.cotopia.iflink.api.driver.Plan;

/**
 * Created by Acceml on 2016/4/14
 * Email: huminghit@gmail.com
 */
public class LocalEnvironment extends ExecutionEnvironment {

    protected LocalEnvironment() {
        super();
    }

    @Override
    public JobExecutionResult execute(String jobName) throws Exception {
        Plan p = createProgramPlan(jobName);
        return null;
    }

    public Plan createProgramPlan(String jobName) {
        return createProgramPlan(jobName, true);
    }

    public Plan createProgramPlan(String jobName, boolean clearSinks) {
        if (this.sinks.isEmpty()) {
            throw new NullPointerException("data sink can not be null");
        }

        return null;
    }
}
