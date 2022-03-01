package com.example.graficas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

public class GraphicActivity extends AppCompatActivity {

    private PieChart pieChart;
    private BarChart barChart;
    //datos eje x
    private String[] meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo"};
    // datos eje y
    private int[] sale = new int[]{25,20,38,10,15};
    //colores de grafica
    private int[] colors = new int[]{Color.BLACK,Color.RED,Color.GREEN,Color.BLUE,Color.LTGRAY};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);
    }

    //Recibe la grafica, la descripción, color de texto, de fondo y tiempo de animación
    private Chart getSameCart(Chart chart, String descripcion, int textColor, int background, int animateY) {
        chart.getDescription().setText("descripcion");
        chart.getDescription().setTextSize(15);
        chart.setBackgroundColor(background);
        chart.animateY(animateY);

        return chart;
    }

    private void leyenda(Chart chart) {
        Legend leyenda = chart.getLegend();
        leyenda.setForm(Legend.LegendForm.SQUARE);
        leyenda.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        ArrayList<LegendEntry> entradas = new ArrayList<>();
        for (int i = 0; i < meses.length; i++) {
            LegendEntry entry = new LegendEntry();
            entry.formColor = colors[i];
            entry.label = meses[i];
            entradas.add(entry);
        }

    }

    private ArrayList<BarEntry>getBarEntries() {
        ArrayList<BarEntry> entries = new ArrayList<>();
        for (int i = 0; i < sale.length; i++) {
            entries.add(new BarEntry(i,sale[i]));
        }
        return entries;
    }

    private void axisX(XAxis axis) {
        axis.setGranularityEnabled(true);
        axis.setPosition(XAxis.XAxisPosition.BOTTOM);
        axis.setValueFormatter(new IndexAxisValueFormatter(meses));
    }

    private void axisY(YAxis axis) {
        axis.setSpaceTop(30);
        axis.setAxisMinimum(0);
    }

    public void createCharts() {
        barChart = (BarChart) getSameCart(barChart, "Series",Color.RED, Color.CYAN,3000);
        barChart.setDrawGridBackground(true);
        barChart.setDrawBarShadow(true);

        axisX(barChart.getXAxis());
        axisY(barChart.getAxisLeft());
    }


}