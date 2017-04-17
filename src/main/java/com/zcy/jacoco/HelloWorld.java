/*
 * Copyright (c) 2017 Guangzhou Ewaytec Technology, Inc.
 * All rights reserved.
 */

package com.zcy.jacoco;

/**
 * @author cyzhu@ewaytec.cn
 * @date on 2017/4/17
 */
public class HelloWorld {
    private HelloWorld() {
        throw new IllegalAccessError("Utility class");
    }

    public static String getWorldName(String name) {
        return "hello_" + name;
    }
}
