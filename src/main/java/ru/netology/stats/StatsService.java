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
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int abodeAverage(int[] sales) {
        int sum = 0;
        int abodeAverageSum = 0;
        int averageSum;
        for (int sale : sales) {
            sum += sale;
        }
        averageSum = sum / sales.length;
        for (int sale : sales) {
            if (sale > averageSum) {
                abodeAverageSum++;
            }
        }
        return abodeAverageSum;

    }

    public int belowTheAverage(int[] sales) {
        int sum = 0;
        int belowTheAverage = 0;
        int averageSum;
        for (int sale : sales) {
            sum += sale;
        }
        averageSum = sum / sales.length;
        for (int sale : sales) {
            if (sale < averageSum) {
                belowTheAverage++;
            }
        }
        return belowTheAverage;
    }
}
