/*
 * Copyright (c) 2017 Guangzhou Ewaytec Technology, Inc.
 * All rights reserved.
 */

package com.zcy.jacoco;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author cyzhu@ewaytec.cn
 * @date on 2017/4/17
 */
public class TestHelloWorld {
    @Test
    public void testGetWorldName() {
        String name = "world";
        String target = HelloWorld.getWorldName(name);
        Assert.assertEquals("测试helloWorld", "hello_" + name, target);
    }
}
