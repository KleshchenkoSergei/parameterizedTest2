package ru.netology.stat;

public class StatsService {


    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int salesAvg(int[] sales) {
        double sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = (int)Math.round(sum / sales.length);
        return average;
    }

    public int salesMaxMonth(int[] sales) {
        int monthMax = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[monthMax]) {
                monthMax = month;
            }
            month++;
        }
        return monthMax + 1;
    }

    public int salesMinMonth(int[] sales) {
        int monthMin = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[monthMin]) {
                monthMin = month;
            }
            month++;
        }
        return monthMin + 1;
    }

    public int salesLowAverage(int[] sales) {
        StatsService service = new StatsService();
        int average = service.salesAvg(sales);
        int numberLow = 0;
        for (int sale : sales) {
            if (sale < average) {
                numberLow++;
            }
        }
        return numberLow;
    }

    public int salesOverAverage(int[] sales) {
        StatsService service = new StatsService();
        int average = service.salesAvg(sales);
        int numberOver = 0;
        for (int sale : sales) {
            if (sale > average) {
                numberOver++;
            }
        }
        return numberOver;
    }

}
