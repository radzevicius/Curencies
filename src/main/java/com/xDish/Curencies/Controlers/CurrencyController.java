package com.xDish.Curencies.Controlers;


import com.xDish.Curencies.Model.Currency;
import com.xDish.Curencies.Repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyController {

    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyController(CurrencyRepository currencyRepository){
        this.currencyRepository = currencyRepository;
    }

    @GetMapping("/currencies")
    public Iterable<Currency> getCurrencies(){
        return  currencyRepository.findAll();
    }

    @PostMapping("/currencies")
    void addCurrency (@RequestBody Currency currency){
        currencyRepository.save(currency);
    }

    @PutMapping("/currencies")
    void updateCurrency(@RequestBody Currency currency){
        currencyRepository.save(currency);
    }

    @DeleteMapping("/currencies/{id}")
    void deleteCurrency(@PathVariable Long id){
        currencyRepository.deleteById(id);
    }
}
