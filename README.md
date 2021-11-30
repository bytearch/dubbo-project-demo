## Dubbo版微服务 Demo

### 组件版本

|组件名|版本|
| ----- | -------|
|Dubbo| 2.7.7|
|SpringBoot| 2.3.2.RELEASE|
|Nacos | 2.0.3|


### 1. 编译
```shell
mvn clean install -DskipTests
```

### 2. 快速启动

```shell 
sh ./make.sh
```

### 3. 访问

|| 项   | 地址 | 账号密码 |
|----| --- | --- | --- |
|注册中心| Nacos | http://172.30.1.201:8848/nacos | 账号: nacos  密码: nacos
|测试| Consumer | http://172.30.1.204:8080/hello/say?name=www.bytearch.com