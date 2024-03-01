package dog3;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ab {

    public static void main(String[] args) {
        // 呼び出し（new した後で、引数へ与えられた値を元に Pokemon が生成されます）
        Pokemon2 pikachu = new Pokemon2("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です","今の現在日時は","です");
        Date date = new Date();
		SimpleDateFormat jikan = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 使用時
        System.out.println(pikachu.number);
        System.out.println(pikachu.name);
        System.out.println(pikachu.category);
        System.out.println(pikachu.type+jikan.format(date)+pikachu.description);
        

    }
}

