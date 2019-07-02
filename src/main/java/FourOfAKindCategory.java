public class FourOfAKindCategory extends Category {
    @Override
    public int calculate(int[] diceNumbers) {
        int scores = 0;

        for (int i = 1; i < diceNumbers.length; i++) {
            scores += diceNumbers[i];
        }

        return scores;
    }
}
