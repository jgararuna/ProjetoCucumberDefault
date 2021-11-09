#language: pt
#coding:utf-8

Funcionalidade: Validar a inclusao de Imoveis

Contexto:
Dado que faco login no site
Quando clico no botao de informacoes patrimoniais
E clico na aba de imoveis rurais
E clico no botao nao proprios


@ExcluirImoveisNaoProprios
Cenario: Acontecera a exclusao de imoveis nao proprios

E clico no icone da lixeira
E clico em Deletar 
Entao imovel sera deletado com sucesso