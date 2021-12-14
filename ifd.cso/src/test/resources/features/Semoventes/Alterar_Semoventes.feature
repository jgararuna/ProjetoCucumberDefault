#language: pt
#coding:utf-8

@Geral_IFD @AlteracaoSemoventes
Funcionalidade: Validar a alteracao de Semoventes

Contexto:
Dado que faco login no site
Quando clico no botao de informacoes patrimoniais


@AlteracaoSemPreenchimento_Semoventes
Cenario: CT002 - Validar o cadastro de novo semovente sem preencher nenhum dos campos da tela

E clico na aba de semoventes
E clico no botao adicionar semoventes
E clico em salvar 
Entao sera apresentado um alerta com a pendencia de dos campos

@AlteracaoComSucessoEfetivo_Semoventes
Cenário: CT028 - Validar inclusao de semoventes com campo Efetivo setado

E clico na aba de semoventes
E clico no botao adicionar semoventes
E preencho descricao
E preencho UF
E preencho cidade
E preencho tipo de semovente
E preencho rebanho
E preencho quantidade
E seleciono o checkbox efetivo
E preencho o campo valor
E preencho peso medio
E clico em Salvar
Entao semoventes sera salvo com sucesso


@AlteracaoComSucessoDefinindo_Semoventes
Cenário: CT033 - Validar inclusao de semoventes com o campo Definido setado

E clico na aba de semoventes
E clico no botao adicionar semoventes
E preencho descricao
E preencho UF
E preencho cidade
E preencho tipo de semovente
E preencho rebanho
E preencho quantidade
E seleciono o checkbox definido
E preencho o campo valor unitario
E clico em Salvar
Entao semoventes sera salvo com sucesso

@AlteracaoComSucessoAdefinir_Semoventes
Cenário: CT037 - Validar inclusao de semoventes com o campo A definir setado

E clico na aba de semoventes
E clico no botao adicionar semoventes
E preencho descricao
E preencho UF
E preencho cidade
E preencho tipo de semovente
E preencho rebanho
E preencho quantidade
E seleciono o checkbox a definir
E preencho o campo peso medio
E clico em Salvar
Entao semoventes sera salvo com sucesso


@AlteracaoComSucessoEfetivo_Semoventes
Cenário: CT038 - Validar inclusao de semoventes com campo Rebanho pronto para Comercializacao habilitado

E clico na aba de semoventes
E clico no botao adicionar semoventes
E preencho descricao
E preencho UF
E preencho cidade
E preencho tipo de semovente
E preencho rebanho
E preencho quantidade
E seleciono o checkbox efetivo
E preencho o campo valor
E preencho peso medio
E seleciono o chechbox Rebanho pronto para comercializacao
E preencho a data de comercializacao 
E preencho a justificativa
E clico em Salvar
Entao semoventes sera salvo com sucesso




