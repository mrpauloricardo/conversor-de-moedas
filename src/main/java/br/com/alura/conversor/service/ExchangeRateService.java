package br.com.alura.conversor.service;

import br.com.alura.conversor.client.ExchangeRateClient;
import br.com.alura.conversor.model.ExchangeRateResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;

public class ExchangeRateService {

    private final ExchangeRateClient client;
    private final ObjectMapper mapper;

    public ExchangeRateService() {
        this.client = new ExchangeRateClient();
        this.mapper = new ObjectMapper();
    }

    public ExchangeRateResponse getExchangeRates(String baseCurrency) throws IOException, URISyntaxException {
        try {
            String jsonResponse = client.getRates(baseCurrency);
            return mapper.readValue(jsonResponse, ExchangeRateResponse.class);
        } catch (RuntimeException e) {
            throw new IOException("Moeda base não encontrada.", e);
        }
    }
}
