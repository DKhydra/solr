###Spring boot 2.1.3 + Solr7.7.1 入门微服务
****
####项目说明
- Blog:[https://www.jianshu.com/p/95869ade37b3](https://www.jianshu.com/p/95869ade37b3)
- Git:[https://github.com/JasonGofen/SolrProject](https://github.com/JasonGofen/SolrProject)
```
本项目是入门项目，只对SolrJ 7.7.1 API的CRUD操作做基础调用演示，对于如何与现业务系统做对接，后续还会出第二版。
```
####环境依赖
```
<!-- SolrJ 7.7.1 API -->
<dependency>
	<groupId>org.apache.solr</groupId>
	<artifactId>solr-solrj</artifactId>
	<version>7.7.1</version>
</dependency>
<!-- 解析文档内容工具包 -->
<dependency>
	<groupId>org.apache.tika</groupId>
	<artifactId>tika-core</artifactId>
	<version>1.9</version>
</dependency>
```
####目录结构
```
├── src                         
│   └── main
│       ├── java
│       │   └── com.jasongofen
│       │       ├── client
│       │       │   └── SolrClient.java             // Solr客户端
│       │       ├── config
│       │       │   ├── CorsConfig.java             // 跨域配置文件
│       │       │   └── SolrConfigProperties.java   // yml属性实例化配置文件
│       │       ├── test
│       │       │   └── SolrCURDTest.java           // Solr API调用测试示例
│       │       ├── util
│       │       │   ├── ConvertUtil.java            // 自定义转换工具类
│       │       │   └── TikaUtil.java               // 提取文档内容工具类
│       │       └── SolrProjectApplication.java     // Spring boot启动类
│       └── resources
│           ├── application.yml                     // 项目配置
│           ├── banner.txt                          // banner配置
│           └── logback-spring.xml                  // 日志配置
├── pom.xml                                         // 依赖配置
└── README.md                                       // 项目帮助文档
```
####使用教程
```
1.准备两个doc文档，写入一些自定内容，放到指定目录下，当然也不一定非得要doc
2.修改 application.yml 中下列参数
# solr配置
solr:
  # Solr Server端地址
  server: localhost:8983
  # Solr Core名称
  core: TestCore
  # 上面准备的文档的所在本地路径
  dir: C:\solrfile\data\
```
####项目运行
```
上面配置完后，确保Solr Server已启动，即可运行。
调用方式：
http://localhost:8080/Solr/Add
http://localhost:8080/Solr/Query
http://localhost:8080/Solr/Delete
查询时因返回的是JSON串，并未做前端页面展示，请根据业务需求自行定制。
```