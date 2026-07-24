---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page for Java API 参考"
description: "表示用于插件的 PS/EPS 到图像转换器选项。"
type: docs
weight: 12
url: /zh/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

表示用于 [PsConverter](../../com.aspose.eps.plugins/psconverter) 插件的 PS/EPS 到图像转换器选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | 初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。 |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | 使用图像格式初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。 |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | 使用生成图像的尺寸初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。 |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | 使用图像格式初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | 向 PsConverter 插件的数据集合添加新的数据源。 |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | 向 PsConverterOptions 插件的数据集合添加新的数据源。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | 返回转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | 返回 PsConverterOptions 插件的数据集合。 |
| [getExceptions()](#getExceptions--) | 返回非关键错误的列表。 |
| [getImageFormat()](#getImageFormat--) | 获取图像格式。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getOperationName()](#getOperationName--) | 返回操作名称。 |
| [getResolution()](#getResolution--) | 获取图像分辨率。 |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 获取用于保存操作结果的已添加目标集合。 |
| [getSize()](#getSize--) | 获取生成图像的尺寸。 |
| [getSmoothingMode()](#getSmoothingMode--) | 获取渲染图像的平滑模式。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | 获取图像格式。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setResolution(int resolution)](#setResolution-int-) | 设置图像分辨率。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 设置生成图像的尺寸。 |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | 设置渲染图像的平滑模式。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


使用图像格式初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 生成图像的格式。 |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


使用生成图像的尺寸初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 生成图像的尺寸。 |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


使用图像格式初始化 [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) 对象的新实例。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 生成图像的格式。 |
| 大小 | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


向 PsConverter 插件的数据集合添加新的数据源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 要添加的数据源。 |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


向 PsConverterOptions 插件的数据集合添加新的数据源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 用于保存操作结果的数据源（文件或流）。 |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


返回 PsConverterOptions 插件的数据集合。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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


获取图像格式。

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


返回操作名称。

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


获取图像分辨率。

**Returns:**
int - 图像分辨率。
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


获取用于保存操作结果的已添加目标集合。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


获取生成图像的尺寸。

**Returns:**
java.awt.Dimension - 图像尺寸。
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


获取渲染图像的平滑模式。

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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


获取图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 生成图像的格式。 |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


设置图像分辨率。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 分辨率 | int | 生成图像的分辨率。 |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


设置生成图像的尺寸。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 生成图像的尺寸。 |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


设置渲染图像的平滑模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | 平滑模式。 |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


指定指示在转换期间是否抑制错误的标志。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| supressErrors | boolean | 布尔值。 |

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

