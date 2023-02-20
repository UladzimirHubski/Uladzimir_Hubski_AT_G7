package homework.day1.basetask;

public class TrainMethodsReturnRunner extends TrainMethodsReturn {

    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        trainMethodsReturn.returnNewInt(6);
        trainMethodsReturn.returnNewLong(2147483647);
        trainMethodsReturn.returnNewChar('g');
        trainMethodsReturn.returnNewFloat(30.6f);
        trainMethodsReturn.returnNewDouble(179.231);
        trainMethodsReturn.returnNewShort((short) 327);
        trainMethodsReturn.returnNewByte((byte) 2);
        trainMethodsReturn.returnNewBoolean(false);

    }

}
