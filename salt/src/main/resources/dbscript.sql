CREATE TABLE EMP
(
    empNo          char(4) NOT NULL ,
    empNm          VARCHAR(50) NULL ,
    empPos         VARCHAR(20) NULL ,
    deptNo         INTEGER NULL ,
    deptNm         VARCHAR(50) NULL ,
    email          VARCHAR(80) NULL ,
    phone          VARCHAR(20) NULL ,
    regDate        DATE NULL ,
    etc            VARCHAR(100) NULL
);
ALTER TABLE EMP
    ADD CONSTRAINT EMP_PK PRIMARY KEY (empNo);
COMMENT ON TABLE EMP IS '[직원]';
COMMENT ON COLUMN EMP.empNo IS '> 사번';
COMMENT ON COLUMN EMP.empNm IS '이름';
COMMENT ON COLUMN EMP.empPos IS '직급명';
COMMENT ON COLUMN EMP.deptNo IS '부서코드';
COMMENT ON COLUMN EMP.deptNm IS '부서명';
COMMENT ON COLUMN EMP.email IS '이메일';
COMMENT ON COLUMN EMP.phone IS '전화번호';
COMMENT ON COLUMN EMP.regDate IS '등록일시';
COMMENT ON COLUMN EMP.etc IS '기타';

insert into emp values ('0001', '홍길동', '사원', null, 'IS팀', 'hongs@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0002', '용엄마', '여왕', null, '용용팀', 'daenerys@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0003', '존스노', '몰라', null, '북부팀', 'jonsnow@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0004', '거산사', '마님', null, '북부팀', 'sansa@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0005', '아리아', '자객', null, '북부팀', 'aria@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0006', '난쟁이', '임프', null, '용용팀', 'tyrion@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0007', '자이메', '외팔', null, '킹스팀', 'jamie@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0008', '까마귀', '세눈', null, '북부팀', 'crow3@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0009', '하운드', '멍멍', null, '자유팀', 'hound@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0010', '드로곤', '퐈야', null, '용용팀', 'drogon@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0011', '고스트', '어후', null, '북부팀', 'ghost@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0012', '브리엔', '떡대', null, '북부팀', 'brien@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0013', '포드릭', '매직', null, '북부팀', 'magicx@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0014', '브론경', '건달', null, '킹스팀', 'bron@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0015', '서세이', '광년', null, '킹스팀', 'cersei@altibase.com', '01012345678', sysdate, '안녕');
insert into emp values ('0016', '다보스', '할배', null, '북부팀', 'davos@altibase.com', '01012345678', sysdate, '안녕');


DROP TABLE T_MEMBER;
CREATE TABLE T_MEMBER
(
    id             VARCHAR(30) NOT NULL ,
    name           VARCHAR(30) NULL ,
    email          VARCHAR(80) NULL ,
    phone          VARCHAR(20) NULL ,
    addr           VARCHAR(200) NULL ,
    birthday       VARCHAR(8) NULL ,
    pwd            VARCHAR(200) NULL ,
    regDate        DATE DEFAULT SYSDATE ,
    modDate        DATE NULL ,
    loginCnt       INTEGER DEFAULT 0,
    etc            VARCHAR(500) NULL
);
ALTER TABLE T_MEMBER
    ADD CONSTRAINT T_MEMBER_PK PRIMARY KEY (id);
COMMENT ON TABLE T_MEMBER IS '[회원]';
COMMENT ON COLUMN T_MEMBER.id IS '> 아이디';
COMMENT ON COLUMN T_MEMBER.name IS '이름';
COMMENT ON COLUMN T_MEMBER.email IS '이메일';
COMMENT ON COLUMN T_MEMBER.phone IS '전화번호';
COMMENT ON COLUMN T_MEMBER.addr IS '주소';
COMMENT ON COLUMN T_MEMBER.birthday IS '생년월일';
COMMENT ON COLUMN T_MEMBER.pwd IS '패스워드';
COMMENT ON COLUMN T_MEMBER.regDate IS '등록일시';
COMMENT ON COLUMN T_MEMBER.loginCnt IS '로그인횟수';
COMMENT ON COLUMN T_MEMBER.etc IS '기타';

INSERT INTO T_MEMBER (id, name, email, phone, addr, birthday, pwd, modDate, etc)
VALUES ('hongs', '홍길동', 'hongs@altibase.com', '0101231234', '서울시 구로구 구로동 대륭', '19741105', NULL, NULL, NULL);