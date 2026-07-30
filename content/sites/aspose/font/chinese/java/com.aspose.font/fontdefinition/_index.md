---
title: "FontDefinition"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示 Font 文件集定义。"
type: docs
weight: 38
url: /zh/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

表示字体文件集定义。此类包含与字体内部数据无关的字段。这些字段描述字体的放置以及从某些字体源（文件、内存等）加载字体所需的其他数据。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | 创建单文件字体定义。 |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | 创建单文件字体定义。 |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | 创建单文件字体定义。 |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | 创建单文件字体定义。 |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | 创建单文件字体定义。 |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | 创建单文件字体定义。 |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | 创建多文件字体定义。 |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | 创建多文件字体定义。 |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | 创建多文件字体定义。 |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | 创建多文件字体定义。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | 获取文件定义集合。 |
| [getFontName()](#getFontName--) | 返回字体名称。 |
| [getFontNames()](#getFontNames--) | 获取字体名称作为一个  MultiLanguageString 。 |
| [getFontType()](#getFontType--) | 获取 Font 类型。 |
| [getPostscriptName()](#getPostscriptName--) | 获取 Postscript 字体名称。 |
| [getPostscriptNames()](#getPostscriptNames--) | 获取 Postscript 字体名称作为一个  MultiLanguageString 。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | 返回针对字体流源和字体类型的 FontDefinition。 |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | 返回针对字体文件和字体类型的 FontDefinition。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileExtension | java.lang.String | 字体文件扩展名。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontName | java.lang.String | 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileExtension | java.lang.String | 字体文件扩展名。 |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontName | java.lang.String | 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


创建单文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontName | java.lang.String | 字体名称。 |
| postscriptName | java.lang.String | Postscript 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


创建多文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | FontFileDefinition 对象数组。 |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


创建多文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontName | java.lang.String | 字体名称。 |
| postscriptName | java.lang.String | Postscript 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | FontFileDefinition 对象数组。 |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


创建多文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 字体名称。 |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


创建多文件字体定义。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | 字体名称。 |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript 字体名称。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | FontFileDefinition 对象数组。 |

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
### getFileDefinitions() {#getFileDefinitions--}
```
public FontFileDefinition[] getFileDefinitions()
```


获取文件定义集合。

**Returns:**
com.aspose.font.FontFileDefinition[] - 文件定义集合。
### getFontName() {#getFontName--}
```
public String getFontName()
```


返回字体名称。

**Returns:**
java.lang.String - 字体名称。
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


获取字体名称作为一个  MultiLanguageString 。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


获取 Font 类型。

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


获取 Postscript 字体名称。

**Returns:**
java.lang.String - Postscript 字体名称。
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


获取 Postscript 字体名称作为一个  MultiLanguageString 。

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names as a  MultiLanguageString .
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




### open(StreamSource source, FontType fontType) {#open-com.aspose.font.StreamSource-com.aspose.font.FontType-}
```
public static FontDefinition open(StreamSource source, FontType fontType)
```


返回针对字体流源和字体类型的 FontDefinition。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | 字体流源。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


返回针对字体文件和字体类型的 FontDefinition。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 文件名 | java.lang.String | 字体文件名。 |
| fontType | [FontType](../../com.aspose.font/fonttype) | 字体类型。 |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
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

