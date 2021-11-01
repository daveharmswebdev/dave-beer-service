package dave.com.davebeerservice.web.mappers;

import dave.com.davebeerservice.domain.Beer;
import dave.com.davebeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
