package homework.day6;

public class  GenericMethodsInGenericClassTwoParams<X, Y>  {

    public void genericMethodOneGenArg(X typeOne) {
        System.out.println("I am an object of " + typeOne.getClass().getSimpleName() + " class");
    }

    public Object genericMethodTwoGenArgs(X typeTwo, Y typeThree) {
        return ("We are objects of " + typeTwo.getClass().getSimpleName() + " class and " + typeThree.getClass().getSimpleName() + " class");
    }

    public void genericMethodHalfGenArgs(X typeFour, String string) {
        System.out.println("I got an object of " + typeFour.getClass().getSimpleName() + " class and string with " + string.length() + " characters");
    }
}
