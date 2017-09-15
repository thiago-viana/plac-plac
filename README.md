# Plac Plac
Esse projeto foi criado para que pessoas que estão tirando a carteira de motorista possam praticar o significado das placas de trânsito. Funciona como um jogo, a pessoa clica em um botão que carrega a imagem de uma placa, em seguida ela tenta adivinhar o que a placa quer transmitir e por último a pessoa clica novamente em um botão que revela o significado da placa. Esse processo pode ser repetido n vezes e cada nova placa é chamada de forma aleatória. Esse projeto consulta um banco de dados montado pela execução de um crawler que se encontra nesse repositório: https://github.com/thiago-viana/crawler-placas-de-transito

# Tecnologias
  - Springboot
  - JPA
  - MySQL
  - Bootstrap
  - Jquery
  - Ajax
  - Bower

# Executando a aplicação no eclipse
  - Clone o repositório https://github.com/thiago-viana/crawler-placas-de-transito e siga as informações para execução do crawler. Ele irá montar o banco acessado pelo Plac Plac.
  - Clone este projeto.
  - Entre no diretório do projeto e navegue até a pasta src/main/resources/static e execute o comando ``` bower install```. Esse comando irá baixar as dependências do frontend.
  - Ajuste as configurações do arquivo *application.properties*, localizado na pasta src/main/resources, para que corresponda às informações de acesso ao seu banco de dados.
  - Importe o projeto para o eclipse e em seguida execute o método main da classe PlacasApplication. Isso levantará um tomcat embutido, que carregará a aplicação no endereço http://localhost:8080.

## Observação
O bower é um utilitário de linha de comando que gerencia dependências de frontend. Não vou entrar em detalhes de como instalá-lo, pois já há um vasto material na internet explicando como se faz. Mas, basicamente, você precisa instalar o ```node``` e o ```git```, após isso será possível instalar o bower e usá-lo. Para saber mais acesse: https://bower.io/
