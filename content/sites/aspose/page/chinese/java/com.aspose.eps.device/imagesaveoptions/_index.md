---
title: "ImageSaveOptions"
second_title: "Aspose.Page for Java API 参考"
description: "此类包含管理转换过程所需的选项。"
type: docs
weight: 10
url: /zh/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

此类包含管理转换过程所需的选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | 初始化 ImageSaveOptions 类的新实例，默认标志 suppressErrors 为 true，debug 为 false。 |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | 初始化 ImageSaveOptions 的新实例，指定图像格式。 |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | 初始化 ImageSaveOptions 的新实例，指定图像尺寸。 |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | 初始化 ImageSaveOptions 的新实例，指定图像尺寸和图像格式。 |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | 初始化 ImageSaveOptions 的新实例，指定图像格式和 suppressErrors 标志。 |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | 初始化 ImageSaveOptions 的新实例，指定图像尺寸和 suppressErrors 标志。 |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | 初始化 ImageSaveOptions 的新实例，指定图像尺寸、图像格式和 suppressErrors 标志。 |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | 初始化 ImageSaveOptions 类的新实例，默认标志 debug 为 false。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 返回转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 获取标志，指示是否需要将非 TrueType 字体保存为 TTF。 |
| [getExceptions()](#getExceptions--) | 返回非关键错误的列表。 |
| [getImageFormat()](#getImageFormat--) | 获取结果图像的图像格式。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getResolution()](#getResolution--) | 返回结果图像的分辨率。 |
| [getSize()](#getSize--) | 获取页面或图像的大小。 |
| [getSmoothingMode()](#getSmoothingMode--) | 获取平滑模式。 |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | 指示库是否会尝试合并图像碎片。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 指定是否将非 TrueType 字体保存为 TTF。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | 指定结果图像的图像格式。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setResolution(float resolution)](#setResolution-float-) | 指定结果图像的分辨率。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 指定页面或图像的大小。 |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | 设置平滑模式。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | 指定库是否应尝试合并图像碎片。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


初始化 ImageSaveOptions 类的新实例，默认标志 suppressErrors 为 true，debug 为 false。

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


初始化 ImageSaveOptions 的新实例，指定图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 图像的格式。 |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


初始化 ImageSaveOptions 的新实例，指定图像尺寸。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 图像大小。 |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


初始化 ImageSaveOptions 的新实例，指定图像尺寸和图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 图像大小。 |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 图像的格式。 |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


初始化 ImageSaveOptions 的新实例，指定图像格式和 suppressErrors 标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 图像的格式。 |
| supressErrors | boolean | 如果为 true，则即使出现非关键错误，转换仍将继续。 |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


初始化 ImageSaveOptions 的新实例，指定图像尺寸和 suppressErrors 标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 图像大小。 |
| supressErrors | boolean | 如果为 true，则即使出现非关键错误，转换仍将继续。 |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


初始化 ImageSaveOptions 的新实例，指定图像尺寸、图像格式和 suppressErrors 标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 图像大小。 |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 图像的格式。 |
| supressErrors | boolean | 如果为 true，则即使出现非关键错误，转换仍将继续。 |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


初始化 ImageSaveOptions 类的新实例，默认标志 debug 为 false。

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
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


返回非关键错误的列表。

**Returns:**
java.util.List<java.lang.Exception> - 异常列表
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


获取结果图像的图像格式。

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getResolution() {#getResolution--}
```
public float getResolution()
```


返回结果图像的分辨率。

**Returns:**
float - 图像的分辨率。
### getSize() {#getSize--}
```
public Dimension getSize()
```


获取页面或图像的大小。

**Returns:**
java.awt.Dimension - 页面或图像的尺寸。
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


获取平滑模式。

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


指示库是否会尝试合并图像碎片。它在源 PS/EPS 文件中的图像被切割成碎片时使用。在这种情况下，如果没有此标志，碎片之间会留下细小的间隙。

**Returns:**
boolean - 标志的值。
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
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


返回指示在转换期间是否会抑制错误的值。

**Returns:**
boolean - 布尔值
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

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


指定结果图像的图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 输出图像格式。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


指定结果图像的分辨率。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 分辨率 | float | 图像的分辨率。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


指定页面或图像的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 页面或图像的尺寸。 |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


设置平滑模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | 要设置的 smoothingMode |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


指定指示在转换期间是否抑制错误的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 布尔值。 |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


指定库是否应尝试合并图像碎片。它在源 PS/EPS 文件中的图像被切割成碎片时使用。在这种情况下，如果没有此标志，碎片之间会留下细小的间隙。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| tryJoinImageFragments | boolean | 标志的值。 |

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

