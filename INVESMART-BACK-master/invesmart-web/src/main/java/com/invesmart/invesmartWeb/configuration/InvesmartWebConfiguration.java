package com.invesmart.invesmartWeb.configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InvesmartWebConfiguration {

    @SuppressWarnings("serial")
    public static Map<String, Object> getWebConfiguration() {
        return Collections.unmodifiableMap(new HashMap<String, Object>() {
            {
                put("server.port", 9080);
                put("server.servlet.context-path", "/invesmart");
            }
        });
    }

}
