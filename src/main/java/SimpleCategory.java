public class SimpleCategory extends Category {
    private int dieNumber;

    public SimpleCategory(int dieNumber) {
        this.dieNumber = dieNumber;
    }

    @Override
    public int calculate(int[] diceNumbers) {
        int scores = 0;

        for (int number : diceNumbers) {
            if (number == this.dieNumber)
                scores += number;
        }

        return scores;
    }
}
