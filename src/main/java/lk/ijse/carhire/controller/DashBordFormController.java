package lk.ijse.carhire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import lk.ijse.carhire.util.Navigation;
import lk.ijse.carhire.util.Routes;

import java.io.IOException;

public class DashBordFormController {
    @FXML
    private AnchorPane pane;
    public void btnAddCustomer(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.CUSTOMER, pane);

    }

    public void btnPlaceBooking(ActionEvent actionEvent) throws IOException {
        Navigation.navigate(Routes.PLACE_BOOKING, pane);
    }

    public void btnAddVehicle(ActionEvent actionEvent) {

    }
}

