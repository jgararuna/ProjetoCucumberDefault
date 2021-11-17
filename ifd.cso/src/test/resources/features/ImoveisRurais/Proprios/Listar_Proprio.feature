#language: pt
#coding:utf-8
Funcionalidade: Validar consulta na listagem de Imoveis Proprios

  Contexto: 
    Dado que faco login no site
    Quando clico no botao de informacoes patrimoniais

  @ConsultaDenominacao_ImoveisProprios
  Esquema do Cenário: CT005 - Validar a consulta de imoveis proprios atraves do filtro denominacao com sucesso
    E clico na aba de imoveis rurais
    E clico no botao proprios
    E clico na denominacao
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao imovel proprio aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | Teste1    |

  @ConsultaUF_ImoveisProprios
  Esquema do Cenário: CT006 - Validar a consulta de imoveis proprios atraves do filtro UF com sucesso
    E clico na aba de imoveis rurais
    E clico no botao proprios
    E clico em UF
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao imovel proprio aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | SP        |

  @ConsultaCidade_ImoveisProprios
  Esquema do Cenário: CT007 - Validar a consulta de imoveis proprios atraves do filtro cidade com sucesso
    E clico na aba de imoveis rurais
    E clico no botao proprios
    E clico na cidade
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao imovel proprio aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | Adolfo    |

  @ConsultaComarca_ImoveisProprios
  Esquema do Cenário: CT008 - Validar a consulta de imoveis proprios atraves do filtro comarca com sucesso
    E clico na aba de imoveis rurais
    E clico no botao proprios
    E clico na comarca
    E preencho o campo "<Pesquisar>"
    E clico na lupa
    Entao imovel proprio aparecera de acordo com a consulta

    Exemplos: 
      | Pesquisar |
      | Barra     |
