package mcm.edu.ph.narca_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display;
        display =  findViewById(R.id.displayText);

        int birthYear = 2002;
        int birthMonth = 03;
        int birthDay = 12;
        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 28;
        int ageInYears, ageInMonths, ageInDays;

        if(birthMonth > currentMonth){
            birthMonth +=12;
            currentYear-= 1;

        }
        if(birthDay > currentDay){
            birthMonth += 12;
            currentDay  -= 1;
        }
        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My exact age is "+ String.valueOf(ageInYears)+"Years"+String.valueOf(ageInMonths)
                +"\nMonths"+String.valueOf(ageInDays)+"Days");


    }
}