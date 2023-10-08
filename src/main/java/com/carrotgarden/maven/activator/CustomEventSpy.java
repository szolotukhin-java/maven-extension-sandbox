package com.carrotgarden.maven.activator;

import org.apache.maven.eventspy.AbstractEventSpy;
import org.apache.maven.execution.MavenExecutionRequest;
import org.codehaus.plexus.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Arrays;

@Singleton
@Named
public class CustomEventSpy extends AbstractEventSpy {
    @Inject
    protected Logger log;

    @Override
    public void onEvent(Object event) {
        if (event instanceof MavenExecutionRequest) {
            MavenExecutionRequest request = (MavenExecutionRequest) event;
            request.setSelectedProjects(Arrays.asList("module3", "module4"));
//            log.info("SZ");
        }
    }
}
