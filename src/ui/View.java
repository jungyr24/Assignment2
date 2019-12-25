package ui;

import java.awt.event.ActionListener;

public interface View {
    void attachActionListener(ActionListener lister);
    void setMessageLabel();
    void setLabelPanel();
    void setInputPanel();
    void setBtnPanel();
    void setListPrintPanel();
    void refreshData();

}
