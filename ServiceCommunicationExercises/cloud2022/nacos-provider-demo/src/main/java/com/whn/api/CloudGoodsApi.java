package com.whn.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : WangRich
 * @Description : description
 * @date : 2022/9/1 10:43
 */
@RestController
public class CloudGoodsApi {
    /**
     * 读取应用的启动端口
     */
    @Value("${server.port}")
    private String applicationServerPort;

    @GetMapping("/goodsServiceTest")
    public String goodsServiceTest() {
        // 返回信息给调用端
        return "this is goods service from port:" + applicationServerPort;
    }
}
