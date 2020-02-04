/*
 * Copyright (c) 1997, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.enterprise.deploy.spi;


/**
 * A Target interface represents a single logical
 * core server of one instance of a Jakarta EE platform
 * product.  It is a designator for a server and
 * the implied location to copy a configured
 * application for the server to access.
 */
public interface Target
{
   /**
    * Retrieve the name of the target server.
    *
    * @return the name
    */
   public String getName();

   /**
    * Retrieve other descriptive information
    * about the target.
    *
    * @return the description
    */
   public String getDescription();
}
