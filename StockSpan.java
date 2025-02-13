import java.util.*;
public class StockSpan{
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } 
			else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        
        return span;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        
        int span[]= calculateSpan(prices);
        
        System.out.println("Stock Span:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
