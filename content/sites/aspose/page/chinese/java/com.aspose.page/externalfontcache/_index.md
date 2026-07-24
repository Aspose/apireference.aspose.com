---
title: "ExternalFontCache"
second_title: "Aspose.Page for Java API 参考"
description: "使用此类获取以 Device 接受的形式的字体封装。"
type: docs
weight: 13
url: /zh/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

使用此类获取以 Device 接受的形式的字体封装。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## 字段

| 字段 | 描述 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | 默认字体大小。 |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | 默认字体样式。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | 通过字体族名称、默认大小 (1) 和默认样式 (PLAIN) 获取 DrFont。 |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | 通过字体族名称、默认大小 (1) 和样式获取 DrFont。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | 通过字体族名称、大小和样式获取 DrFont。 |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | 通过字体族名称、大小、样式和字体大写形式获取 DrFont。 |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | 通过字体族名称、大小、样式和替代字体族名称获取 DrFont。 |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | 通过字体族名称、大小、样式、字体大写形式和替代字体族名称获取 DrFont。 |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | 通过字体族名称、样式和替代字体族名称获取 TTFont。 |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定额外的字体文件夹。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


默认字体大小。

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


默认字体样式。

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


通过字体族名称、默认大小 (1) 和默认样式 (PLAIN) 获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


通过字体族名称、默认大小 (1) 和样式获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| 样式 | int | 字体样式。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


通过字体族名称、大小和样式获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| sizePoints | float | 字体大小（单位为点，1 点等于 1/72 英寸）。 |
| 样式 | int | 字体样式。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


通过字体族名称、大小、样式和字体大写形式获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| sizePoints | float | 字体大小（单位为点，1 点等于 1/72 英寸）。 |
| 样式 | int | 字体样式。 |
| fontCapitals | int | 字体大写。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


通过字体族名称、大小、样式和替代字体族名称获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| sizePoints | float | 字体大小（单位为点，1 点等于 1/72 英寸）。 |
| 样式 | int | 字体样式。 |
| altFamilyName | java.lang.String | 备用字体族名称。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


通过字体族名称、大小、样式、字体大写形式和替代字体族名称获取 DrFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| sizePoints | float | 字体大小（单位为点，1 点等于 1/72 英寸）。 |
| 样式 | int | 字体样式。 |
| altFamilyName | java.lang.String | 备用字体族名称。 |
| fontCapitals | int | 字体大写。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


通过字体族名称、样式和替代字体族名称获取 TTFont。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| familyName | java.lang.String | 字体族名称。 |
| 样式 | int | 字体样式。 |
| altFamilyName | java.lang.String | 备用字体族名称。 |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
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




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


指定额外的字体文件夹。操作系统使用的字体文件夹默认由 ExternalFont 缓存使用。通常不需要自行定义它们，

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | 额外字体文件夹的数组。 |

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

