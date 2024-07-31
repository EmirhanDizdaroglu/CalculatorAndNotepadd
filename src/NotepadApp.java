import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class NotepadApp {
    JFrame SHAPE;
    JPanel PANO;
    JTextArea NOTEPAD;
    JButton KEY;
    JButton KEY2;

    public static void main(String[] args) {//MAİN
        new NotepadApp();
    }

    public NotepadApp() {
        SHAPE = new JFrame("NOTEPAD-EMIRHAN DIZDAROGLU");
        PANO = new JPanel();
        PANO.setBackground(Color.RED);
        SHAPE.add(PANO);
        SHAPE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SHAPE.setSize(650, 400);
        KEY = new JButton("OPEN");
        KEY2 = new JButton("SAVE");
        NOTEPAD = new JTextArea(20, 40);
        NOTEPAD.setForeground(Color.gray);
        NOTEPAD.setBackground(Color.yellow);
        JScrollPane scrollPane = new JScrollPane(NOTEPAD);
        PANO.add(scrollPane, BorderLayout.CENTER);
        PANO.add(KEY, BorderLayout.CENTER);
        PANO.add(KEY2, BorderLayout.CENTER);
        KEY2.addActionListener(new ButtonTwoActionListener());
        KEY.addActionListener(new ButtonOneActionListener());
        SHAPE.setVisible(true);
    }

    class ButtonOneActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "Text Files", "txt");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    NOTEPAD.setText("");
                    File f = chooser.getSelectedFile();
                    FileInputStream fs = new FileInputStream(f);
                    InputStreamReader i = new InputStreamReader(fs, StandardCharsets.UTF_8);
                    BufferedReader reader = new BufferedReader(i);
                    String line;
                    while ((line = reader.readLine()) != null) {
                        NOTEPAD.append(line + "\n");
                    }
                    reader.close();
                }
            } catch (FileNotFoundException x) {
                NOTEPAD.setText("This is not a txt file");
            } catch (IOException ex) {
                System.out.println("");
            }
        }
    }

    class ButtonTwoActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FileDialog fDialog = new FileDialog(SHAPE, "Save", FileDialog.SAVE);
            fDialog.setVisible(true);
            Path path = Paths.get(fDialog.getDirectory() + fDialog.getFile());
            try {
                Files.createFile(path);
            } catch (Exception x) {
                System.out.println("");
            }
            try {
                FileWriter w = new FileWriter(String.valueOf(path));
                String[] stringArr = NOTEPAD.getText().split("\n");
                for (int i = 0; i < stringArr.length; i++) {
                    w.write(stringArr[i]);
                    w.write(System.getProperty("////n////"));
                }
                w.close();
            } catch (Exception x) {
                System.out.println("");
            }


        }
    }
}

