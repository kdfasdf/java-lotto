package lotto.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WinningStatisticTest {

    @Test
    @DisplayName("우승자 통계 테스트")
    void 우승자_통계_테스트() {
        WinningStatistic ws = new WinningStatistic();
        ws.calculateStatistic(2_000_005_000);
        Assertions.assertThat(ws.getStatistic()).containsExactly(1,0,0,1);
    }

    @Test
    @DisplayName("수익률 계산 테스트")
    void 수익률_계산_테스트() {

        WinningStatistic ws = new WinningStatistic();

        Assertions.assertThat(ws.calculateProfit(5000,14000)).isEqualTo(0.35);

    }

}
