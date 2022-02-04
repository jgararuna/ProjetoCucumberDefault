#language: pt
#coding:utf-8

@Inclusao
Funcionalidade: Validar a inclusao de bem movel

	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais

	@Inclusao_BemMovel
	Cenario: CT001 - Validar a inclusao de um bem movel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no botao Adicionar bens moveis
		E preencho campo Descricao Item
		E preencho campo Quantidade
		E preencho campo Valor Unitario
		Entao a inclusao sera concluida com sucesso