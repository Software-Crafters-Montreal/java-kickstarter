import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumberTest {

    @Test
    public void should_return_I_for_1() {
        String res = RomanNumber.translate(1);

        assertThat(res).isEqualTo("I");
    }

}
