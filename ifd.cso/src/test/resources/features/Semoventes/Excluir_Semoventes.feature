#language: pt
#coding:utf-8

@Geral_IFD @ExclusaoSemoventes
Funcionalidade: Validar a exclusao de Semoventes

Contexto:
Dado que faco login no site
Quando clico no botao de informacoes patrimoniais


@Exclusao_Semoventes
Cenario: CT001 - Validar exclusao de semoventes

E clico na aba de semoventes
E clico no icone da lixeira
E clico em Deletar 
Entao semovente sera deletado com sucesso

@CancelamentoExclusao_Semoventes
Cenário: CT002 - Validar cancelamento da exclusao semoventes atraves da opcao Cancelar

E clico na aba de semoventes
E clico no icone da lixeira
E clico em Cancelar
Entao semoventes nao sera deletado

@CancelamentoExclusaoFechandoJanela_Semoventes
Cenário: CT003 - Validar cancelamento da exclusao semoventes atraves X para fechar a janela

E clico na aba de semoventes
E clico no icone da lixeira
E clico no X para fechar a janela
Entao semovente nao sera deletado