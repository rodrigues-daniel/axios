package vaadin.prometheus.iconaction;


import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by daniel.rodrigues on 22/04/2017.
 */
public class IconAction extends CustomComponent {

  VerticalLayout layout;

  public IconAction(VerticalLayout layout) {
    this.layout = layout;
    configureLayout();

  }

  public IconAction() {
    this.layout = new VerticalLayout();
    configureLayout();

  }

  public VerticalLayout getLayout() {
    return layout;
  }

  public void setLayout(VerticalLayout layout) {
    this.layout = layout;
  }

  private void configureLayout(){
  
    this.layout.addStyleName("icon-action");
    setCompositionRoot(layout);
  }
}
