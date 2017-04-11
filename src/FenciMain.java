import java.io.IOException;

public class FenciMain {
    public static void main(String[] args) throws IOException {
        PaoDingFenci pd = new PaoDingFenci();
        String text = "自己翻译的官方文档，需要的人可以参考一下，有翻译错误还请指正。 \nHello world";
        System.out.println(pd.fenci01(text));
        //System.out.println(pd.fenci02(text));
    }
}