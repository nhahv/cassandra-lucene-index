package org.apache.lucene.analysis.core;

import org.apache.lucene.analysis.Analyzer;

public class AsciiWhitespaceAnalyzer extends Analyzer {
    @Override
    protected TokenStreamComponents createComponents(String s) {
        return null;
    }
}
