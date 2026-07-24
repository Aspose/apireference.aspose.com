---
title: "JpegSaveOptions"
second_title: "Aspose.Page for Java API 参考"
description: "用于 XPS-as-JPEG 保存选项的类。"
type: docs
weight: 12
url: /zh/java/com.aspose.xps.rendering/jpegsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class JpegSaveOptions extends ImageSaveOptions
```

用于 XPS-as-JPEG 保存选项的类。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [JpegSaveOptions()](#JpegSaveOptions--) | 创建选项的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 返回转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [getBatchSize()](#getBatchSize--) | 返回从节点到节点传递的一部分页面的大小。 |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | 返回在 XPS 页面保存之前执行修改的事件处理程序集合。 |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | 获取标志，指示是否需要将非 TrueType 字体保存为 TTF。 |
| [getExceptions()](#getExceptions--) | 返回非关键错误的列表。 |
| [getImageSize()](#getImageSize--) | 获取输出图像的像素大小。 |
| [getInterpolationMode()](#getInterpolationMode--) | 获取插值模式。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getPageNumbers()](#getPageNumbers--) | 获取要渲染的页面编号数组。 |
| [getResolution()](#getResolution--) | 获取图像分辨率。 |
| [getSize()](#getSize--) | 获取页面或图像的大小。 |
| [getSmoothingMode()](#getSmoothingMode--) | 获取平滑模式。 |
| [getTextRenderingHint()](#getTextRenderingHint--) | 获取文本渲染提示。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setBatchSize(int value)](#setBatchSize-int-) | 设置从节点到节点传递的一部分页面的大小。 |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | 指定是否将非 TrueType 字体保存为 TTF。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | 设置输出图像的像素大小。 |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | 设置插值模式。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | 设置要渲染的页面编号数组。 |
| [setResolution(float value)](#setResolution-float-) | 设置图像分辨率。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 指定页面或图像的大小。 |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | 设置平滑模式。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | 设置文本渲染提示。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JpegSaveOptions() {#JpegSaveOptions--}
```
public JpegSaveOptions()
```


创建选项的新实例。

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


返回从节点到节点传递的一部分页面的大小。

**Returns:**
int - 从节点到节点传递的一部分页面的大小。
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


返回在 XPS 页面保存之前执行修改的事件处理程序集合。

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


获取输出图像的像素大小。

**Returns:**
java.awt.Dimension - 输出图像的像素大小。
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


获取插值模式。

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


获取要渲染的页面编号数组。

**Returns:**
int[] - 页面数量。
### getResolution() {#getResolution--}
```
public float getResolution()
```


获取图像分辨率。

**Returns:**
float - 图像分辨率。
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


获取文本渲染提示。

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


设置从节点到节点传递的一部分页面的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 从节点到节点传递的页面部分的大小。 |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


设置输出图像的像素大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | java.awt.Dimension | 输出图像的像素大小。 |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


设置插值模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | 插值模式。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


设置要渲染的页面编号数组。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int[] | 页面数量。 |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


设置图像分辨率。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | float | 图像分辨率。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


指定页面或图像的大小。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 页面或图像的尺寸。 |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


设置平滑模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | 平滑模式。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


指定指示在转换期间是否抑制错误的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 布尔值。 |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


设置文本渲染提示。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | 文本渲染提示。 |

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

