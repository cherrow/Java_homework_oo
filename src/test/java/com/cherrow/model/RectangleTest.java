package com.cherrow.model;

import org.junit.Test;
import org.junit.Assert;

public class RectangleTest {

    @Test
    public void should_get_correct_size() {
        //given
        float width = 2;
        float length = 3;
        float expectedArea = 6;

        //when
        Rectangle rectangle = new Rectangle(length, width);
        float area = rectangle.area();

        //then
        Assert.assertEquals(expectedArea, area, 0);
    }

    @Test
    public void should_get_correct_perimeter() {
        //given
        float width = 2;
        float length = 3;
        float expectedCircumference = 10;

        //when
        Rectangle rectangle = new Rectangle(length, width);
        float circumference = rectangle.circumference();

        //then
        Assert.assertEquals(expectedCircumference, circumference, 0);
    }
}