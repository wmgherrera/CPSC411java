package com.herrera.william.gridlayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DemoGridLayout extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GridLayout layout = new GridLayout(this);

        layout.setColumnCount(25);
        layout.setRowCount(11);
        layout.setBackgroundColor(Color.BLACK);

        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.setMargins(1, 1, 1, 1);
        layout.setLayoutParams(params);

        // Row 1
        createWidgetAtCellWithColor(layout, "1", 0, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "Rules void hello1(int hour)", 0, 1, 24, 1f);

        // Row 2
        createWidgetAtCellWithColor(layout, "2", 1, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "properties", 1, 1, 4, 1f);
        createWidgetAtCell(layout, "name", 1, 5, 10, 1f);
        createWidgetAtCell(layout, "Day Hour Classification", 1, 15, 10, 1f);

        // Row 3
        createWidgetAtCellWithColor(layout, "3", 2, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "properties", 2, 1, 4, 1f);
        createWidgetAtCell(layout, "category", 2, 5, 10, 1f);
        createWidgetAtCell(layout, "Day and Time", 2, 15, 10, 1f);

        // Row 4
        createWidgetAtCellWithColor(layout, "4", 3, 0, 1, 0f, "#9c908f");
        createWidgetAtCellWithColor(layout, "Rule", 3, 1, 4, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "C1", 3, 5, 10, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "A1", 3, 15, 10, 1f, "#26fcf9");

        // Row 5
        createWidgetAtCellWithColor(layout, "5", 4, 0, 1, 0f, "#9c908f");
        createWidgetAtCellWithColor(layout, "", 4, 1, 4, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "min<=hour && hour<=max", 4, 5, 10, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "System.out.println(greeting + , World!)", 4, 15, 10, 1f, "#26fcf9");

        // Row 6
        createWidgetAtCellWithColor(layout, "6", 5, 0, 1, 0f, "#9c908f");
        createWidgetAtCellWithColor(layout, "", 5, 1, 4, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "int min", 5, 5, 5, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "int max", 5, 10, 5, 1f, "#26fcf9");
        createWidgetAtCellWithColor(layout, "String Greeting", 5, 15, 10, 1f, "#26fcf9");

        // Row 7
        createWidgetAtCellWithColor(layout, "7", 6, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "Rule", 6, 1, 4, 1f);
        createWidgetAtCellWithColor(layout, "From", 6, 5, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "To", 6, 10, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "Greeting", 6, 15, 10, 1f, "#fcb858");

        // Row 8
        createWidgetAtCellWithColor(layout, "8", 7, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "R10", 7, 1, 4, 1f);
        createWidgetAtCellWithColor(layout, "0", 7, 5, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "11", 7, 10, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "Good Morning", 7, 15, 10, 1f, "#fcb858");

        // Row 9
        createWidgetAtCellWithColor(layout, "9", 8, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "R20", 8, 1, 4, 1f);
        createWidgetAtCellWithColor(layout, "12", 8, 5, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "17", 8, 10, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "Good Afternoon", 8, 15, 10, 1f, "#fcb858");

        // Row 10
        createWidgetAtCellWithColor(layout, "10", 9, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "R30", 9, 1, 4, 1f);
        createWidgetAtCellWithColor(layout, "18", 9, 5, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "21", 9, 10, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "Good Evening", 9, 15, 10, 1f, "#fcb858");

        // Row 11
        createWidgetAtCellWithColor(layout, "11", 10, 0, 1, 0f, "#9c908f");
        createWidgetAtCell(layout, "R40", 10, 1, 4, 1f);
        createWidgetAtCellWithColor(layout, "22", 10, 5, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "23", 10, 10, 5, 1f, "#fcfc7e");
        createWidgetAtCellWithColor(layout, "Good Night", 10, 15, 10, 1f, "#fcb858");

        setContentView(layout);


    }

    private void createWidgetAtCell(GridLayout g, String s, int row, int col, int size, float weight)
    {
        TextView tv = new TextView(this);
        tv.setText(s);
        tv.setBackgroundColor(Color.WHITE);
        GridLayout.Spec rowSpec = GridLayout.spec(row);
        GridLayout.Spec colSpec = GridLayout.spec(col, size, weight);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        g.addView(tv);

    }

    private void createWidgetAtCellWithColor(GridLayout g, String s, int row, int col, int size, float weight, String hexColor)
    {
        TextView tv = new TextView(this);
        tv.setText(s);
        int myColor = Color.parseColor(hexColor);
        tv.setBackgroundColor(myColor);
        GridLayout.Spec rowSpec = GridLayout.spec(row);
        GridLayout.Spec colSpec = GridLayout.spec(col, size, weight);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        params.setMargins(1, 1, 1, 1);
        tv.setLayoutParams(params);
        g.addView(tv);

    }

}


