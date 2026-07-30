---
title: "TtfCMapTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 cmap 表。"
type: docs
weight: 89
url: /zh/java/com.aspose.font/ttfcmaptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfCMapTable extends TtfTableBase
```

表示 TTF 字体文件的 "cmap" 表。
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findUnicodeTable()](#findUnicodeTable--) | 搜索并返回 Unicode CMap。 |
| [getAllSubtables()](#getAllSubtables--) | 返回 CMap 表中的所有子表。 |
| [getClass()](#getClass--) |  |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getPlatformTables(int platformId, int platformSpecificId)](#getPlatformTables-int-int-) | 返回针对 platformId 和 platformSpecificId 的 CMap 子表。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
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
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findUnicodeTable() {#findUnicodeTable--}
```
public TtfCMapFormatBaseTable findUnicodeTable()
```


搜索并返回 Unicode CMap。如果存在 ucs-4 CMap，则首先返回它；否则返回它能找到的任何 Unicode CMap。

**Returns:**
[TtfCMapFormatBaseTable](../../com.aspose.font/ttfcmapformatbasetable) - Unicode subtable.
### getAllSubtables() {#getAllSubtables--}
```
public TtfCMapTable.TtfCMapSubtableDescription[] getAllSubtables()
```


返回 CMap 表中的所有子表。

**Returns:**
com.aspose.font.TtfCMapTable.TtfCMapSubtableDescription[] - TtfCmapSubtableDescription 对象数组
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


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getPlatformTables(int platformId, int platformSpecificId) {#getPlatformTables-int-int-}
```
public TtfCMapFormatBaseTable[] getPlatformTables(int platformId, int platformSpecificId)
```


返回针对 platformId 和 platformSpecificId 的 CMap 子表。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | int | 平台标识。 |
| platformSpecificId | int | 平台特定编码标识。 |

**Returns:**
com.aspose.font.TtfCMapFormatBaseTable[] - CMap 子表。
### getTag() {#getTag--}
```
public static String getTag()
```


获取表标签。

**Returns:**
java.lang.String - 表标签。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


指向 TTF 表仓库的引用。

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

