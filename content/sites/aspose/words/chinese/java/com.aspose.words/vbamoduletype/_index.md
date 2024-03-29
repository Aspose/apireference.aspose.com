---
title: VbaModuleType
second_title: Aspose.Words for Java API 参考
description: 指定 VBA 项目中模型的类型。
type: docs
weight: 595
url: /zh/java/com.aspose.words/vbamoduletype/
---

**遗产：**
java.lang.Object
```
public class VbaModuleType
```

指定 VBA 项目中模型的类型。
## 字段

| 场地 | 描述 |
| --- | --- |
| [CLASS_MODULE](#CLASS-MODULE) | 包含新对象定义的模块。 |
| [DESIGNER_MODULE](#DESIGNER-MODULE) | 扩展已注册到项目的 ActiveX 控件的方法和属性的 VBA 模块。 |
| [DOCUMENT_MODULE](#DOCUMENT-MODULE) | 一种 VBA 项目项，它为与文档关联的嵌入式宏和编程访问操作指定模块。 |
| [PROCEDURAL_MODULE](#PROCEDURAL-MODULE) | 子例程和函数的集合。 |
| [length](#length) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromName(String vbaModuleTypeName)](#fromName-java.lang.String-) |  |
| [getClass()](#getClass--) |  |
| [getName(int vbaModuleType)](#getName-int-) |  |
| [getValues()](#getValues--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [toString(int vbaModuleType)](#toString-int-) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CLASS_MODULE {#CLASS-MODULE}
```
public static int CLASS_MODULE
```


包含新对象定义的模块。类的每个实例都创建一个新对象，模块中定义的过程成为该对象的属性和方法。

### DESIGNER_MODULE {#DESIGNER-MODULE}
```
public static int DESIGNER_MODULE
```


扩展已注册到项目的 ActiveX 控件的方法和属性的 VBA 模块。

### DOCUMENT_MODULE {#DOCUMENT-MODULE}
```
public static int DOCUMENT_MODULE
```


一种 VBA 项目项，它为与文档关联的嵌入式宏和编程访问操作指定模块。

### PROCEDURAL_MODULE {#PROCEDURAL-MODULE}
```
public static int PROCEDURAL_MODULE
```


子例程和函数的集合。

### length {#length}
```
public static int length
```


### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**退货：**
布尔值
### fromName(String vbaModuleTypeName) {#fromName-java.lang.String-}
```
public static int fromName(String vbaModuleTypeName)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| vbaModuleTypeName | java.lang.String |  |

**退货：**
整数
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**退货：**
java.lang.Class<?>
### getName(int vbaModuleType) {#getName-int-}
```
public static String getName(int vbaModuleType)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| vbaModuleType | int |  |

**退货：**
java.lang.字符串
### getValues() {#getValues--}
```
public static int[] getValues()
```




**退货：**
整数[]
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**退货：**
整数
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**退货：**
java.lang.字符串
### toString(int vbaModuleType) {#toString-int-}
```
public static String toString(int vbaModuleType)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| vbaModuleType | int |  |

**退货：**
java.lang.字符串
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |
