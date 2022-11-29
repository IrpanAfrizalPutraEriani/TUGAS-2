package BIODATA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataBank {
    private JTextField TextNomor;
    private JComboBox PilihanAtm;
    private JComboBox PilihanBank;
    private JTextField textPengguna;
    private JButton buttonSave;
    private JButton buttonFoto;
    private JTextArea CATATAN;
    private JLabel Nomor;
    private JLabel Jenis;
    private JLabel Bank;
    private JLabel Pemilik;
    private JPanel rootPanel;
    private JLabel Foto;

    public String NamaFile;



    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("FILE DATA BANK", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("BERHASIL MENIMPAN FILE");
        } catch (IOException ex) {
            System.out.println("ERRORRRRR");
            ex.printStackTrace();
        }
    }
    public DataBank() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nomor = TextNomor.getText();
                String Jenis = (String) PilihanAtm.getSelectedItem();
                String Bank = (String) PilihanBank.getSelectedItem();
                String Pemilik = textPengguna.getText();

                DataBank2 dataBank2 = new DataBank2();
                dataBank2.setNomor(Nomor);
                dataBank2.setJenis(Jenis);
                dataBank2.setBank(Bank);
                dataBank2.setPemilik(Pemilik);

                String hasil = "Save Data!!!!" + "\nNo Kartu = " + Nomor + "\nJenis ATM = " + Jenis + "\nBank = " + Bank + "\nNama Pemilik = " + Pemilik + "\nNama File Gambar = " + NamaFile ;

                CATATAN.append(hasil);

                try {
                    insertingDataToFile(hasil + "\n\n");
                    NamaFile = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        buttonFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser InsertFoto = new JFileChooser();

                int showOpenDialogue = InsertFoto.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    NamaFile = InsertFoto.getSelectedFile().getName();

                    File SelectedFoto = InsertFoto.getSelectedFile();
                    String Insertimage = ((File) SelectedFoto).getAbsolutePath();

                    ImageIcon FOTO = new ImageIcon(Insertimage);
                    Image image = FOTO.getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH);

                    Foto.setIcon(new ImageIcon(image));
                }
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
