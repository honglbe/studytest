package com.studytest.studytest;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Vector;

public class TableFrame extends JFrame {
    public TableFrame(){
        super();
        setTitle("表格");
        setBounds(100,100,240,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] columnNames = {"A", "B"};
        String[][] tableValues = {{"A1", "B1"}, {"A2", "B2"}, {"A3", "B3"}, {"A4", "B4"}, {"A5", "B5"}};
        JTable table = new JTable(tableValues, columnNames);
        JScrollPane jScrollPane = new JScrollPane(table);
        getContentPane().add(jScrollPane, BorderLayout.CENTER);
    }

    public TableFrame(String title){
        super();
        setTitle(title);
        setBounds(100,100,240,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Vector<String> columnNameV = new Vector<>();
        columnNameV.add("A");
        columnNameV.add("B");
        Vector<Vector<String>> tableValueV = new Vector<>();
        for (int row = 1; row < 6; row++) {
            Vector<String> rowV = new Vector<>();
            rowV.add("A" + row);
            rowV.add("B" + row);
            tableValueV.add(rowV);
        }
        JTable table = new JTable(tableValueV, columnNameV);
        getContentPane().add(table, BorderLayout.CENTER);
        JTableHeader tableHeader = table.getTableHeader();
        getContentPane().add(tableHeader, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        TableFrame tableFrame = new TableFrame("表格展示");
        tableFrame.setVisible(true);
    }
}
