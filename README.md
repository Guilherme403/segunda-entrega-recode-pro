# Agência de Viagens - Aplicação Web

Este projeto é uma aplicação web para a Agência de Viagens, que visa melhorar o layout do site, criar uma estrutura robusta de banco de dados, e desenvolver um back-end eficiente utilizando Java, JDBC e MySQL. O front-end é implementado com HTML, CSS, e Bootstrap, enquanto o back-end é gerenciado com Java e MySQL.

## Tecnologias Utilizadas

- **Front-end**: HTML5, CSS3, Bootstrap
- **Back-end**: Java, JDBC, MySQL
- **Modelagem de Dados**: UML, SQL

## Estrutura do Projeto

### 1. Layout do Site

O site foi aprimorado para ter um layout moderno e responsivo. O menu horizontal é fixo na parte superior de todas as páginas e inclui as seguintes seções:

- **Home**: Página inicial com informações gerais e destaques.
- **Destinos**: Página para exibir todos os destinos disponíveis.
- **Promoções**: Página para mostrar ofertas e promoções.
- **Contato**: Página com informações de contato e formulário para envio de mensagens.

#### Estrutura HTML com Bootstrap

Utiliza tags semânticas e o framework Bootstrap para garantir que o site seja responsivo e adaptável a diferentes dispositivos.

### 2. Modelagem de Dados

#### Modelo Conceitual e Lógico

1. **Tabelas e Atributos**:

   - **Usuário**
     - **cpf**: VARCHAR(11), PRIMARY KEY
     - **nome**: VARCHAR(255), NOT NULL
     - **email**: VARCHAR(255), NOT NULL, UNIQUE
     - **telefone**: VARCHAR(20)

   - **Destino**
     - **id**: INT, AUTO_INCREMENT, PRIMARY KEY
     - **nome**: VARCHAR(255), NOT NULL
     - **valor**: DECIMAL(10, 2), NOT NULL

2. **Relações e Cardinalidades**:
   - As tabelas `usuario` e `destino` são independentes no modelo atual, sem relações diretas entre elas.

#### Modelo Físico

As tabelas serão criadas no MySQL com os seguintes comandos SQL:

```sql
CREATE TABLE destino (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL
);

CREATE TABLE usuario (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    telefone VARCHAR(20)
);
