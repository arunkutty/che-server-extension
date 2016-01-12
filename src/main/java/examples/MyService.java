/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package examples;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello/{ws-id}")
public class MyService {

    @GET
    @Path("{name}")
    public String sayHello(@PathParam("name") String name) {
        try {
            Thread.sleep(2000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return "Hello " + name + " !";
    }
}
