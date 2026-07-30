---
title: "TtfFont"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 TrueType 字体 TTF。"
type: docs
weight: 94
url: /zh/java/com.aspose.font/ttffont/
---
**Inheritance:**
java.lang.Object, [com.aspose.font.Font](../../com.aspose.font/font)
```
public class TtfFont extends Font
```

表示 TrueType 字体 (TTF)。
## 方法

| 方法 | 描述 |
| --- | --- |
| [convert(FontType fontType)](#convert-com.aspose.font.FontType-) | 将 Font 转换为另一种格式。 |
| [convert(FontType fontType, Collection<Integer> limitingCharacterSet)](#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--) | 将 Font 转换为另一种格式，并限制字符集  *注意：仅支持 TTF 字体类型。* |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAllGlyphIds()](#getAllGlyphIds--) | 返回 Font 中可用的所有字形 ID 的数组。 |
| [getCffFont()](#getCffFont--) | 获取 CFF Font（如果存在）。 |
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
| [getGlyphById(String glyphName)](#getGlyphById-java.lang.String-) | 根据字形名称返回字形。 |
| [getGlyphById(long id)](#getGlyphById-long-) | 根据字形 ID 返回字形。 |
| [getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-) | 获取指定字形标识符的字形，并用该字形的组件填充传入的字形标识符列表。 |
| [getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-) | 获取指定字形名称的字形，并用该字形的组件填充传入的字形标识符列表。 |
| [getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)](#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-) | 获取指定字形索引的字形，并用该字形的组件填充传入的字形标识符列表。 |
| [getGlyphIdType()](#getGlyphIdType--) | 获取字形 ID 类型规范。 |
| [getGlyphsForText(String text)](#getGlyphsForText-java.lang.String-) | 获取文本的字形表示。 |
| [getMetrics()](#getMetrics--) | 获取 Font 度量。 |
| [getNumGlyphs()](#getNumGlyphs--) | 获取字体中的字形数量。 |
| [getPostscriptNames()](#getPostscriptNames--) | 获取 Postscript 字体名称。 |
| [getStyle()](#getStyle--) | 获取 Font 样式。 |
| [getTtfTables()](#getTtfTables--) | 获取 TTF 表。 |
| [hashCode()](#hashCode--) |  |
| [isSymbolic()](#isSymbolic--) | 如果字体是符号字体，则返回 true。 |
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
public Font convert(FontType fontType)
```


将字体转换为其他格式。注意：目前仅支持 TTF 字体类型。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 要转换成的字体格式类型。 |

**Returns:**
[Font](../../com.aspose.font/font) - Font converted into new format.
### convert(FontType fontType, Collection<Integer> limitingCharacterSet) {#convert-com.aspose.font.FontType-java.util.Collection-java.lang.Integer--}
```
public Font convert(FontType fontType, Collection<Integer> limitingCharacterSet)
```


将 Font 转换为另一种格式，并限制字符集  *注意：仅支持 TTF 字体类型。*

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 要转换成的字体格式类型。 |
| limitingCharacterSet | java.util.Collection<java.lang.Integer> | 限制字符集。 |

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
public GlyphId[] getAllGlyphIds()
```


返回字体中所有可用字形 ID 的数组。字形 ID 是字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 ( GlyphStringId ) 类或 ( GlyphUInt32Id ) 类的实例。支持通过 Post 表映射使用名称（string）对 TTF 字体进行字形寻址。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

**Returns:**
com.aspose.font.GlyphId[] - 字形标识符。
### getCffFont() {#getCffFont--}
```
public Font getCffFont()
```


获取 CFF Font（如果存在）。

**Returns:**
[Font](../../com.aspose.font/font) - CFF Font.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncoding() {#getEncoding--}
```
public IFontEncoding getEncoding()
```


获取 Font 编码。

**Returns:**
[IFontEncoding](../../com.aspose.font/ifontencoding) - Font encoding.
### getFontDefinition() {#getFontDefinition--}
```
public FontDefinition getFontDefinition()
```


获取 Font 定义。

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - Font definition.
### getFontFamily() {#getFontFamily--}
```
public String getFontFamily()
```


获取 Font 家族。

**Returns:**
java.lang.String - 字体族。
### getFontName() {#getFontName--}
```
public String getFontName()
```


获取 Font 字体名称。

**Returns:**
java.lang.String - 字体面名称。
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


获取 Font 名称。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names
### getFontSaver() {#getFontSaver--}
```
public IFontSaver getFontSaver()
```


获取 Font 保存功能。

**Returns:**
[IFontSaver](../../com.aspose.font/ifontsaver) - Font save functionality.
### getFontStyle() {#getFontStyle--}
```
public int getFontStyle()
```


获取字体样式。这是一个在通用类型中计算并表示的值。

**Returns:**
int - 字体样式。通常是 FontStyle 类常量标志值的组合或 0。
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


获取字体类型。返回 FontType.TTF 值。

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
public Glyph getGlyphById(GlyphId id)
```


根据字形 ID 返回字形。字形 ID 是字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 ( GlyphStringId ) 类的实例或 ( GlyphUInt32Id ) 类的实例。支持通过 Post 表映射使用名称（string）来寻址 TTF 字体的字形。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) |  |

**Returns:**
[Glyph](../../com.aspose.font/glyph)
### getGlyphById(String glyphName) {#getGlyphById-java.lang.String-}
```
public Glyph getGlyphById(String glyphName)
```


根据字形名称返回字形。支持通过 Post 表映射使用名称（string）来寻址 TTF 字体的字形。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | java.lang.String | 字形字符串标识符。 |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphById(long id) {#getGlyphById-long-}
```
public Glyph getGlyphById(long id)
```


根据字形 ID 返回字形。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | long | 字形索引。 |

**Returns:**
[Glyph](../../com.aspose.font/glyph) - Glyph.
### getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-com.aspose.font.GlyphId-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(GlyphId id, GlyphIdList componentsToPopulate)
```


根据传入的字形标识符获取字形，并将该字形的组成部分标识符填充到传入的字形标识符列表中。字形 ID 是字形的唯一编号，取决于字体类型。TTF 字体的字形 ID 可以是 ( GlyphStringId ) 类的实例或 ( GlyphUInt32Id ) 类的实例。支持通过 Post 表映射使用名称（string）来寻址 TTF 字体的字形。如果是 CFF 字体，则使用 CFF 结构通过名称来寻址字形。

--------------------

应传入空集合 componentsToPopulate，用于保存字形组件 ID 列表。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | [GlyphId](../../com.aspose.font/glyphid) | 字形 ID。 |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | 用于填充的字形标识符列表。 |

### getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-java.lang.String-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(String glyphName, GlyphIdList componentsToPopulate)
```


获取指定字形名称的字形，并用该字形的组件填充传入的字形标识符列表。

--------------------

应传入空集合 componentsToPopulate，用于保存字形组件 ID 列表。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| glyphName | java.lang.String | 字形名称。 |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | 用于填充的字形标识符列表。 |

### getGlyphComponentsById(long id, GlyphIdList componentsToPopulate) {#getGlyphComponentsById-long-com.aspose.font.GlyphIdList-}
```
public void getGlyphComponentsById(long id, GlyphIdList componentsToPopulate)
```


获取指定字形索引的字形，并用该字形的组件填充传入的字形标识符列表。

--------------------

应传入空集合 componentsToPopulate，用于保存字形组件 ID 列表。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| id | long | 字形索引。 |
| componentsToPopulate | [GlyphIdList](../../com.aspose.font/glyphidlist) | 用于填充的字形标识符列表。 |

### getGlyphIdType() {#getGlyphIdType--}
```
public GlyphIdType getGlyphIdType()
```


获取字形 ID 类型规范。

**Returns:**
[GlyphIdType](../../com.aspose.font/glyphidtype) - Glyph id type specification.
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
public IFontMetrics getMetrics()
```


获取 Font 度量。

**Returns:**
[IFontMetrics](../../com.aspose.font/ifontmetrics) - Font metrics.
### getNumGlyphs() {#getNumGlyphs--}
```
public int getNumGlyphs()
```


获取字体中的字形数量。

**Returns:**
int - 字体中的字形数量。
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


获取 Postscript 字体名称。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript font names.
### getStyle() {#getStyle--}
```
public String getStyle()
```


获取字体样式。这是字体文件提供的原始字符串值。

**Returns:**
java.lang.String - 字体样式。
### getTtfTables() {#getTtfTables--}
```
public TtfTableRepository getTtfTables()
```


获取 TTF 表。

**Returns:**
[TtfTableRepository](../../com.aspose.font/ttftablerepository) - TTF tables.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isSymbolic() {#isSymbolic--}
```
public boolean isSymbolic()
```


如果字体是符号字体，则返回 true。

**Returns:**
boolean - 如果字体是符号字体则为 true。
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
public void setFontFamily(String value)
```


设置字体族。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 新的字体族。 |

### setFontName(String value) {#setFontName-java.lang.String-}
```
public void setFontName(String value)
```


设置字体面名称。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.lang.String | 新的字体面名称。 |

### setStyle(String value) {#setStyle-java.lang.String-}
```
public void setStyle(String value)
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

