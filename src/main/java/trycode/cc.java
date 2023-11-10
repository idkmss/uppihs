package trycode;

public class cc {
    public String metricx(){
        String a="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"36dp\"\n" +
                "        android:text=\"Metric Converter\"\n" +
                "        android:textColor=\"@android:color/holo_purple\"\n" +
                "        android:textSize=\"34sp\"\n" +
                "        android:textStyle=\"bold|italic\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.512\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/editTextNumber\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"96dp\"\n" +
                "        android:ems=\"10\"\n" +
                "        android:inputType=\"number\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.497\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Enter the value:\"\n" +
                "        android:textColor=\"#2196F3\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/editTextNumber\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.498\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/textView\"\n" +
                "        app:layout_constraintVertical_bias=\"0.428\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView4\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginBottom=\"100dp\"\n" +
                "        android:textSize=\"34sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.498\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/valueOfPounds\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Value is:\"\n" +
                "        android:textColor=\"#F44336\"\n" +
                "        android:textSize=\"20sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/textView4\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumber\"\n" +
                "        app:layout_constraintVertical_bias=\"0.924\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/Button12\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Inch to Centimeter\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button2\"\n" +
                "        app:layout_constraintEnd_toStartOf=\"@+id/button\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.29\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumber\"\n" +
                "        app:layout_constraintVertical_bias=\"0.618\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"72dp\"\n" +
                "        android:layout_marginEnd=\"28dp\"\n" +
                "        android:text=\"Kilometer to Meter\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumber\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginBottom=\"16dp\"\n" +
                "        android:text=\"Fahrenheit to Celsius\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button4\"\n" +
                "        tools:layout_editor_absoluteX=\"22dp\"\n" +
                "        tools:ignore=\"MissingConstraints\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button3\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginTop=\"40dp\"\n" +
                "        android:text=\"Foot to Inches\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/button4\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.582\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/button2\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/button\"\n" +
                "        app:layout_constraintVertical_bias=\"0.111\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button4\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_marginBottom=\"48dp\"\n" +
                "        android:text=\"Liter to Milliliter\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/valueOfPounds\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.507\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/editTextNumber\"\n" +
                "        app:layout_constraintVertical_bias=\"1.0\" />\n" +
                "\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>";
        return a;
    }
    public String metricj(){
        String b="package com.example.kgtopound;\n" +
                "\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import android.annotation.SuppressLint;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.Button;\n" +
                "    import android.widget.EditText;\n" +
                "    import android.widget.TextView;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "        //Declaring Widgets\n" +
                "        EditText editTextNumber;\n" +
                "        TextView textView,textView2, textView4, valueOfPounds;\n" +
                "        Button Button12,Button,Button2,Button3,Button4;\n" +
                "\n" +
                "        @SuppressLint(\"MissingInflatedId\")\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "\n" +
                "            //Instantiating Widgets\n" +
                "\n" +
                "            textView=findViewById(R.id.textView);\n" +
                "            textView2=findViewById(R.id.textView2);\n" +
                "            textView4=findViewById(R.id.textView4);\n" +
                "            valueOfPounds=findViewById(R.id.valueOfPounds);\n" +
                "            editTextNumber=findViewById(R.id.editTextNumber);\n" +
                "            Button12=findViewById(R.id.Button12);\n" +
                "            Button=findViewById(R.id.button);\n" +
                "            Button2=findViewById(R.id.button2);\n" +
                "            Button3=findViewById(R.id.button3);\n" +
                "            Button4=findViewById(R.id.button4);\n" +
                "\n" +
                "            //Adding a click event for button (Executing the convert method when clicked)\n" +
                "            Button12.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                //Calling ConvertFromKiloTo Pounds Method\n" +
                "                    inchtocentimeter();\n" +
                "\n" +
                "                }\n" +
                "            });\n" +
                "            Button.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    //Calling ConvertFromKiloTo Pounds Method\n" +
                "                    KilometerToMeter();\n" +
                "\n" +
                "                }\n" +
                "            });\n" +
                "            Button2.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    //Calling ConvertFromKiloTo Pounds Method\n" +
                "                    FahrenheittoCelsius();\n" +
                "\n" +
                "                }\n" +
                "            });\n" +
                "            Button3.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    //Calling ConvertFromKiloTo Pounds Method\n" +
                "                    foottoinches();\n" +
                "\n" +
                "                }\n" +
                "            });\n" +
                "            Button4.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    //Calling ConvertFromKiloTo Pounds Method\n" +
                "                    litertomilliliter();\n" +
                "\n" +
                "                }\n" +
                "            });\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        private void inchtocentimeter() {\n" +
                "            //This method will convert the  values entered in editText\n" +
                "            //From Kilo to pounds\n" +
                "            String valueEnteredinKILO=editTextNumber.getText().toString();\n" +
                "            //converting  string to number\n" +
                "            double kilo = Double.parseDouble(valueEnteredinKILO);\n" +
                "            //converting kilo to pounds formula\n" +
                "            double pounds=kilo*2.54;\n" +
                "            //Displaying the value resulted in textView\n" +
                "            textView4.setText(\"\"+pounds);\n" +
                "        }\n" +
                "        private void KilometerToMeter() {\n" +
                "            //This method will convert the  values entered in editText\n" +
                "            //From Kilo to pounds\n" +
                "            String valueEnteredinKILO=editTextNumber.getText().toString();\n" +
                "            //converting  string to number\n" +
                "            double kilo = Double.parseDouble(valueEnteredinKILO);\n" +
                "            //converting kilo to pounds formula\n" +
                "            double pounds=kilo*1000;\n" +
                "            //Displaying the value resulted in textView\n" +
                "            textView4.setText(\"\"+pounds);\n" +
                "        }\n" +
                "        private void FahrenheittoCelsius() {\n" +
                "            //This method will convert the  values entered in editText\n" +
                "            //From Kilo to pounds\n" +
                "            String valueEnteredinKILO=editTextNumber.getText().toString();\n" +
                "            //converting  string to number\n" +
                "            double kilo = Double.parseDouble(valueEnteredinKILO);\n" +
                "            //converting kilo to pounds formula\n" +
                "            double pounds=(kilo-32)*5/9;\n" +
                "            //Displaying the value resulted in textView\n" +
                "            textView4.setText(\"\"+pounds);\n" +
                "        }\n" +
                "        private void foottoinches() {\n" +
                "            //This method will convert the  values entered in editText\n" +
                "            //From Kilo to pounds\n" +
                "            String valueEnteredinKILO=editTextNumber.getText().toString();\n" +
                "            //converting  string to number\n" +
                "            double kilo = Double.parseDouble(valueEnteredinKILO);\n" +
                "            //converting kilo to pounds formula\n" +
                "            double pounds=kilo*12;\n" +
                "            //Displaying the value resulted in textView\n" +
                "            textView4.setText(\"\"+pounds);\n" +
                "        }\n" +
                "        private void litertomilliliter() {\n" +
                "            //This method will convert the  values entered in editText\n" +
                "            //From Kilo to pounds\n" +
                "            String valueEnteredinKILO=editTextNumber.getText().toString();\n" +
                "            //converting  string to number\n" +
                "            double kilo = Double.parseDouble(valueEnteredinKILO);\n" +
                "            //converting kilo to pounds formula\n" +
                "            double pounds=kilo*1000;\n" +
                "            //Displaying the value resulted in textView\n" +
                "            textView4.setText(\"\"+pounds);\n" +
                "        }\n" +
                "        }\n" +
                "    ";
        return b;
    }
    public String studinfox() {
        String c = "//use add class\n" +
                "    //activity-main.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:padding=\"10dp\"\n" +
                "    >\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/textView\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Student Information\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/name\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:hint=\"Enter name of the Student:\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:minHeight=\"48dp\"\n" +
                "        android:textColorHint=\"#2196F3\" />\n" +
                "\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/reg\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:hint=\"Enter Register number:\"\n" +
                "        android:inputType=\"number\"\n" +
                "        android:minHeight=\"48dp\"\n" +
                "        android:textColorHint=\"#2196F3\" />\n" +
                "\n" +
                "    <EditText\n" +
                "        android:id=\"@+id/dept\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:hint=\"Enter the department:\"\n" +
                "        android:inputType=\"text\"\n" +
                "        android:minHeight=\"48dp\"\n" +
                "        android:textColorHint=\"#2196F3\" />\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:text=\"Submit\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"0.569\" />\n" +
                "\n" +
                "    </LinearLayout>\n" +
                "    //activity-second.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".Second_Page\"\n" +
                "    android:orientation=\"vertical\"\n" +
                "    android:gravity=\"center\"\n" +
                "    android:padding=\"10dp\">\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/result\"\n" +
                "        android:textSize=\"30sp\"\n" +
                "        android:textStyle=\"bold\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"/>\n" +
                "    </LinearLayout>\n" +
                "    ";
        return c;
    }
    public String studinfoj() {
        String d = "/activity-main.java\n" +
                "\n" +
                "    import androidx.appcompat.app.ActionBar;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import android.content.Intent;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.Button;\n" +
                "    import android.widget.EditText;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "\n" +
                "            /*ActionBar actionBar=getSupportActionBar();\n" +
                "            actionBar.setTitle(\"First Activity\");\n" +
                "            getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
                "            getSupportActionBar().setHomeButtonEnabled(true);*/\n" +
                "\n" +
                "\n" +
                "            EditText Name=findViewById(R.id.name);\n" +
                "            EditText Reg=findViewById(R.id.reg);\n" +
                "            EditText Dept=findViewById(R.id.dept);\n" +
                "\n" +
                "            Button button=findViewById(R.id.button);\n" +
                "\n" +
                "            button.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    String nam =Name.getText().toString();\n" +
                "                    String re =Reg.getText().toString();\n" +
                "                    String dep =Dept.getText().toString();\n" +
                "                    Intent intent =new Intent(MainActivity.this,Second_Page.class);\n" +
                "                    intent.putExtra(\"K1\",nam);\n" +
                "                    intent.putExtra(\"K2\",re);\n" +
                "                    intent.putExtra(\"K3\",dep);\n" +
                "                    startActivity(intent);\n" +
                "                }\n" +
                "            });\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "    // second-page.java\n" +
                "\n" +
                "    import androidx.appcompat.app.ActionBar;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import android.content.Intent;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.widget.TextView;\n" +
                "\n" +
                "    public class Second_Page extends AppCompatActivity {\n" +
                "\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_second_page);\n" +
                "\n" +
                "            /*ActionBar actionBar=getSupportActionBar();\n" +
                "            actionBar.setTitle(\"Second Activity\");\n" +
                "            getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
                "            getSupportActionBar().setHomeButtonEnabled(true);*/\n" +
                "\n" +
                "\n" +
                "            Intent intent=getIntent();\n" +
                "\n" +
                "            TextView textView=findViewById(R.id.result);\n" +
                "\n" +
                "            String name =intent.getStringExtra(\"K1\");\n" +
                "            String reg =intent.getStringExtra(\"K2\");\n" +
                "            String dept =intent.getStringExtra(\"K3\");\n" +
                "\n" +
                "            textView.setText(\"Name:\"+name+\"\n" +
                "Register no.:\"+reg+\"\n" +
                "Department:\"+dept);\n" +
                "\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "    \n";
        return d;
    }
    public String contactx(){
        String e="//activity-main.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <androidx.recyclerview.widget.RecyclerView\n" +
                "        android:id=\"@+id/recyclerViewId\"\n" +
                "        android:layout_width=\"409dp\"\n" +
                "        android:layout_height=\"726dp\"\n" +
                "        android:layout_marginTop=\"4dp\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.0\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        />\n" +
                "\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>    \n" +
                "\n" +
                "    //contact-details.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                "    xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\">\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/imageView\"\n" +
                "        android:layout_width=\"100dp\"\n" +
                "        android:layout_height=\"100dp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.051\"\n" +
                "        app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "        app:layout_constraintTop_toTopOf=\"parent\"\n" +
                "        app:layout_constraintVertical_bias=\"1.0\"\n" +
                "        tools:srcCompat=\"@tools:sample/avatars\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/nameId\"\n" +
                "        android:layout_width=\"265dp\"\n" +
                "        android:layout_height=\"32dp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"name\"\n" +
                "        android:textSize=\"25sp\"\n" +
                "        app:layout_constraintBottom_toTopOf=\"@+id/numberId\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.534\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/imageView\"\n" +
                "        app:layout_constraintTop_toTopOf=\"@+id/imageView\"\n" +
                "        app:layout_constraintVertical_bias=\"0.047\" />\n" +
                "\n" +
                "    <TextView\n" +
                "        android:id=\"@+id/numberId\"\n" +
                "        android:layout_width=\"269dp\"\n" +
                "        android:layout_height=\"30dp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"number\"\n" +
                "        android:textSize=\"25sp\"\n" +
                "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
                "        app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "        app:layout_constraintHorizontal_bias=\"0.57\"\n" +
                "        app:layout_constraintStart_toEndOf=\"@+id/imageView\"\n" +
                "        app:layout_constraintTop_toBottomOf=\"@+id/nameId\"\n" +
                "        app:layout_constraintVertical_bias=\"0.1\" />\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>";
        return e;
    }
    public String contactj(){
        String f="//main-activiy.xml\n" +
                "\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import androidx.recyclerview.widget.LinearLayoutManager;\n" +
                "    import androidx.recyclerview.widget.RecyclerView;\n" +
                "    import android.os.Bundle;\n" +
                "    import java.util.Arrays;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "        RecyclerView recyclerView;\n" +
                "        ContactAdapter contactAdapter;\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "            recyclerView=findViewById(R.id.recyclerViewId);\n" +
                "            contactAdapter=new ContactAdapter(\n" +
                "                    this,\n" +
                "                    Arrays.asList(\"Tom\", \"Jerry\", \"Mickey\"),\n" +
                "                    Arrays.asList(\"123\",\"456\",\"789\"),\n" +
                "                    new int[]{R.drawable.p1,R.drawable.p2,R.drawable.p3}\n" +
                "            );\n" +
                "            recyclerView.setAdapter(contactAdapter);\n" +
                "            recyclerView.setLayoutManager(new LinearLayoutManager(this));\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //contact-adapter.java\n" +
                "    import android.content.Context;\n" +
                "    import android.view.LayoutInflater;\n" +
                "    import android.view.View;\n" +
                "    import android.view.ViewGroup;\n" +
                "    import androidx.annotation.NonNull;\n" +
                "    import androidx.recyclerview.widget.RecyclerView;\n" +
                "    import java.util.List;\n" +
                "\n" +
                "    public class ContactAdapter  extends RecyclerView.Adapter<ContactViewHolder> {\n" +
                "        List<String> nameList;\n" +
                "        List<String> numberList;\n" +
                "        LayoutInflater layoutInflater;\n" +
                "        int images[];\n" +
                "        ContactAdapter(Context context,List<String> nameList,List<String> numberList,int images[]){\n" +
                "            this.nameList=nameList;\n" +
                "            this.numberList=numberList;\n" +
                "            this.images=images;\n" +
                "            layoutInflater=LayoutInflater.from(context);\n" +
                "        }\n" +
                "        @NonNull\n" +
                "        @Override\n" +
                "        public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){\n" +
                "            View view=layoutInflater.inflate(R.layout.contact_details,parent, false);\n" +
                "            return new ContactViewHolder(view,numberList);\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onBindViewHolder(@NonNull ContactViewHolder holder,int position){\n" +
                "            holder.nameTextView.setText(nameList.get(position));\n" +
                "            holder.numberTextView.setText(numberList.get(position));\n" +
                "            holder.imageView.setImageResource(images[position]);\n" +
                "        }\n" +
                "        public int getItemCount(){return nameList.size();}\n" +
                "    }\n" +
                "\n" +
                "    //contactviewholder.java\n" +
                "\n" +
                "    import android.content.Context;\n" +
                "    import android.content.Intent;\n" +
                "    import android.net.Uri;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.ImageView;\n" +
                "    import android.widget.TextView;\n" +
                "    import androidx.annotation.NonNull;\n" +
                "    import androidx.recyclerview.widget.RecyclerView;\n" +
                "    import java.util.List;\n" +
                "\n" +
                "    public class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {\n" +
                "        public ImageView imageView;\n" +
                "        public TextView nameTextView,numberTextView;\n" +
                "        List<String> numberList;\n" +
                "        public ContactViewHolder(@NonNull View itemView, List<String> numberList){\n" +
                "            super(itemView);\n" +
                "            itemView.setOnClickListener(this);\n" +
                "            imageView=itemView.findViewById(R.id.imageView);\n" +
                "            nameTextView=itemView.findViewById(R.id.nameId);\n" +
                "            numberTextView=itemView.findViewById(R.id.numberId);\n" +
                "            this.numberList=numberList;\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onClick(View view){\n" +
                "            int position=getLayoutPosition();\n" +
                "            String element=numberList.get(position);\n" +
                "            Context context=view.getContext();\n" +
                "            context.startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(\"tel:\"+element)));\n" +
                "        }\n" +
                "    }";
        return f;}
    public String musicx() {
        String f = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <RelativeLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".MainActivity\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txtVw1\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Now Playing: \"\n" +
                "            android:layout_marginTop=\"30dp\"\n" +
                "            android:textAppearance=\"?android:attr/textAppearance\"\n" +
                "            />\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txtSname\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignBaseline=\"@+id/txtVw1\"\n" +
                "            android:layout_toRightOf=\"@+id/txtVw1\"\n" +
                "            android:text=\"TextView\"\n" +
                "            />\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/btnBackward\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignParentBottom=\"true\"\n" +
                "            android:layout_marginTop=\"44dp\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            android:src=\"@android:drawable/ic_media_rew\"\n" +
                "            />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/btnPlay\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignTop=\"@+id/btnBackward\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            android:layout_toRightOf=\"@+id/btnBackward\"\n" +
                "            android:src=\"@android:drawable/ic_media_play\" />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/btnPause\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignTop=\"@+id/btnPlay\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            android:layout_toRightOf=\"@+id/btnPlay\"\n" +
                "            android:src=\"@android:drawable/ic_media_pause\" />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/btnForward\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignTop=\"@+id/btnPause\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            android:layout_toRightOf=\"@+id/btnPause\"\n" +
                "            android:src=\"@android:drawable/ic_media_ff\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txtStartTime\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignTop=\"@+id/sBar\"\n" +
                "            android:text=\"0 min, 0 sec\"\n" +
                "            />\n" +
                "\n" +
                "        <SeekBar\n" +
                "            android:id=\"@+id/sBar\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_above=\"@+id/btnBackward\"\n" +
                "            android:layout_toLeftOf=\"@+id/txtSongTime\"\n" +
                "            android:layout_toRightOf=\"@+id/txtStartTime\" />\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txtSongTime\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_toRightOf=\"@+id/btnForward\"\n" +
                "            android:layout_alignTop=\"@+id/sBar\"\n" +
                "            android:text=\"0 min, 0 sec \"\n" +
                "            />\n" +
                "\n" +
                "    </RelativeLayout>";
        return f;
    }
    public String musicj() {
        String f = "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "    import android.media.MediaPlayer;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.os.Handler;\n" +
                "    import android.provider.ContactsContract;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.ImageButton;\n" +
                "    import android.widget.SeekBar;\n" +
                "    import android.widget.TextView;\n" +
                "    import android.widget.Toast;\n" +
                "\n" +
                "    import java.util.concurrent.TimeUnit;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "        private ImageButton forwardbtn, backwardbtn, pausebtn, playbtn;\n" +
                "        private MediaPlayer mPlayer;\n" +
                "        private TextView songName, startTime, songTime;\n" +
                "        private SeekBar songPrgs;\n" +
                "        private static int oTime=0,sTime=0,eTime=0,fTime=5000,bTime=5000;\n" +
                "        private Handler hdlr=new Handler();\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "            backwardbtn=(ImageButton)findViewById(R.id.btnBackward);\n" +
                "            forwardbtn=(ImageButton)findViewById(R.id.btnForward);\n" +
                "            playbtn=(ImageButton)findViewById(R.id.btnPlay);\n" +
                "            pausebtn=(ImageButton)findViewById(R.id.btnPause);\n" +
                "            songName=(TextView)findViewById(R.id.txtSname);\n" +
                "            startTime=(TextView)findViewById(R.id.txtStartTime);\n" +
                "            songTime=(TextView)findViewById(R.id.txtSongTime);\n" +
                "            songName.setText(\"sng.mp3\");\n" +
                "            mPlayer=MediaPlayer.create(this,R.raw.sng);\n" +
                "            songPrgs=(SeekBar)findViewById(R.id.sBar);\n" +
                "            songPrgs.setClickable(false);\n" +
                "            songPrgs.setEnabled(false);\n" +
                "            playbtn.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    Toast.makeText(MainActivity.this,\"Playing Audio!\",Toast.LENGTH_SHORT).show();\n" +
                "                    mPlayer.start();\n" +
                "                    eTime=mPlayer.getDuration();\n" +
                "                    sTime=mPlayer.getCurrentPosition();\n" +
                "                    if(oTime==0){\n" +
                "                        songPrgs.setMax(eTime);\n" +
                "                        oTime=1;\n" +
                "                    }\n" +
                "                    songTime.setText(String.format(\"%d min,%d sec\", TimeUnit.MILLISECONDS.toMinutes(eTime),\n" +
                "                            TimeUnit.MILLISECONDS.toSeconds(eTime)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(eTime))));\n" +
                "                    startTime.setText(String.format(\"%d min,%d sec\", TimeUnit.MILLISECONDS.toMinutes(sTime),\n" +
                "                            TimeUnit.MILLISECONDS.toSeconds(sTime)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(sTime))));\n" +
                "                    songPrgs.setProgress(sTime);\n" +
                "                    hdlr.postDelayed(UpdateSongTime,100);\n" +
                "                    pausebtn.setEnabled(true);\n" +
                "                    playbtn.setEnabled(false);\n" +
                "                }\n" +
                "            });\n" +
                "            pausebtn.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    mPlayer.pause();\n" +
                "                    pausebtn.setEnabled(false);\n" +
                "                    playbtn.setEnabled(true);\n" +
                "                    Toast.makeText(getApplicationContext(),\"Pausing Audio!\",Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "            });\n" +
                "            forwardbtn.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    if((sTime+fTime)<=eTime)\n" +
                "                    {\n" +
                "                        sTime=sTime+fTime;\n" +
                "                        mPlayer.seekTo(sTime);\n" +
                "                    }\n" +
                "                    else\n" +
                "                    {\n" +
                "                    Toast.makeText(getApplicationContext(),\"Cannot jump forward 5 seconds!\",Toast.LENGTH_SHORT).show();\n" +
                "                    }\n" +
                "                    if(!playbtn.isEnabled()){\n" +
                "                        playbtn.setEnabled(true);\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "            backwardbtn.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    if((sTime-bTime)>0)\n" +
                "                    {\n" +
                "                        sTime=sTime-bTime;\n" +
                "                        mPlayer.seekTo(sTime);\n" +
                "                    }\n" +
                "                    else\n" +
                "                    {\n" +
                "                        Toast.makeText(getApplicationContext(),\"Cannot jump backward 5 seconds!\",Toast.LENGTH_SHORT).show();\n" +
                "                    }\n" +
                "                    if(!playbtn.isEnabled()){\n" +
                "                        playbtn.setEnabled(true);\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "        }\n" +
                "        private Runnable UpdateSongTime=new Runnable() {\n" +
                "            @Override\n" +
                "            public void run() {\n" +
                "                sTime=mPlayer.getCurrentPosition();\n" +
                "                startTime.setText(String.format(\"%d min,%d sec\", TimeUnit.MILLISECONDS.toMinutes(sTime),\n" +
                "                        TimeUnit.MILLISECONDS.toSeconds(sTime)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(sTime))));\n" +
                "                songPrgs.setProgress(sTime);\n" +
                "                hdlr.postDelayed(this,100);\n" +
                "          }\n" +
                "        };\n" +
                "    }";
        return f;
    }
    public String smsx() {
        String f = "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <RelativeLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:paddingBottom=\"16dp\"\n" +
                "        android:paddingLeft=\"16dp\"\n" +
                "        android:paddingRight=\"16dp\"\n" +
                "        android:paddingTop=\"16dp\"\n" +
                "        tools:context=\".MainActivity\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/txtVw1\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"ComposeTo: \"\n" +
                "            android:layout_marginTop=\"30dp\"\n" +
                "            android:textAppearance=\"?android:attr/textAppearanceMedium\"\n" +
                "            />\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/Cname\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignBaseline=\"@+id/txtVw1\"\n" +
                "            android:layout_marginLeft=\"10dp\"\n" +
                "            android:layout_toRightOf=\"@+id/txtVw1\"\n" +
                "            android:hint=\"Contact Number\"\n" +
                "            />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/contactbook\"\n" +
                "            android:layout_width=\"49dp\"\n" +
                "            android:layout_height=\"54dp\"\n" +
                "            android:layout_marginLeft=\"10dp\"\n" +
                "            android:layout_marginTop=\"25dp\"\n" +
                "            android:layout_toRightOf=\"@+id/Cname\"\n" +
                "            android:src=\"@drawable/ic_baseline_import_contacts_24\" />\n" +
                "        <EditText\n" +
                "            android:id=\"@+id/sms\"\n" +
                "            android:layout_width=\"300dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_alignParentBottom=\"true\"\n" +
                "            android:layout_alignBottom=\"@+id/txtVw1\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            />\n" +
                "\n" +
                "        <ImageButton\n" +
                "            android:id=\"@+id/send\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"56dp\"\n" +
                "            android:layout_alignTop=\"@+id/sms\"\n" +
                "            android:layout_marginLeft=\"20dp\"\n" +
                "            android:layout_marginTop=\"0dp\"\n" +
                "            android:layout_toRightOf=\"@+id/sms\"\n" +
                "            android:src=\"@drawable/ic_baseline_send_24\" />\n" +
                "\n" +
                "    </RelativeLayout>\n" +
                "    \n";
        return f;
    }
    public String smsj() {
        String f = "    import androidx.annotation.NonNull;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import androidx.core.app.ActivityCompat;\n" +
                "    import androidx.core.content.ContextCompat;\n" +
                "\n" +
                "    import android.app.Activity;\n" +
                "    import android.content.Intent;\n" +
                "    import android.content.pm.PackageManager;\n" +
                "    import android.database.Cursor;\n" +
                "    import android.net.Uri;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.provider.ContactsContract;\n" +
                "    import android.telephony.SmsManager;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.EditText;\n" +
                "    import android.widget.ImageButton;\n" +
                "    import android.widget.TextView;\n" +
                "    import android.widget.Toast;\n" +
                "    import android.Manifest;\n" +
                "\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "\n" +
                "        EditText msg_send;\n" +
                "        EditText cn;\n" +
                "        TextView tv;\n" +
                "        ImageButton open, send_msg;\n" +
                "        private static final int CONTACT_PERMISSION_CODE=1;\n" +
                "        private static final int CONTACT_PICK_CODE=2;\n" +
                "\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "            cn=findViewById(R.id.Cname);\n" +
                "            msg_send=findViewById(R.id.sms);\n" +
                "            send_msg=findViewById(R.id.send);\n" +
                "            tv=findViewById(R.id.sms);\n" +
                "            open=findViewById(R.id.contactbook);\n" +
                "            open.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    if(checkContactPermission()){\n" +
                "                        pickContactIntent();\n" +
                "                    }\n" +
                "                    else{\n" +
                "                        requestContactPermission();\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "            send_msg.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    if (ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.SEND_SMS)== PackageManager.PERMISSION_GRANTED){\n" +
                "                        sendMessage();\n" +
                "                    }\n" +
                "                    else{\n" +
                "                        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS},100);\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "        }\n" +
                "        private void sendMessage(){\n" +
                "            String phoneno=cn.getText().toString().trim();\n" +
                "            String message=msg_send.getText().toString().trim();\n" +
                "            if(!phoneno.equals(\"\") && !message.equals(\"\")){\n" +
                "                SmsManager smsManager = SmsManager.getDefault();\n" +
                "                smsManager.sendTextMessage(phoneno,null,message,null,null);\n" +
                "                Toast.makeText(this, \"SMS SENT SUCESSFULLY!\", Toast.LENGTH_SHORT).show();\n" +
                "            }else{\n" +
                "                Toast.makeText(this, \"Type some message!\", Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        }\n" +
                "        private boolean checkContactPermission(){\n" +
                "            boolean result=ContextCompat.checkSelfPermission(this,\n" +
                "                    Manifest.permission.READ_CONTACTS)==(PackageManager.PERMISSION_GRANTED);\n" +
                "            return result;\n" +
                "        }\n" +
                "        private void requestContactPermission(){\n" +
                "            String[] permissions={Manifest.permission.READ_CONTACTS};\n" +
                "            ActivityCompat.requestPermissions(this,permissions,CONTACT_PERMISSION_CODE);\n" +
                "        }\n" +
                "        private void pickContactIntent(){\n" +
                "            Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);\n" +
                "            startActivityForResult(intent,CONTACT_PICK_CODE);\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,@NonNull int[] grantResults){\n" +
                "            super.onRequestPermissionsResult(requestCode,permissions,grantResults);\n" +
                "            if(requestCode==CONTACT_PERMISSION_CODE){\n" +
                "                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){\n" +
                "                    pickContactIntent();\n" +
                "                }\n" +
                "                else{\n" +
                "                    Toast.makeText(this,\"Permission Denied\",Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "            }\n" +
                "            if(requestCode==100 && grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){\n" +
                "                sendMessage();\n" +
                "            }else{\n" +
                "                Toast.makeText(this,\"Permission Denied\",Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        }\n" +
                "        @Override\n" +
                "        protected void onActivityResult(int requestCode,int resultCode,@NonNull Intent data){\n" +
                "            super.onActivityResult(requestCode,resultCode,data);\n" +
                "            if(requestCode==RESULT_OK){\n" +
                "                switch (requestCode){\n" +
                "                    case CONTACT_PICK_CODE:\n" +
                "                        contactPicked (data);\n" +
                "                        break;\n" +
                "                }\n" +
                "            }\n" +
                "            else{\n" +
                "                Toast.makeText(this ,\"Failed to Pick Contact\",Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        }\n" +
                "        private void contactPicked(Intent data){\n" +
                "            Cursor cursor=null;\n" +
                "            try{\n" +
                "                String phoneNo =null;\n" +
                "                Uri uri =data.getData();\n" +
                "                cursor= getContentResolver().query(uri,null,null,null,null);\n" +
                "                cursor.moveToFirst();\n" +
                "                int phoneIndex=cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);\n" +
                "                phoneNo=cursor.getString(phoneIndex);\n" +
                "                cn.setText(phoneNo);\n" +
                "            }catch (Exception e){\n" +
                "                e.printStackTrace();\n" +
                "           }\n" +
                "        }\n" +
                "    }";
        return f;
    }
    public String imagedownx() {
        String f = "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <RelativeLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".MainActivity\">\n" +
                "\n" +
                "    <Button\n" +
                "        android:id=\"@+id/button2\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentEnd=\"true\"\n" +
                "        android:layout_alignParentBottom=\"true\"\n" +
                "        android:layout_marginEnd=\"144dp\"\n" +
                "        android:layout_marginBottom=\"547dp\"\n" +
                "        android:gravity=\"center\"\n" +
                "        android:text=\"Download\"\n" +
                "        tools:layout_editor_absoluteX=\"158dp\"\n" +
                "        tools:layout_editor_absoluteY=\"82dp\"\n" +
                "        />\n" +
                "\n" +
                "        <ImageView\n" +
                "            android:id=\"@+id/imageView\"\n" +
                "            android:layout_width=\"383dp\"\n" +
                "            android:layout_height=\"479dp\"\n" +
                "            android:layout_alignParentBottom=\"true\"\n" +
                "            android:layout_alignParentEnd=\"true\"\n" +
                "            android:layout_marginBottom=\"41dp\"\n" +
                "            android:layout_marginEnd=\"9dp\"\n" +
                "            tools:srcCompat=\"@tools:sample/backgrounds/scenic\"\n" +
                "            android:src=\"@drawable/bailey\"\n" +
                "            />\n" +
                "\n" +
                "    </RelativeLayout>";
        return f;
    }
    public String imagedownj() {
        String f = "    import  androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "    import android.app.ProgressDialog;\n" +
                "    import android.graphics.Bitmap;\n" +
                "    import android.graphics.BitmapFactory;\n" +
                "    import android.os.AsyncTask;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.Button;\n" +
                "    import android.widget.ImageView;\n" +
                "\n" +
                "    import java.io.IOException;\n" +
                "    import java.io.InputStream;\n" +
                "    import java.net.HttpURLConnection;\n" +
                "    import java.net.URL;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "        URL ImageUrl =null;\n" +
                "        InputStream is = null;\n" +
                "        Bitmap bmImg=null;\n" +
                "        ImageView image;\n" +
                "        ProgressDialog p;\n" +
                "        Button download;\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "\n" +
                "            download = findViewById(R.id.button2);\n" +
                "            image=findViewById(R.id.imageView);\n" +
                "            download.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    AsyncTaskExample asyncTask=new AsyncTaskExample();\n" +
                "                    asyncTask.execute(\"https://karunya.edu/sites/default/files/img/images/37,P20Years,P20KITS,P203.jpg.pagespeed.ce.CT73xojF3W.jpg\");\n" +
                "                }\n" +
                "            });\n" +
                "        }\n" +
                "        private class AsyncTaskExample extends AsyncTask<String,String,Bitmap>{\n" +
                "            @Override\n" +
                "                    protected void onPreExecute(){\n" +
                "                super.onPreExecute();\n" +
                "                p=new ProgressDialog(MainActivity.this);\n" +
                "                p.setMessage(\"Please wait.... It is downloading\");\n" +
                "                p.setIndeterminate(false);\n" +
                "                p.setCancelable(false);\n" +
                "                p.show();\n" +
                "            }\n" +
                "            @Override\n" +
                "            protected Bitmap doInBackground(String... strings){\n" +
                "                try{\n" +
                "                    ImageUrl = new URL(strings[0]);\n" +
                "                    HttpURLConnection conn =(HttpURLConnection) ImageUrl.openConnection();\n" +
                "                    conn.setDoInput(true);\n" +
                "                    conn.connect();\n" +
                "                    is=conn.getInputStream();\n" +
                "                    BitmapFactory.Options options=new BitmapFactory.Options();\n" +
                "                    options.inPreferredConfig=Bitmap.Config.RGB_565;\n" +
                "                    bmImg=BitmapFactory.decodeStream(is,null,options);\n" +
                "                }\n" +
                "                catch (IOException e){\n" +
                "                    e.printStackTrace();\n" +
                "                }\n" +
                "                return bmImg;\n" +
                "            }\n" +
                "            @Override\n" +
                "            protected void onPostExecute(Bitmap bitmap){\n" +
                "                super.onPostExecute(bitmap);\n" +
                "                if(image!=null){\n" +
                "                    p.hide();\n" +
                "                    image.setImageBitmap(bitmap);\n" +
                "                }else {\n" +
                "                    p.show();\n" +
                "                }\n" +
                "           }\n" +
                "        }\n" +
                "    }";
        return f;
    }
    public String swipex() {
        String f = "    //main-activity.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".MainActivity\">\n" +
                "\n" +
                "        <com.google.android.material.tabs.TabLayout\n" +
                "            android:id=\"@+id/tabLayout\"\n" +
                "            android:layout_width=\"409dp\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:layout_marginStart=\"1dp\"\n" +
                "            android:layout_marginEnd=\"1dp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "\n" +
                "        <androidx.viewpager2.widget.ViewPager2\n" +
                "            android:id=\"@+id/viewPagerId\"\n" +
                "            android:layout_width=\"409dp\"\n" +
                "            android:layout_height=\"681dp\"\n" +
                "            android:layout_marginStart=\"1dp\"\n" +
                "            android:layout_marginTop=\"1dp\"\n" +
                "            android:layout_marginEnd=\"1dp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toBottomOf=\"@+id/tabLayout\" />\n" +
                "\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
                "\n" +
                "    //fragment1.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".FirstFragment\">\n" +
                "\n" +
                "        <!-- TODO: Update blank fragment layout -->\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:text=\"First Fragment\" />\n" +
                "\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "    //fragment2.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <FrameLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".SecondFragment\">\n" +
                "\n" +
                "        <!-- TODO: Update blank fragment layout -->\n" +
                "        <TextView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:text=\"Second Fragment\" />\n" +
                "\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "    //fragment3.xml\n" +
                "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:id=\"@+id/frameLayout\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".ThirdFragment\">\n" +
                "\n" +
                "        <!-- TODO: Update blank fragment layout -->\n" +
                "\n" +
                "\n" +
                "        <androidx.recyclerview.widget.RecyclerView\n" +
                "            android:id=\"@+id/recyclerView\"\n" +
                "            android:layout_width=\"409dp\"\n" +
                "            android:layout_height=\"729dp\"\n" +
                "            android:layout_marginStart=\"1dp\"\n" +
                "            android:layout_marginTop=\"1dp\"\n" +
                "            android:layout_marginEnd=\"1dp\"\n" +
                "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
                "            app:layout_constraintStart_toStartOf=\"parent\"\n" +
                "            app:layout_constraintTop_toTopOf=\"parent\" />\n" +
                "    </androidx.constraintlayout.widget.ConstraintLayout>";
        return f;
    }
    public String swipej() {
        String f = "    //main-activity.java\n" +
                "    import androidx.annotation.NonNull;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import androidx.fragment.app.Fragment;\n" +
                "    import androidx.viewpager2.widget.ViewPager2;\n" +
                "\n" +
                "    import android.os.Bundle;\n" +
                "\n" +
                "    import com.google.android.material.tabs.TabLayout;\n" +
                "    import com.google.android.material.tabs.TabLayoutMediator;\n" +
                "\n" +
                "    import java.util.ArrayList;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity implements TabLayoutMediator.TabConfigurationStrategy {\n" +
                "\n" +
                "        ViewPager2 viewPager2;\n" +
                "        TabLayout tabLayout;\n" +
                "        ArrayList<String> tabTitles;\n" +
                "\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "            viewPager2 = findViewById(R.id.viewPagerId);\n" +
                "            tabLayout = findViewById(R.id.tabLayout);\n" +
                "            ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(this);\n" +
                "            ArrayList<Fragment> fragments = new ArrayList<>();\n" +
                "            fragments.add(new FirstFragment());\n" +
                "            fragments.add(new SecondFragment());\n" +
                "            fragments.add(new ThirdFragment());\n" +
                "            viewPager2Adapter.setFragments(fragments);\n" +
                "            viewPager2.setAdapter(viewPager2Adapter);\n" +
                "            tabTitles = new ArrayList<>();\n" +
                "            tabTitles.add(\"First\");\n" +
                "            tabTitles.add(\"Second\");\n" +
                "            tabTitles.add(\"Third\");\n" +
                "            new TabLayoutMediator(tabLayout,viewPager2, this).attach();\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {\n" +
                "            tab.setText(tabTitles.get(position));\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //firstfragment.java\n" +
                "\n" +
                "    import android.os.Bundle;\n" +
                "\n" +
                "    import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "    import android.view.LayoutInflater;\n" +
                "    import android.view.View;\n" +
                "    import android.view.ViewGroup;\n" +
                "\n" +
                "\n" +
                "    public class FirstFragment extends Fragment {\n" +
                "\n" +
                "\n" +
                "\n" +
                "        @Override\n" +
                "        public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                                Bundle savedInstanceState) {\n" +
                "            // Inflate the layout for this fragment\n" +
                "            return inflater.inflate(R.layout.fragment_first, container, false);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //secondfragment.java\n" +
                "\n" +
                "    import android.os.Bundle;\n" +
                "\n" +
                "    import androidx.fragment.app.Fragment;\n" +
                "\n" +
                "    import android.view.LayoutInflater;\n" +
                "    import android.view.View;\n" +
                "    import android.view.ViewGroup;\n" +
                "\n" +
                "    public class SecondFragment extends Fragment {\n" +
                "\n" +
                "        @Override\n" +
                "        public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                                Bundle savedInstanceState) {\n" +
                "            // Inflate the layout for this fragment\n" +
                "            return inflater.inflate(R.layout.fragment_second, container, false);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //thirdfragment.java\n" +
                "\n" +
                "    import android.os.Bundle;\n" +
                "\n" +
                "    import androidx.fragment.app.Fragment;\n" +
                "    import androidx.recyclerview.widget.LinearLayoutManager;\n" +
                "    import androidx.recyclerview.widget.RecyclerView;\n" +
                "\n" +
                "    import android.view.LayoutInflater;\n" +
                "    import android.view.View;\n" +
                "    import android.view.ViewGroup;\n" +
                "\n" +
                "\n" +
                "    public class ThirdFragment extends Fragment {\n" +
                "\n" +
                "        @Override\n" +
                "        public View onCreateView(LayoutInflater inflater, ViewGroup container,\n" +
                "                                Bundle savedInstanceState) {\n" +
                "            // Inflate the layout for this fragment\n" +
                "            return inflater.inflate(R.layout.fragment_third, container, false);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    //viewpager2adapter.java\n" +
                "    import androidx.annotation.NonNull;\n" +
                "    import androidx.fragment.app.Fragment;\n" +
                "    import androidx.fragment.app.FragmentActivity;\n" +
                "    import androidx.viewpager2.adapter.FragmentStateAdapter;\n" +
                "\n" +
                "    import java.util.ArrayList;\n" +
                "\n" +
                "    public class ViewPager2Adapter extends FragmentStateAdapter {\n" +
                "\n" +
                "        private ArrayList<Fragment> fragments;\n" +
                "\n" +
                "        public void setFragments(ArrayList<Fragment> fragments) {\n" +
                "            this.fragments = fragments;\n" +
                "        }\n" +
                "\n" +
                "        public ViewPager2Adapter(@NonNull FragmentActivity fragmentActivity) {\n" +
                "            super(fragmentActivity);\n" +
                "        }\n" +
                "\n" +
                "        @NonNull\n" +
                "        @Override\n" +
                "        public Fragment createFragment(int position) {\n" +
                "            return fragments.get(position);\n" +
                "        }\n" +
                "\n" +
                "        @Override\n" +
                "        public int getItemCount() {\n" +
                "            return fragments.size();\n" +
                "        }\n" +
                "    }";
        return f;
    }
    public String firebasex() {
        String f = "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <LinearLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".MainActivity\"\n" +
                "        android:orientation=\"vertical\">\n" +
                "        <ImageView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:id=\"@+id/imageId\"/>\n" +
                "        <Button\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:text=\"Click me\"\n" +
                "            android:id=\"@+id/buttonId\"\n" +
                "            android:onClick=\"doProcess\"/>\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/textId\"\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            />\n" +
                "    </LinearLayout>";
        return f;
    }
    public String firebasej() {
        String f = "    import androidx.annotation.NonNull;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "\n" +
                "    import android.Manifest;\n" +
                "    import android.content.Intent;\n" +
                "    import android.content.pm.PackageManager;\n" +
                "    import android.graphics.Bitmap;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.provider.MediaStore;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.ImageView;\n" +
                "    import android.widget.TextView;\n" +
                "    import android.widget.Toast;\n" +
                "\n" +
                "    import com.google.android.gms.tasks.OnFailureListener;\n" +
                "    import com.google.android.gms.tasks.OnSuccessListener;\n" +
                "    import com.google.android.gms.tasks.Task;\n" +
                "    import com.google.firebase.ml.vision.FirebaseVision;\n" +
                "    import com.google.firebase.ml.vision.common.FirebaseVisionImage;\n" +
                "    import com.google.firebase.ml.vision.text.FirebaseVisionText;\n" +
                "    import com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer;\n" +
                "\n" +
                "    import org.jetbrains.annotations.Nullable;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity {\n" +
                "        ImageView imageView;\n" +
                "        TextView textView;\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "            imageView=findViewById(R.id.imageId);\n" +
                "            textView=findViewById(R.id.textId);\n" +
                "            if(checkSelfPermission(Manifest.permission.CAMERA)!= PackageManager.PERMISSION_GRANTED){\n" +
                "                requestPermissions(new String[]{Manifest.permission.CAMERA},101);\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        public void doProcess(View view){\n" +
                "            Intent intent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);\n" +
                "            startActivityForResult(intent,101);\n" +
                "        }\n" +
                "        @Override\n" +
                "        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){\n" +
                "            super.onActivityResult(requestCode,resultCode,data);\n" +
                "            Bundle bundle = data.getExtras();\n" +
                "            Bitmap bitmap=(Bitmap) bundle.get(\"data\");\n" +
                "            imageView.setImageBitmap(bitmap);\n" +
                "            FirebaseVisionImage firebaseVisionImage =FirebaseVisionImage.fromBitmap(bitmap);\n" +
                "            FirebaseVision firebaseVision=FirebaseVision.getInstance();\n" +
                "            FirebaseVisionTextRecognizer firebaseVisionTextRecognizer=firebaseVision.getOnDeviceTextRecognizer();\n" +
                "            Task<FirebaseVisionText> task=firebaseVisionTextRecognizer.processImage(firebaseVisionImage);\n" +
                "            task.addOnSuccessListener(new OnSuccessListener<FirebaseVisionText>() {\n" +
                "                @Override\n" +
                "                public void onSuccess(FirebaseVisionText firebaseVisionText) {\n" +
                "            String s =firebaseVisionText.getText();\n" +
                "            textView.setText(s);\n" +
                "                }\n" +
                "            });\n" +
                "            task.addOnFailureListener(new OnFailureListener() {\n" +
                "                @Override\n" +
                "                public void onFailure(@NonNull Exception e) {\n" +
                "                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG);\n" +
                "                }\n" +
                "         });\n" +
                "        }\n" +
                "    }";
        return f;
    }
    public String locationx() {
        String f = "    <?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "    <RelativeLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        xmlns:tools=\"http://schemas android.com/tools\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        tools:context=\".MainActivity\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"vertical\">\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"Country\"\n" +
                "                android:textColor=\"#000\"\n" +
                "                android:textSize=\"20sp\"\n" +
                "                android:id=\"@+id/editCountry\"/>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"State\"\n" +
                "                android:textColor=\"#000\"\n" +
                "                android:textSize=\"20sp\"\n" +
                "                android:id=\"@+id/editState\"/>\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"City\"\n" +
                "                android:textColor=\"#000\"\n" +
                "                android:textSize=\"20sp\"\n" +
                "                android:id=\"@+id/editCity\"/>\n" +
                "\n" +
                "            <TextView\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:hint=\"Pincode\"\n" +
                "                android:textColor=\"#000\"\n" +
                "                android:textSize=\"20sp\"\n" +
                "                android:id=\"@+id/editPincode\"/>\n" +
                "\n" +
                "            <Button\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:text=\"Get Location\"\n" +
                "                android:id=\"@+id/btnShowLocation\"/>\n" +
                "        </LinearLayout>\n" +
                "    </RelativeLayout>";
        return f;
    }
    public String locationj() {
        String f = "    import androidx.annotation.NonNull;\n" +
                "    import androidx.appcompat.app.AppCompatActivity;\n" +
                "    import androidx.core.app.ActivityCompat;\n" +
                "    import androidx.core.content.ContextCompat;\n" +
                "\n" +
                "    import android.Manifest;\n" +
                "    import android.app.Activity;\n" +
                "    import android.content.Context;\n" +
                "    import android.content.pm.PackageManager;\n" +
                "    import android.location.Address;\n" +
                "    import android.location.Geocoder;\n" +
                "    import android.location.Location;\n" +
                "    import android.location.LocationListener;\n" +
                "    import android.location.LocationManager;\n" +
                "    import android.os.Bundle;\n" +
                "    import android.util.Log;\n" +
                "    import android.view.View;\n" +
                "    import android.widget.Button;\n" +
                "    import android.widget.TextView;\n" +
                "    import android.widget.Toast;\n" +
                "    import java.util.List;\n" +
                "    import java.util.Locale;\n" +
                "\n" +
                "    public class MainActivity extends AppCompatActivity implements LocationListener {\n" +
                "\n" +
                "        Button btnShowLocation;\n" +
                "        LocationManager locationManager;\n" +
                "        private double latitude;\n" +
                "        private double longitude;\n" +
                "        TextView edit_Country,edit_State,edit_City,edit_Pincode;\n" +
                "\n" +
                "        @Override\n" +
                "        protected void onCreate(Bundle savedInstanceState) {\n" +
                "            super.onCreate(savedInstanceState);\n" +
                "            setContentView(R.layout.activity_main);\n" +
                "\n" +
                "            edit_Country=findViewById(R.id.editCountry);\n" +
                "            edit_State=findViewById(R.id.editState);\n" +
                "            edit_City=findViewById(R.id.editCity);\n" +
                "            edit_Pincode=findViewById(R.id.editPincode);\n" +
                "            btnShowLocation=findViewById(R.id.btnShowLocation);\n" +
                "\n" +
                "            btnShowLocation.setOnClickListener(new View.OnClickListener() {\n" +
                "                @Override\n" +
                "                public void onClick(View view) {\n" +
                "                    if(ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED){\n" +
                "                        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);\n" +
                "                    }else{\n" +
                "                        detectCurrentLocation();\n" +
                "                    }\n" +
                "                }\n" +
                "            });\n" +
                "        }\n" +
                "        private void detectCurrentLocation(){\n" +
                "            Toast.makeText(this,\"Getting your current location\",Toast.LENGTH_SHORT).show();\n" +
                "            locationManager=(LocationManager) getSystemService(Context.LOCATION_SERVICE);\n" +
                "            if ((ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {\n" +
                "                return;\n" +
                "            }\n" +
                "            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,this);\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onLocationChanged(Location location) {\n" +
                "        latitude=location.getLatitude();\n" +
                "        longitude=location.getLongitude();\n" +
                "        findAddress();\n" +
                "        }\n" +
                "        private void findAddress(){\n" +
                "            Geocoder geocoder;\n" +
                "            List<Address> addresses;\n" +
                "            geocoder=new Geocoder(this, Locale.getDefault());\n" +
                "            try{\n" +
                "                addresses=geocoder.getFromLocation(latitude,longitude,1);\n" +
                "                String country=addresses.get(0).getCountryName();\n" +
                "                String state=addresses.get(0).getAdminArea();\n" +
                "                String city=addresses.get(0).getLocality();\n" +
                "                String Pincode=addresses.get(0).getPostalCode();\n" +
                "\n" +
                "                edit_Country.setText(country);\n" +
                "                edit_State.setText(state);\n" +
                "                edit_City.setText(city);\n" +
                "                edit_Pincode.setText(Pincode);\n" +
                "                Log.d(\"City\",city);\n" +
                "                Log.d(\"State\",state);\n" +
                "                Log.d(\"Country\",country);\n" +
                "                Log.d(\"Pincode\",String.valueOf(Pincode));\n" +
                "            }catch (Exception e){\n" +
                "                Toast.makeText(this,\"\"+e.getMessage(),Toast.LENGTH_SHORT).show();\n" +
                "            }\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onStatusChanged(String provider,int status,Bundle extras){\n" +
                "\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onProviderEnabled(String provider){\n" +
                "\n" +
                "        }\n" +
                "        public void onProviderDisabled(String provider){\n" +
                "            Toast.makeText(this,\"Please turn on Location\",Toast.LENGTH_SHORT).show();\n" +
                "        }\n" +
                "        @Override\n" +
                "        public void onRequestPermissionsResult(int requestCode,@NonNull String[] permissions,@NonNull int[] grantResults){\n" +
                "            super.onRequestPermissionsResult(requestCode,permissions,grantResults);\n" +
                "\n" +
                "            if(requestCode==1){\n" +
                "                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){\n" +
                "                    detectCurrentLocation();\n" +
                "                }else{\n" +
                "                    Toast.makeText(this,\"Permission Denied\",Toast.LENGTH_SHORT).show();\n" +
                "                }\n" +
                "           }\n" +
                "        }\n" +
                "    }";
        return f;
    }
}
