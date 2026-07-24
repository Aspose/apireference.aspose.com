---
title: "PsSaveOptions"
second_title: "Aspose.Page for Java API 参考"
description: "此类包含管理转换过程所需的选项。"
type: docs
weight: 12
url: /zh/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

此类包含管理转换过程所需的选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | 初始化 PdfSaveOptions 类的新实例，默认标志 suppressErrors 为 true，debug 为 false。 |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | 初始化 PdfSaveOptions 类的新实例，默认标志 debug 为 false。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 返回转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 获取标志，指示是否需要将非 TrueType 字体保存为 TTF。 |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | 返回非关键错误的列表。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | 获取页面或图像的大小。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isEmbedFonts()](#isEmbedFonts--) | 指示是否在 PS 文档中嵌入使用的字体 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 指定是否将非 TrueType 字体保存为 TTF。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | 指定是否在 PS 文档中嵌入使用的字体 |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | 指定在 PS 文档中嵌入字体的字体类型 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | 指定生成文件的保存格式 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 指定页面或图像的大小。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


初始化 PdfSaveOptions 类的新实例，默认标志 suppressErrors 为 true，debug 为 false。

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


初始化 PdfSaveOptions 类的新实例，默认标志 debug 为 false。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 如果为 true，则即使出现非关键错误，转换仍将继续。 |

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


返回转换器应在其中为输入文档查找字体的附加字体文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。

**Returns:**
java.lang.String[] - 字体文件夹数组。
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - 背景颜色
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


获取标志，指示是否需要将非 TrueType 字体保存为 TTF。

**Returns:**
boolean - 标志值。
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - 在 PS 文档中嵌入字体的字体类型
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


返回非关键错误的列表。

**Returns:**
java.util.List<java.lang.Exception> - 异常列表
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - 页面边距
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - 页面尺寸
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


获取页面或图像的大小。

**Returns:**
java.awt.Dimension - 页面或图像的尺寸。
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


获取在转换期间允许输出警告和消息的标志。

**Returns:**
boolean - 调试值。
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


指示是否在 PS 文档中嵌入使用的字体

**Returns:**
boolean - embedFonts 标志的值
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


返回指示在转换期间是否会抑制错误的值。

**Returns:**
boolean - 布尔值
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - 指示背景是否透明
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


指定转换器应在其中为输入文档查找字体的附加字体文件夹。默认文件夹是操作系统用于内部需求的标准字体文件夹。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | 字体文件夹数组。 |

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| backgroundColor | java.awt.Color | 指定背景颜色 |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


指定是否将非 TrueType 字体保存为 TTF。这会显著减小 PS 转 PDF 转换后生成的文档体积，并提升将包含大量非 TrueType 字体文本的 PS 文件转换为任何输出格式的速度。然而，在将 PostSctipt 文件转换为图像时会出现轻微的垂直文字位移。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | boolean | 标志值。 |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


指定在转换期间允许输出警告和消息的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| debug | boolean | 布尔值。 |

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


指定是否在 PS 文档中嵌入使用的字体

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| embedFonts | boolean | embedFonts 标志 |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


指定在 PS 文档中嵌入字体的字体类型

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| embedFontsAs | java.lang.String | 字体类型 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 边距 | java.awt.Insets | 指定页面的边距 |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pageSize | java.awt.Dimension | 指定页面的尺寸 |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


指定生成文件的保存格式

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | 生成文件的格式 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


指定页面或图像的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 页面或图像的尺寸。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


指定指示在转换期间是否抑制错误的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 布尔值。 |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 透明 | boolean | 指定背景是否透明 |

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

