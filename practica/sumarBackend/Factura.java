import java.util.ArrayList;

public class Factura {
    ArrayList<float> articles = new ArrayList<float>();
    // float art1;
    // float art2;
    // float art3;

    float getTotal() {
        float suma =0;
        for(float article : articles)  {
            suma+=article;
        }
        return suma;
    }
    float getMedia() {
        return getTotal()/articles.size;
    }
    float getTotalWidthDto(float discount) {
        //float total = art1+art2+art3;
        return getTotal() * (1-discount);
    }
}