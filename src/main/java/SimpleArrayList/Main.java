package SimpleArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("string1");
        list.add("string2");
        list.add("string3");

        int k = 0;
        while (list.size() > 0){
            System.out.println(list.get(k));
            try {
                list.delete(k);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
