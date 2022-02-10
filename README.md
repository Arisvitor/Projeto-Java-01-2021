# Projeto-Java-Reserva-de-Passagens-Aereas

### Atividade relativa à Disciplina Linguagem de Programação 1 - LP1A3, ministrada pelo professor André Evandro Lourenço, presente no Curso de Tecnologia em Análise e Desenvolvimento de Sistemas do Instituto Federal de Educação, Ciência e Tecnologia de São Paulo - IFSP, em Setembro de 2021.
Projeto realizado em dupla (Arisvitor Barros e Karine Amaral) cujo objetivo era a criação de um sistema para Reserva de Passagens Aéreas.

Utilizamos a linguagem de programação Java.
Não foi feita integração com banco de dados e assim, não há persistência dos dados digitados nesta tela. Foram exemplificados alguns tratamentos de excessões, máscara de formatação e validação de dados.

A estrutura foi organizada da seguinte forma:
A classe "Menu" extende JFrame. Declaramos as aeronaves e voos com seus contadores para manipular o array; Em seguida, começamos a montar toda a estrutura do menu com todos os itens e subitens; Para cada subitem, criamos uma janela (que são os PANELS) com os elementos que irão compor as respectivas telas, bem como as ações que serão realizadas em cada uma; Um ponto que foi necessário para conseguirmos manipular as telas de Janelas/Painels e fazer o efeito de transição ao clicar nas opçõs da barra de menu foi:
  - iniciar a chamada do Menu com todos os painels ocultados (em segundo plano), e apresentar um de cada vez, conforme as respectivas chamadas, depois de ter todas os parâmetros e ações já determinados em cada uma delas.

Esta mesma lógica mencionada está sendo utilizada para todos as janelas em todo o projeto. Todas as janelas tem as "actions" que realizam as ações necessárias para aquele contexto, e em seguida, a criação dos elementos que compõe a tela (tais como labels, TextFilds com e sem máscara de formatação). Para os casos em que estamos utilizando máscara de validação, existe um "try catch" para validar a informação digitada (data, hora, etc). Ao final de todas elas, os campos preenchidos são esvaziados/limpos ao registrar os dados no final.

##Link para o vídeo da apresentação do Projeto, postado no Youtube: https://www.youtube.com/watch?v=85chmW9Msq0.
