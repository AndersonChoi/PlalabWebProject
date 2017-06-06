package plalab;

import com.opensymphony.xwork2.Action;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by HackerAnderson on 2017. 6. 7..
 */
public class HelloWorldAction implements Action {

    private String message;

    private String userName;

    public HelloWorldAction() {
    }

    public String execute() {
        setMessage("Hello " + getUserName());
        return "SUCCESS";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
