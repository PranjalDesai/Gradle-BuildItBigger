package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.pranjaldesai.javajokes.javaJokes;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says name back */
    @ApiMethod(name = "sayJoke")
    public MyBean sayJoke() {
        javaJokes myJoke = new javaJokes();
        MyBean response = new MyBean();
        response.setData(myJoke.getMyJoke());

        return response;
    }

}
