#language: pt
#coding:utf-8
@Geral_IFD @FiltroProposta
Funcionalidade: Validar os filtro de selecao de proposta

  Contexto: 
    Dado que faco login no site

  @FiltroProposta_SelecaoProposta
  Cenario: CT005 - validar tipo de pesquisa por cod. proposta
    E seleciono tipo de pesquisa Proposta
    E digito o filtro do cod proposta
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro

  @FiltroStatus_SelecaoProposta
  Cenario: CT006 - validar tipo de pesquisa por Status
    E seleciono tipo de pesquisa status
    E digito o filtro do status da proposta
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro

  @FiltroProdutor_SelecaoProposta
  Cenario: CT007 - validar tipo de pesquisa por Produtor
    E seleciono tipo de pesquisa produtor
    E digito o filtro do produtor
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro

  @FiltroRegional_SelecaoProposta
  Cenario: CT008 - validar tipo de pesquisa por Regional
    E seleciono tipo de pesquisa regional
    E digito o filtro da regional
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro

  @FiltroAgencia_SelecaoProposta
  Cenario: CT009 - validar tipo de pesquisa por Agencia
    E seleciono tipo de pesquisa agencia
    E digito o filtro da agencia
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro

  @FiltroGerenteDeConta_SelecaoProposta
  Cenario: CT0010 - validar tipo de pesquisa por Gerente de Contas
    E seleciono tipo de pesquisa gerente de contas
    E digito o filto do gerente de contas
    E clico em buscar
    Entao o sistema apresentara a prosposta de acordo com o filtro
