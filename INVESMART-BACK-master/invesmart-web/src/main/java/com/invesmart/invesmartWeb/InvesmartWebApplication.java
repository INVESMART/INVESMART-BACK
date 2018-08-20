package com.invesmart.invesmartWeb;

import com.invesmart.invesmartCore.InvesmartCoreApplication;
import com.invesmart.invesmartWeb.configuration.InvesmartWebConfiguration;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class InvesmartWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.CONSOLE)
                .sources(InvesmartCoreApplication.class, InvesmartWebApplication.class)
                .properties(InvesmartWebConfiguration.getWebConfiguration())
                .run(args);
    }

}
