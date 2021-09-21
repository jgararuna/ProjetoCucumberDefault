#language: pt

Funcionalidade: Validar a inclusao de Imoveis

Contexto:
Dado que estou na tela de Informaçoes patrimoniais
Quando clico na aba de imoveis rurais

@IncluirImoveisRuraisProprios
Cenario: acontecerá a inclusao de imoveis rurais

E clico no botão proprios
E clico em adicionar Imovel proprio
E preencho a matricula
E preencho o nome do Imovel
E preencho a UF
E preencho a cidade	
E preencho a participacao
E preencho a area utilizada
E preencho valor HA
E preencho o campo de observacao
Entao clico em Salvar para concluir

