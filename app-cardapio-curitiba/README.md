# App Cardápio Curitiba

Este projeto é um aplicativo desenvolvido em Java que analisa cardápios de lanchonetes, lojas e restaurantes na região da Grande Curitiba. O objetivo é explorar descontos e promoções vinculados a aplicativos de comida, permitindo ao usuário encontrar o melhor preço para seus lanches.

## Funcionalidades

- **Busca de Alimentos**: O aplicativo permite que os usuários busquem alimentos disponíveis nos cardápios de diferentes comércios.
- **Comparação de Preços**: O sistema compara preços de produtos entre diferentes estabelecimentos e apresenta ao usuário a melhor opção.
- **Sugestões Inteligentes**: Utiliza inteligência artificial para sugerir alimentos com base nas preferências do usuário e na localização.
- **Localização**: O aplicativo ajuda a encontrar comércios próximos ao usuário, facilitando a escolha do lanche.

## Estrutura do Projeto

- `src/main/java/br/com/cardapiocuritiba/App.java`: Ponto de entrada da aplicação.
- `src/main/java/br/com/cardapiocuritiba/controllers/BuscaController.java`: Gerencia requisições de busca de alimentos.
- `src/main/java/br/com/cardapiocuritiba/models/Cardapio.java`: Representa o cardápio de um comércio.
- `src/main/java/br/com/cardapiocuritiba/models/Produto.java`: Representa um produto individual no cardápio.
- `src/main/java/br/com/cardapiocuritiba/models/Promocao.java`: Representa promoções associadas a produtos ou comércios.
- `src/main/java/br/com/cardapiocuritiba/models/Comercio.java`: Representa um comércio e suas informações.
- `src/main/java/br/com/cardapiocuritiba/services/BuscaAlimentoService.java`: Serviço para buscar alimentos disponíveis.
- `src/main/java/br/com/cardapiocuritiba/services/ComparacaoPrecoService.java`: Serviço para comparar preços de produtos.
- `src/main/java/br/com/cardapiocuritiba/services/LocalizacaoService.java`: Serviço para lidar com a localização do usuário.
- `src/main/java/br/com/cardapiocuritiba/services/SugestaoIAService.java`: Serviço que sugere alimentos com base nas preferências do usuário.
- `src/main/java/br/com/cardapiocuritiba/repositories/CardapioRepository.java`: Repositório para acessar dados dos cardápios.
- `src/main/resources/data/lanchonetes-curitiba.json`: Dados fictícios sobre lanchonetes na região de Curitiba.
- `src/main/resources/views/principal.fxml`: Interface gráfica da aplicação.
- `src/main/resources/application.properties`: Configurações da aplicação.
- `src/test/java/br/com/cardapiocuritiba/CardapioRepositoryTest.java`: Testes unitários para o repositório de cardápios.
- `pom.xml`: Configuração do Maven.

## Como Executar

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Execute o comando `mvn clean install` para compilar o projeto.
4. Execute a aplicação com `mvn exec:java -Dexec.mainClass="br.com.cardapiocuritiba.App"`.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.

## Licença

Este projeto está licenciado sob a MIT License. Veja o arquivo LICENSE para mais detalhes.