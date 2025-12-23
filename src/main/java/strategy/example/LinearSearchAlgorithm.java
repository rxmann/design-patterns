package strategy.example;

public class LinearSearchAlgorithm implements SearchAlgorithm {

    @Override
    public Integer search(Integer[] data, Integer target) {

        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

}
