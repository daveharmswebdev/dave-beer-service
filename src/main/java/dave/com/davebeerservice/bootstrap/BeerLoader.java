package dave.com.davebeerservice.bootstrap;

import dave.com.davebeerservice.domain.Beer;
import dave.com.davebeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Peanut Butter Stout")
                    .beerStyle("STOUT")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000001L)
                    .price(new BigDecimal("6.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Southern IPA")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(337010000002L)
                    .price(new BigDecimal("7.95"))
                    .build());
        }
    }
}
