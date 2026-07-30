---
title: "许可证"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "提供对组件授权的方法。"
type: docs
weight: 58
url: /zh/java/com.aspose.font/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

提供对组件授权的方法。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹以及调用程序集的嵌入资源中查找名为 MyLicense.lic 的许可证文件。

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
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | 为组件授权。 |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | 为组件授权。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


初始化此类的新实例。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹以及调用程序集的嵌入资源中查找名为 MyLicense.lic 的许可证文件。

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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


为组件授权。

包含许可证的流。

使用此方法从流加载许可证。

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


为组件授权。

尝试在以下位置查找许可证：

1. 明确路径。

2. 组件 jar 文件所在的文件夹。

在此示例中，将尝试在包含组件的文件夹、包含调用程序集的文件夹、入口程序集的文件夹以及调用程序集的嵌入资源中查找名为 MyLicense.lic 的许可证文件。

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

