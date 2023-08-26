## Controle de Fluxo - Desafio - DIO

O sistema recebe dois parâmetros via terminal que representam dois números inteiros, com estes dois números o sistema obtém a quantidade de iterações (for) e realiza a impressão no console (System.out.print) dos números incrementados.

- Se você passar os números 5 e 15, logo teremos uma iteração (for) com 10 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, o sistema lança a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro".

- Os parâmetros devem conter apenas números inteiros. Caso seja informado um caractere especial ou um valor com casas decimais o sistema lança a InputMismatchException contendo a frase "Apenas números inteiros são aceitos nos parâmetros!".

- Se algum dos dois valores forem 0 ou negativos o sistema mostra a mensagem "Os parâmetros precisam ser maiores do que 0."
