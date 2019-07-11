import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class YachtGame {
    private final DiceCombination diceCombination;
    private final Map<String, Supplier<Category>> categories;

    public YachtGame(DiceCombination diceCombination) {
        this.diceCombination = diceCombination;

        this.categories = new HashMap<String, Supplier<Category>>() {
            {
                put("Ones", () -> new SimpleCategory(1));
            }
        };
    }

    public int play(String category) {
        int[] randomCombination = this.diceCombination.generate();

        Category concreteCategory = this.categories.get(category).get();

        return concreteCategory.calculate(randomCombination);
    }
}
