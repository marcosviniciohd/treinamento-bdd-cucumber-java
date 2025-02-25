# language: pt
# encoding: utf-8

Funcionalidade: Aprender Cucumber

  Como um aluno
  Quero aprender a utilizar o Cucumber
  Para que eu possa automatizar testes de aceitação

  Cenário: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando executá-lo
  Então a especificação deve finalizar com sucesso


  Cenário: Deve incrementar contador
  Dado que o valor do contador é 15
  Quando eu incrementar em 5
  Então o valor do contador será 18