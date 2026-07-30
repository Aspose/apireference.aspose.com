---
title: "TtfMaxpTable"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TTF 字体文件的 maxp 表"
type: docs
weight: 104
url: /zh/java/com.aspose.font/ttfmaxptable/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.TtfTableBase](../../com.aspose.font/ttftablebase)
```
public class TtfMaxpTable extends TtfTableBase
```

表示 TTF 字体文件的 "maxp" 表
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getMaxComponentContours()](#getMaxComponentContours--) | 获取 uint16 maxComponentContours 轮廓数（contours），用于复合字形。 |
| [getMaxComponentDepth()](#getMaxComponentDepth--) | 获取 uint16 maxComponentDepth 递归层级数；如果字体仅包含简单字形，则设为 0。 |
| [getMaxComponentElements()](#getMaxComponentElements--) | 获取 uint16 maxComponentElements 顶层引用的字形数量。 |
| [getMaxComponentPoints()](#getMaxComponentPoints--) | 获取 uint16 maxComponentPoints 点数，用于复合字形。 |
| [getMaxContours()](#getMaxContours--) | 获取 uint16 maxContours 轮廓数（contours），用于非复合字形。 |
| [getMaxFunctionDefs()](#getMaxFunctionDefs--) | 获取 uint16 maxFunctionDefs FDEF 的数量。 |
| [getMaxInstructionDefs()](#getMaxInstructionDefs--) | 获取 uint16 maxInstructionDefs IDEF 的数量。 |
| [getMaxPoints()](#getMaxPoints--) | 获取 uint16 maxPoints 点数，用于非复合字形。 |
| [getMaxSizeOfInstructions()](#getMaxSizeOfInstructions--) | 获取 uint16 maxSizeOfInstructions 字节计数，用于字形指令。 |
| [getMaxStackElements()](#getMaxStackElements--) | 获取 uint16 maxStackElements 最大堆栈深度。 |
| [getMaxStorage()](#getMaxStorage--) | 获取 uint16 maxStorage 存储区位置的数量。 |
| [getMaxTwilightPoints()](#getMaxTwilightPoints--) | 获取 uint16 maxTwilightPoints 在暮光区 (Z0) 中使用的点数。 |
| [getMaxZones()](#getMaxZones--) | 获取 uint16 maxZones，设为 2。 |
| [getNumGlyphs()](#getNumGlyphs--) | 获取 uint16 numGlyphs 字体中的字形数量。 |
| [getOffset()](#getOffset--) | 获取自 sfnt 开始的偏移量。 |
| [getTableVersion()](#getTableVersion--) | 获取格式版本。 |
| [getTag()](#getTag--) | 获取表标签。 |
| [getTtfTables()](#getTtfTables--) | 指向 TTF 表仓库的引用。 |
| [getVersion()](#getVersion--) | 获取固定版本 0x00010000（如果 version 1.0）。 |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getMaxComponentContours() {#getMaxComponentContours--}
```
public int getMaxComponentContours()
```


获取 uint16 maxComponentContours 轮廓数（contours），用于复合字形。

**Returns:**
int - UInt16 maxComponentContours 复合字形中的轮廓。
### getMaxComponentDepth() {#getMaxComponentDepth--}
```
public int getMaxComponentDepth()
```


获取 uint16 maxComponentDepth 递归层级数；如果字体仅包含简单字形，则设为 0。

**Returns:**
int - Uint16 maxComponentDepth 递归层级，如果字体仅包含简单字形则设为 0。
### getMaxComponentElements() {#getMaxComponentElements--}
```
public int getMaxComponentElements()
```


获取 uint16 maxComponentElements 顶层引用的字形数量。

**Returns:**
int - UInt16 maxComponentElements 顶层引用的字形数量。
### getMaxComponentPoints() {#getMaxComponentPoints--}
```
public int getMaxComponentPoints()
```


获取 uint16 maxComponentPoints 点数，用于复合字形。

**Returns:**
int - UInt16 maxComponentPoints 复合字形中的点数。
### getMaxContours() {#getMaxContours--}
```
public int getMaxContours()
```


获取 uint16 maxContours 轮廓数（contours），用于非复合字形。

**Returns:**
int - UInt16 maxContours 非复合字形中的轮廓数。
### getMaxFunctionDefs() {#getMaxFunctionDefs--}
```
public int getMaxFunctionDefs()
```


获取 uint16 maxFunctionDefs FDEF 的数量。

**Returns:**
int - UInt16 maxFunctionDefs FDEF 的数量。
### getMaxInstructionDefs() {#getMaxInstructionDefs--}
```
public int getMaxInstructionDefs()
```


获取 uint16 maxInstructionDefs IDEF 的数量。

**Returns:**
int - UInt16 maxInstructionDefs IDEF 的数量。
### getMaxPoints() {#getMaxPoints--}
```
public int getMaxPoints()
```


获取 uint16 maxPoints 点数，用于非复合字形。

**Returns:**
int - UInt16 maxPoints 非复合字形中的点数。
### getMaxSizeOfInstructions() {#getMaxSizeOfInstructions--}
```
public int getMaxSizeOfInstructions()
```


获取 uint16 maxSizeOfInstructions 字节计数，用于字形指令。

**Returns:**
int - UInt16 maxSizeOfInstructions 字形指令的字节计数。
### getMaxStackElements() {#getMaxStackElements--}
```
public int getMaxStackElements()
```


获取 uint16 maxStackElements 最大堆栈深度。

**Returns:**
int - UInt16 maxStackElements 最大堆栈深度。
### getMaxStorage() {#getMaxStorage--}
```
public int getMaxStorage()
```


获取 uint16 maxStorage 存储区位置的数量。

**Returns:**
int - UInt16 maxStorage 存储区位置的数量。
### getMaxTwilightPoints() {#getMaxTwilightPoints--}
```
public int getMaxTwilightPoints()
```


获取 uint16 maxTwilightPoints 在暮光区 (Z0) 中使用的点数。

**Returns:**
int - UInt16 maxTwilightPoints 在 Twilight Zone (Z0) 中使用的点数。
### getMaxZones() {#getMaxZones--}
```
public int getMaxZones()
```


获取 uint16 maxZones，设为 2。

**Returns:**
int - Uint16 maxZones 设置为 2。
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


获取 uint16 numGlyphs 字体中的字形数量。

**Returns:**
int - UInt16 numGlyphs 字体中的字形数量。
### getOffset() {#getOffset--}
```
public long getOffset()
```


获取自 sfnt 开始的偏移量。

**Returns:**
long - 自 sfnt 开始的偏移量。
### getTableVersion() {#getTableVersion--}
```
public Version16Dot16 getTableVersion()
```


获取格式版本。使用对象 Version16Dot16 的属性 MajorNumber 和 MinorNUmber（十六进制表示）来检测使用的版本。

**Returns:**
[Version16Dot16](../../com.aspose.font/version16dot16) - Format version.
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
### getVersion() {#getVersion--}
```
public float getVersion()
```


获取固定版本 0x00010000（如果 version 1.0）。已弃用，请改用 TableVersion 属性。

**Returns:**
float - 固定版本 0x00010000（如果 version 1.0）。
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

