package ru.netology.homework6.stats;

public class StatsService {

    public long calcAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long calcAverage(long[] sales) {
        long amount = calcAmount(sales);
        long average = amount / sales.length;
        return average;
    }

    public int findMonthWithMaxSale(long[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[maxMonth] <= sales[month]) {
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    public int findMonthWithMinSale(long[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[minMonth] >= sales[month]) {
                minMonth = month;
            }
        }
        return minMonth;
    }

    public int cntMonthUnderAverage(long[] sales) {
        int cnt = 0;
        long average = calcAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                cnt++;
            }
        }
        return cnt;
    }

    public int cntMonthOverAverage(long[] sales) {
        int cnt = 0;
        long average = calcAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                cnt++;
            }
        }
        return cnt;
    }
}
