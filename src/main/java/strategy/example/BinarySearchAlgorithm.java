package strategy.example;

public class BinarySearchAlgorithm implements SearchAlgorithm {

    @Override
    public Integer search(Integer[] data, Integer target) {
        int start = 0;
        int end = data.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (data[mid].equals(target)) {
                return mid;
            } else if (data[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}
