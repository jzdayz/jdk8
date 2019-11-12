package io.github.jzdayz;

public class Util {

    interface Run{
        void run() throws Exception;
    }

    public static void invoke(Run runnable){
        try {
            runnable.run();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
