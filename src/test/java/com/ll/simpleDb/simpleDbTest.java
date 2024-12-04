package com.ll.simpleDb;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class simpleDbTest {
    private static SimpleDb simpleDb;

    @BeforeAll
    public static void beforeAll() {
        simpleDb = new SimpleDb("localhost", "root", "lldj123414", "simpleDb__test");

        createArticleTable();
    }

    //테스트 완료 후 데이터베이스 연결 닫음
    //SimpleDb의 close메서드를 호출해 연결 해제 보장
    @AfterAll
    public static void afterAll(){
        simpleDb.close();
    }

    private static void createArticleTable() {
        simpleDb.run("DROP TABLE IF EXISTS article");

        simpleDb.run("""
                CREATE TABLE article (
                    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                    PRIMARY KEY(id),
                    createdDate DATETIME NOT NULL,
                    modifiedDate DATETIME NOT NULL,
                    title VARCHAR(100) NOT NULL,
                    `body` TEXT NOT NULL,
                    isBlind BIT(1) NOT NULL DEFAULT 0
                )
                """);
    }

    @Test
    @DisplayName("데이터베이스 연결 테스트")
    public void t000(){

    }
}
