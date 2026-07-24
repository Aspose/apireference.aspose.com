---
title: "XpsPage"
second_title: "Aspose.Page for Java API 参考"
description: "封装 FixedPage 元素特性的类。"
type: docs
weight: 38
url: /zh/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

封装 FixedPage 元素特性的类。此元素包含页面内容，并且是 FixedPage 部分的根元素。
## 方法

| 方法 | 描述 |
| --- | --- |
| [deepClone()](#deepClone--) | 克隆此页面。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | 提供通过索引 i 访问元素子项的功能。 |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | 返回页面的高度，以有效坐标空间的单位表示的实数。 |
| [getWidth()](#getWidth--) | 返回页面的宽度，以有效坐标空间的单位表示的实数。 |
| [getXmlLang()](#getXmlLang--) | 返回指定当前元素及其任何子元素或后代元素使用的默认语言的值。 |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | 实现 Iterable 接口。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | 设置页面的高度，以有效坐标空间的单位表示的实数。 |
| [setWidth(float value)](#setWidth-float-) | 设置页面的宽度，以有效坐标空间的单位表示的实数。 |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | 设置指定当前元素及其任何子元素或后代元素使用的默认语言的值。 |
| [size()](#size--) | 返回子元素的数量。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


克隆此页面。

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
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
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


提供通过索引 i 访问元素子项的功能。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int | 子元素的索引。 |

**Returns:**
[XpsContentElement](../../com.aspose.xps/xpscontentelement) - Child element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getHeight() {#getHeight--}
```
public float getHeight()
```


返回页面的高度，以有效坐标空间的单位表示的实数。

**Returns:**
float - 页面高度。
### getWidth() {#getWidth--}
```
public float getWidth()
```


返回页面的宽度，以有效坐标空间的单位表示的实数。

**Returns:**
float - 页面宽度。
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


返回指定当前元素及其任何子元素或后代元素使用的默认语言的值。

**Returns:**
java.lang.String - 指定默认语言的值。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### iterator() {#iterator--}
```
public Iterator<XpsContentElement> iterator()
```


实现 Iterable 接口。

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - 返回列表的枚举器。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setHeight(float value) {#setHeight-float-}
```
public void setHeight(float value)
```


设置页面的高度，以有效坐标空间的单位表示的实数。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 页面的高度。 |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


设置页面的宽度，以有效坐标空间的单位表示的实数。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 页面的宽度。 |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


设置指定当前元素及其任何子元素或后代元素使用的默认语言的值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 指定默认语言的值。 |

### size() {#size--}
```
public int size()
```


返回子元素的数量。

**Returns:**
int - 子元素的数量。
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

