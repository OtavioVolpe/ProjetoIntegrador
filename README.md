# ProjetoIntegrador - UniPlanning
 **Trabalho de Projeto Integrador** - 3T-B, 2025  
 **Integrantes:** Gabriel Hernandes de Oliveira, Hernandes de Castro Guereta, Luiz Felipe Gomes Magalhães, Maria Eloiza Marques Consolino, Otávio Volpe Leal.  
 ## 1) Introdução do Projeto: 
 O UniPlanning surgiu da necessidade de criar maneiras do estudante melhorarar sua rotina de estudos e seu desempenho no curso. O sistema oferece funcionalidades como planos de ensino persomalizados, vídeo-aulas relacionadas com o conteúdo, plataforma para postagem de arquivos e informações.

 ## 2) Descrição das telas que serão desenvolvidas:
 ### TELA DE CADASTRO DO ALUNO: Permitir que o aluno se cadastre seus dados e acesse o sistema
	- Matrícula (id): campo obrigatório;  
	- Nome: campo obrigatório;  
	- Cpf: campo obrigatório;  
	- Email: campo obrigatório;  
 	- Senha: campo obrigatório;  
	- Curso: campo obrigatório - O aluno escreve o curso em que está inserido para que acontece a confirmação com o sistema.  
	- Botão para realizar o cadastro no sistema - CONFIRMAR : campo obrigatório para que o aluno consiga cadastrar as suas informações no 		banco de dados e acessar o sistema pela primeira vez.  
 	- Texto com hiperlink para entrar em uma conta: Caso o aluno já possua uma conta, ele pode clicar no texto "AQUI" que fazerá ele ser 		redirecionado para a página de login.  
	- Protótipo de tela de cadastro feito no Canva e no Figma:  
