---
title: "CffFontMetrics"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "CFF 字体度量实现"
type: docs
weight: 21
url: /zh/java/com.aspose.font/cfffontmetrics/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.FontMetrics](../../com.aspose.font/fontmetrics)
```
public class CffFontMetrics extends FontMetrics
```

CFF 字体度量实现
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAscender()](#getAscender--) | 获取 Ascender 值。 |
| [getAscender(double fontSize)](#getAscender-double-) | 返回特定字体大小的 ascender。 |
| [getClass()](#getClass--) |  |
| [getDescender()](#getDescender--) | 获取 Descender 值。 |
| [getDescender(double fontSize)](#getDescender-double-) | 返回特定字体大小的 descender。 |
| [getFontBBox()](#getFontBBox--) | 获取 FontBBox 值。 |
| [getFontMatrix()](#getFontMatrix--) | 获取 FontMatrix 值。 |
| [getFontMatrixForGlyph(GlyphId glyphId)](#getFontMatrixForGlyph-com.aspose.font.GlyphId-) | 计算由 ID 指定的字形的变换矩阵。 |
| [getGlyphBBox(GlyphId glyphId)](#getGlyphBBox-com.aspose.font.GlyphId-) | 返回字形 Bbox。 |
| [getGlyphWidth(GlyphId glyphId)](#getGlyphWidth-com.aspose.font.GlyphId-) | 返回字形宽度。 |
| [getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)](#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-) | 返回字形对的字距值。 |
| [getLineGap()](#getLineGap--) | 获取 LineGap 值。 |
| [getTypoAscender()](#getTypoAscender--) | 获取 TypoAscender 值。 |
| [getTypoAscender(double fontSize)](#getTypoAscender-double-) | 返回特定 Font 大小的排版上升线。 |
| [getTypoDescender()](#getTypoDescender--) | 获取 TypoDescender 值。 |
| [getTypoDescender(double fontSize)](#getTypoDescender-double-) | 返回特定字体大小的排版下降线 |
| [getTypoLineGap()](#getTypoLineGap--) | 获取 TypoLineGap 值。 |
| [getTypoLineGap(double fontSize)](#getTypoLineGap-double-) | 返回特定 Font 大小的行间距。 |
| [getUnitsPerEM()](#getUnitsPerEM--) | 获取 UnitsPerEM 值。 |
| [hashCode()](#hashCode--) |  |
| [isFixedPitch()](#isFixedPitch--) | 获取 IsFixedPitch 值。 |
| [measureString(String unicode, double fontSize)](#measureString-java.lang.String-double-) | 测量字符串并返回字符串宽度。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAscender(double value)](#setAscender-double-) | 设置 Ascender 值。 |
| [setDescender(double value)](#setDescender-double-) | 设置 Descender 值。 |
| [setGlyphWidth(GlyphId glyphId, double value)](#setGlyphWidth-com.aspose.font.GlyphId-double-) |  |
| [setTypoAscender(double value)](#setTypoAscender-double-) | 设置 TypoAscender 值。 |
| [setTypoDescender(double value)](#setTypoDescender-double-) | 设置 TypoDescender 值。 |
| [setUnitsPerEM(long value)](#setUnitsPerEM-long-) | 设置 UnitsPerEM 值。 |
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
### getAscender() {#getAscender--}
```
public double getAscender()
```


获取 Ascender 值。

**Returns:**
double - Ascender 值。
### getAscender(double fontSize) {#getAscender-double-}
```
public double getAscender(double fontSize)
```


返回特定字体大小的 ascender。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontSize | double | 字体大小。 |

**Returns:**
double - Ascender 值。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDescender() {#getDescender--}
```
public double getDescender()
```


获取 Descender 值。

**Returns:**
double - Descender 值。
### getDescender(double fontSize) {#getDescender-double-}
```
public double getDescender(double fontSize)
```


返回特定字体大小的 descender。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontSize | double | 字体大小。 |

**Returns:**
double - Descender 值。
### getFontBBox() {#getFontBBox--}
```
public FontBBox getFontBBox()
```


获取 FontBBox 值。

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - FontBBox value.
### getFontMatrix() {#getFontMatrix--}
```
public TransformationMatrix getFontMatrix()
```


获取 FontMatrix 值。

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - FontMatrix value.
### getFontMatrixForGlyph(GlyphId glyphId) {#getFontMatrixForGlyph-com.aspose.font.GlyphId-}
```
public TransformationMatrix getFontMatrixForGlyph(GlyphId glyphId)
```


计算由 ID 指定的字形的变换矩阵。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字形标识符。 |

**Returns:**
[TransformationMatrix](../../com.aspose.font/transformationmatrix) - Glyph transformation matrix.
### getGlyphBBox(GlyphId glyphId) {#getGlyphBBox-com.aspose.font.GlyphId-}
```
public FontBBox getGlyphBBox(GlyphId glyphId)
```


返回字形 Bbox。 如果字形未定义 BBox，则返回 FontBBox。 可能会被特定字体编码的继承者覆盖。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字形标识符。 |

**Returns:**
[FontBBox](../../com.aspose.font/fontbbox) - Glyph BBox.
### getGlyphWidth(GlyphId glyphId) {#getGlyphWidth-com.aspose.font.GlyphId-}
```
public double getGlyphWidth(GlyphId glyphId)
```


返回字形宽度。可能会被特定字体编码的继承者覆盖。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) | 字形标识符。 |

**Returns:**
double - 字形宽度。
### getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId) {#getKerningValue-com.aspose.font.GlyphId-com.aspose.font.GlyphId-}
```
public double getKerningValue(GlyphId prevGlyphId, GlyphId nextGlyphId)
```


返回字形对的字距值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| prevGlyphId | [GlyphId](../../com.aspose.font/glyphid) | 对中的第一个字形。 |
| nextGlyphId | [GlyphId](../../com.aspose.font/glyphid) | 字体大小。 |

**Returns:**
double - 字距调整值。
### getLineGap() {#getLineGap--}
```
public double getLineGap()
```


获取 LineGap 值。

**Returns:**
double - 行间距值。
### getTypoAscender() {#getTypoAscender--}
```
public double getTypoAscender()
```


获取 TypoAscender 值。

**Returns:**
double - TypoAscender 值。
### getTypoAscender(double fontSize) {#getTypoAscender-double-}
```
public double getTypoAscender(double fontSize)
```


返回特定 Font 大小的排版上升线。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontSize | double | 字体大小。 |

**Returns:**
double - 排版上升线值。
### getTypoDescender() {#getTypoDescender--}
```
public double getTypoDescender()
```


获取 TypoDescender 值。

**Returns:**
double - TypoDescender 值。
### getTypoDescender(double fontSize) {#getTypoDescender-double-}
```
public double getTypoDescender(double fontSize)
```


返回特定字体大小的排版下降线

param fontSize 字体大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontSize | double |  |

**Returns:**
double - 排版下降线值。
### getTypoLineGap() {#getTypoLineGap--}
```
public double getTypoLineGap()
```


获取 TypoLineGap 值。

**Returns:**
double - TypoLineGap 值。
### getTypoLineGap(double fontSize) {#getTypoLineGap-double-}
```
public double getTypoLineGap(double fontSize)
```


返回特定 Font 大小的行间距。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontSize | double | 字体大小。 |

**Returns:**
double - 行间隙值。
### getUnitsPerEM() {#getUnitsPerEM--}
```
public long getUnitsPerEM()
```


获取 UnitsPerEM 值。

**Returns:**
long - UnitsPerEM 值。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isFixedPitch() {#isFixedPitch--}
```
public boolean isFixedPitch()
```


获取 IsFixedPitch 值。

**Returns:**
boolean - IsFixedPitch 值。
### measureString(String unicode, double fontSize) {#measureString-java.lang.String-double-}
```
public double measureString(String unicode, double fontSize)
```


测量字符串并返回字符串宽度。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| unicode | java.lang.String | Unicode 字符串。 |
| fontSize | double | 字体大小。 |

**Returns:**
double - 字符串宽度。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAscender(double value) {#setAscender-double-}
```
public void setAscender(double value)
```


设置 Ascender 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | 上升线值。 |

### setDescender(double value) {#setDescender-double-}
```
public void setDescender(double value)
```


设置 Descender 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | 下降线值。 |

### setGlyphWidth(GlyphId glyphId, double value) {#setGlyphWidth-com.aspose.font.GlyphId-double-}
```
public void setGlyphWidth(GlyphId glyphId, double value)
```


设置字形宽度。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphId | [GlyphId](../../com.aspose.font/glyphid) |  |
| 值 | double |  |

### setTypoAscender(double value) {#setTypoAscender-double-}
```
public void setTypoAscender(double value)
```


设置 TypoAscender 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | TypoAscender 值。 |

### setTypoDescender(double value) {#setTypoDescender-double-}
```
public void setTypoDescender(double value)
```


设置 TypoDescender 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | double | TypoDescender 值。 |

### setUnitsPerEM(long value) {#setUnitsPerEM-long-}
```
public void setUnitsPerEM(long value)
```


设置 UnitsPerEM 值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | long | UnitsPerEM 值。 |

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

