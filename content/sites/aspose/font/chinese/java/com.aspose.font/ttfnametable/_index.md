---
title: "TtfNameTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的名称表。"
type: docs
weight: 105
url: /zh/java/com.aspose.font/ttfnametable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfNameTable extends TtfTableBase
```

表示 "name" 表的 TTF 字体文件。
## 方法

| 方法 | 描述 |
| --- | --- |
| [addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)](#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | 从传入的  mlNames  对象中提取所有多语言字符串，并使用传入的参数  platformId 、  platformSpecificId  和  nameId 为每个提取的字符串创建相应的 NameRecord 结构。 |
| [addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)](#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-) | 向表中添加条目。 |
| [deleteRecords(PlatformId platformId, int platformSpecificId)](#deleteRecords-com.aspose.font.PlatformId-int-) | 删除所有与指定平台相关的记录。 |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-) | 删除所有与传入参数相关的记录。 |
| [deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)](#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-) | 删除与指定参数相关的记录(s)。 |
| [deleteRecordsByNameId(NameId nameId)](#deleteRecordsByNameId-com.aspose.font.NameId-) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllNameRecords()](#getAllNameRecords--) | 返回表中所有  NameRecord  结构。 |
| [getClass()](#getClass--) |  |
| [getMultiLanguageNameById(NameId nameId)](#getMultiLanguageNameById-com.aspose.font.NameId-) | 返回 nameId 对应的名称。 |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-) | 返回使用传入的 platform identifier 的 nameId 对应的名称。 |
| [getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)](#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-) | 返回类型为  MultiLanguageString  的名称对象。 |
| [getNameById(NameId nameId)](#getNameById-com.aspose.font.NameId-) | 如果找到则返回 nameId 对应的名称，否则返回 null。 |
| [getNameRecordsByNameId(NameId nameId)](#getNameRecordsByNameId-com.aspose.font.NameId-) | 返回所有 NameId 字段等于传入 nameId 值的  NameRecord  结构。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)](#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-) | 更新与指定平台（platformId 和 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录(s)中的名称。 |
| [updateNamesByNameId(NameId nameId, String newName)](#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-) | 选择所有与逻辑字符串类别（由参数 nameId 指定）相关的记录，并更新这些记录中的 name 字段（字符串数据）。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId) {#addMultiLanguageNames-com.aspose.font.MultiLanguageString-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void addMultiLanguageNames(MultiLanguageString mlNames, PlatformId platformId, int platformSpecificId, NameId nameId)
```


从传入的  mlNames  对象中提取所有多语言字符串，并使用传入的参数  platformId 、  platformSpecificId  和  nameId 为每个提取的字符串创建相应的 NameRecord 结构。字段 languageID 的值从  mlNames  对象中提取。新创建的记录被添加到表中。如果发现已有记录在字段 platformID、platformSpecificID、nameID 和 languageId 上与新创建的记录相同，则不会添加新记录，而仅更新已有记录的字符串数据。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| mlNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 多语言字符串 |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符 |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由  NameId  枚举指定。 |

### addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name) {#addName-com.aspose.font.NameId-com.aspose.font.PlatformId-int-int-java.lang.String-}
```
public void addName(NameId nameId, PlatformId platformId, int platformSpecificId, int languageId, String name)
```


向表中添加条目。要添加的字符串数据类别由 name 参数指定。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由 [NameId](../../com.aspose.font/nameid) 枚举指定。 |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符。 |
| platformSpecificId | int | 平台特定编码标识符。请使用以下枚举之一的值 - UnicodePlatformSpecificId、MacPlatformSpecificId、MSPlatformSpecificId。使用哪种枚举由上下文（platformId 参数）决定。 |
| languageId | int | 语言标识符。请根据上下文（由 platformId 参数定义），使用 MSLanguageId 或 MacLanguageId 枚举中的值。 |
| 名称 | java.lang.String | 实际字符串数据。 |

### deleteRecords(PlatformId platformId, int platformSpecificId) {#deleteRecords-com.aspose.font.PlatformId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId)
```


删除所有与指定平台相关的记录。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符 |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId)
```


