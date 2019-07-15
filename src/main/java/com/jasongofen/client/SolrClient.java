package com.jasongofen.client;

import org.apache.solr.client.solrj.impl.HttpSolrClient;

/**
 * @Description: Solr客户端
 * @Project: SolrProject
 * @Author: JasonGofen
 * @Date: 2019/3/28
 * @UpdatedBy:
 * @UpdateDate:
 */
public class SolrClient {

    public static HttpSolrClient getClient(String baseSolrUrl) {

        StringBuffer solrUrl = new StringBuffer();
        solrUrl.append("http://");
        solrUrl.append(baseSolrUrl);
        solrUrl.append("/solr/");

        return new HttpSolrClient.Builder(solrUrl.toString())
                // 设置超时时间
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
    }

}
