## 多渠道打包方案
--------
### 1.V2签名原理

[APK 签名方案 v2](https://source.android.google.cn/security/apksigning/v2)

[APK 签名方案 v3](https://source.android.google.cn/security/apksigning/v3)

### 2.腾讯VasDolly实现原理
[asDolly](https://github.com/Tencent/VasDolly)
[原理](https://github.com/Tencent/VasDolly/wiki/VasDolly%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86)

+ 腾讯的VasDolly多渠道打包有问题：
Android Studio 4.0 Gradle plugin 4.0.0 及其以上版本 BUILD FAILED
错误：Could not get unknown property 'apkVariantData' for object of type com.android.build.gradle.internal.api.ApplicationVariantImpl

[腾讯的VasDolly多渠道打包有问题](https://github.com/Tencent/VasDolly/issues/102)


### 3.美团多渠道打包

[美团多渠道打包](https://github.com/mcxiaoke/packer-ng-plugin)
