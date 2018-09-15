package Police;

public class xyz {

    public boolean xyzMiddle(String str) {
        int leng = str.length();
        int i = leng / 2 - 1;

        if (str.length() >= 3 && str.substring(i, i + 3).equals("xyz")) {
            return true;
        }

        if (str.length() >= 3 && leng % 2 == 0 && str.substring(i - 1, i + 2).equals("xyz")) {
            return true;

        }

        return false;


    }

}







