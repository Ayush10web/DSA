import java.util.*;

public class ques {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_book_count = sc.nextInt();
        int[] book_prices = new int[n];
        for (int i = 0; i < n; i++) {
            book_prices[i] = sc.nextInt();
        }

        double window_sum = 0;
        double min_avg_price = Double.MAX_VALUE;
        int min_start_index = 0;

        for (int i = 0; i < n; i++) {
            if (i < max_book_count) {
                window_sum += book_prices[i];
                if (i == max_book_count - 1) {
                    double window_avg_price = window_sum / max_book_count;
                    if (window_avg_price < min_avg_price) {
                        min_avg_price = window_avg_price;
                        min_start_index = 0;
                    }
                }
            } else {
                window_sum += book_prices[i] - book_prices[i - max_book_count];
                double window_avg_price = window_sum / max_book_count;
                if (window_avg_price < min_avg_price) {
                    min_avg_price = window_avg_price;
                    min_start_index = i - max_book_count + 1;
                }
            }
        }

        int[] min_books = Arrays.copyOfRange(book_prices, min_start_index, min_start_index + max_book_count);
        for (int i = 0; i < min_books.length; i++) {
            System.out.println(min_books[i]);
        }   
    }
}
