import java.util.HashMap;

public class FullHouseCategory extends Category {

    @Override
    public int calculate(int[] diceNumbers) {
        HashMap<Integer, Integer> grouping = new HashMap<Integer, Integer>();

        for (int dieNumber : diceNumbers) {
            if (grouping.containsKey(dieNumber))
                grouping.put(dieNumber, (int) grouping.get(dieNumber) + 1);

            else
                grouping.put(dieNumber, 1);
        }

        if (grouping.size() == 2) {

            int firstPosition = (int) grouping.values().toArray()[0];
            int secondPosition = (int) grouping.values().toArray()[1];

            if (firstPosition == 2 && secondPosition == 3 || firstPosition == 3 && secondPosition == 2)
                return this.sumAllElements(diceNumbers);
        }

        return 0;
    }

    private int sumAllElements(int[] diceNumbers) {
        int score = 0;

        for (int dieNumber : diceNumbers)
            score += dieNumber;

        return score;
    }
}
