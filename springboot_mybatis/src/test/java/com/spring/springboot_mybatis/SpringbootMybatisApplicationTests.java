package com.spring.springboot_mybatis;

import org.junit.Test;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Test
    void contextLoads() {
    }

}
/**
 * Invocation failed Server returned invalid
 * Response. * java.lang.RuntimeException: Invocation failed Server returned invalid Response.
 * at org.jetbrains.git4idea.http.GitAskPassXmlRpcClient.askUsername
 * (GitAskPassXmlRpcClient.java:50) at org.jetbrains.git4idea.http.GitAskPassApp.
 * main(GitAskPassApp.java:64) Caused by: java.io.IOException: Server returned invalid Response.
 * at org.apache.xmlrpc.LiteXmlRpcTransport.sendRequest(LiteXmlRpcTransport.java:242)
 * at * org.apache.xmlrpc.LiteXmlRpcTransport.sendXmlRpc(LiteXmlRpcTransport.java:90)
 * at org.apache.xmlrpc.XmlRpcClientWorker.execute(XmlRpcClientWorker.java:72)
 * at org.apache.xmlrpc.XmlRpcClient.execute(XmlRpcClient.java:194)
 * at org.apache.xmlrpc.XmlRpcClient.execute(XmlRpcClient.java:185)
 * at org.apache.xmlrpc.XmlRpcClient.execute(XmlRpcClient.java:178)
 * at org.jetbrains.git4idea.http.GitAskPassXmlRpcClient.askUsername(GitAskPassXmlRpcClient.java:47)
 * ... 1 more remote: No anonymous write access. Authentication failed for 'https://github.com/foreverxwwl/springBootLearning.git/'
 */
