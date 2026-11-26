package br.com.cardapiocuritiba.controllers;

import br.com.cardapiocuritiba.services.BuscaAlimentoService;
import br.com.cardapiocuritiba.services.ComparacaoPrecoService;
import br.com.cardapiocuritiba.services.LocalizacaoService;
import br.com.cardapiocuritiba.services.SugestaoIAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/busca")
public class BuscaController {

    @Autowired
    private BuscaAlimentoService buscaAlimentoService;

    @Autowired
    private ComparacaoPrecoService comparacaoPrecoService;

    @Autowired
    private LocalizacaoService localizacaoService;

    @Autowired
    private SugestaoIAService sugestaoIAService;

    @GetMapping("/alimentos")
    public List<String> buscarAlimentos(@RequestParam String nome) {
        return buscaAlimentoService.buscarAlimentos(nome);
    }

    @GetMapping("/comparar-precos")
    public String compararPrecos(@RequestParam String produto) {
        return comparacaoPrecoService.compararPrecos(produto);
    }

    @GetMapping("/localizacao")
    public String encontrarComerciosProximos(@RequestParam String localizacao) {
        return localizacaoService.encontrarComerciosProximos(localizacao);
    }

    @GetMapping("/sugestao")
    public String sugerirAlimento(@RequestParam String preferencia) {
        return sugestaoIAService.sugerirAlimento(preferencia);
    }
}