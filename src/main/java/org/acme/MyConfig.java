package org.acme;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "my")
@StaticInitSafe
public interface MyConfig {

    String config();

}
