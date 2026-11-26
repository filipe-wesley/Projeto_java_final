package br.com.cardapiocuritiba;

import br.com.cardapiocuritiba.repositories.CardapioRepository;
import br.com.cardapiocuritiba.models.Cardapio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CardapioRepositoryTest {

    private CardapioRepository cardapioRepository;

    @BeforeEach
    public void setUp() {
        cardapioRepository = new CardapioRepository();
    }

    @Test
    public void testGetAllCardapios() {
        List<Cardapio> cardapios = cardapioRepository.getAllCardapios();
        assertNotNull(cardapios);
        assertTrue(cardapios.size() > 0);
    }

    @Test
    public void testGetCardapioByComercio() {
        String comercioNome = "Lanchonete Exemplo";
        Cardapio cardapio = cardapioRepository.getCardapioByComercio(comercioNome);
        assertNotNull(cardapio);
        assertTrue(cardapio.getComercio().getNome().equals(comercioNome));
    }

    @Test
    public void testGetCardapioByInvalidComercio() {
        String comercioNome = "Comercio Inexistente";
        Cardapio cardapio = cardapioRepository.getCardapioByComercio(comercioNome);
        assertNotNull(cardapio);
        assertTrue(cardapio.getProdutos().isEmpty());
    }
}