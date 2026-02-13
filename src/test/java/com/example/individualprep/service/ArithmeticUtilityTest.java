package com.example.individualprep.service;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArithmeticUtilityTest {

    private ArithmeticUtility arithmeticUtility;

    @BeforeEach
    void setUp(){
        arithmeticUtility = new ArithmeticUtility();
    }

    @Test
    void multiplyTest(){
        assertEquals(6, arithmeticUtility.multiply(2.0,3.0));
        assertEquals(-20, arithmeticUtility.multiply(5.0,-4.0));
        assertEquals(9, arithmeticUtility.multiply(-3.0, -3.0));
    }
}
