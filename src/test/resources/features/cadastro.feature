# language: pt

@cadastro-usuario
Funcionalidade: Cadastro de usuário
  Eu como visitante do sistema
  Quero se cadastrar
  Para fazer uma compra



  @cadastro-usuario-sucesso
  Cenario: Cadastro de usuário  com sucesso
    Dado que estou no cadastro de usuários
    E preencho todos os campos obrigatórios
    Quando clico em cadastrar usuário
    Então vejo mensagem de cadastro com sucesso