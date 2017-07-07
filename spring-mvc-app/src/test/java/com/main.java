package com;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by yongli.chen on 2017/7/7.
 */
public class main
{
    @Test
    public void testSet()
    {
        Set<Integer> busRpodTpKeySet = Sets.newHashSet();
        busRpodTpKeySet.add(1);
        busRpodTpKeySet.add(2);
        busRpodTpKeySet.add(3);
        busRpodTpKeySet.add(4);

        List<Integer> list = Lists.newArrayList(busRpodTpKeySet.iterator());
        System.out.println(list);


    }

}
