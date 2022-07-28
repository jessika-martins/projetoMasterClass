$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuário",
  "description": "Eu como visitante do sistema\r\nQuero se cadastrar\r\nPara fazer uma compra",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro-usuario"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Cadastro de usuário  com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;cadastro-de-usuário--com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 11,
      "name": "@cadastro-usuario-sucesso"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "que estou no cadastro de usuários",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "preencho todos os campos obrigatórios",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clico em cadastrar usuário",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "vejo mensagem de cadastro com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "CadastroUsuarioSteps.acessaCadastroUsuarios()"
});
formatter.result({
  "duration": 10488387300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.preencho_todos_os_campos_obrigatorios()"
});
formatter.result({
  "duration": 628542800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.clico_em_cadastrar_usuario()"
});
formatter.result({
  "duration": 133924100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroUsuarioSteps.vejo_mensagem_de_cadastro_com_sucesso()"
});
formatter.result({
  "duration": 84121500,
  "status": "passed"
});
});