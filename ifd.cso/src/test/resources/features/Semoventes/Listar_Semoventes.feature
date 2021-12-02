#language: pt
#coding:utf-8

@Geral_IFD @ListagemSemoventes
Funcionalidade: Validar consulta na listagem de Semoventes

  Contexto: 
    Dado que faco login no site
    Quando clico no botao de informacoes patrimoniais

  @ConsultaTipo_Semoventes
  Esquema do Cenário: CT005 - Validar a consulta de semoventes atraves do filtro tipo com sucesso
    E clico na aba de semoventes
    E clico no filtro tipo
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao semovente aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | Suino     |

  @ConsultaRebanho_Semoventes
  Esquema do Cenário: CT006 - Validar a consulta de semoventes atraves do filtro rebanho com sucesso
    E clico na aba de semoventes
    E clico no filtro rebanho
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao semovente aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | Bezerros  |

  @ConsultaInexistente_Semoventes
  Esquema do Cenário: CT007 - Validar a consulta de semoventes inexistente
    E clico na aba de semoventes
    E clico no "<Filtro>" qualquer
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao semovente aparecera de acordo com a consulta

    Exemplos: 
      | Filtro | Pesquisar |
      | Tipo   | Galo      |
