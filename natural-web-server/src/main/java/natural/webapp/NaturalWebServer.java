package natural.webapp;

import com.google.inject.Guice;
import com.google.inject.Injector;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NaturalWebServer {

    @Inject
    public NaturalWebServer(){
    }

    public void println(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        Injector injector = Guice.createInjector();
        injector.getInstance(NaturalWebServer.class).println("ddd");
    }
}
