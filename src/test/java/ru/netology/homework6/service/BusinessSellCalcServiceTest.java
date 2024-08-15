package ru.netology.homework6.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BusinessSellCalcServiceTest {

    @Test
    public void shouldCalcAmount() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expect = 180;

        long actual = service.calcAmount(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcAverage() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expect = 15;

        long actual = service.calcAverage(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSale() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 7;

        int actual = service.findMonthWithMaxSale(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldFindMonthWithMinSale() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 8;

        int actual = service.findMonthWithMinSale(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcCntMonthUnderAverage() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;

        int actual = service.cntMonthUnderAverage(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcCntMonthOverAverage() {
        BusinessSellCalcService service = new BusinessSellCalcService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;

        int actual = service.cntMonthOverAverage(sales);
        Assertions.assertEquals(expect, actual);
    }
}
