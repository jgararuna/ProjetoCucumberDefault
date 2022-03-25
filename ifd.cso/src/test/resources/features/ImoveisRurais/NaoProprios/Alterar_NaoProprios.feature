#language: pt
#coding:utf-8
@Alteracao
Funcionalidade: Validar inclusão de Imoveis Nao Proprios

  Contexto: 
    Dado que faco login no site
    Quando clico no botao de informacoes patrimoniais
    E clico na aba de imoveis rurais
    E clico no botao nao proprios
    E pesquiso pela proposta que desejo alterar
		E clico no botão de alterar imovel nao proprio
		
  @Alteracao_ImoveisNaoProprios
  Cenario: CT001 - Validar a alteração de imoveis nao proprios 
		E altero os dados obrigatórios de cadastro
		E altero a colonua Atual
		E altero a coluna Ano Um
		E altero as projeções
		E clico no botão de salvar
    Entao o sistema conclui a alteração