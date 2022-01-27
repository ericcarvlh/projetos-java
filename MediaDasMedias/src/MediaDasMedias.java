public class MediaDasMedias {

    public static void main(String[] args){

        float mean1 = ((float)8.9+7)/2;
        int mean2 = (4+5+6)/3;
        float meanOfMean = (mean1+mean2)/2;
        float sum = mean1+mean2;

        System.out.println("A média aritmética dos números 8,9 e 7: "+mean1);
        System.out.println("A média aritmética dos números 4, 5 e 6: "+mean2);
        System.out.println("A média aritmética das médias: "+meanOfMean);
        System.out.println("A das duas primeiras médias: "+sum);

    }
}
