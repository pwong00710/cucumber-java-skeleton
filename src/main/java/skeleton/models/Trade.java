package skeleton.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import skeleton.enums.TradeStatus;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Trade {
    private String buyCcy;
    private String sellCcy;
    private BigDecimal amount;
    private LocalDate date;
    private TradeStatus tradeStatus = TradeStatus.NEW;

    public Trade() {
    }

    public Trade(String buyCcy, String sellCcy, BigDecimal amount, LocalDate date) {
        this.buyCcy = buyCcy;
        this.sellCcy = sellCcy;
        this.amount = amount;
        this.date = date;
    }
}
