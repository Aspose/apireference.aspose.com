---
title: "Font"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示基础 Font 类。"
type: docs
weight: 32
url: /zh/java/com.aspose.font/font/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IFont](../../com.aspose.font/ifont), [com.aspose.font.IGlyphAccessor](../../com.aspose.font/iglyphaccessor), [com.aspose.font.IFontSaver](../../com.aspose.font/ifontsaver)
```
public abstract class Font implements IFont, IGlyphAccessor, IFontSaver
```

表示基础 Font 类。
## 方法

| 方法 | 描述 |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | 将 Font 转换为另一种格式。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | 返回字体中可用的所有字形 ID。 |
| [getClass()](#getClass--) |  |
| [getEncoding()](#getEncoding--) | 获取 Font 编码。 |
| [getFontDefinition()](#getFontDefinition--) | 获取 Font 定义。 |
| [getFontFamily()](#getFontFamily--) | 获取 Font 家族。 |
| [getFontName()](#getFontName--) | 获取 Font 字体名称。 |
| [getFontNames()](#getFontNames--) | 获取 Font 名称。 |
| [getFontSaver()](#getFontSaver--) | 获取 Font 保存功能。 |
| [getFontStyle()](#getFontStyle--) | 获取 Font 样式。 |
| [getFontType()](#getFontType--) | 获取 Font 类型。 |
| [getGlyphAccessor()](#getGlyphAccessor--) | Font 字形访问器。 |
| [getGlyphById(GlyphId id)](#getGlyphById-com.aspose.font.GlyphId-) | 根据字形 ID 返回字形。 |
| [getGlyphIdType()](#getGlyphIdType--) | 字形 ID 类型规范。 |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | 获取文本的字形表示。 |
| [getMetrics()](#getMetrics--) | 获取 Font 度量。 |
| [getNumGlyphs()](#getNumGlyphs--) | 获取字体中的字形数量。 |
| [getPostscriptNames()](#getPostscriptNames--) | 获取 PostScript 字体名称。 |
| [getStyle()](#getStyle--) | 获取 Font 样式。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(FontDefinition fontDefinition)](#open-com.aspose.font.FontDefinition-) | 打开字体，使用 FontDefinition 对象。 |
| [open(FontType fontType, byte[] fontData)](#open-com.aspose.font.FontType-byte---) | 打开字体，使用字体类型和字体数据字节数组。 |
| [open(FontType fontType, StreamSource fontStreamSource)](#open-com.aspose.font.FontType-com.aspose.font.StreamSource-) | 打开字体，使用字体类型和流源。 |
| [open(FontType fontType, String fileName)](#open-com.aspose.font.FontType-java.lang.String-) | 打开字体，使用字体类型和字体文件名。 |
| [save(OutputStream stream)](#save-java.io.OutputStream-) | 将字体保存为原始格式。 |
| [save(String fileName)](#save-java.lang.String-) | 将字体保存为原始格式。 |
| [saveToFormat(OutputStream stream, FontSavingFormats outFormat)](#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-) | 将字体保存为指定格式。 |
| [setFontFamily(String value)](#setFontFamily-java.lang.String-) | 设置字体族。 |
| [setFontName(String value)](#setFontName-java.lang.String-) | 设置字体面名称。 |
| [setStyle(String value)](#setStyle-java.lang.String-) | 设置字体样式。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### convert(FontType fontType) {#convert-com.aspose.font.FontType-}
```
public abstract Font convert(FontType fontType)
```


将 Font 转换为另一种格式。

--------------------

> ```
> Note: TTF Font type is now supported only.
> ```

fontType 要转换成的字体格式类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) |  |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
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
### getAllGlyphIds() {#getAllGlyphIds--}
```
public abstract GlyphId[] getAllGlyphIds()
```


返回字体中可用的所有字形 ID。字形 ID 是字形的唯一编号，取决于字体类型。例如：Type1 的 ID 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 ID 是整数索引，属于 ( GlyphInt32Id ) 类的实例。

**Returns:**
com.aspose.font.GlyphId[] - 字形标识符。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public abstract IFontEncoding getEncoding()
```


获取 Font 编码。

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public abstract FontDefinition getFontDefinition()
```


获取 Font 定义。

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public abstract String getFontFamily()
```


获取 Font 家族。

**Returns:**
java.lang.String - 字体族。
### getFontName() {#getFontName--}
```
public abstract String getFontName()
```


获取 Font 字体名称。

**Returns:**
java.lang.String - 字体面名称。
### getFontNames() {#getFontNames--}
```
public abstract MultiLanguageString getFontNames()
```


获取 Font 名称。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names.
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


获取 Font 保存功能。

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public abstract int getFontStyle()
```


获取字体样式。这是一个在通用类型中计算并表示的值。

**Returns:**
int - 字体样式。通常是 FontStyle 类常量标志值的组合或 0。
### getFontType() {#getFontType--}
```
public abstract FontType getFontType()
```


获取 Font 类型。

--------------------

> ```
> Type1, TrueType etc.
> ```

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getGlyphAccessor() {#getGlyphAccessor--}
```
public IGlyphAccessor getGlyphAccessor()
```


字体字形访问器。检索字形及其标识符。

**Returns:**
[IGlyphAccessor](../../com.aspose.font/iglyphaccessor) - Font glyph accessor.
### getGlyphById(GlyphId id) {#getGlyphById-com.aspose.font.GlyphId-}
```
public abstract Glyph getGlyphById(GlyphId id)
```


根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。GlyphId 为派生对象。例如：Type1 的 ID 是字形名称，属于 ( GlyphStringId ) 类的实例。TTF 的 ID 是整数索引，属于 ( GlyphInt32Id ) 类的实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | 字形 ID。 |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphIdType() {#getGlyphIdType--}
```
public abstract GlyphIdType getGlyphIdType()
```


字形 ID 类型规范。供需要了解 'bytes[]' 实际类型的使用者使用。

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Id type specification
### getGlyphsForText(String text) {#getGlyphsForText-java.lang.String-}
```
public GlyphId[] getGlyphsForText(String text)
```


获取文本的字形表示。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| text | java.lang.String | 输入文本。 |

**Returns:**
com.aspose.font.GlyphId[] - GlyphId 数组。
### getMetrics() {#getMetrics--}
```
public abstract IFontMetrics getMetrics()
```


获取 Font 度量。

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public abstract int getNumGlyphs()
```


获取字体中的字形数量。

**Returns:**
int - 字体中的字形数量。
### getPostscriptNames() {#getPostscriptNames--}
```
public abstract MultiLanguageString getPostscriptNames()
```


获取 PostScript 字体名称。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public abstract String getStyle()
```


获取字体样式。这是字体文件提供的原始字符串值。

**Returns:**
java.lang.String - 字体样式。
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




### open(FontDefinition fontDefinition) {#open-com.aspose.font.FontDefinition-}
```
public static Font open(FontDefinition fontDefinition)
```


打开字体，使用 FontDefinition 对象。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontDefinition | [FontDefinition](../../com.aspose.font/fontdefinition) | 字体定义对象。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, byte[] fontData) {#open-com.aspose.font.FontType-byte---}
```
public static Font open(FontType fontType, byte[] fontData)
```


打开字体，使用字体类型和字体数据字节数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fontData | byte[] | 用于加载字体的字节数组。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, StreamSource fontStreamSource) {#open-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public static Font open(FontType fontType, StreamSource fontStreamSource)
```


打开字体，使用字体类型和流源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fontStreamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体的流来源。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### open(FontType fontType, String fileName) {#open-com.aspose.font.FontType-java.lang.String-}
```
public static Font open(FontType fontType, String fileName)
```


打开字体，使用字体类型和字体文件名。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| 文件名 | java.lang.String | 字体文件名。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font loaded.
### save(OutputStream stream) {#save-java.io.OutputStream-}
```
public void save(OutputStream stream)
```


将字体保存为原始格式。

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 用于保存字体的流。 |

### save(String fileName) {#save-java.lang.String-}
```
public void save(String fileName)
```


将字体保存为原始格式。

--------------------

> ```
> Note: following Font types are supported for saving:
>  New TTF fonts;
>  TTF Font subsets;
>  CFF Font subsets;
>  Type1 Font subsets.
> ```

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文件名 | java.lang.String | 用于保存字体的文件。 |

### saveToFormat(OutputStream stream, FontSavingFormats outFormat) {#saveToFormat-java.io.OutputStream-com.aspose.font.FontSavingFormats-}
```
public void saveToFormat(OutputStream stream, FontSavingFormats outFormat)
```


将字体保存为指定格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | java.io.OutputStream | 用于保存字体的流 |
| outFormat | [FontSavingFormats](../../com.aspose.font/fontsavingformats) | 期望的格式 |

### setFontFamily(String value) {#setFontFamily-java.lang.String-}
```
public abstract void setFontFamily(String value)
```


设置字体族。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 新的字体族。 |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public abstract void setFontName(String value)
```


设置字体面名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 新的字体面名称。 |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public abstract void setStyle(String value)
```


设置字体样式。这是由字体文件提供的原始字符串值。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 新的字体样式。 |

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

