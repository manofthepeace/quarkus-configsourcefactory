package org.acme;

import java.util.Collections;

import org.jboss.logging.Logger;

import io.smallrye.config.ConfigSourceContext;
import io.smallrye.config.ConfigSourceFactory;

public class ConfigSource implements ConfigSourceFactory {

    private static final Logger LOG = Logger.getLogger(ConfigSource.class);

    @Override
    public Iterable<org.eclipse.microprofile.config.spi.ConfigSource> getConfigSources(ConfigSourceContext context) {
        LOG.infof("Profile is", context.getProfiles());
        LOG.infof("Config from factory is [%s]", context.getValue("my.config"));
        return Collections.emptyList();
    }

}
