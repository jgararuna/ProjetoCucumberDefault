#language: pt
#coding:utf-8
@Exclusao
Funcionalidade: Validar a exclusão de bem imóvel


	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais
	
	@Exclusao_BemImovel
	Cenario: CT001 - Validar a exclusao de bem imovel	
		E clico na aba de Bens Moveis/Imoveis
		E clico no botao imovel
		E clico na lixeira do primeiro item da lista de bens imoveis
		E clico em Deletar na popup de confirmacao de exclusao
		Entao o item será removido da lista de bens imoveis