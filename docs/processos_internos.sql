create database processos_internos;

-- Primeira tabela criada

use processos_internos;

CREATE TABLE `administradores` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `matricula` varchar(50) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `departamentos` varchar(100) DEFAULT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `tipoUser` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `login` (`login`),
  UNIQUE KEY `matricula` (`matricula`)
  )
  default charset = utf8;
  
 INSERT INTO `administradores` 
 VALUES 
 (1,'Matheus Daniel','02683194137','9997026165','20161043016','matheus_@outlook.com','Masculino','Supervisor','Administrativo','adm','md123','Administrador'),
 (2,'Murilo Henrique Reis','02488765432','998877665','20161043015','murilo@gmail.com','Masculino','Contador','Financeiro','gurindiz','123456','Administrador'),
 (3,'Christian Santos','02387654323','99776543','20161043017','christian.santos@gmail.com','Masculino','Analista','Recursos humanos','christian','123456','Administrador');
 
 select * from administradores;

  
  -- Segunda tabela criada
  use processos_internos;

  CREATE TABLE `tipoproc` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `descricao` blob,
  PRIMARY KEY (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `tipoproc` 
  VALUES 
  (1,'Matricula','Matricular aluno novo'),
  (2,'Comprovante de matricula','Retirar comprovante'),
  (3,'FIES','Cadastro no Fies'),
  (4,'Troca de Curso','Trocar para outro curso similar'),
  (7,'OVG','adçlkfjadlçkf'),
  (9,'Bolsa Empresa','Ganhar desconto');
  
  select * from tipoproc;

  
  -- Terceira tabela criada
  use processos_internos;

  CREATE TABLE `admproc` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `id_Processo` int(200) DEFAULT NULL,
  `id_Adm` int(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Processo` (`id_Processo`),
  KEY `id_Adm` (`id_Adm`),
  CONSTRAINT `admproc_ibfk_1` FOREIGN KEY (`id_Processo`) REFERENCES `tipoproc` (`id`),
  CONSTRAINT `admproc_ibfk_2` FOREIGN KEY (`id_Adm`) REFERENCES `administradores` (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `admproc` 
  VALUES 
  (1,1,1);
  
  select * from admproc;
  
  -- Quarta tabela criada
  use processos_internos;
  CREATE TABLE `alunos` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `matricula` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `curso` varchar(50) DEFAULT NULL,
  `ender` varchar(200) DEFAULT NULL,
  `respons` varchar(200) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `dataNasci` date DEFAULT NULL,
  PRIMARY KEY (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `alunos` 
  VALUES 
  (1,'João da Silva','02456789431','985643222','20164234532','joão@gmail','Masculino','Sistemas de Informação','Rua 2 qdr 19 lot 1 - Jardim JD','Joana Aparecida','Goiania','1990-12-02'),
  (2,'Pedro dos Santos','03568974333','966322262','20164388325','pedro@gmail','Masculino','Engenharia mecanica','Rua 3 qdr 1 lot 2 - Jd Vitorio','Maria dos Santos','Goiania','1996-09-01'),
  (3,'Jenival Pereira','02355443221','995323622','20168765543','jenival@gmail','Masculino','Engenharia da computação','Rua 6 qdr 3 lot 3 - Jd Pedro','Claudia dos Santos','Goiânia','1992-03-02'),
  (4,'Maria Sebastiana','03484532456','981345564','20161845734','Maria@live.com','Feminino','Administração','Rua JC qud 4 lot9 - Centro','João Barbosa Pereira','Goiaânia','1998-09-11');

  select * from alunos;
  
  -- Quinta tabela criada
  use processos_internos;
  CREATE TABLE `documentos` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `documentos` 
  VALUES 
  (1,'RG'),
  (3,'CERTIDÃO DE NASCIMENTO'),
  (7,'CNH'),
  (12,'Titulo de eleitor'),
  (21,'PIS'),
  (22,'CPF'),
  (23,'Historico escolar'),
  (25,'Comprovante de endereço');
  
  select * from documentos;

  -- Sexta tabela criada
  use processos_internos;
  CREATE TABLE `procdoc` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `id_Documento` int(200) DEFAULT NULL,
  `id_Processo` int(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Documento` (`id_Documento`),
  KEY `id_Processo` (`id_Processo`),
  CONSTRAINT `procdoc_ibfk_1` FOREIGN KEY (`id_Documento`) REFERENCES `documentos` (`id`),
  CONSTRAINT `procdoc_ibfk_2` FOREIGN KEY (`id_Processo`) REFERENCES `tipoproc` (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `procdoc` 
  VALUES 
  (12,3,9);

  select * from procdoc;
  
  -- Sétima tabela criada
  use processos_internos;
  CREATE TABLE `processos` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `status` blob,
  `comentarios` blob,
  `dataIni` date DEFAULT NULL,
  `id_Aluno` int(50) DEFAULT NULL,
  `nomeAluno` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Aluno` (`id_Aluno`),
  CONSTRAINT `processos_ibfk_1` FOREIGN KEY (`id_Aluno`) REFERENCES `alunos` (`id`)
  )
  default charset = utf8;
  
  INSERT INTO `processos` 
  VALUES 
  (35,'Matricula','Aguardando resposta de Thiago dos Santos - Administrativo','Tudo ok','2017-06-01',1,'João da Silva'),
  (36,'Comprovante de matricula','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',4,'Maria Sebastiana'),
  (37,'Matricula','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',3,'Jenival Pereira'),
  (38,'Comprovante de matricula','Aguardando resposta de Thiago dos Santos - Administrativo','ok','2017-06-01',3,'Jenival Pereira'),
  (39,'OVG','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',1,'João da Silva'),
  (40,'Bolsa Empresa','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',2,'Pedro dos Santos'),
  (41,'OVG','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',1,'João da Silva'),
  (42,'FIES','Aguardando resposta de Thiago dos Santos - Administrativo',NULL,'2017-06-01',1,'João da Silva'),
  (43,'Troca de Curso','Aguardando resposta de Murilo Henrique Reis - Financeiro',NULL,'2017-06-01',4,'Maria Sebastiana');
  
  select * from processos;

  -- Oitava tabela criada
  use processos_internos;
  CREATE TABLE `procopen` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `id_Proc` int(200) DEFAULT NULL,
  `id_Resp` int(100) DEFAULT NULL,
  `cont` int(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Proc` (`id_Proc`),
  KEY `id_Resp` (`id_Resp`),
  CONSTRAINT `procopen_ibfk_1` FOREIGN KEY (`id_Proc`) REFERENCES `processos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `procopen_ibfk_2` FOREIGN KEY (`id_Resp`) REFERENCES `administradores` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) 
DEFAULT CHARSET=utf8;

INSERT INTO `procopen` 
VALUES 
(38,35,1,1,'off');

select * from procopen;

-- Nona tabela criada
use processos_internos;
CREATE TABLE `responsavel` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `matricula` int(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `departamentos` varchar(100) DEFAULT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf` (`cpf`),
  UNIQUE KEY `matricula` (`matricula`),
  UNIQUE KEY `login` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




  
  
  
  
  


  
  
  

  


