package vaadin.prometheus.iconaction;


import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by daniel.rodrigues on 22/04/2017.
 */
public class IconAction extends CustomComponent {

    VerticalLayout layout;

    public IconAction(String iconeHtml, String label) {
        Label labeltxt = new Label(label);


        this.layout = new VerticalLayout();
        this.layout.setSpacing(false);
        Label icone = new Label(iconeHtml);
        icone.setContentMode(ContentMode.HTML);
        this.layout.addComponent(icone);
        this.layout.addComponent(labeltxt);


        configureLayout();
    }


    public VerticalLayout getLayout() {
        return layout;
    }

    public void setLayout(VerticalLayout layout) {
        this.layout = layout;
    }

    private void configureLayout() {

        this.layout.addStyleName("icon-action");
        setCompositionRoot(layout);
    }
}
