
package com.example.tinyidclientdemo;

import com.alibaba.fastjson.JSON;
import com.xiaoju.uemc.tinyid.client.utils.TinyId;

import java.util.List;

public class TestTinyid {
    public static void main(String[] args) {
        // 无论是获取一个还是获取一批，tinyid client的号段也会跳一个步长。所以应该每次获取一批，每批个数等于步长，缓存起来，用完了再获取。
        Long id = TinyId.nextId("test");
        List<Long> ids = TinyId.nextId("test_odd", 10);
        System.out.println(id);
        System.out.println(JSON.toJSONString(ids));
    }
}
