# Conversor de Moedas

Esta é uma aplicação de conversão de moedas desenvolvida em Java. A aplicação permite converter valores entre diferentes moedas de países de todo o mundo, divididos por continentes. Utiliza a API [ExchangeRateAPI](https://www.exchangerate-api.com/) para obter taxas de câmbio atualizadas diariamente.

## Funcionalidades

- **Conversão de Moedas**: Converta valores entre diferentes moedas de diversos países.
- **Histórico de Conversões**: Veja o histórico das conversões realizadas.
- **Menu Interativo**: Navegue por um menu interativo para selecionar continentes e países.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `br.com.alura.conversor`: Pacote principal contendo a classe `Main`.
- `br.com.alura.conversor.view`: Pacote contendo as classes de menu e submenus (`Menu`, `SubMenu`, `Europa`, `Asia`, etc.).
- `br.com.alura.conversor.model`: Pacote contendo a classe `ExchangeRateResponse`.
- `br.com.alura.conversor.service`: Pacote contendo a classe `ExchangeRateService`.

## Dependências

A aplicação utiliza as seguintes dependências:

- Jackson Databind
- Jackson Core
- Jackson Annotations

Estas dependências são utilizadas para processar a resposta da API de taxas de câmbio.

## Requisitos

- Java 22
- Maven

## Configuração e Execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   cd conversor-moedas
   ```

2. **Compile o projeto com Maven**:
   ```bash
   mvn clean install
   ```

3. **Execute a aplicação**:
   ```bash
   mvn exec:java -Dexec.mainClass="br.com.alura.conversor.Main"
   ```

## Uso

Ao iniciar a aplicação, você será apresentado ao menu principal com as seguintes opções:

1. **Converter Moedas**: Escolha esta opção para iniciar o processo de conversão. Você será levado ao menu de continentes para selecionar o país da moeda base e, em seguida, o país da moeda de destino.
2. **Histórico de Conversões**: Visualize o histórico das conversões realizadas.
3. **Sair**: Encerre a aplicação.

### Exemplo de Conversão

1. No menu principal, escolha `1` para converter moedas.
2. Escolha o continente, por exemplo, `5` para Ásia.
3. Escolha o país, por exemplo, `1` para Bahrein (Dinar do Bahrein - BHD).
4. Você será retornado ao menu de continentes. Escolha outro continente e país, por exemplo, `6` para Europa e `2` para Euro (EUR).
5. Digite o valor a ser convertido.
6. O resultado da conversão será exibido e adicionado ao histórico.

## API Utilizada

A aplicação utiliza a [ExchangeRateAPI](https://www.exchangerate-api.com/) para obter as taxas de câmbio mais recentes.

## Contribuição

Se você deseja contribuir com este projeto, por favor, faça um fork do repositório, crie uma nova branch com suas alterações e envie um pull request.