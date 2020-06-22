package org.apache.lucene.analysis.vi;

import jdk.nashorn.internal.parser.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilter;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        VietnameseAnalyzer analyzer = new VietnameseAnalyzer();

        TokenStream stream = analyzer.tokenStream("test", "Trong các đẳng\nthức sau\n\n động vật trên thế giới rất phong phú và đa dạng");

        stream = new ASCIIFoldingFilter(stream);
        CharTermAttribute cattr = stream.addAttribute(CharTermAttribute.class);
        try {
            stream.reset();
            while (stream.incrementToken()) {
                System.out.println(cattr.toString());
            }
            stream.end();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
