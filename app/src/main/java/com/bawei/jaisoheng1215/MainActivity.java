package com.bawei.jaisoheng1215;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private CustomCircleView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.cudtom);
        final Animation rotate= AnimationUtils.loadAnimation(this, R.anim.anim_rotate);//获取旋转动画资源
        final Animation translate=AnimationUtils.loadAnimation(this, R.anim.anim_translate);//获取平移动画资源
        final Animation scale=AnimationUtils.loadAnimation(this, R.anim.anim_scale);//获取缩放动画资源
        final Animation alpha=AnimationUtils.loadAnimation(this, R.anim.anim_alpha);//获取透明度变化动画资源

        Button button1=(Button)findViewById(R.id.button1);//获取"旋转"按钮
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.startAnimation(rotate);
            }
        });
        Button button2=(Button)findViewById(R.id.button2);//获取"平移"按钮
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //播放平移动画
                iv.startAnimation(translate);

            }
        });

        Button button3=(Button)findViewById(R.id.button3);//获取"缩放"按钮
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //播放缩放动画
                iv.startAnimation(scale);

            }
        });

        Button button4=(Button)findViewById(R.id.button4);//获取"透明度渐变"按钮
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //播放透明度渐变动画
                iv.startAnimation(alpha);

            }
        });

    }


}

