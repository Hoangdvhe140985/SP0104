/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import GUI.NewJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author MSI GF63
 */
public class Controller {
    private JButton button1,button2,button3,button4;
    private JTable table;
    int size,select;

    public Controller() {
        NewJFrame f = new NewJFrame();
        f.setVisible(true);
        
        button1 = f.getjButton1();
        button2 = f.getjButton2();
        button3 = f.getjButton3();
        button4 = f.getjButton4();
        table= f.getjTable1();
        
        size = table.getRowCount();
        table.setFocusable(true);
        
        pressF();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressF();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressP();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressN();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressL();
            }
        });
    }
    public void pressF(){
        select = 0;
        setTable();
    }
    
    public void pressL(){
        select = size-1;
        setTable();
    }
    public void pressP(){
        select--;
        if (select < 0) {
            select = size -1;
        }
        setTable();
    }
    public void pressN(){
        select++;
        if (select > size-1) {
            select = 0;
        }
        setTable();
    }
    
    public void setTable(){
        table.setRowSelectionInterval(select, select);
        table.setColumnSelectionInterval(0, 0);
    }
}
