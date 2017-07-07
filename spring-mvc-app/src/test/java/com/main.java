package com;

import com.google.common.base.Objects;

import com.google.common.collect.*;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Created by yongli.chen on 2017/7/7.
 */
public class main {
    @Test
    public void testSet() {
        ImmutableList<String> imList = ImmutableList.of("peida", "jerry", "harry", "lisa", "jerry");
        System.out.println("imList：" + imList);
        ImmutableSortedSet<String> imSortList = ImmutableSortedSet.copyOf(imList);
        System.out.println("imSortList：" + imSortList);
        System.out.println("imSortList as list：" + imSortList.asList());
    }

}




