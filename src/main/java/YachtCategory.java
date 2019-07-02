public class YachtCategory extends Category {
    @Override
    public int calculate(int[] diceNumbers) {
        Integer lastNumber = null;

        for (int dieNumber : diceNumbers) {
            if (lastNumber == null || lastNumber == dieNumber) {
                lastNumber = dieNumber;

                continue;
            }

            return 0;
        }

        return 50;
    }
}
