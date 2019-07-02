public class BigStraightCategory extends Category {
    @Override
    public int calculate(int[] diceNumbers) {
        if (diceNumbers[0] == 2 &&
                diceNumbers[1] == 3 &&
                diceNumbers[2] == 4 &&
                diceNumbers[3] == 5 &&
                diceNumbers[4] == 6)
            return 30;

        return 0;
    }
}
