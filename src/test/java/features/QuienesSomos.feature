Feature:Feature: Pagina footer Quienes somos
  Yo Como: usuario de Portal Público
  Quiero: poder acceder al Footer del portal seccion Quienes somo
  Para: poder ver La informacion de los comercios que forman la alianza con Transbank

  Scenario: Validar despliegue Pagina Quienes Somos
    Given Se abre portal publico en navegador Google Chrome
    When Presiono menu Quienes Somos desde footer
    Then Se despliega pagina quienes somos correctamente

  Scenario: Validar Quienes Somos contenido sobre la alianza de comercios
    Given Se abre portal publico en navegador Google Chrome
    When Presiono menu Quienes Somos desde footer
    Then Se despliega contenido de la pagina Quienes Somos correctamente

  Scenario: Validar Quienes Somos Cards Mision, Proposito y Suenio
    Given Se abre portal publico en navegador Google Chrome
    When Presiono menu Quienes Somos desde footer
    Then Se despliega tres cards sobre mision, proposito y sueño