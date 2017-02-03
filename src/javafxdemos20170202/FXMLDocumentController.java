package javafxdemos20170202;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class FXMLDocumentController implements Initializable {    
    @FXML private TextField urlInfo;
    @FXML private WebView webView;
    @FXML private Slider zoomSlider;
    
    @FXML private void handleGoButton(ActionEvent event) {
        String url = urlInfo.getText();
        System.out.println("GO button clicked. URL is " + url);
        
        webView.getEngine().load(url);
    }
    
    @FXML private void handleGoBack(ActionEvent event) {
        System.out.println("Go back");
        WebHistory history = webView.getEngine().getHistory();
        int size = history.getEntries().size();
        
        if (size > 0) {
            webView.getEngine().getHistory().go(-1);
        }
    }
    
    @FXML private void handleGoForward(ActionEvent event) {
        System.out.println("Go forward");
        
        WebHistory history = webView.getEngine().getHistory();
        int size = history.getEntries().size();
        int currentIndex = history.getCurrentIndex();
        
        if (currentIndex < size - 1) {
            webView.getEngine().getHistory().go(1);
        }
    }
    
    @FXML private void handleSlider(Event event) {
        double zoomLevel = zoomSlider.getValue()/100;
        System.out.println("Slider change detected: Value is " + zoomLevel);
        
        Platform.runLater(() -> {
            webView.setZoom(zoomLevel);        
        });
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
