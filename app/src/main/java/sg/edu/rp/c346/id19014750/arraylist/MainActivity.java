package sg.edu.rp.c346.id19014750.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        //q2(b)
        fruits.add(3, "durian");

        //q2(c)
        String theFruit = fruits.get(1);

        //q2(d)
        fruits.remove(0);

        //q2(e) - size() gives the number of elements in the ArrayList (use - 1 to get the last index of the element)
        fruits.set(fruits.size() - 1, "dragon fruit");

        String strText = "Fruits\n";
        strText += "===============================\n";

        for(int i = 0; 1 < fruits.size(); i++){
            strText += fruits.get(i) + "\n";
        }

        tv.setText(strText);

    }
}