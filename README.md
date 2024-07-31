# Agência de Viagens - Aplicação Web

Este projeto é uma aplicação web para a Agência de Viagens, com o objetivo de criar um site moderno e responsivo. O front-end utiliza HTML, CSS e Bootstrap, enquanto o back-end é gerenciado com Java, JDBC e MySQL.

## Tecnologias Utilizadas

- **Front-end**: HTML5, CSS3, Bootstrap
- **Back-end**: Java, JDBC, MySQL
- **Modelagem de Dados**: UML, SQL

## Estrutura do Projeto

### 1. Layout do Site

O site foi projetado para ser responsivo e fácil de usar, com um layout moderno que inclui um menu horizontal fixo na parte superior de todas as páginas. As principais páginas são:

- **Home**: Página inicial com informações gerais e destaques.
- **Ofertas**: Página para exibir promoções e ofertas especiais.
- **Destinos**: Página para listar todos os destinos disponíveis para reserva.
- **Contato**: Página com informações de contato e um formulário para enviar mensagens.
- **Entre ou cadastre-se**: Página para login e registro de novos usuários.

#### Estrutura HTML com Bootstrap

O layout utiliza Bootstrap para garantir que o site seja responsivo e se adapte a diferentes tamanhos de tela.

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
   - No modelo atual, as tabelas `usuario` e `destino` são independentes, sem relações diretas entre elas.

#### Modelo Físico

Scripts SQL serão utilizados para criar as tabelas `destino` e `usuario` no MySQL.

#### Modelo do Sistema

1. **Modelo de Classes em UML**:
   - **Destino**
     - `id`: int
     - `nome`: String
     - `valor`: double

   - **Usuario**
     - `cpf`: String
     - `nome`: String
     - `email`: String
     - `telefone`: String

2. **Classes em Java**
   - **Destino** e **Usuario** serão representados por classes Java com os atributos e métodos apropriados.

### 3. Back-end

#### Projeto Console em Java

1. **Configuração do Projeto**:
   - Utiliza JDBC para conectar ao banco de dados MySQL.
   - Implementa operações CRUD (Create, Read, Update, Delete) para as tabelas `destino` e `usuario`.

2. **Operações CRUD**:
   - **Create**: Inserir novos registros.
   - **Read**: Consultar registros existentes.
   - **Update**: Atualizar registros.
   - **Delete**: Remover registros.

### 4. Modelagem do Sistema e Implementação

1. **Criar Diagramas UML**:
   - Utilize uma ferramenta de modelagem para criar diagramas UML representando as classes e suas relações.

2. **Desenvolver o Projeto Console**:
   - Crie um projeto Java console que implementa o CRUD com as classes Java e a conexão MySQL.

3. **Atualização do Front-end**:
   - Refatore as páginas existentes (Home, Ofertas, Destinos, Contato, Entre ou cadastre-se) para melhorar o layout e a responsividade, usando HTML, CSS e Bootstrap.
