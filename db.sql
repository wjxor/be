# DB 생성
DROP DATABASE IF EXISTS be;
CREATE DATABASE be;
USE be;

# member 테이블 생성
CREATE TABLE `member` (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    loginId CHAR(40) NOT NULL,
    loginPw VARCHAR(150) NOT NULL,
    `name` CHAR(20) NOT NULL,
    nickname CHAR(20) NOT NULL
);

# 관리자 회원 생성
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'admin',
loginPw = 'admin',
`name` = '관리자',
nickname = '관리자';

# 일반 회원 생성
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user2',
loginPw = 'user2',
`name` = '유저2',
nickname = '유저2';

CREATE TABLE `article` (
    id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    regDate DATETIME NOT NULL,
    updateDate DATETIME NOT NULL,
    memberId INT(10) UNSIGNED NOT NULL,
    title CHAR(100) NOT NULL,
    `body` LONGTEXT NOT NULL
);

# 임시 게시물 생성
INSERT INTO `article`
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body` = '내용1';

# 임시 게시물 생성
INSERT INTO `article`
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2';

# 임시 게시물 생성
INSERT INTO `article`
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3';