package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
public class AppTest    extends TestCase{

    @org.junit.Test
    public void testApp(){
        App app = new  App();
//        String result = app.checkDayNum(1);
        Assert.assertEquals(app.checkDayNum(1), "Понедельник");
        Assert.assertEquals(app.checkDayNum(2), "Вторник");
        Assert.assertEquals(app.checkDayNum(3), "Среда");
        Assert.assertEquals(app.checkDayNum(4), "Четверг");
        Assert.assertEquals(app.checkDayNum(5), "Пятница");
        Assert.assertEquals(app.checkDayNum(6), "Суббота");
        Assert.assertEquals(app.checkDayNum(7), "Воскресенье");
        Assert.assertEquals(app.checkDayNum(-1), "Неправильный день недели");
        Assert.assertEquals(app.checkDayNum(0), "Неправильный день недели");
        Assert.assertEquals(app.checkDayNum(9), "Неправильный день недели");
    }

}
