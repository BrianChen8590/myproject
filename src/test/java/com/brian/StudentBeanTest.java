package com.brian;

import com.brian.student.StudentBean;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentBeanTest {

    @Test
    public void highTest() {
        StudentBean studentBean = new StudentBean("Peter", 50, 80);
        Assertions.assertEquals(80, studentBean.highest());
    }

    @Test
    public void averageTest() {
        StudentBean studentBean = new StudentBean("Peter", 50, 80);
        Assertions.assertEquals(65, studentBean.average());
    }

}
