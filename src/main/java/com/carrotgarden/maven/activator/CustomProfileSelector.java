package com.carrotgarden.maven.activator;

import org.apache.maven.model.Profile;
import org.apache.maven.model.building.ModelProblemCollector;
import org.apache.maven.model.profile.DefaultProfileSelector;
import org.apache.maven.model.profile.ProfileActivationContext;
import org.apache.maven.model.profile.ProfileSelector;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;
import org.codehaus.plexus.logging.Logger;

import java.util.Collection;
import java.util.List;

@Component(role = ProfileSelector.class, hint = "default")
public class CustomProfileSelector extends DefaultProfileSelector {

    @Requirement
    protected Logger log;

    @Override
    public List<Profile> getActiveProfiles(Collection<Profile> profiles, ProfileActivationContext context, ModelProblemCollector problems) {
        List<Profile> defaultList = super.getActiveProfiles(profiles, context, problems);
//        log.info("Hello from the Maven extension sandbox");
        return defaultList;
    }
}
