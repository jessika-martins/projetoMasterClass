# language: pt

  @login
 Funcionalidade: Login
  Eu como usuário do sistema
  Quero fazer login
  Para fazer uma compra na Americana

   Contexto: Acessar aplicação
     Dado que estou na tela de login

     @login-sucesso
  Cenario: Login com sucesso
    E preencho o e-mail "finotti@gmail.com" e senha "1234567"
    Quando clico no botão de login
    Então sou logado com sucesso


    Cenario: E-mail inválido
      E preencho o e-mail "xxxx" e senha "12345"
      Quando clico no botão de login
      Então vejo a mensagem de "E-mail inválido."

   Cenario: Senha inválido
     E preencho o e-mail "finotti@gmail.com" e senha "xx"
     Quando clico no botão de login
     Então vejo a mensagem de "Senha inválida."

  @login-falha
     Esquema do Cenario: Credenciais inválidas
       E preencho o e-mail "<email>" e senha "<senha>"
       Quando clico no botão de login
       Então vejo a mensagem de "<mensagem>"

       Exemplos:
       | email            | senha   | mensagem        |
       | xxxxx            | 123456  | E-mail inválido.|
       | finotti@gmail.com| .....   | Senha inválida. |