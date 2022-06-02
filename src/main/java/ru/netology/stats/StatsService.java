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

    public int sum(int[] sales) {
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
        int sum = sum(sales);

        return sum / sales.length;
    }

    public int abodeAverage(int[] sales) {
        int averageSum = sumAverage(sales);
        int aboveAverageSum = 0;

        for (int sale : sales) {
            if (sale > averageSum) {
                aboveAverageSum++;
            }
        }
        return aboveAverageSum;

    }

    public int belowTheAverage(int[] sales) {
        int averageSum = sumAverage(sales);
        int belowTheAverage = 0;

        for (int sale : sales) {
            if (sale < averageSum) {
                belowTheAverage++;
            }
        }
        return belowTheAverage;
    }
}
