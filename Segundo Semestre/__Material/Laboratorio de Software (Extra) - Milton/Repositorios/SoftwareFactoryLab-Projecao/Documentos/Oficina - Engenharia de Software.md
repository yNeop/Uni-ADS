# Oficina: Fundamentos da Engenharia de Software na Prática
---
###  ** - Estrutura com Resumos Aprofundados**
####  1: O que vamos Fazer hoje?
- Título: "Oficina  - Fundamentos da Engenharia de Software na Prática"
- Milton Júnior
- Projeção 

####  2: Objetivo da Oficina
- Compreender os principais conceitos e fases do processo de desenvolvimento de software.
- Aplicar os fundamentos teóricos em um projeto prático de pequeno porte, promovendo uma visão integrada e realista da engenharia de software.

####  3: O que é Engenharia de Software?
- Engenharia de Software é uma disciplina da computação voltada para a aplicação de princípios de engenharia na especificação, desenvolvimento, manutenção e gerenciamento de sistemas de software.
- Vai além da programação: envolve planejamento, análise, validação, documentação e boas práticas para garantir qualidade, produtividade e sustentabilidade dos sistemas.

####  4: Fases do Desenvolvimento de Software
- **Levantamento de Requisitos**: compreensão detalhada das necessidades do usuário e do negócio.
- **Análise e Projeto**: modelagem da solução (estrutura, regras, arquitetura).
- **Implementação**: codificação segundo os padrões e boas práticas.
- **Testes**: verificação sistemática para assegurar que os requisitos estão sendo atendidos.
- **Implantação e Manutenção**: liberação em ambiente real, correções e melhorias contínuas.

####  5: Levantamento de Requisitos
- Envolve entrevistas, questionários, análise de documentos, observações.
- **Requisitos Funcionais**: funcionalidades específicas (ex: login, busca de produtos).
- **Requisitos Não Funcionais**: restrições e qualidades (ex: desempenho, usabilidade, segurança).
- Exemplo prático:
  - RF01: O sistema deve permitir o cadastro de tarefas.
  - RF02: O sistema deve permitir a edição de tarefas.
  - RF03: O sistema deve permitir a exclusão de tarefas.
  - RNF01: O sistema deve estar disponível 24h por dia.
  - RNF02: O tempo de resposta para o carregamento da lista de tarefas deve ser menor que 2 segundos.

####  6: Casos de Uso
- Técnica de modelagem que descreve como usuários (atores) interagem com o sistema.
- Cada caso de uso descreve um cenário funcional, com entradas, saídas e fluxo alternativo.
- Exemplo:
  - Nome: Cadastrar Tarefa
  - Atores: Usuário
  - Descrição: O usuário informa título e descrição da tarefa e confirma o cadastro.
  - Fluxo principal: O sistema salva os dados e exibe a tarefa cadastrada na lista.
  ## Realização de caso de uso 
## UC01 - Realizar Login
Ator Principal:Usuário
Atores Secundários:Sistema de Autenticação
Descrição:
Este caso de uso permite que o usuário acesse o sistema fornecendo suas credenciais (e-mail e senha). O sistema valida os dados e permite ou nega o acesso.
## Pré-condições:
O usuário já deve estar cadastrado no sistema.
O sistema está em funcionamento.
##
1-Fluxo Principal de Eventos:
2-O usuário acessa a tela de login.
3-O sistema exibe campos para e-mail e senha.
4-O usuário informa o e-mail e a senha.
5-O usuário clica no botão “Entrar”.
6-O sistema verifica se o e-mail está cadastrado.
7-O sistema verifica se a senha informada corresponde ao e-mail.
8-O sistema autentica o usuário e redireciona para a tela principal.
Fluxos Alternativos:
3A. Campos obrigatórios não preenchidos
3A1. O sistema alerta que todos os campos são obrigatórios.
3A2. O caso de uso retorna ao passo 2.

6A. Credenciais inválidas
6A1. O sistema exibe uma mensagem: “E-mail ou senha incorretos”.

6A2. O usuário pode tentar novamente.

6A3. O caso de uso retorna ao passo 2.

Pós-condições:
O usuário autenticado tem acesso às funcionalidades internas do sistema.

Em caso de falha, o sistema mantém o usuário na tela de login.

Ator: Usuário
Caso de Uso: Realizar Login

+---------------------+          +---------------------------+
|       Usuário       |          |       Sistema           |
+---------------------+          ---------------------------+
         |                                   |
         |      1. Acessa tela de login      |
         |---------------------------------->|
         |                                   |
         | 2. Exibe campos de e-mail/senha   |
         |<----------------------------------|
         |                                   |
         | 3. Informa e-mail/senha           |
         |---------------------------------->|
         |                                   |
         | 4. Clica em "Entrar"              |
         |---------------------------------->|
         |                                   |
         | 5. Verifica credenciais           |
         |---------------------------------->|
         |                                   |
         | 6. Login válido?                  |
         |---------------------------------->|
         |                                   |
         | 7. Redireciona usuário            |
         |<----------------------------------|
         |                                   |

####  7: Diagrama de Classes
- Modelo visual que representa os elementos principais do sistema orientado a objetos.
- Mostra classes, atributos, métodos, associações e heranças.
- Exemplo:
  - Classe: Tarefa
    - Atributos: id, titulo, descricao, status
    - Métodos: criar(), editar(), excluir(), marcarComoConcluida()
  - Classe: Usuario
    - Atributos: id, nome, email, senha
    - Métodos: autenticar(), cadastrar()

####  8: Protótipo / MVP
- MVP (Produto Mínimo Viável): versão inicial que entrega o mínimo de valor funcional.
- Usado para validar hipóteses e coletar feedback com baixo custo.
- Exemplo:
  - Interface HTML simples com formulário para adicionar tarefa e uma lista para visualização.
  - Elementos essenciais: campo de texto, botão "Adicionar", área de exibição da lista de tarefas.
  - Pode ser implementado com HTML, CSS e JS puro ou usando ferramentas como Figma para prototipagem visual.

####  9: Testes de Software
- Processo essencial para garantir confiabilidade e segurança no sistema.
- **Teste Unitário**: verifica se componentes individuais funcionam isoladamente.
- **Teste de Integração**: verifica se os módulos funcionam bem juntos.
- **Teste de Aceitação**: realizado pelo cliente para validar se o sistema atende às suas expectativas.
- Ferramentas comuns: JUnit, PyTest, Postman (para APIs).

####  10: Documentação
- Documentação clara facilita manutenção, onboard de novos desenvolvedores e uso pelo cliente.
- Tipos: Especificação de requisitos, diagramas, manuais do usuário e README.
- **README**: essencial para projetos em repositórios públicos; deve ser objetivo, atualizado e útil.

####  11: Apresentação Final
Vocês terão que desenvolver em grupo os itens abaixo, considerando o desenvolvimento do aplicativo elaborado em sala. 
Observando:
  - Requisitos documentados - Funcionais e não-funcionais
  - Modelagem (casos de uso, realização de caso de uso, diagrama de sequência e diagrama de classes)
  - Protótipo de baixa fidelidade





