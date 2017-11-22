/*******************************************************************************
 * Copyright (c) 2012 - 2017 Signal Iduna Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Signal Iduna Corporation - initial API and implementation
 * akquinet AG
 * itemis AG
 *******************************************************************************/

package org.testeditor.fixture.web.json;

import org.junit.Assert;
import org.junit.Test;

public class CapabilityTest {
    
    @Test
    public void capabilityTest() throws Exception {
        
        Capability capabilityInt = new Capability("This is an Integer", 1, Integer.class); 
        Capability capabilityString = new Capability("This is a String", "world", String.class); 
        Capability capabilityDouble = new Capability("This is a Double", 0.2, Double.class);
        Capability capabilityBoolean = new Capability("This is a Boolean", true, Boolean.class);
        
        Assert.assertTrue("Value is not an integer", (Integer) capabilityInt.getValue() == 1);
        Assert.assertTrue("Value is not a String", capabilityString.getValue().equals("world")) ;
        Assert.assertTrue("Value is not a double", (Double) capabilityDouble.getValue() == 0.2);
        Assert.assertTrue("Value is not a boolean", (Boolean) capabilityBoolean.getValue() == true);
    }

}
