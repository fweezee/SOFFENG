package controller;

import controller.ViewManager.ViewManagerException;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class InventoryController extends Controller
{
    @FXML
    private TableView tableviewInvetory;

    @FXML
    private TableColumn tableInventory, colNumber;

    public InventoryController() throws IOException
    {
        initialize(this, "/view/inventory", true);
    }

    @Override
    public void load() throws ViewManagerException
    {
        if(checkInitialLoad(getClass().getSimpleName()))
        {
            /**
             * Nix, put code here
             */
        }
    }

    @Override
    public void clear()
    {

    }

    private void loadRawItems()
    {
        DatabaseModel dbm = new DatabaseModel();
        ArrayList<RawItem> rawItemList = dbm.getRawItems();

        ObservableList<String> columnData1 = FXCollections.observableArrayList();
        ObservableList<String> columnData2 = FXCollections.observableArrayList();
    }
}
