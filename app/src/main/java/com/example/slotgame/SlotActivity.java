package com.example.slotgame;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Looper;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.Timer;
        import java.util.TimerTask;

public class SlotActivity<b> extends AppCompatActivity {

    private static int i = 0; int j = 0; int k = 0; int l = 0;
    private static int a; int b; int c;
    Timer timer =  null;
    Timer timer2 = null;
    Timer timer3 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slot);

        TextView textView4 = (TextView) findViewById(R.id.count);
        textView4.setText(String.valueOf(l));




        //左のリール
        final TextView textView = (TextView) findViewById(R.id.slotroll1);
        final Button button = (Button) findViewById(R.id.slotbutton1);
        textView.setText(String.valueOf(i));
        textView.setText(String.valueOf(i)); // i の値を表示する
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer == null){
                    timer = new Timer();}
                else{
                    timer = null;
                    timer = new Timer();}
                textAnimation(textView, 0, 10, 70, 10); // i を１増やす

            }

        });
        final Button button2 = (Button) findViewById(R.id.stopbutton1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();

            }

        });
        a = i;


        //真ん中のリール
        final TextView textView2 = (TextView) findViewById(R.id.slotroll2);
        final Button button3 = (Button) findViewById(R.id.slotbutton2);
        textView2.setText(String.valueOf(j));
        textView2.setText(String.valueOf(j)); // j の値を表示する
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer2 == null){
                    timer2 = new Timer();}
                else{
                    timer2 = null;
                    timer2 = new Timer();}

                textAnimation2(textView2, 0, 10, 100, 10); // i を１増やす

            }

        });
        final Button button4 = (Button) findViewById(R.id.stopbutton2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer2.cancel();

            }

        });
        b = j;



        //右のリール
        final TextView textView3 = (TextView) findViewById(R.id.slotroll3);
        final Button button5 = (Button) findViewById(R.id.slotbutton3);
        textView3.setText(String.valueOf(k));
        textView3.setText(String.valueOf(k)); // j の値を表示する
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timer3 == null){
                    timer3 = new Timer();}
                else{
                    timer3 = null;
                    timer3 = new Timer();}

                textAnimation3(textView3, 0, 10, 90, 10); // i を１増やす

            }

        });
        final Button button6 = (Button) findViewById(R.id.stopbutton3);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer3.cancel();

            }

        });
        c = k;

        if((a == b) && (b == c)){
            l++;
        }

    }


    //左のリールを動かす
    /**
     * start: アニメーション開始時の数値
     * end: アニメーション終了時の数値
     * duration: アニメーション表示期間
     * period: 更新時間
     */
    private void textAnimation(final TextView textView, final int start, final int end, int duration, final long period) {
        final int blockValue = (int) ((end - start) * period / duration);

        final Handler handler = new Handler(Looper.getMainLooper());
        // TextView animationText = this.findViewById(R.id.animationText);
        timer.schedule(new TimerTask() {
            int value = start;

            @Override
            public void run() {
                // handlerを使って処理をキューイングする
                if (value < end) {
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });
                    value += blockValue;

                } else {
                    value = 0;
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });


                    //value = end ;
                    //timer.cancel();
                }




            }
        },  0, period);
    }

    //真ん中のリールを動かす
    /**
     * start: アニメーション開始時の数値
     * end: アニメーション終了時の数値
     * duration: アニメーション表示期間
     * period: 更新時間
     */
    private void textAnimation2(final TextView textView, final int start, final int end, int duration, final long period) {
        final int blockValue = (int) ((end - start) * period / duration);

        final Handler handler = new Handler(Looper.getMainLooper());
        // TextView animationText = this.findViewById(R.id.animationText);
        timer2.schedule(new TimerTask() {
            int value = start;

            @Override
            public void run() {
                // handlerを使って処理をキューイングする
                if (value < end) {
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });
                    value += blockValue;

                } else {
                    value = 0;
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });


                    //value = end ;
                    //timer.cancel();
                }




            }
        },  0, period);
    }


    private void textAnimation3(final TextView textView, final int start, final int end, int duration, final long period) {
        final int blockValue = (int) ((end - start) * period / duration);

        final Handler handler = new Handler(Looper.getMainLooper());
        // TextView animationText = this.findViewById(R.id.animationText);
        timer3.schedule(new TimerTask() {
            int value = start;

            @Override
            public void run() {
                // handlerを使って処理をキューイングする
                if (value < end) {
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });
                    value += blockValue;

                } else {
                    value = 0;
                    handler.post(new Runnable() {
                        public void run() {
                            textView.setText(String.valueOf(value));
                        }

                    });


                    //value = end ;
                    //timer.cancel();
                }




            }
        },  0, period);
    }
}