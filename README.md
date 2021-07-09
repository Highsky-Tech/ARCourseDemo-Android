# ARCourseDemo-Android
手动集成 LibraryDemo

1. 下载ARSDK，下载完成后进行解压。

2. 打开您的 Android Studio 工程项目，将SDK 目录下的 aar 文件拷贝到工程的 **app/libs** 目录下

3. 添加 LiteAVSDK 依赖，在 app/build.gradle 中，添加引用 aar 包的代码。

```java
implementation fileTree(dir: 'libs', include: ['*.jar','*.aar'])
compileOnly(name: 'artlibrary-debug', ext: 'aar')
```

4. 同时，引用项目中所使用的的第三方，如果项目中已经引用，则无需处理

```java
implementation 'androidx.recyclerview:recyclerview:1.0.0'
api 'com.google.code.gson:gson:2.8.4'
api 'com.github.bumptech.glide:glide:4.12.0'
      
/*RxJava2与RxAndroid2*/
api 'io.reactivex.rxjava2:rxandroid:2.0.2'
api 'io.reactivex.rxjava2:rxjava:2.1.12'
/*Retrofit与RxAndroid2配置依赖*/
api 'com.squareup.retrofit2:retrofit:2.5.0'
api 'com.squareup.retrofit2:adapter-rxjava2:2.4.0'
api 'com.squareup.retrofit2:converter-gson:2.4.0'
//卡片布局
implementation 'com.android.support:cardview-v7:28.0.0'
//gpuimage
implementation 'jp.co.cyberagent.android:gpuimage:2.1.0'
// 侧滑删除
api 'com.yanzhenjie.recyclerview:x:1.3.2'
//图片选择
implementation 'io.github.lucksiege:pictureselector:v2.7.3-rc05'
//文件选择
implementation 'com.zhihu.android:matisse:latest.release'
implementation "androidx.annotation:annotation:1.2.0"
implementation "androidx.annotation:annotation-experimental:1.1.0"
implementation 'com.github.fengxiaocan:RecyclerHelper:latest.release'
//EventBus
api 'org.greenrobot:eventbus:3.0.0'
implementation 'com.google.android.material:material:1.1.0-alpha07'
//图片预览 缩放
api 'com.bm.photoview:library:1.4.1'
implementation 'cn.jzvd:jiaozivideoplayer:7.3.0'
//刷新
implementation  'com.scwang.smart:refresh-layout-kernel:2.0.3'      //核心必须依赖
implementation  'com.scwang.smart:refresh-header-classics:2.0.3'    //经典刷新头
implementation  'com.scwang.smart:refresh-footer-classics:2.0.3'    //经典加载
 ```



#### 配置 App 权限

在SDK的 AndroidManifest.xml 中配置 App 的使用了以下权限，请知悉。

```java
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.RECORD_AUDIO" /> 
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.FLASHLIGHT" />
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
<uses-permission android:name="android.permission.VIBRATE" /> 
<uses-permission android:name="android.permission.WAKE_LOCK" />
<uses-permission android:name="android.permission.MODIFY_AUDIO_SETTINGS" />
```



#### 在应用的的Application中初始化ARCSDK

```java
ARSDKBase.getInstance().ARSDKBaseInit(this);
```





#### 进入ARSDK并进行企业、密钥、用户的验证

在集成ARSDK前，您会获得两个字符串：一个字符串是企业ID，另一个字符串是密钥Screat。

然后从项目中任何界面进行ARSDK并进行企业、密钥、用户的验证：

 ```java
Intent intent = new Intent(mContext, ARLaunchActivity.class);
intent.putExtra("companyID", "companyID");
intent.putExtra("companyScreat", "companyScreat");
intent.putExtra("userID", "userID");
startActivity(intent);
 ```
