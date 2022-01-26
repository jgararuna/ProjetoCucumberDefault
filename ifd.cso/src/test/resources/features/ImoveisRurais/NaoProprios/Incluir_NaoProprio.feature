#language: pt
#coding:utf-8
@Inclusao
Funcionalidade: Validar inclusão de Imoveis Nao Proprios

  Contexto: 
    Dado que faco login no site
    Quando clico no botao de informacoes patrimoniais
    E clico na aba de imoveis rurais
    E clico no botao nao proprios
		E clico no botão de incluir imovel nao proprio
		E preencho os campos obrigatórios
		
  @Inclusao_ImoveisNaoProprios_SemPreencherColunas
  Cenario: CT001 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
    E ciclo no botão de Salvar
    Entao o sistema comclui o cadastro e apresenta mensagem de sucesso
    
  @Inclusao_ImoveisNaoProprios_PreencherColunaAtual_ValorFixo
  Cenario: CT002 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como valor fixo
  	E preencho o campo Custo (Ha)
  	E preencho o campo período
  	E preencho o campo valor
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso
  
 	@Inclusao_ImoveisNaoProprios_PreencherColunaAtual_Contrato
  Cenario: CT003 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como contrato
  	E seleciono uma opção na combobox Mercadoria
  	E preencho o campo Kg/Ha
  	E preencho o campo período
  	E preencho o campo valor
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso
    
 	@Inclusao_ImoveisNaoProprios_PreencherColunaAno1_ValorFixo
  Cenario: CT004 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como valor fixo
  	E preencho o campo Custo (Ha)
  	E preencho o campo período
  	E preencho o campo valor
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso

 	@Inclusao_ImoveisNaoProprios_PreencherColunaAno1_Contrato
  Cenario: CT005 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como contrato
  	E seleciono uma opção na combobox Mercadoria
  	E preencho o campo Kg/Ha
  	E preencho o campo período
  	E preencho o campo valor
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso
    
 	@Inclusao_ImoveisNaoProprios_PreencherColunaProjecao_ValorFixo
  Cenario: CT006 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como valor fixo
  	E seleciono a opção de editar de um dos anos das projeções
  	E preencho o campo Custo (Ha)
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso

 	@Inclusao_ImoveisNaoProprios_PreencherColunaProjecao_Contrato
  Cenario: CT007 - Validar a inclusão de imoveis nao proprios sem preencher as colunas de distribuição
  	E marco a coluna atual da distribuição como contrato
  	E seleciono uma opção na combobox Mercadoria
  	E preencho o campo Kg/Ha
  	E clico no botão Distrib.
  	E clico no botão Salvar
  	Entao o sistema comclui o cadastro e apresenta mensagem de sucesso