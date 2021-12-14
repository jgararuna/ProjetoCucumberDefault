#language: pt
#coding:utf-8
@Geral_IFD @InclusaoSemoventes
Funcionalidade: Validar a inclusao de Semoventes

  Contexto: 
    Dado que faco login no site
    Quando clico no botao de informacoes patrimoniais

  @InclusaoSemPreenchimento_Semoventes
  Cenario: CT002 - Validar o cadastro de novo semovente sem preencher nenhum dos campos da tela
    E clico na aba de semoventes
    E clico no botao adicionar semoventes
    E clico em salvar
    Entao sera apresentado um alerta com a pendencia de dos campos

  @InclusaoComSucessoEfetivo_Semoventes
  Esquema do Cenario: CT028 - Validar inclusao de semoventes com campo Efetivo setado
    E clico na aba de semoventes
    E clico no botao adicionar semoventes
    E preencho a descricao "<descricao>"
    E preencho a UF "<UF>"
    E preencho a cidade "<cidade>"
    E preencho a tipo de semoventes "<tipo semovente>"
    E preencho a rebanho "<rebanho>"
    E preencho a quantidade "<quantidade>"
    E seleciono o checkbox efetivo
    E preencho o campo valor arroba "<valor arroba>"
    E preencho peso "<peso medio>"
    E clico em Salvar
    Entao semoventes sera salvo com sucesso

    Exemplos: 
      | descricao                 | UF | cidade | tipo semovente | rebanho  | quantidade | valor arroba | peso medio |
      | teste com sucesso efetivo | SP | Adolfo | Gado Bovino    | Bezerros |         20 |         1000 |       1000 |

  @InclusaoComSucessoDefinindo_Semoventes
  Esquema do Cenario: CT033 - Validar inclusao de semoventes com o campo Definido setado
    E clico na aba de semoventes
    E clico no botao adicionar semoventes
    E preencho a descricao "<descricao>"
    E preencho a UF "<UF>"
    E preencho a cidade "<cidade>"
    E preencho a tipo de semoventes "<tipo semovente>"
    E preencho a rebanho "<rebanho>"
    E preencho a quantidade "<quantidade>"
    E seleciono o checkbox definido
    E preencho o campo valor unitario "<valor unitario>"
    E clico em Salvar
    Entao semoventes sera salvo com sucesso

    Exemplos: 
      | descricao                  | UF | cidade | tipo semovente | rebanho             | quantidade | valor unitario |
      | teste com sucesso definido | SP | Adolfo | Aves           | Avicultura de Corte |         10 |             10 |

  @InclusaoComSucessoAdefinir_Semoventes
  Esquema do Cenario: CT037 - Validar inclusao de semoventes com o campo A definir setado
    E clico na aba de semoventes
    E clico no botao adicionar semoventes
    E preencho a descricao "<descricao>"
    E preencho a UF "<UF>"
    E preencho a cidade "<cidade>"
    E preencho a tipo de semoventes "<tipo semovente>"
    E preencho a rebanho "<rebanho>"
    E preencho a quantidade "<quantidade>"
    E seleciono o checkbox a definir
    E preencho peso "<peso medio>"
    E clico em Salvar
    Entao semoventes sera salvo com sucesso

    Exemplos: 
      | descricao                   | UF | cidade | tipo semovente | rebanho             | quantidade | peso medio |
      | teste com sucesso A definir | SP | Adolfo | Aves           | Avicultura de Corte |         10 |         20 |

  @InclusaoRebanhoProntoComercializacao_Semoventes
  Esquema do Cenario: CT038 - Validar inclusao de semoventes com campo Rebanho pronto para Comercializacao habilitado
    E clico na aba de semoventes
    E clico no botao adicionar semoventes
    E preencho a descricao "<descricao>"
    E preencho a UF "<UF>"
    E preencho a cidade "<cidade>"
    E preencho a tipo de semoventes "<tipo semovente>"
    E preencho a rebanho "<rebanho>"
    E preencho a quantidade "<quantidade>"
    E seleciono o checkbox efetivo
    E preencho o campo valor arroba "<valor arroba>"
    E preencho peso "<peso medio>"
    E seleciono o chechbox Rebanho pronto para comercializacao
    E preencho a data comercializacao "<data comercializacao>"
    E preencho a justificativa "<Justificativa>"
    E clico em Salvar
    Entao semoventes sera salvo com sucesso

    Exemplos: 
      | descricao                              | UF | cidade | tipo semovente | rebanho     | quantidade | valor arroba | peso medio | data comercilizacao | Justificativa |
      | Teste com rebanho para comercializacao | SP | Adolfo | Suino          | Suino Corte |         10 |           10 |         10 |            09122021 | teste         |
