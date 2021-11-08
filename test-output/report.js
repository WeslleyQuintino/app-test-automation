$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/CucumberTest.feature");
formatter.feature({
  "name": "Teste",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Teste Frame",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ct-01"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou no aplicativo",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.app.CucumberTestStep.que_estou_no_aplicativo()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat pages.CucumberTestActivity.validateHomePage(CucumberTestActivity.java:16)\r\n\tat steps.app.CucumberTestStep.que_estou_no_aplicativo(CucumberTestStep.java:11)\r\n\tat ✽.que estou no aplicativo(file:///C:/automation-app-test/src/test/resources/feature/CucumberTest.feature:6)\r\n",
  "status": "failed"
});
});