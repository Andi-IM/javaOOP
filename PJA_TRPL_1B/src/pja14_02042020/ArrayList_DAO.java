/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pja14_02042020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Andi
 ArrayList_DAO berfungsi untuk menghandle fungsi-fungsi utama program ini.
 ArrayLIstHandler adalah pusat aksi dari program ini.
 */
public class ArrayList_DAO extends ArrayListModel implements ArrayListInterface{
   ArrayList<ArrayListModel> AL = new ArrayList<>();
   
   public void Insert() {         // using JTextField to Insert Data
        JTextField noKTP = new JTextField();
        JTextField name = new JTextField();
        JTextField phone = new JTextField();
        JTextField address = new JTextField();
        JTextField disease = new JTextField();
        JTextField Status = new JTextField();
        
        Object[] message = {
            "No. KTP :", noKTP,
            "Nama    :", name,
            "No HP   :", phone,
            "Alamat  :", address,
            "Gejala  :", disease,
            "Status  :", Status
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Insert Data", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            AL.add(new ArrayListModel(noKTP.getText(), name.getText(),  phone.getText(), 
                    address.getText(), disease.getText(), Status.getText()));
        }
    }
   
    //------------------------------------------
    // [EXPERIMENTAL AND NOT USE IN THIS PROGRAM]
    @Override
    public int menu(int pilihan) {
        System.out.println("+==============================+");
        System.out.println("|====== List Data Pasien ======|");
        System.out.println("+==============================+");
        System.out.println("|Menu -------------------------|");
        System.out.println("| 1. Tambahkan data            |");
        System.out.println("| 2. Lihat data                |");
        System.out.println("| 3. Hapus data                |");
        System.out.println("| 4. Update data               |");
        System.out.println("| 5. Cetak iterasi             |");
        System.out.println("+==============================+");
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //------------------------------------------
    private JList<ArrayListModel> list;
    @Override
    public void display() {
        JFrame frame = new JFrame("Dislay all");
        DefaultListModel<ArrayListModel> listModel = new DefaultListModel<>();
        JLabel label = new JLabel();
        
        if(!AL.isEmpty()){
        
        Iterator itr = AL.iterator();                       // using iterator
         
         while(itr.hasNext()){
            ArrayListModel asl = (ArrayListModel)itr.next();
            System.out.println(
                    "\nNomor Pasien : "+(AL.indexOf(asl)+1)+
                    "\nNo Ktp       : "+asl.getNoKtp()+" "+
                    "\nNama         : "+asl.getNama()+" "+
                    "\nNo. HP       : "+asl.getNoHp()+" "+
                    "\nAlamat       : "+asl.getAlamat()+" "+
                    "\nGejala       : "+asl.getGejala()+" "+
                    "\nStatus       : "+asl.getStatus());  } //EXPERIMENTAL 
              
//                for (ArrayListModel ald: AL ) { // create the model and elements          
//                    listModel.addElement(ald);
//                    System.out.println(listModel.get(AL.indexOf(ald)).getNama());
//                    System.out.println(ald);
//                }
//                
//                list = new JList<ArrayListData>(listModel);
//                list.addListSelectionListener(new ListSelectionListener() {
//                    @Override
//                    public void valueChanged(ListSelectionEvent e) {
//                        if (!e.getValueIsAdjusting()) {
//                            final List<ArrayListData> selectedValuesList = list.getSelectedValuesList();
//                            System.out.println(selectedValuesList);
//                        }
//                    }
//                });
//                
//                frame.add(new JScrollPane(list));
//                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                frame.setTitle("Display");
//                frame.setSize(400,400);
//                frame.setLocationRelativeTo(null);
//                frame.setVisible(true);
            }else{    
             System.out.println("--kosong--");
            }}   
    
    
    @Override
    public void find() {
        int key=0;
        JTextField findData = new JTextField();
        Object[] message = {
            "Nomor Pasien : ", findData, "Jumlah data saat ini : "+AL.size()
        };
        
        if(!AL.isEmpty()){
        int option = JOptionPane.showConfirmDialog(null, message, "Find Data", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (option == JOptionPane.OK_OPTION) {
                
                key = Integer.parseInt(findData.getText())-1;
                System.out.println("Console input : "+key);
                
                Iterator itr = AL.iterator();
                
                    while(itr.hasNext()){
                        ArrayListModel asl = (ArrayListModel) itr.next();
                            if (AL.indexOf(asl) == (key)) {
                            break;}
                            Object[] pesan = {
                                "Data pasien no "+(key+1)+" tidak ditemukan!"
                            };
                            JOptionPane.showMessageDialog(null, pesan,"Data pasien "+(key+1),JOptionPane.INFORMATION_MESSAGE);
                    }
                        try {
                        Object[] pesan = {
                        "Nomor Pasien : \t"+(AL.indexOf(key)+2),
                        "Nomor KTP    : \t"+AL.get(key).getNoKtp(),
                        "Nama         : \t"+AL.get(key).getNama(),
                        "No. HP       : \t"+AL.get(key).getNoHp(),
                        "Alamat       : \t"+AL.get(key).getAlamat(),
                        "Gejala       : \t"+AL.get(key).getGejala(),
                        "Status       : \t"+AL.get(key).getStatus()
                        };
                        JOptionPane.showMessageDialog(null, pesan,"Data pasien "+(key+1),JOptionPane.INFORMATION_MESSAGE);
                        }catch (ArrayIndexOutOfBoundsException e) {System.out.println("Salah woe!!");}
            }
        }else{    
            String alert = "Data belum ada!";
            JOptionPane.showInternalMessageDialog(findData, alert);}
        
    }

    @Override
    public void delete() {
        String dialog = null;
        int key = 0;
        Object[] pesan = {"Masukkan nomor pasien: (Data saat ini : "+AL.size()+")"};
        if(!AL.isEmpty()){
        
        dialog = JOptionPane.showInputDialog(null,pesan,"Delete",JOptionPane.INFORMATION_MESSAGE);
        key = Integer.parseInt(dialog)-1;
        
        Iterator itr = AL.iterator();
        while(itr.hasNext()){
            ArrayListModel asl = (ArrayListModel) itr.next();
                if (AL.indexOf(asl) == (key)) {
                break;}
                Object[] ps = {
                    "Data pasien no "+(key+1)+" tidak ditemukan!"
                };
                JOptionPane.showMessageDialog(null, ps,"Data pasien "+(key+1),JOptionPane.INFORMATION_MESSAGE);
            }
        int option = JOptionPane.showConfirmDialog(null,"Yakin mau dihapus?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                AL.remove(key);
                JOptionPane.showMessageDialog(null, "Terhapus!");
            }
        
        }else{    
            String alert = "Data belum ada!";
            JOptionPane.showInternalMessageDialog(null, alert);}
        System.out.println(key);
    }

    @Override
    public void update() {
        String dialog = null;
        int key = 0;
        
        Object[] pesan = {"Masukkan nomor pasien: (Data saat ini : "+AL.size()+")"};
        if(!AL.isEmpty()){
        
            dialog = JOptionPane.showInputDialog(null,pesan,"Update",JOptionPane.INFORMATION_MESSAGE);
            key = Integer.parseInt(dialog)-1;

            Iterator itr = AL.iterator();
            while(itr.hasNext()){
                ArrayListModel asl = (ArrayListModel) itr.next();
                    if (AL.indexOf(asl) == (key)) {
                    break;}
                    Object[] ps = {
                        "Data pasien no "+(key+1)+" tidak ditemukan!"
                    };
                    JOptionPane.showMessageDialog(null, ps,"Data pasien "+(key+1),JOptionPane.INFORMATION_MESSAGE);
                }
            int option = JOptionPane.showConfirmDialog(null,"Yakin mau ubah?","Alert",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    JTextField noKTP = new JTextField();
                    JTextField name = new JTextField();
                    JTextField phone = new JTextField();
                    JTextField address = new JTextField();
                    JTextField disease = new JTextField();
                    JTextField Status = new JTextField();

                    Object[] message = {
                        "No. KTP :", noKTP,
                        "Nama    :", name,
                        "No HP   :", phone,
                        "Alamat  :", address,
                        "Gejala  :", disease,
                        "Status  :", Status
                    };

                int optIns = JOptionPane.showConfirmDialog(null, message, "Insert Data", JOptionPane.OK_CANCEL_OPTION);
                if (optIns == JOptionPane.OK_OPTION) {
                    AL.set(key, new ArrayListModel(noKTP.getText(), name.getText(),  phone.getText(), 
                            address.getText(), disease.getText(), Status.getText()));
                    JOptionPane.showMessageDialog(null, "Data Telah di update!");}
                }
        }else{    
            String alert = "Data belum ada!";
            JOptionPane.showInternalMessageDialog(null, alert);}
    }

    private void add(JScrollPane jScrollPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

