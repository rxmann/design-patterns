package strategy.example;

public class SearchContext {

    private SearchAlgorithm algorithm;

    public SearchContext(SearchAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public SearchAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(SearchAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Integer executeSearch(Integer[] data, Integer target) {
        return algorithm.search(data, target);
    }

}
