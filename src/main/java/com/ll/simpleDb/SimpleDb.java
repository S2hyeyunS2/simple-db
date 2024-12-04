package com.ll.simpleDb;

import lombok.RequiredArgsConstructor;

//final 붙은 것들만 자동으로 생성자가 생긴다
@RequiredArgsConstructor
public class SimpleDb {
    private final String host;
    private final String username;
    private final String password;
    private final String dbName;

    public void run(String sql){

    }
}
