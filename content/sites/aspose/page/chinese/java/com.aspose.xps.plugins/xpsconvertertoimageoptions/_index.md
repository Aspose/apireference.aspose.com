---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page for Java API 参考"
description: "表示用于插件的 XPS 到图像转换器选项。"
type: docs
weight: 12
url: /zh/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

表示用于 [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) 插件的 XPS 到图像转换器选项。
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | 初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例。 |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | 初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，使用图像格式。 |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | 初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，指定生成图像的尺寸。 |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | 初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，使用图像格式。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | 向 XpsConverter 插件的数据集合添加新数据源。 |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | 向 XpsConverterOptions 插件的数据集合添加新数据源。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | 返回 XpsConverterOptions 插件的数据集合。 |
| [getImageFormat()](#getImageFormat--) | 获取图像格式。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getOperationName()](#getOperationName--) | 返回操作名称。 |
| [getPageNumbers()](#getPageNumbers--) | 获取要转换的 XPS 文档中页码的数组。 |
| [getResolution()](#getResolution--) | 获取图像分辨率。 |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 获取用于保存操作结果的已添加目标集合。 |
| [getSize()](#getSize--) | 获取生成图像的尺寸。 |
| [getSmoothingMode()](#getSmoothingMode--) | 获取渲染图像的平滑模式。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | 获取图像格式。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | 设置要转换的 XPS 文档页数数组。 |
| [setResolution(int resolution)](#setResolution-int-) | 设置图像分辨率。 |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | 设置生成图像的尺寸。 |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | 设置渲染图像的平滑模式。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例。

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，使用图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 生成图像的格式。 |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，指定生成图像的尺寸。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 大小 | java.awt.Dimension | 生成图像的尺寸。 |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


初始化 [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) 对象的新实例，使用图像格式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | 生成图像的格式。 |
| 大小 | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


向 XpsConverter 插件的数据集合添加新数据源。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | 要添加的数据源。 |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


向 XpsConverterOptions 插件的数据集合添加新数据源。

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


返回 XpsConverterOptions 插件的数据集合。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


获取要转换的 XPS 文档中页码的数组。

**Returns:**
int[] - XPS 文档页数的数组。
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


设置要转换的 XPS 文档页数数组。如果未设置，将转换所有页。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| pageNumbers | int[] | XPS 文档中页面数量的数组。 |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


设置渲染图像的平滑模式。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | 平滑模式。 |

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

