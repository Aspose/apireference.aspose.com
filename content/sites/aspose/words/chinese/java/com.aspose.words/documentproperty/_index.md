---
title: DocumentProperty
second_title: Aspose.Words for Java API 参考
description: 表示自定义或内置文档属性。
type: docs
weight: 126
url: /zh/java/com.aspose.words/documentproperty/
---

**遗产：**
java.lang.Object

**所有已实现的接口：**
java.lang.Cloneable
```
public class DocumentProperty implements Cloneable
```

表示自定义或内置文档属性。

要了解更多信息，请访问**Work with Document Properties**文档文章。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getLinkSource()](#getLinkSource--) | 获取链接的自定义文档属性的来源。 |
| [getName()](#getName--) | 返回属性的名称。 |
| [getType()](#getType--) | 获取属性的数据类型。 |
| [getValue()](#getValue--) | 获取属性的值。 |
| [hashCode()](#hashCode--) |  |
| [isLinkToContent()](#isLinkToContent--) | 显示此属性是否链接到内容。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setValue(Object value)](#setValue-java.lang.Object-) | 设置属性的值。 |
| [toBool()](#toBool--) | 以 bool 形式返回属性值。 |
| [toByteArray()](#toByteArray--) | 以字节数组形式返回属性值。 |
| [toDateTime()](#toDateTime--) | 将属性值返回为 UTC 中的 DateTime。 |
| [toDouble()](#toDouble--) | 将属性值返回为双精度值。 |
| [toInt()](#toInt--) | 以整数形式返回属性值。 |
| [toString()](#toString--) | 将属性值作为根据当前区域设置格式化的字符串返回。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**退货：**
java.lang.Class<?>
### getLinkSource() {#getLinkSource--}
```
public String getLinkSource()
```


获取链接的自定义文档属性的来源。

**退货：**
java.lang.String - 链接的自定义文档属性的来源。
### getName() {#getName--}
```
public String getName()
```


返回属性的名称。

不能为空且不能为空字符串。

**退货：**
java.lang.String - 属性的名称。
### getType() {#getType--}
```
public int getType()
```


获取属性的数据类型。

**退货：**
 int - 属性的数据类型。返回值是其中之一[PropertyType](../../com.aspose.words/propertytype)常数。
### getValue() {#getValue--}
```
public Object getValue()
```


获取属性的值。

不能为空。

**退货：**
java.lang.Object - 属性的值。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**退货：**
整数
### isLinkToContent() {#isLinkToContent--}
```
public boolean isLinkToContent()
```


显示此属性是否链接到内容。

**退货：**
boolean - 相应的布尔值。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setValue(Object value) {#setValue-java.lang.Object-}
```
public void setValue(Object value)
```


设置属性的值。

不能为空。

**参数：**

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| value | java.lang.Object | 财产的价值。 |

### toBool() {#toBool--}
```
public boolean toBool()
```


以 bool 形式返回属性值。

如果属性类型不是，则引发异常[PropertyType.BOOLEAN](../../com.aspose.words/propertytype\#BOOLEAN).

**退货：**
布尔值
### toByteArray() {#toByteArray--}
```
public byte[] toByteArray()
```


以字节数组形式返回属性值。

如果属性类型不是，则引发异常[PropertyType.BYTE\_ARRAY](../../com.aspose.words/propertytype\#BYTE-ARRAY).

**退货：**
字节[]
### toDateTime() {#toDateTime--}
```
public Date toDateTime()
```


将属性值返回为 UTC 中的 DateTime。

如果属性类型不是，则引发异常[PropertyType.DATE\_TIME](../../com.aspose.words/propertytype\#DATE-TIME).

Microsoft Word 仅存储自定义日期属性的日期部分（无时间）。

**退货：**
java.util.日期
### toDouble() {#toDouble--}
```
public double toDouble()
```


将属性值返回为双精度值。如果属性类型不是，则引发异常[PropertyType.NUMBER](../../com.aspose.words/propertytype\#NUMBER).

**退货：**
双倍的
### toInt() {#toInt--}
```
public int toInt()
```


以整数形式返回属性值。如果属性类型不是，则引发异常[PropertyType.NUMBER](../../com.aspose.words/propertytype\#NUMBER).

**退货：**
整数
### toString() {#toString--}
```
public String toString()
```


将属性值作为根据当前区域设置格式化的字符串返回。

将布尔属性转换为“Y”或“N”。将日期属性转换为短日期字符串。对于所有其他类型，使用 Object.ToString() 转换属性。

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
