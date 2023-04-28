package tw.org.iii.tutor;

public class Poker03 {

    public static void main(String[] args) {
        // 1.產生一副有序的撲克牌
        int count = 52; 
        int[] poker = new int[count]; // 宣告一個長度為52的整數陣列poker，用來儲存撲克牌的編號
        for (int i = 0; i < poker.length; i++) {
            poker[i] = i + 1; // 將撲克牌的編號存入陣列中，從1到52
        }

        // 2.洗牌
        for (int n = 0; n < 1000; n++) { // 將洗牌的動作重複執行1000次，增加洗牌的效果
            int i = (int) (Math.random() * poker.length - 1) + 0; // 隨機產生一個介於0和陣列長度-1之間的整數i
            int j = (int) (Math.random() * poker.length - 1) + 0; // 隨機產生一個介於0和陣列長度-1之間的整數j
            int tmp = poker[i]; 
            poker[i] = poker[j]; 
            poker[j] = tmp; 
        }

        // 3.輸出洗牌後的撲克牌
        for (int v : poker) // 使用foreach迴圈，將洗牌後的撲克牌一一輸出
            System.out.println(v);
    }
}
