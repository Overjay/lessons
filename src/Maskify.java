public class Maskify {
    public static String maskify(String str) {
        StringBuffer strBuffer = new StringBuffer(str);
        int buffLength = strBuffer.length();

        if(buffLength>4){
            StringBuffer strBuffer2 = new StringBuffer();
            for (int i=0; i<(buffLength-4);i++){
                if(i==0){
                    strBuffer2.insert(0,"#");
                }else {
                    strBuffer2.append("#");
                }
            }

            strBuffer.replace(0,buffLength-4,strBuffer2.toString());
        }else return strBuffer.toString();

        return strBuffer.toString();
    }
}
