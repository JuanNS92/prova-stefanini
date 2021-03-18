#language: pt
#Author: bruno.fernandes

@allTest
Funcionalidade: Cadastro de usuario
  Eu como usuario quero acessar o site para realizar um cadastro
  
    Contexto: Acesar o site para cadastrar um novo usu�rio
    Dado que eu acesse o site "http://prova.stefanini-jgr.com.br/teste/qa/" para realizar um cadastro

@positivos
  Cenario: realizar cadastro de novo usuario
    Quando informar os dados do novo usuario
    Entao cadastro realizado

 