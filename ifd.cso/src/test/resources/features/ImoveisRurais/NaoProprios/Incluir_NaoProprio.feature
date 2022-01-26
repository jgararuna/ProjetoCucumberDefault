#language: pt
#coding:utf-8
@Inclusao
Funcionalidade: Validar a exclusão de bem móvel

	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais

	
	@Exclusao_BemMovel
	Cenario: CT001 - Validar a exclusao de bem movel	
		E clico na aba de Bens Moveis/Imoveis
		E clico na lixeira do primeiro item da lista de bens moveis
		E clico em Deletar na popup de confirmacao de exclusao
		Entao o item será removido da lista de bens moveis
