#language: pt
#coding:utf-8

@InclusaoBensImoveis
Funcionalidade: Validar a inclusao de bem imovel

	Contexto:
		Dado que faco login no site
		Quando clico no botao de informacoes patrimoniais

	@Inclusao_BemImovel
	Cenario: CT001 - Validar a inclusao de um bem imovel com sucesso	
		E clico na aba de Bens Moveis/Imoveis
		E clico no botao Imoveis
		E clico no botao Adicionar bens imoveis
		E preencho campo Descricao Item
		E preencho campo Valor Total
		E clico no botao salvar
		Entao a inclusao bens imoveis sera concluida com sucesso