package com.sy.snack.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/10/13.
 */
public class test1 {

    @Test
    public void teets() {
        Logger logger = LogManager.getLogger();
        List<test> list = new ArrayList<>();

        list.add(new test("2012-12-12 00:00:00", 1.0, 2.0));
        list.add(new test("2012-12-12 10:00:00", 3.0, 4.0));
        list.add(new test("2015-12-12 00:00:00", 5.0, 6.0));
        list.add(new test("2014-12-12 00:00:00", 7.0, 8.0));

        list.add(new test("2016-12-12 00:00:00", 9.0, 10.0));
        list.add(new test("2016-12-12 10:00:00", 11.0, 12.0));
        list.add(new test("2012-12-12 01:00:00", 13.0, 14.0));

        list.add(new test("2017-12-12 01:00:00", 13.0, 14.0));
        list.add(new test("2017-12-12 11:00:00", 13.0, 14.0));

        list.add(new test("2011-12-12 11:00:00", 13.0, 14.0));
        list.add(new test("2011-12-12 00:00:00", 13.0, 14.0));
        list.add(new test("2018-12-12 05:00:00", 13.0, 14.0));
        list.add(new test("2018-12-12 04:00:00", 13.0, 14.0));
        Collections.sort(list);


        List<test> newlist = new ArrayList<>();
        logger.warn(list.toString());
        for (int i = 0; i < list.size(); i++) {

            try {
                List<test> listOneDay = new ArrayList<>();
                test oneTest = list.get(0);
                listOneDay.add(oneTest);
                String oneTestTime = oneTest.getTime().substring(0, 10);
                logger.warn(oneTestTime);
                for (int j = 1; j < list.size(); j++) {
                    try {
                        test oneTestNext = list.get(j);
                        String oneTestNextTime = oneTestNext.getTime().substring(0, 10);
                        if (oneTestNextTime.equals(oneTestTime)) {
                            listOneDay.add(oneTestNext);
                            list.remove(j);
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                        break;
                    }

                }
                list.remove(0);
                test oneDayAllTest = new test("", 0.0, 0.0);
                for (int k = 0; k < listOneDay.size(); k++) {
                    oneDayAllTest.setTime(oneTestTime);
                    oneDayAllTest.setValue1(oneDayAllTest.getValue1() + listOneDay.get(k).getValue1());
                    oneDayAllTest.setValue2(oneDayAllTest.getValue2() + listOneDay.get(k).getValue1());
                }
                oneDayAllTest.setValue1(oneDayAllTest.getValue1() / listOneDay.size());
                oneDayAllTest.setValue2(oneDayAllTest.getValue2() / listOneDay.size());
                newlist.add(oneDayAllTest);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

        }

        logger.warn(newlist.toString());
    }
}
