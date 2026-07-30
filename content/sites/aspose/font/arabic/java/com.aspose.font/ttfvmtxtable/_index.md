---
title: "TtfVmtxTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول vmtx لملف خط TTF."
type: docs
weight: 113
url: /ar/java/com.aspose.font/ttfvmtxtable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfVmtxTable extends TtfTableBase
```

يمثل جدول "vmtx" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTopSideBearings()](#getTopSideBearings--) | يحصل على الحوامل العلوية الجانبية. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
| [getVMetrics()](#getVMetrics--) | يحصل على المقاييس العمودية. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| معامل | نوع | الوصف |
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
### getOffset() {#getOffset--}
```
public long getOffset()
```


يحصل على الإزاحة من بداية sfnt.

**Returns:**
long - إزاحة من بداية sfnt.
### getTag() {#getTag--}
```
public static String getTag()
```


يحصل على علامة الجدول.

**Returns:**
java.lang.String - علامة الجدول.
### getTopSideBearings() {#getTopSideBearings--}
```
public short[] getTopSideBearings()
```


يحصل على الحوامل العلوية الجانبية. مصفوفة من الحوامل العلوية الجانبية للحرف.

**Returns:**
short[] - الحوامل العلوية الجانبية.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
### getVMetrics() {#getVMetrics--}
```
public TtfVmtxTable.LongVerMetric[] getVMetrics()
```


يحصل على المقاييس العمودية.

**Returns:**
com.aspose.font.TtfVmtxTable.LongVerMetric[] - المقاييس العمودية.
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

