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


