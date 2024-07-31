# Remessa

Esta aplicação Java recebe uma lista de valores, gera um número sequencial para cada valor, e devolve uma String com os sequenciais inteiros concatenados a um texto e ao seu respectivo valor. Ao final, apresenta o total da soma dos valores.

## Como usar

1. **Pré-requisitos**: 
   - Certifique-se de ter o [Maven](https://maven.apache.org/) instalado no seu computador.

2. **Compilar o projeto**:
   - Navegue até o diretório raiz do projeto onde o arquivo `pom.xml` está localizado.
   - Execute o comando a seguir para compilar o projeto e baixar as dependências:

     ```sh
     mvn compile
     ```

3. **Executar o projeto**:
   - Após a compilação, você pode executar o projeto com o comando:

     ```sh
     mvn exec:java -Dexec.mainClass="com.example.Remessa"
     ```

## Executar os testes

1. **Executar os testes unitários**:
   - Navegue até o diretório raiz do projeto.
   - Execute o comando a seguir para rodar os testes:

     ```sh
     mvn test
     ```

   - Os resultados dos testes serão exibidos no terminal.

Se você encontrar algum problema ou precisar de mais informações, consulte a documentação do Maven ou entre em contato com o suporte.
