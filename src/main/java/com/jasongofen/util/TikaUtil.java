package com.jasongofen.util;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.txt.TXTParser;
import org.apache.tika.sax.BodyContentHandler;

import java.io.InputStream;

/**
 * @Description: 提取文档内容工具类
 * @Project: SolrProject
 * @Author: JasonGofen
 * @Date: 2019/3/28
 * @UpdatedBy:
 * @UpdateDate:
 */
public class TikaUtil {

    /**
     * 获取txt文档内容
     * @param is
     * @return
     */
    public static String txt2String(InputStream is) {
        try {
            BodyContentHandler handler = new BodyContentHandler();
            Metadata metadata = new Metadata();
            ParseContext context = new ParseContext();
            TXTParser txtParser = new TXTParser();
            txtParser.parse(is, handler, metadata, context);
            return handler.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 获取word，excel，ppt，pdf文档内容
     * @param is
     * @return
     */
    public static String doc2String(InputStream is) {
        try {
            BodyContentHandler handler = new BodyContentHandler();
            Metadata metadata = new Metadata();
            AutoDetectParser parser = new AutoDetectParser();
            parser.parse(is, handler, metadata);
            return handler.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
