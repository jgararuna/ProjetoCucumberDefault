#language: pt
#coding:utf-8

@Geral_IFD @ExclusaoImoveisNaoProprios
Funcionalidade: Validar a exclusao de Imoveis Nao Proprios

Contexto:
Dado que faco login no site
Quando clico no botao de informacoes patrimoniais


@Exclusao_ImoveisNaoProprios
Cenario: CT001 - Validar exclusao de imoveis nao proprios

E clico na aba de imoveis rurais
E clico no botao nao proprios
E clico no icone da lixeira
E clico em Deletar 
Entao imovel nao proprio sera deletado com sucesso

@CancelamentoExclusao_ImoveisNaoProprios
Cenário: CT002 - Validar cancelamento da exclusao imoveis nao proprios atraves da opcao Cancelar

E clico na aba de imoveis rurais
E clico no botao nao proprios
E clico no icone da lixeira
E clico em Cancelar
Entao imovel nao proprio nao sera deletado

@CancelamentoExclusaoFechandoJanela_ImoveisNaoProprios
Cenário: CT003 - Validar cancelamento da exclusao imoveis nao proprios atraves X para fechar a janela

E clico na aba de imoveis rurais
E clico no botao nao proprios
E clico no icone da lixeira
E clico no X para fechar a janela
Entao imovel nao proprio nao sera deletado