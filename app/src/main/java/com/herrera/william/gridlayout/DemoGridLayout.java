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
        createWidgetAtCell(layout, "1", 0, 0, 1, 0f);
        createWidgetAtCell(layout, "Rules void hello1(int hour)", 0, 1, 24, 1f);

        // Row 2
        createWidgetAtCell(layout, "2", 1, 0, 1, 0f);
        createWidgetAtCell(layout, "properties", 1, 1, 4, 1f);
        createWidgetAtCell(layout, "name", 1, 5, 10, 1f);
        createWidgetAtCell(layout, "Day Hour Classification", 1, 15, 10, 1f);

        // Row 3
        createWidgetAtCell(layout, "3", 2, 0, 1, 0f);
        createWidgetAtCell(layout, "properties", 2, 1, 4, 1f);
        createWidgetAtCell(layout, "category", 2, 5, 10, 1f);
        createWidgetAtCell(layout, "Day and Time", 2, 15, 10, 1f);

        // Row 4
        createWidgetAtCell(layout, "4", 3, 0, 1, 0f);
        createWidgetAtCell(layout, "Rule", 3, 1, 4, 1f);
        createWidgetAtCell(layout, "C1", 3, 5, 10, 1f);
        createWidgetAtCell(layout, "A1", 3, 15, 10, 1f);

        // Row 5
        createWidgetAtCell(layout, "5", 4, 0, 1, 0f);
        createWidgetAtCell(layout, "", 4, 1, 4, 1f);
        createWidgetAtCell(layout, "min<=hour && hour<=max", 4, 5, 10, 1f);
        createWidgetAtCell(layout, "System.out.println(greeting + , World!)", 4, 15, 10, 1f);

        // Row 6
        createWidgetAtCell(layout, "6", 5, 0, 1, 0f);
        createWidgetAtCell(layout, "", 5, 1, 4, 1f);
        createWidgetAtCell(layout, "int min", 5, 5, 5, 1f);
        createWidgetAtCell(layout, "int max", 5, 10, 5, 1f);
        createWidgetAtCell(layout, "String Greeting", 5, 15, 10, 1f);

        // Row 7
        createWidgetAtCell(layout, "7", 6, 0, 1, 0f);
        createWidgetAtCell(layout, "Rule", 6, 1, 4, 1f);
        createWidgetAtCell(layout, "From", 6, 5, 5, 1f);
        createWidgetAtCell(layout, "To", 6, 10, 5, 1f);
        createWidgetAtCell(layout, "Greeting", 6, 15, 10, 1f);

        // Row 8
        createWidgetAtCell(layout, "8", 7, 0, 1, 0f);
        createWidgetAtCell(layout, "R10", 7, 1, 4, 1f);
        createWidgetAtCell(layout, "0", 7, 5, 5, 1f);
        createWidgetAtCell(layout, "11", 7, 10, 5, 1f);
        createWidgetAtCell(layout, "Good Morning", 7, 15, 10, 1f);

        // Row 9
        createWidgetAtCell(layout, "9", 8, 0, 1, 0f);
        createWidgetAtCell(layout, "R20", 8, 1, 4, 1f);
        createWidgetAtCell(layout, "12", 8, 5, 5, 1f);
        createWidgetAtCell(layout, "17", 8, 10, 5, 1f);
        createWidgetAtCell(layout, "Good Afternoon", 8, 15, 10, 1f);

        // Row 10
        createWidgetAtCell(layout, "10", 9, 0, 1, 0f);
        createWidgetAtCell(layout, "R30", 9, 1, 4, 1f);
        createWidgetAtCell(layout, "18", 9, 5, 5, 1f);
        createWidgetAtCell(layout, "21", 9, 10, 5, 1f);
        createWidgetAtCell(layout, "Good Evening", 9, 15, 10, 1f);

        // Row 11
        createWidgetAtCell(layout, "11", 10, 0, 1, 0f);
        createWidgetAtCell(layout, "R40", 10, 1, 4, 1f);
        createWidgetAtCell(layout, "22", 10, 5, 5, 1f);
        createWidgetAtCell(layout, "23", 10, 10, 5, 1f);
        createWidgetAtCell(layout, "Good Night", 10, 15, 10, 1f);

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

}


