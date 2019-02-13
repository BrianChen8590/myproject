package com.student

import com.brian.Person2
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentBeanTest {
    @Test
    fun Person2Test() {
        var bmi = Person2(weight = 70f, high = 1.8f);
        Assertions.assertEquals(70f / (1.8f * 1.8f), bmi.bmi())
    }
}