删除所有与传入参数相关的记录。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符 |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由  NameId  枚举指定。 |

### deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId) {#deleteRecords-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-}
```
public void deleteRecords(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId)
```


删除与指定参数相关的记录(s)。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符 |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由  NameId  枚举指定。 |
| languageId | int | 语言标识符 |

### deleteRecordsByNameId(NameId nameId) {#deleteRecordsByNameId-com.aspose.font.NameId-}
```
public void deleteRecordsByNameId(NameId nameId)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) |  |

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
### getAllNameRecords() {#getAllNameRecords--}
```
public NameRecord[] getAllNameRecords()
```


返回表中所有  NameRecord  结构。

**Returns:**
com.aspose.font.NameRecord[] - 表中所有 NameRecord 结构。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMultiLanguageNameById(NameId nameId) {#getMultiLanguageNameById-com.aspose.font.NameId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId)
```


返回 nameId 对应的名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name Id。 |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - name
### getMultiLanguageNameById(NameId nameId, PlatformId platformId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId)
```


返回使用传入的 platform identifier 的 nameId 对应的名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id。 |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识。 |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId) {#getMultiLanguageNameById-com.aspose.font.NameId-com.aspose.font.PlatformId-int-}
```
public MultiLanguageString getMultiLanguageNameById(NameId nameId, PlatformId platformId, int platformSpecificId)
```


返回一个类型为 MultiLanguageString 的对象作为名称。该方法收集所有与传入参数 nameId、platformId 和 platformSpecificId 匹配的 NameRecord 结构，然后基于这些结构列表构建结果对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | Name Id。 |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识。 |
| platformSpecificId | int | 平台特定 Id。 |

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Name.
### getNameById(NameId nameId) {#getNameById-com.aspose.font.NameId-}
```
public String getNameById(NameId nameId)
```


如果找到则返回 nameId 对应的名称，否则返回 null。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name 标识符 |

**Returns:**
java.lang.String - name
### getNameRecordsByNameId(NameId nameId) {#getNameRecordsByNameId-com.aspose.font.NameId-}
```
public NameRecord[] getNameRecordsByNameId(NameId nameId)
```


返回所有 NameId 字段等于传入 nameId 值的 NameRecord 结构。如果未找到记录，将返回空数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | name 标识符 |

**Returns:**
com.aspose.font.NameRecord[] - NameRecord 结构数组
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
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
### updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName) {#updateName-com.aspose.font.PlatformId-int-com.aspose.font.NameId-int-java.lang.String-}
```
public void updateName(PlatformId platformId, int platformSpecificId, NameId nameId, int languageId, String newName)
```


更新与指定平台（platformId 和 platformSpecificId 的组合）、类别（nameId）和语言（languageId）相关的记录(s)中的名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| platformId | [PlatformId](../../com.aspose.font/platformid) | 平台标识符 |
| platformSpecificId | int | 平台特定编码标识符 |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由  NameId  枚举指定。 |
| languageId | int | 语言标识符 |
| newName | java.lang.String | 新名称或新字符串数据 |

### updateNamesByNameId(NameId nameId, String newName) {#updateNamesByNameId-com.aspose.font.NameId-java.lang.String-}
```
public void updateNamesByNameId(NameId nameId, String newName)
```


选择所有与参数 nameId 指定的逻辑字符串类别相关的记录，并更新这些记录中的 name 字段（字符串数据）。平台相关的字段（platformID、Platform-specific encoding ID）和语言相关的字段（Language ID）不受此方法影响。仅用新名称替换 name 字符串数据。使用此方法时需谨慎，因为它会替换所有与 nameId 相关的平台和语言的原始名称。若原始名称在不同平台或语言中具有不同值，替换操作会将这些值全部改为单一的新值，可能导致与某些平台和语言的逻辑不一致。此方法适用于原始名称在所有平台和语言中只有单一表示的情况，例如 name 字符串数据为英文时。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| nameId | [NameId](../../com.aspose.font/nameid) | 名称标识符，逻辑字符串类别，由  NameId  枚举指定。 |
| newName | java.lang.String | 新名称或新字符串数据 |

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