![Image](https://github.com/user-attachments/assets/a5e4f2cc-2731-447a-aa85-ba1d38df3725)  

 ### TELA DE LOGIN DO ALUNO: Permitir que o aluno acesse o sistema sem ter que repitir o processo de cadastro após que ele ter feito isso uma vez.
   	- Email: campo obrigatório;  
   	- Senha: campo obrigatório;
    	- Botão para criar uma conta: Caso o aluno ainda não tenha criado o seu cadastro, ele pode clicar em um botão para ser redirecionado a tela de cadastro.  
   	- Botão para realizar o login no sistema - CONFIRMAR : campo obrigatório para que o aluno consiga confirmar as suas informações e caso esteja tudo correto de acordo com o banco de dados da universidade, ele consiga acessar o sistema.    
    	- Protótipo de tela de login feito no Canva e no Figma:
![Image](https://github.com/user-attachments/assets/be2c49e0-e2dd-4549-b6c3-e6778837d47d)  

 ### TELA DE INICIO DO ALUNO: Permitir que o aluno veja as funcionalidades do sistema.
   	Botões interativos no canto esquerdo da página que redireciona para  as páginas relacionadas: 
	- Início  
	- Planner   
	- Vídeo-aulas  
	- Assistente - I.A  
 	- Mapas Mentais  
  	- Resumos  
   	- Progresso  
    	No meio da tela possui imagens interativas que ao clicar você será redirecionado aspáginas relacionadas:  
     	- Confira o nosso assistente I.A  
      	- Calendário do mês  
       	Perfil do aluno no canto direito:  
	- Foto do aluno  
 	- Nome do aluno  
  	- Curso e termo do aluno  
   	- Botão Interativo - SAIR: Ao clicar você saíra da sua conta e será redirecionado a tela de login    
    	- Protótipo de tela de login feito no Canva e no Figma:
![Image](https://github.com/user-attachments/assets/0ef54c61-2ff3-4f99-a5ff-92fa6ff329ff)

 ### TELA DE PLANNER DO ALUNO: Os alunos nessa funcionalidade vão conseguir definir suas prioridades, acessar as suas tarefas e as datas de envio máximo e a agenda os compromissos.
 	Parte esquerda da tela - PRIORIDADES: O aluno definirá o que ele precisa fazer com prioridade e as datas e o sistema mostrará para ele na aba de prioridades.  
  	Parte do meio da tela - AGENDA: O aluno consegue ver tudo o que ele possui em determinada semana, como apresentações, provas, visitas técnicas, palestras etc. Esses compromissos podem ser cadastrados pelos alunos, pelos professores ou pela coordenação.  
   	Parte direita da tela - TAREFAS: O aluno consegue ver tudo que ele precisa entregar e fazer durante determinado período. As tarefas podem ser cadastras  pelos professores, pela coordenação ou pelos próprios alunos. 
  	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de início ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início.  
   	- Protótipo de tela de planner do aluno feito no Canva e no Figma:
![Image](https://github.com/user-attachments/assets/8f10efbf-6865-4bb1-821a-f261c33d78d1)  

### TELA DE VÍDEO-AULAS DO ALUNO: Os alunos nessa funcionalidade vão conseguir acessar as vídeo-aulas que os processores linkaram a sua repectiva matéria.
 	Página de início das vídeo-aulas: A primeira página que o aluno será redirecionado após clicar no botão "Vídeo-aulas" na tela de início, será uma tela que contém todas as matérias do aluno. Todas as matérias são botões interativos que após clicar, o aluno será redirecionado a uma nova tela que contém todos as vídeo-aulas que o professor daquela máteria linkou para os alunos.  
  	- Botão matéria: cada matéria do aluno é um botão interativo que ao clicar ele será redirecionado a página da matéria escolhida. A quantidade de matérias depende de quantas matérias o aluno tem no semestre.  
  	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de início ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início.   
  	Página da matéria que o aluno escolheu: Contém todas as vídeo-aulas que o professor daquela matéria linjou para os seus alunos assistirem.  
  	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de matérias, ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início das vídeo-aulas.   
	- Uma lista de vídeo-aulas no canto esquerdo da tela: Aqui estará em ordem, todas as vídeo-aulas que o professor cadastrou na sua matéria.   
	- Vídeo aula selecionada pelo aluno: Após o aluno escolher qual vídeo-aula ele queira assistir, a vídeo aula aparecerá no meio da tela. O aluno consegue aumentar a vídeo-aula para que ela ocupe toda a tela, pausar e despausar, pular ou voltar alguns segundos, aumentar ou diminuir o volume, entrar nas configurações para alterar a qualidade, a velocidade ou adicionar legendas no vídeo.  
	- Avaliação da vídeo-aula no canto direito da tela: Após assistirem a vídeo aula selecionada, os alunos vão conseguir avaliar o conteúdo. O sistema oferece três tipos de avaliação = boa, média, ruim; os professores conseguem acompanhar as avaliações dos alunos e assim ver se o conteúdo das vídeo-aulas que ele linkou está ajudando ou não e caso necessário ele consiga mudar.   
	- Protótipo de tela de planner do aluno feito no Canva e no Figma:
![Image](https://github.com/user-attachments/assets/50c4e91c-e20e-4974-8ad7-5f5fe1d62b89)  
![Image](https://github.com/user-attachments/assets/161d2fce-83b9-4997-b885-f44955018bf4)  

### TELA DE RESUMO DO ALUNO: Os alunos nessa funcionalidade vão conseguir ver seus resumos que ele cadastrou no sistema, os resumos da comunidade, criar um novo resumo e compartilhar seus resumos para a comunidade.
 	Página Inicial dos Resumo: A página Inicial mostra as funcionalidades de criar novos resumos, ver os resumos compartilhados pela comunidade, os resumos que o aluno já cadastrou no sistema e se quiser compartilhar esses resumos para a comunidade.  
    	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de início ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início.  
  	Parte esquerda da tela: Botões Interativos = NOVO RESUMO, RESUMOS DA COMUNIDADE.  
  	- Botão NOVO RESUMO: Esse botão interativo redirecionará o aluno para uma nova página onde ele consiguirá escrever um novo resumo.  
   	- Botão RESUMOS DA COMUNIDADE: Esse botão interativo redirecionará o aluno para uma nova página onde ele consiguirá ver os resumos postados pela comunidade. Nessa página o aluno poderá filtrar os resumos de acordo com a matéria que ele deseja ou os resumos que foram publicados recentemente.  
      	- Botão de VOLTAR: Caso o aluno queira voltar para a tela geral de resumos, ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início dos resumos.  
    	Parte central da tela: Aqui estará os resumos feitos pelos alunos.  
     	- Botão interativo RESUMOS: Cada resumo será um botão interativo, o aluno ao clicar em um título de resumo que ele deseja acessar, ele será redirecionado para uma nova página, onde estará o resumo completo. Existirá um botão interativo para cada resumo cadastrado pelo aluno.  
	- Botão de VOLTAR: Caso o aluno queira voltar para a tela geral de resumos, ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início dos resumos.  
	Canto direito da tela: Aqui terá a opção de compartilhar.  
 	- Botão Interativo COMPARTILHAR: Ao clicar nesse botão, o aluno será redirecionado a uma página onde ele consiguirá selecionar seus resumos para compartilhar com a comunidade do curso.  
	- Botão de VOLTAR: Caso o aluno queira voltar para a tela geral de resumos, ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início dos resumos.  
   	- Protótipo de tela de planner do aluno feito no Canva e no Figma:  
![Image](https://github.com/user-attachments/assets/99ef66b1-9fbe-49ae-873f-e7f3df07f087)  
![Image](https://github.com/user-attachments/assets/7bf80873-524e-498f-a239-31890dbafd29)  
![image](https://github.com/user-attachments/assets/06be6165-5ef8-4d60-8992-8fdc574ffbb7)  

 ### TELA DE PROGRESSO DO ALUNO: Os alunos nessa funcionalidade vão conseguir ver quais são os seus progressos em cada matéria e o progresso final. Cada vez que ele finalizar uma atividade e marcar como feita no seu planner ou quando ele assitir as vídeo aulas passadas, esse progresso das matérias e geral vai aumentar.  
   	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de início ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início.   
 	Parte esquerda da tela - Progresso de cada matéria. As matérias estarão uma embaixo da outra com os seus respectivos progressos na frente. É possível ver o progresso detalhado ao clicar na matéria.  
  	- Botão Interativo MATÉRIAS: Cada matéria é um botão interativo diferente, quando o aluno cliclar em uma dessas matérias, ele será redirecionado para uma nova página que detalhará o progresso do aluno na matéria = o que ele fez e o que falta ele fazer. Cada matéria contém um pequeno gráfico "pizza" ao lado dela que será atualizado automaticamente com a porcentagem de progresso a medida que o aluno finaliza as suas tarefas.  
       	- Botão de VOLTAR: Caso o aluno queira voltar para a tela geral de progresso, ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início do progresso.    
  	Parte direita da tela - PROGRESSO GERAL: O aluno consegue ver todo o seu progresso geral por meio de um gráfico "pizza" que estará posiciodnado no canto direito da tela. Esse gráfico mostra a porcentagem do progresso já feito e ele vai atualizar automaticamente a medida que o aluno finaliza mais tarefas.  
   	- Protótipo de tela de planner do aluno feito no Canva e no Figma:
![Image](https://github.com/user-attachments/assets/0560d353-5b1f-4370-bbbc-1f18bd960302)

 ### TELA DE ASSISTENTE I.A DO ALUNO: Os alunos nessa funcionalidade vão conseguir mandar dúvidas para a inteligência artificial do sistema. Essa inteligência será alimentada pelos usuários da faculdade e ajudarão os alunos com informações relacionadas a faculdade.  
 	- Campo para os alunos digitarem um comando: Os alunos poderão digitar um comando relacionado ao conteúdo da faculdade e a inteligência artificial oferecerá uma resposta.  
    	- Botão de VOLTAR: Caso o aluno queira voltar para a tela de início ele pode clicar nesse botão interativo que ele será redirecionado para a tela de início.   
	- Protótipo de tela de planner do aluno feito no Canva e no Figma:  
 ![Image](https://github.com/user-attachments/assets/5316cff1-cc94-4fbe-b910-2155d2b4b476)




