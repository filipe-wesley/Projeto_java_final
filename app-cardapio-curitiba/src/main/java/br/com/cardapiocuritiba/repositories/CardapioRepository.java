package br.com.cardapiocuritiba.repositories;

import br.com.cardapiocuritiba.models.Cardapio;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CardapioRepository {

    private static final String DATA_FILE_PATH = "src/main/resources/data/lanchonetes-curitiba.json";

    public List<Cardapio> carregarCardapios() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(DATA_FILE_PATH), new TypeReference<List<Cardapio>>() {});
    }
}