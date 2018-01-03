/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Control.Data;
import Locations.Building;
import Locations.Campus;
import Locations.Floor;
import Locations.Location;
import Locations.Room;
import javax.swing.DefaultListModel;

/**
 * Displays a <code>.state</code> file
 * @author Student
 */
public class ViewState extends javax.swing.JDialog {
    
    private final DefaultListModel campusListModel;
    private final DefaultListModel buildingListModel;
    private final DefaultListModel floorListModel;
    private final DefaultListModel roomListModel;
    private final DefaultListModel roomDisplayListModel;
    
    private final Data data;
    
    private Location selectedLocation;

    /**
     * Creates new form ViewState
     * @param parent
     * @param modal
     * @param data
     * @param title
     */
    public ViewState(java.awt.Frame parent, boolean modal, Data data, String title) {
        super(parent, modal);
        
        campusListModel = new DefaultListModel();
        buildingListModel = new DefaultListModel();
        floorListModel = new DefaultListModel();
        roomListModel = new DefaultListModel();
        roomDisplayListModel = new DefaultListModel();
        
        this.data = data;
        
        initComponents();
        setLocationRelativeTo(parent);
        
        lblTitle.setText(title);
        lblState.setText("");
        
        RefreshCampusListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstCampuses = new javax.swing.JList<>();
        lblTitle = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstBuildings = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstFloors = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstRooms = new javax.swing.JList<>();
        lblState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Read-only View of State");
        setResizable(false);

        lstCampuses.setModel(campusListModel);
        lstCampuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstCampusesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lstCampuses);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("TITLE");

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lstBuildings.setModel(buildingListModel);
        lstBuildings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstBuildingsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(lstBuildings);

        lstFloors.setModel(floorListModel);
        lstFloors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstFloorsMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(lstFloors);

        lstRooms.setModel(roomDisplayListModel);
        lstRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstRoomsMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(lstRooms);

        lblState.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblState.setText("STATE AND REASON");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstCampusesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCampusesMouseReleased
        SetLocationToCampus();
        RefreshBuildingListModel();
    }//GEN-LAST:event_lstCampusesMouseReleased

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lstBuildingsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstBuildingsMouseReleased
        SetLocationToBuilding();
        RefreshFloorListModel();
    }//GEN-LAST:event_lstBuildingsMouseReleased

    private void lstFloorsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstFloorsMouseReleased
        SetLocationToFloor();
        RefreshRoomListModel();
    }//GEN-LAST:event_lstFloorsMouseReleased

    private void lstRoomsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRoomsMouseReleased
        SetLocationToRoom();
    }//GEN-LAST:event_lstRoomsMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ViewState dialog = new ViewState(new javax.swing.JFrame(), true, Data.LoadState("Current.state", false), "Current.state");
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstBuildings;
    private javax.swing.JList<String> lstCampuses;
    private javax.swing.JList<String> lstFloors;
    private javax.swing.JList<String> lstRooms;
    // End of variables declaration//GEN-END:variables
   
    private void RefreshCampusListModel() {
        campusListModel.clear();
        buildingListModel.clear();
        floorListModel.clear();
        roomListModel.clear();
        roomDisplayListModel.clear();
        
        data.GetCampuses().values().forEach((campus) -> {
            campusListModel.addElement(campus.GetName());
        });
    }

    private void RefreshBuildingListModel() {
        buildingListModel.clear();
        floorListModel.clear();
        roomListModel.clear();
        roomDisplayListModel.clear();
        
        Campus selectedCampus = data.GetCampuses().get(lstCampuses.getSelectedValue());
        
        for(Building building : selectedCampus.GetAllChildren()){
            buildingListModel.addElement(building.GetName());
        }
    }

    private void RefreshFloorListModel() {
        floorListModel.clear();
        roomListModel.clear();
        roomDisplayListModel.clear();
        
        Campus selectedCampus = data.GetCampuses().get(lstCampuses.getSelectedValue());
        Building selectedBuilding = selectedCampus.GetChild(lstBuildings.getSelectedValue());
        
        for(Floor floor : selectedBuilding.GetAllChildren()){
            floorListModel.addElement(floor.GetFloorNumber());
        }
    }

    private void RefreshRoomListModel() {
        roomListModel.clear();
        roomDisplayListModel.clear();
        Campus selectedCampus = data.GetCampuses().get(lstCampuses.getSelectedValue());
        Building selectedBuilding = selectedCampus.GetChild(lstBuildings.getSelectedValue());
        Floor selectedFloor = selectedBuilding.GetChild(lstFloors.getSelectedValue());
        
        for(Room room : selectedFloor.GetAllChildren()){
            roomDisplayListModel.addElement(selectedFloor.GetFloorNumber() + room.GetNumber() + " (" + room.GetRoomType() + ")");
            roomListModel.addElement(room.GetNumber());
        }
    }

    private void SetLocationToCampus() {
        selectedLocation = data.GetCampuses().get(lstCampuses.getSelectedValue());
        UpdateStateLabel();
    }

    private void SetLocationToBuilding() {
        SetLocationToCampus();
        selectedLocation = ((Campus)selectedLocation).GetChild(lstBuildings.getSelectedValue());
        UpdateStateLabel();
    }

    private void SetLocationToFloor() {
        SetLocationToBuilding();
        selectedLocation = ((Building)selectedLocation).GetChild(lstFloors.getSelectedValue());
        UpdateStateLabel();
    }

    private void SetLocationToRoom() {
        SetLocationToFloor();
        selectedLocation = ((Floor)selectedLocation).GetChild((String)roomListModel.getElementAt(lstRooms.getSelectedIndex()));
        UpdateStateLabel();
    }

    private void UpdateStateLabel() {
        if (selectedLocation.GetIsMixedState())
            lblState.setText("Mixed State");
        else {
            if (selectedLocation.GetStateChangeReason().equals(""))
                lblState.setText(selectedLocation.GetState().GetName());
            else
                lblState.setText(selectedLocation.GetState().GetName() + ": "
                        +  selectedLocation.GetStateChangeReason());
        }
    }
}
