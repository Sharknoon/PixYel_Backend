package pixyel_backend.userinterface;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import java.util.concurrent.Executors;
import pixyel_backend.Main;
import pixyel_backend.userinterface.UIs.LoginUI.Login;

/**
 * This Userinterface is the application entry point. A Userinterface may either
 * represent a browser window (or tab) or some part of a html page where a
 * Vaadin application is embedded.
 * <p>
 * The Userinterface is initialized using {@link #init(VaadinRequest)}. This
 * method is intended to be overridden to add component to the user interface
 * and initialize non-component functionality.
 */
@Theme("mytheme")
public class Userinterface extends com.vaadin.ui.UI implements Runnable {

    private final static int PORT = 8080;

    /**
     * To start the Userinterface in general as a separate Thread
     */
    public static void start() {
        Translations.init();
        Executors.newCachedThreadPool().submit(new Userinterface());
    }

    /**
     * Here starts the seperate Thread working
     */
    @Override
    public void run() {
        try {
            VaadinJettyServer vaadinJettyServer = new VaadinJettyServer(8080, Userinterface.class);
            vaadinJettyServer.start();
        } catch (Exception ex) {
            if (ex.toString().contains("Address already in use")) {
                System.err.println("Could not start UI, port " + PORT + " is used by another program, shutting down this UI");
                //TODO Shutdown without Userinterface Server shutdown
            } else {
                System.err.println("Could not start UI: " + ex);
            }

        }
    }

    /**
     * Here is the first UI being loaded
     *
     * @param vaadinRequest
     */
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Login.show();
    }

    /**
     * Some settings for the VaadinServlet and other things
     */
    @WebServlet(urlPatterns = "/*", name = "PixYelUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = Userinterface.class, productionMode = !Main.DEBUG)
    public static class PixYelUIServlet extends VaadinServlet {
    }

    /**
     * ONLY for DEBUGGING Reasons
     *
     * @param args
     */
    public static void main(String[] args) {
        start();
    }

}