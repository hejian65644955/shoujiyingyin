package com.atguigu.www.speechdemo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;

public class MainActivity extends AppCompatActivity {

    private EditText et_input;
    private Button btn_voice;
    private Button btn_speechtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=587a3851");
        btn_speechtext = (Button) findViewById(R.id.btn_speechtext);
        btn_voice = (Button) findViewById(R.id.btn_voice);
        et_input = (EditText) findViewById(R.id.et_input);
        btn_voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogVoice();
            }
        });

        btn_speechtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void showDialogVoice() {
        //1.创建RecognizerDialog对象
        RecognizerDialog mDialog = new RecognizerDialog(this, new MyInitListener());
//2.设置accent、language等参数
        mDialog.setParameter(SpeechConstant.LANGUAGE, "zh_cn");
        mDialog.setParameter(SpeechConstant.ACCENT, "mandarin");
//若要将UI控件用于语义理解，必须添加以下参数设置，设置之后onResult回调返回将是语义理解 //结果 // mDialog.setParameter("asr_sch", "1");
// mDialog.setParameter("nlp_version", "2.0");

//3.设置回调接口
        mDialog.setListener(new MyRecognizerDialogListener());
        //4.显示dialog，接收语音输入
        mDialog.show();
    }
    class MyInitListener implements InitListener {

        @Override
        public void onInit(int i) {

        }
    }
    class MyRecognizerDialogListener implements RecognizerDialogListener{

        @Override
        public void onResult(RecognizerResult recognizerResult, boolean b) {
            String result = recognizerResult.getResultString();
            System.out.println(result);

        }

        @Override
        public void onError(SpeechError speechError) {
            Toast.makeText(MainActivity.this,"出错了哦",Toast.LENGTH_SHORT).show();

        }
    }

}
