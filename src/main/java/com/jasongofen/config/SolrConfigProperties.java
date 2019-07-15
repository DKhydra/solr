package com.jasongofen.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: yml配置实体
 * @Project: SolrProject
 * @Author: JasonGofen
 * @Date: 2019/3/27
 * @UpdatedBy:
 * @UpdateDate:
 */
@Component
@ConfigurationProperties(prefix = "solr")
@Data
public class SolrConfigProperties {

    private String server;

    private String core;

    private String dir;

}
