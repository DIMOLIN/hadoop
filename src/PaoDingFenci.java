import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
//import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.TermAttribute;

import net.paoding.analysis.analyzer.PaodingAnalyzer;

public class PaoDingFenci {

    Analyzer analyzer = new PaodingAnalyzer();

    public PaoDingFenci() {
        //
    }

    public String fenci01(String text) throws IOException {
        StringBuffer sb = new StringBuffer();
        StringReader reader = new StringReader(text);
        TokenStream ts = this.analyzer.tokenStream(text, reader);

        TermAttribute termAtt = (TermAttribute) ts
                .addAttribute(TermAttribute.class);
        while (ts.incrementToken()) {
            sb.append(termAtt.term());
            sb.append(" ");
        }
        return sb.toString();
    }
}