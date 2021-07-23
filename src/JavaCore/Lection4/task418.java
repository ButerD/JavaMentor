package JavaCore.Lection4;

public class task418 {


        public static void main(String[] args) throws ClassNotFoundException {
            System.out.println(getCallerClassAndMethodName());


            anotherMethod();
        }

        private static void anotherMethod() throws ClassNotFoundException {
            System.out.println(getCallerClassAndMethodName());
        }

public static String getCallerClassAndMethodName() throws ClassNotFoundException {
//    StackTraceElement[] stackTraceElements =  new Exception().getStackTrace();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    if(stackTraceElements.length < 4) {
        return null;
    }


    return stackTraceElements[1].getClassName() + "#" + stackTraceElements[1].getMethodName();
}

}
