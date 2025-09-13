# 🔐 Conexão entre uma aplicação Java com qualquer banco de dados utilizando JPA e Spring Boot

## 🔖 Objetivo do projeto

<p style="text-align: justify">Neste projeto orientado pelo professor de Desenvolvimento de Sistemas, foi passado o objetivo de desenvolver uma <strong>aplicação em linguagem Java</strong> que realizasse as 4 operações básicas de banco de dados (O CRUD) e que criasse uma tabela em um banco de dados do qual o usuário pudesse escolher.<p/>

## 💡 Tecnologias utilizadas

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="100"/><img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/mysql/mysql-original.svg" width="100"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" width="100"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postman/postman-original.svg" width="100"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/npm/npm-original.svg" width="100"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" width="100"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/vscode/vscode-original.svg" width="100"/>

## 🖥️ Como utilizar esse projeto

### 1: Organize seu ambiente de desenvolvimento

<p style="text-align: justify">Para conseguir preparar sua máquina para clonar e executar o projeto, é necessário conferir e realizar algumas etapas antes para verificar se está tudo nos conformes</p>

#### I) Verifique em seu terminal de comandos se há o npm e o java instalados

_A versão do seu java deve estar, no mínimo, na versão 21.x.x ou algo próximo a isso_

```bash
  java --version 
```

```bash
  npm -v
```

Caso o terminal diga que não reconheceu o comando ou não está na versão apropriada, baixe o [Java](https://www.oracle.com/java/technologies/downloads/archive/) ou o [Node](https://nodejs.org/en/download), no qual vem junto dele o NPM conforme necessário.

#### II) Instale o MySQL

O MySQL é um sistema de gerenciamento de banco de suma importância para testar se nossa aplicação está realmente criando a ponte entre o programa em Java e o banco de dados. (para baixá-lo, [clique aqui!](https://dev.mysql.com/downloads/installer/))

### 2: Clone meu repositório

<p style="text-align: justify">Agora que seu ambiente está preparado para a execução desse projeto, vamos inseri-lo em sua máquina:</p>

(_Execute esse comando no diretório em que você deseja ter o projeto clonado_)

```bash
git clone https://github.com/Breno-V/JPA-Spring-Project
```

### 3: Prepare as configurações do projeto

<p style="text-align: justify">Como último passo, é necessário que você configure alguns requisitos que a aplicação em Java precisa para achar o banco de dados em que ele irá inserir as tabelas!</p>

#### I) Crie o Application.properties

<p style="text-align: justify">Esse arquivo é onde irá armazenar as informações que serão úteis a aplicação para conseguir identificar em qual banco será inserido as tabelas! Crie ele no seguinte caminho:

```bash
src/main/resources
```

#### II) Insira as informações necessárias

Dentro desse arquivo que você acabou de criar, insira as seguintes informações:

```bash
spring.application.name=api-produtos
spring.datasource.url=jdbc:mysql://localhost:3306/seubanco
spring.datasource.username=seuusuario
spring.datasource.password=suasenha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Não esqueça de trocar SEUBANCO, SEUUSUARIO e SUASENHA pelos seus dados pessoais/sensíveis que conferem no MySQL (Ou outro sistema que estiver utilizando)
```

#### Pronto! Agora você tem uma aplicação que cria tabelas em qualquer banco de dados
