package skeleton.config;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import skeleton.models.Trade;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Map;

/*
 * Maps datatables in feature files to custom domain objects.
 */
public class DataTableConfigurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(Trade.class, new TableEntryTransformer<Trade>() {
            @Override
            public Trade transform(Map<String, String> entry) {
                return new Trade(entry.get("buyCcy"), entry.get("sellCcy"), new BigDecimal(entry.get("amount")), LocalDate.parse(entry.get("date")));
            }
        }));
    }
}
