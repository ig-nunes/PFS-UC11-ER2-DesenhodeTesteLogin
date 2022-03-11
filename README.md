# *PFS-UC11-ER2-DesenhodeTesteLogin*
Desenho de Teste da página de login do site da Game Mania

# Relatório Resumo de Teste
Site Game Mania – 
Página de Login


# Objetivo
Este documento tem por objetivo apresentar o relatório dos casos de testes aplicados sobre o site da Game Mania. Para melhor entendimento dos resultados e para mais
informações com relação ao planejamento ou o passo a passo dos testes, procurar os documentos “Plano de Teste AO2” e “Casos de Teste AO2”.


# Responsáveis
    Os responsáveis pela execução, elaboração e publicação deste documento será a equipe:

Representante:	Igor dos Santos Nunes;

Descrição:	Responsável pelo planejamento, execução e avaliação do teste;

Tipo de Formação:	Graduando em Engenharia da Computação e Programador Full-Stack;

Responsabilidade:	Testar a funcionalidade do componente escolhido, além de garantir integridade do teste, deste documento e dos outros relatórios advindos do projeto.



# Resultados
Inicialmente, é importante ter o conhecimento que até o momento da confecção deste documento, o banco de dados possui dois usuários “igor@email.com” e 
“fernanda@email.com”, ambos com a senha “senha”, enquanto que o usuário “outro@email.com” não está cadastrado. Com isso, foi utilizado apenas o primeiro para 
realização de login e o último para ocasionar erro de login no teste.


*Caso “Teste de Login”:*

Neste caso de teste, foi constatado que os campos de e-mail e senha e o botão de fazer login estão funcionando de acordo com o previsto: O login é realizado com 
sucesso para o usuário cadastrado (e-mail “igor@email.com”) e falha para o usuário não cadastrado (“outro@email.com”). As mensagens do sistema, que alertam o usuário 
se o login foi realizado com sucesso ou não, são geradas corretamente, de acordo com a situação (falha ou sucesso). Contudo, foi notado que há um erro em sua 
apresentação: Após o primeiro momento que o login é realizado com sucesso, o elemento da mensagem que apresenta o sucesso da ação permanece na tela, mesmo após 
a segunda tentativa de login, da qual tem o propósito de falhar. Com isso, enquanto ocorrem os erros, o elemento de página permanece na tela, sendo que na situação 
ideal, esse elemento < p > de id “mensagem-sucesso-desktop”, deveria sumir. Fora esse ponto, não foram observados outros erros ou anormalidades no sistema.


# Conclusão
Por fim, é recomendado que a equipe de front-end responsável pelo desenvolvimento do site da Game Mania verifique a codificação do elemento citado (< p > com o 
id “mensagem-sucesso-desktop”) e dos scripts que geram a função desse, para correção de sua funcionalidade. Após essa verificação, novos testes deverão ser 
realizados para averiguação da funcionalidade da página de login. A partir de futuros testes, novas recomendações podem ser feitas.

