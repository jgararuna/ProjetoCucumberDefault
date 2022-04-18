#language: pt
#coding:utf-8

@AlteracaoBensImoveis
Funcionalidade: Validar a alteracao de bem imovel

	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais

	@AlteracaoDescricao_BemImovel
	Cenario: CT001 - Validar a alteracao do campo descricao item do bem imovel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no botao Imoveis
		E clico no icone do lapis
		E altero campo Descricao Item
		E clico no botao salvar
		Entao a alteracao imovel sera concluida com sucesso
		
		@AlteracaoValorTotal_BemImovel
	Cenario: CT002 - Validar a alteracao do campo valor total do bem imovel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no botao Imoveis
		E clico no icone do lapis
		E altero campo Valor Total
		E clico no botao salvar
		Entao a alteracao imovel sera concluida com sucesso