package com.xDish.Curencies.Repositories;

import com.xDish.Curencies.Model.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency, Long> {
}
