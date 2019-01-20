package com.jdk.test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Random;

/**
 * @author ��Ƽ
 * @date 2017/12/9 0009
 */
//Emuneration�ٶȿ�һ�㣬��ΪIterator֧��fail-fast���������һЩ��
//Emuneration��jdk1.0ʱ��ƣ�Iterator��1.2ʱ������
//Iterator�ж���һ��remove���������Խ��м��ϵ��޸�
public class TestEmunerationAndIterator {
    public static void main(String[] args) {
        int val;
        Random r = new Random();
        Hashtable table = new Hashtable();
        for (int i = 0; i < 3000000; i++) {
            // �����ȡһ��[0,100)֮�������
            val = r.nextInt(100);
            table.put(String.valueOf(i), val);
        }

        // ͨ��Iterator����Hashtable
        iterateHashtable(table);

        // ͨ��Enumeration����Hashtable
        enumHashtable(table);
    }

    /*
     * ͨ��Iterator����Hashtable
     */
    private static void iterateHashtable(Hashtable table) {
        long startTime = System.currentTimeMillis();

        Iterator iter = table.entrySet().iterator();
        while (iter.hasNext()) {
            //System.out.println("iter:"+iter.next());
            iter.next();
        }

        long endTime = System.currentTimeMillis();
        countTime(startTime, endTime);
    }

    /*
         * ͨ��Enumeration����Hashtable
     */
    private static void enumHashtable(Hashtable table) {
        long startTime = System.currentTimeMillis();

        Enumeration enu = table.elements();
        while (enu.hasMoreElements()) {
            //System.out.println("enu:"+enu.nextElement());
            enu.nextElement();
        }

        long endTime = System.currentTimeMillis();
        countTime(startTime, endTime);
    }

    private static void countTime(long start, long end) {
        System.out.println("time: " + (end - start) + "ms");
    }
}
