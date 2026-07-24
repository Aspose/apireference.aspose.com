---
title: "许可证"
second_title: "Aspose.Page for Java API 参考"
description: "提供对组件进行授权的方法。"
type: docs
weight: 14
url: /zh/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

提供对组件进行授权的方法。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹中查找名为 MyLicense.lic 的许可证文件，然后在调用程序集的嵌入资源中查找。

License license = new License();
license.setLicense("MyLicense.lic");
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [License()](#License--) | 初始化此类的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | 默认情况下我们使用默认的 jdk 安全。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | 默认情况下我们使用默认的 jre 安全。 |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | 对组件进行授权。 |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | 对组件进行授权。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


初始化此类的新实例。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹中查找名为 MyLicense.lic 的许可证文件，然后在调用程序集的嵌入资源中查找。

License license = new License();
license.setLicense("MyLicense.lic");

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


默认情况下我们使用默认的 jdk 安全。默认值 == false。在某些情况下，自定义的 java 环境无法支持所需的算法，因此我们可以建议使用内部内置的 FIPS 安全。

**Returns:**
boolean - 布尔值
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


默认情况下我们使用默认的 jre 安全。默认值 == false。在某些情况下，自定义的 java 环境无法支持所需的算法，因此我们可以建议使用内部内置的 FIPS 安全。

另请注意：根据 JVM SecureRandom 算法，在某些操作系统上 /dev/random 会等待在主机上生成一定量的 \u201cnoise\u201d 后才返回结果。Oracle\u2019s JVM 中用于随机数生成的库默认在 UNIX 平台上依赖 /dev/random。虽然 /dev/random 更安全，但如果默认 JVM 配置导致延迟，建议使用 /dev/urandom，或添加生成 /dev/random 熵的设备。

以下 java 选项可以帮助避免延迟并覆盖 securerandom.source 设置。-Djava.security.egd=file:/dev/./urandom

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| internalFIPSSecurity | boolean | 布尔值 |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


对组件进行授权。

包含许可证的流。

使用此方法从流中加载许可证。

License license = new License();
license.setLicense(myStream);

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.InputStream | license 流 |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


对组件进行授权。

尝试在以下位置查找许可证：

1. 明确路径。

2. 组件 jar 文件的文件夹。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹中查找名为 MyLicense.lic 的许可证文件，然后在调用程序集的嵌入资源中查找。

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| licenseName | java.lang.String | 可以是完整或简短的文件名，或嵌入资源的名称。使用空字符串切换到评估模式。 |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

