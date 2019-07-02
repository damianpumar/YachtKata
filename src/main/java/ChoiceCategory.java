public class ChoiceCategory extends Category {
    @Override
    public int calculate(int[] diceNumbers) {
        return this.sumAllElements(diceNumbers);
    }
}
