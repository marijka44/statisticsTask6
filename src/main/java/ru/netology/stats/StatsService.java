package ru.netology.stats;

public class StatsService {
    public int maxSales(int[] sales) {
        int maxMonth = sales[0];
        for (int sale : sales) {
            if (sale > maxMonth) {
                maxMonth = sale;
            }
        }
        return maxMonth;
    }

    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = sales[0];
        for (int sale : sales) {
            if (sale < minMonth) {
                minMonth = sale;
            }
        }
        return minMonth;
    }

    public int sumAverage(int[] sales) {
        int sum = (sales[0]);
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int abodeAverage(int[] sales) {
        int sum = (sales[0]);
        for (int sale : sales) {
           if (sum / sales.length <= sum ) {
               sum = sum / sales.length + 1;
           }
        }
        return sales.length + 1;

    }
}
