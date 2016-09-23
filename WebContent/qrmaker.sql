CREATE TABLE `tb_box` (
  `AUTO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `ID` int(8) unsigned NOT NULL COMMENT '箱子编号',
  `CAPACITY` char(20) NOT NULL COMMENT '箱子容量',
  `PICI_ID` int(4) unsigned NOT NULL COMMENT '生产批次',
  PRIMARY KEY (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;


CREATE TABLE `tb_bottle` (
  `AUTO_ID` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `ID` int(20) unsigned NOT NULL COMMENT '药瓶编号',
  `TYPE_ID` int(4) unsigned NOT NULL COMMENT '农药种类',
  `PDCDATE` int(10) NOT NULL COMMENT '生产日期',
  `PACKDATE` int(10) NOT NULL COMMENT '包装日期',
  `BOX_ID` int(8) unsigned NOT NULL COMMENT '所属物流箱',
  `PICI_ID` int(4) unsigned NOT NULL COMMENT '生产批次',
  PRIMARY KEY (`AUTO_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
ALTER TABLE tb_bottle ADD CONSTRAINT FK_BOX_ID_B FOREIGN KEY (BOX_ID) REFERENCES tb_box (ID);
ALTER TABLE tb_bottle ADD CONSTRAINT FK_PICI_ID_A FOREIGN KEY (PICI_ID) REFERENCES tb_pici (ID);
ALTER TABLE tb_bottle ADD CONSTRAINT FK_TYPE_ID FOREIGN KEY (TYPE_ID) REFERENCES tb_type (ID);

CREATE TABLE `tb_pici` (
  `AUTO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `ID` int(4) unsigned NOT NULL COMMENT '批次号',
  `REMARK` varchar(50) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`AUTO_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE `tb_specification` (
  `AUTO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `ID` int(4) unsigned NOT NULL COMMENT '编号',
  `SPECIFICATION` char(20) NOT NULL DEFAULT '' COMMENT '规格',
  PRIMARY KEY (`AUTO_ID`),
  KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

CREATE TABLE `tb_type` (
  `AUTO_ID` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `ID` int(4) unsigned NOT NULL COMMENT '编号',
  `NAME` char(20) NOT NULL DEFAULT '' COMMENT '农药名称',
  `TYPE` char(20) NOT NULL DEFAULT '' COMMENT '农药种类',
  `QGP` char(20) NOT NULL DEFAULT '' COMMENT '保质期',
  `SPECIFICATION_ID` int(4) unsigned NOT NULL COMMENT '包装规格',
  PRIMARY KEY (`AUTO_ID`),
  KEY `FK_SPECIFICATION_ID` (`SPECIFICATION_ID`),
  KEY `ID` (`ID`),
  CONSTRAINT `FK_SPECIFICATION_ID` FOREIGN KEY (`SPECIFICATION_ID`) REFERENCES `tb_specification` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

create table company(
	autoid int primary key auto_increment,
	id int(5) not null unique,
	name varchar(50),
	admin varchar(50),
	password varchar(50),
	email varchar(50)
);
insert into company values (null,00001,'公司1','admin1','00001','00001@gmail.com');
insert into company values (null,00002,'公司2','admin2','00002','00002@gmail.com');
insert into company values (null,00003,'公司3','admin3','00003','00003@gmail.com');
insert into company values (null,00004,'公司4','admin4','00004','00004@gmail.com');

create table com2pro(
	autoid int primary key auto_increment,
	company_id int,
	producttype_id int unsigned
);
ALTER TABLE com2pro ADD CONSTRAINT FK_com2pro_com FOREIGN KEY (company_id) REFERENCES company (id);
ALTER TABLE com2pro ADD CONSTRAINT FK_com2pro_protype FOREIGN KEY (producttype_id) REFERENCES tb_type (ID);

create table plan(
	autoid int primary key auto_increment,
	yield int,
	codepre12 char(12),
	status int,
	createdate date,
	com2pro_id int
);
ALTER TABLE plan ADD CONSTRAINT FK_plan_com2pro FOREIGN KEY (com2pro_id) REFERENCES com2pro (autoid);

create table qrpicture(
	autoid int primary key auto_increment,
	width int,
	height int,
	pagepath varchar(255),
	fixedtext varchar(255),
	plan_id int
);
ALTER TABLE qrpicture ADD CONSTRAINT FK_qrpicture_plan FOREIGN KEY (plan_id) REFERENCES plan (autoid);

create table saveinfo(
	autoid int primary key auto_increment,
	id int(5) not null unique,
	path varchar(100),
	filename varchar(50),
	format varchar(20)
);

