package strategy.example;

public class SearchClient {

    public static void main(String[] args) {

        Integer[] data = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Integer target = 4;

        SearchAlgorithm linearSearchAlgo = new LinearSearchAlgorithm();
        SearchContext ctx = new SearchContext(linearSearchAlgo);
        Integer result = ctx.executeSearch(data, target);

        System.out.println("Linear Search Result: " + result);
    }

}
