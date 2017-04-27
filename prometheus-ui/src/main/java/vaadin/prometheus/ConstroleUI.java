package vaadin.prometheus;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.*;

/**
 * Created by daniel.rodrigues on 26/04/2017.
 */
public class ConstroleUI {


  public ConstroleUI(UI ui) {


    AbsoluteLayout layout = new AbsoluteLayout();
    layout.setSizeFull();

    HorizontalLayout acoes_one = new HorizontalLayout();
    HorizontalLayout acoes_twuo = new HorizontalLayout();
    HorizontalLayout acoes_3 = new HorizontalLayout();




    VerticalLayout layout1 = new VerticalLayout();
    Label o = new Label("Registar Ocorrencia");
    o.setIcon(VaadinIcons.BOOK);
    layout1.addComponent(o);


// A component with coordinates for its top-left corner

    TabSheet tabSheet = new TabSheet();
    tabSheet.addTab(acoes_one, "Atendimentos", VaadinIcons.AMBULANCE);
    acoes_one.addComponent(layout1);

    tabSheet.addTab(acoes_twuo, "Manutenção", VaadinIcons.TOOLS);
    acoes_twuo.addComponent(layout1);

    tabSheet.addTab(acoes_3, "Mapa", VaadinIcons.MAP_MARKER);
    acoes_3.addComponent(layout1);
    layout.addComponent(tabSheet, "left:20; top:10px");


    ui.setContent(layout);


  }
}
