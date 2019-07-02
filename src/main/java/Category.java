public abstract class Category {
    public abstract int calculate(int[] diceNumbers);

    protected int sumAllElements(int[] diceNumbers) {
        int score = 0;

        for (int dieNumber : diceNumbers)
            score += dieNumber;

        return score;
    }
}
