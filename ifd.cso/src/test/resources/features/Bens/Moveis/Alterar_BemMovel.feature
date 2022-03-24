#language: pt
#coding:utf-8

@AlteracaoBensMoveis
Funcionalidade: Validar a inclusao de bem movel

	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais

	@AlteracaoDescricao_BemMovel
	Cenario: CT001 - Validar a alteracao do campo descricao item do bem movel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no icone do lapis
		E altero campo Descricao Item
		E clico no botao salvar
		Entao a alteracao sera concluida com sucesso
		
		
		@AlteracaoQuantidade_BemMovel
	Cenario: CT002 - Validar a alteracao do campo quantidade do bem movel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no icone do lapis
		E altero campo Quantidade
		E clico no botao salvar
		Entao a alteracao sera concluida com sucesso
		
		@AlteracaoValorUnitario_BemMovel
	Cenario: CT003 - Validar a alteracao do campo valor unitario do bem movel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no icone do lapis
		E altero campo Valor Unitario
		E clico no botao salvar
		Entao a alteracao sera concluida com sucesso