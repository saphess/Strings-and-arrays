package ru.netology.homework6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalcAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expect = 180;

        long actual = service.calcAmount(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expect = 15;

        long actual = service.calcAverage(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 7;

        int actual = service.findMonthWithMaxSale(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldFindMonthWithMinSale() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 8;

        int actual = service.findMonthWithMinSale(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcCntMonthUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;

        int actual = service.cntMonthUnderAverage(sales);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalcCntMonthOverAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;

        int actual = service.cntMonthOverAverage(sales);
        Assertions.assertEquals(expect, actual);
    }
}
