import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class YachtGameShould {

    private YachtGame yachtGame;

    @Mock
    private DiceCombination diceCombination;

    @Before
    public void Initialize() {
        this.diceCombination = mock(DiceCombination.class);

        yachtGame = new YachtGame(this.diceCombination);
    }

    @Test
    public void scores_3_When_Category_Ones_With_Dice_Combination_11134() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 1, 3, 4});

        assertThat(yachtGame.play("Ones")).isEqualTo(3);
    }

    @Test
    public void scores_3_When_Category_Ones_With_Dice_Combination_11114() {
        when(this.diceCombination.generate()).thenReturn(new int[]{1, 1, 1, 1, 4});

        assertThat(yachtGame.play("Ones")).isEqualTo(4);
    }

    @Test
    public void scores_6_When_Category_Twos_With_Dice_Combination_22256() {
        when(this.diceCombination.generate()).thenReturn(new int[]{2, 2, 2, 5, 6});

        assertThat(yachtGame.play("Twos")).isEqualTo(6);
    }
}
