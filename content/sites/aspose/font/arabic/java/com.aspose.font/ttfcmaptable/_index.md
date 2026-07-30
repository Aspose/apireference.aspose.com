---
title: "TtfCMapTable"
second_title: "مرجع API لـ Aspose.Font لـ Java"
description: "يمثل جدول cmap لملف الخط TTF."
type: docs
weight: 89
url: /ar/java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

يمثل جدول "cmap" لملف خط TTF.
## الطرق

| طريقة | الوصف |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findUnicodeTable()](#findUnicodeTable--) | يبحث ويعيد CMap Unicode. |
| [getAllSubtables()](#getAllSubtables--) | يعيد جميع الجداول الفرعية من جدول CMap. |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | يحصل على الإزاحة من بداية sfnt. |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | يعيد جداول فرعية لـ CMap للـ planformId و platformSpecificId. |
| [getTag()](#getTag--) | يحصل على علامة الجدول. |
| [getTtfTables()](#getTtfTables--) | مرجع إلى مستودع جدول TTF. |
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
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


يبحث ويعيد CMap Unicode. إذا كان هناك CMap ucs-4 - يعيده أولاً؛ وإلا - يعيد أي CMap Unicode يمكنه العثور عليه.

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


يعيد جميع الجداول الفرعية من جدول CMap.

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - مصفوفة من كائنات TtfCmapSubtableDescription.
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
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


يعيد جداول فرعية لـ CMap للـ planformId و platformSpecificId.

**Parameters:**
| معامل | نوع | الوصف |
| --- | --- | --- |
| platformId | int | معرف المنصة. |
| platformSpecificId | int | معرف الترميز الخاص بالمنصة. |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - جداول فرعية لـ CMap.
### getTag() {#getTag--}
```
public static String getTag()
```


يحصل على علامة الجدول.

**Returns:**
java.lang.String - علامة الجدول.
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


مرجع إلى مستودع جدول TTF.

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - Reference to TTF table repository.
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

