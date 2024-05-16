 ## DESAFIO POO: iPhone Componente

Autor: Philippe Antonio Mendes Diniz



Introdução
Este projeto consiste na implementação de um componente do iPhone em Java, utilizando os princípios da Programação Orientada a Objetos (POO). O objetivo é criar classes e interfaces que representem as funcionalidades básicas de um iPhone, tais como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

Funcionalidades Implementadas

Reprodutor Musical: Capacidade de reproduzir, pausar, parar, avançar para a próxima música e voltar para a música anterior.

Aparelho Telefônico: Permite fazer chamadas, atender chamadas e encerrar chamadas.

Navegador na Internet: Possibilidade de abrir páginas da web, atualizar páginas e adicionar páginas aos favoritos.

Detalhes do Projeto

Diagrama UML

![png](https://github.com/dev-philippe/dio-desafio-POO-modelagem-componente-iphone/assets/108426379/ca36d81d-d215-45e2-910d-debfe079ea46)

O diagrama UML acima representa a estrutura do projeto. Nele, temos:

Interfaces:

ReprodutorMusical: Define os métodos relacionados à reprodução de música.
AparelhoTelefonico: Define os métodos relacionados ao uso do telefone.
NavegadorInternet: Define os métodos relacionados à navegação na internet.
Classe iPhone:

Implementa todas as interfaces.
Fornece a funcionalidade completa do iPhone, incluindo reprodução de música, chamadas telefônicas e navegação na internet.
Estrutura do Projeto
O projeto está organizado da seguinte forma:

src/: Contém os arquivos fonte do projeto.
ReprodutorMusical.java: Interface que define os métodos do reprodutor musical.
AparelhoTelefonico.java: Interface que define os métodos do aparelho telefônico.
NavegadorInternet.java: Interface que define os métodos do navegador na internet.
iPhone.java: Classe que implementa todas as interfaces e representa um iPhone.
Como Utilizar
Clone este repositório para sua máquina local.
Importe o projeto para sua IDE Java preferida.
Utilize as funcionalidades fornecidas pela classe iPhone de acordo com suas necessidades.
Exemplo de Uso
java
Copiar código
// Criar uma instância de iPhone
iPhone meuIPhone = new iPhone();

// Utilizar as funcionalidades do iPhone
meuIPhone.play();
meuIPhone.makeCall("123456789");
meuIPhone.openPage("https://www.example.com");
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir um problema ou enviar um pull request com melhorias.

Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
