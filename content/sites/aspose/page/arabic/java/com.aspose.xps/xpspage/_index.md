---
title: "XpsPage"
second_title: "مرجع API لـ Aspose.Page للـ Java"
description: "فئة تغلف ميزات عنصر FixedPage."
type: docs
weight: 38
url: /ar/java/com.aspose.xps/xpspage/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsElement](../../com.aspose.xps/xpselement)
```
public final class XpsPage extends XpsElement
```

فئة تُغلف ميزات عنصر FixedPage. يحتوي هذا العنصر على محتويات الصفحة وهو العنصر الجذر لجزء FixedPage.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [deepClone()](#deepClone--) | ينسخ هذه الصفحة. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | يوفر وصولاً إلى أبناء العنصر حسب الفهرس i. |
| [getClass()](#getClass--) |  |
| [getHeight()](#getHeight--) | يعيد ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [getWidth()](#getWidth--) | يعيد عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [getXmlLang()](#getXmlLang--) | يعيد القيمة التي تحدد اللغة الافتراضية المستخدمة للعنصر الحالي ولأي عناصر فرعية أو سلفية. |
| [hashCode()](#hashCode--) |  |
| [iterator()](#iterator--) | تنفيذ واجهة Iterable. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setHeight(float value)](#setHeight-float-) | يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [setWidth(float value)](#setWidth-float-) | يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة. |
| [setXmlLang(String value)](#setXmlLang-java.lang.String-) | يضبط القيمة التي تحدد اللغة الافتراضية المستخدمة للعنصر الحالي ولأي عناصر فرعية أو سلفية. |
| [size()](#size--) | يعيد عدد العناصر الفرعية. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsPage deepClone()
```


ينسخ هذه الصفحة.

**Returns:**
[XpsPage](../../com.aspose.xps/xpspage) - Clone of this page.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
منطقي
### get(int i) {#get-int-}
```
public XpsContentElement get(int i)
```


يوفر وصولاً إلى أبناء العنصر حسب الفهرس i.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| i | int | فهرس العنصر الفرعي. |

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


يعيد ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Returns:**
float - ارتفاع الصفحة.
### getWidth() {#getWidth--}
```
public float getWidth()
```


يعيد عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Returns:**
float - عرض الصفحة.
### getXmlLang() {#getXmlLang--}
```
public String getXmlLang()
```


يعيد القيمة التي تحدد اللغة الافتراضية المستخدمة للعنصر الحالي ولأي عناصر فرعية أو سلفية.

**Returns:**
java.lang.String - القيمة التي تحدد اللغة الافتراضية.
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


تنفيذ واجهة Iterable.

**Returns:**
java.util.Iterator<com.aspose.xps.XpsContentElement> - يعيد المُعدِّد للقائمة.
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


يضبط ارتفاع الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | ارتفاع الصفحة. |

### setWidth(float value) {#setWidth-float-}
```
public void setWidth(float value)
```


يضبط عرض الصفحة، معبرًا عنه كعدد حقيقي بوحدات مساحة الإحداثيات الفعّالة.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | float | عرض الصفحة. |

### setXmlLang(String value) {#setXmlLang-java.lang.String-}
```
public void setXmlLang(String value)
```


يضبط القيمة التي تحدد اللغة الافتراضية المستخدمة للعنصر الحالي ولأي عناصر فرعية أو سلفية.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| القيمة | java.lang.String | القيمة التي تحدد اللغة الافتراضية. |

### size() {#size--}
```
public int size()
```


يعيد عدد العناصر الفرعية.

**Returns:**
int - عدد العناصر الفرعية.
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
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

