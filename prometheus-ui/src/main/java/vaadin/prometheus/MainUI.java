package vaadin.prometheus;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;


/**
 *
 */
@Theme("mytheme")
public class MainUI extends UI {

    /*private CrudService<Person> service = new CrudService<>();
    private DataProvider<Person, String> dataProvider = new CallbackDataProvider<>(
                    query -> service.findAll().stream(),
                    query -> service.findAll().size());*/

    @Override
    protected void init(VaadinRequest vaadinRequest) {


       /* final VerticalLayout layout = new VerticalLayout();
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        final Button button = new Button("Click Me");
        button.addClickListener(e -> {
            service.save(new Person(name.getValue()));
            dataProvider.refreshAll();
        });

        final Grid<Person> grid = new Grid<>();
        grid.addColumn(Person::getName).setCaption("Name");
        grid.setDataProvider(dataProvider);
        grid.setSizeFull();

        // This is a component from the prometheus-addon module
        //layout.addComponent(new MyComponent());
        layout.addComponents(name, button, grid);
        layout.setSizeFull();
        layout.setExpandRatio(grid, 1.0f);

        setContent(layout);*/

      new ConstroleUI(this);

    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MainUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
