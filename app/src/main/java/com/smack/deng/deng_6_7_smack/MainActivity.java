package com.smack.deng.deng_6_7_smack;

import android.provider.DocumentsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化Logger
        Logger.v("我是断言");
        Logger.i("我是信息");
        Logger.d("我是调试");
        Logger.w("我是警告");
        Logger.e("我是错误");
        Logger.wtf("我是wtf");
        // 输出json的时候不能拼接字符串例如："我是json " + getJson()
        Logger.json(getJson());
        // 至于xml的输出，没有尝试，可能需要将xml文件解析成String然后输出
        Logger.xml(getResources().getLayout(R.layout.activity_main).toString());
    }

    private String getJson(){
        JSONObject jsonObject = null;
        String mJson = null;
        String json = "{\"jpush_id\":\"160a3797c8073c8c7fd\",\"password\":\"18475544690\",\"username\":\"18475544690\",\"command\":\"login\"}";
        try {
            jsonObject = new JSONObject(json);
            mJson = jsonObject.toString();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return mJson;
    }

}
