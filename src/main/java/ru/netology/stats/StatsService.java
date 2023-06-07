package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long generalSale = 0;
        for (long sale : sales) {
            generalSale += sale;
        }
        return generalSale;
    }

    public long mid(long[] sales) {
        long generalSale = 0;
        for (long sale : sales) {
            generalSale += sale;
        }
        long midSale = generalSale / 12;
        return midSale;
    }

    public int monthMaxsum(long[] sales) {
        int monthMaxsum = 0;
        long saleMaxsum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaxsum) {
                monthMaxsum = i;
                saleMaxsum = sales[i];
            }

        }
        return monthMaxsum +1;
    }

    public int monthMinsum(long[] sales) {
        int monthMinsum = 0;
        long saleMinsum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinsum) {
                monthMinsum = i;
                saleMinsum = sales[i];
            }

        }
        return monthMinsum +1;
    }

    public int monthBelowAverage(long[] sales) {
        int month = 0;

        for (long sale : sales) {
            if (sale < mid(sales)) {
                month ++;
            }
        }
        return month;

    }

    public int monthAboveAverage(long[] sales) {
        int month = 0;

        for (long sale : sales) {
            if (sale > mid(sales)) {
                month ++;
            }
        }
        return month;

    }


}