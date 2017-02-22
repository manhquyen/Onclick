package com.example.mypc.manhquyen.onclick;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// tao cua so
        setContentView(R.layout.activity_main);// doc file xml de tim textview va button roi nem vao cua so tren
        // Bước 0: tìm đối tượng nguồn
        name = (TextView) findViewById(R.id.textview);
        Button button = (Button) findViewById(R.id.button);//R dai dien cho toan bo project
        // Bước 1: Viết lớp xử lý sự kiện
        ButtonLinten btListener= new ButtonLinten();
        button.setOnClickListener(btListener);

    }
        //Bước 2 : Tạo đối tượng nghe
        //ButtonListener btListener = new ButtonListener();
        // ẩn tên đối tượng nghe
        //Bước 3: Đăng ký đối tượng nghe
        //zbutton.setOnClickListener(new ButtonListener()); // khi có sự kiện trên nút button thì sẽ nhờ btListener xử lý
        //ẩn tên lớp khai báo đối tượng nghe
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,"Button Ngày giờ",Toast.LENGTH_LONG).show();


                char a = 'a';
                Calendar time = Calendar.getInstance();
                int h = time.get(Calendar.HOUR_OF_DAY);
                int m = time.get(Calendar.MINUTE);
                int d = time.get(Calendar.DATE);
                int mon = time.get(Calendar.MONTH);
                int mon1 = mon + 1;
                int y = time.get(Calendar.YEAR);
                String str = "bay gio  la " + h + " gio " + m + " phut " + "ngay " + d + " thang " + mon1 + " nam " + y;
                // char c = Calendar.get(Calendar.DATE);
                name.setText(str);
                Toast.makeText(MainActivity.this, "Button ngay gio ", Toast.LENGTH_LONG).show();
                Log.d("mylog", "Button ngay gio"); // test nut bam

            } // end Onclick
        } // end of class   (Listener)
        );// truyền vào đố tượng nghe */
        //end of setOnClickListener
     // end of onCreate
    //bước 1 : Viết lớp xử lý suwj kiện
     class ButtonLinten implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            //Toast.makeText(MainActivity.this,"Button Ngày giờ",Toast.LENGTH_LONG).show();

            char a = 'a';
            Calendar time = Calendar.getInstance();
            int h = time.get(Calendar.HOUR_OF_DAY);
            int m = time.get(Calendar.MINUTE);
            int d = time.get(Calendar.DATE);
            int mon= time.get(Calendar.MONTH);
            int mon1=mon+1;
            int y= time.get(Calendar.YEAR);
            String str="bay gio  la " +h+" gio "+m+" phut " + "ngay "+d+ " thang "+mon1+" nam "+y ;
            // char c = Calendar.get(Calendar.DATE);
            name.setText(str);
            Toast.makeText(MainActivity.this, "Button ngay gio ", Toast.LENGTH_LONG).show();
            Log.d("mylog", "Button ngay gio"); // test nut bam


        }
    }
}
   // public void btProcess (View v) // ham xu ly button trong xml