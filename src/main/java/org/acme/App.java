package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

import io.quarkus.runtime.Startup;

@Startup
@ApplicationScoped
public class App {

    App(Logger log, MyConfig config) {
        String myConfig = ConfigProvider.getConfig().getConfigValue("my.config").getValue();
        log.infof("My config from ConfigProvider is [%s]", myConfig);
        log.infof("My config from ConfigMapping is [%s]", config.config());
    }
}