---
title: "PsConverter"
second_title: "Aspose.Page for Java API 参考"
description: "表示 PsConverter 插件。"
type: docs
weight: 10
url: /zh/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

表示 PsConverter 插件。

此示例演示如何将 PS/EPS 文件转换为 PDF 文档。

// 创建 PsConverter PsConverter converter = new PsConverter(); // 创建 PsConverterToPdfOptions 对象以将输出数据类型设置为文件 PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 设置输出文件路径 opt.addSaveDataSource(new FileDataSource(outputPath)); // 启动转换过程 ResultContainer results = converter.process(opt);

此示例演示如何将 PS/EPS 文件转换为带文件输出的图像。

// 创建 PsConverter PsConverter converter = new PsConverter(); // 创建 PsConverterToImageOptions，目标图像格式为 JPEG。生成图像的默认格式为 PNG。 // 还可以设置生成图像的尺寸、分辨率、平滑模式以及 JPEG 结果图像格式的质量级别。 PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 如果输入的 PS 文件是多页的，结果将是一组图像文件，命名方式为：[\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // 启动转换过程 converter.process(opt);

此示例演示如何将 PS/EPS 文件转换为字节数组输出的图像。

在字节数组输出数据源 (byte [][]) 中，每个字节数组包含一页的图像。因此，对于单页文档，结果将包含 [1][] 数组；对于多页文档，结果将包含 [number of pages in input PS document][] 数组。 // 创建 PsConverter PsConverter converter = new PsConverter(); // 创建 PsConverterToImageOptions，目标图像格式为 JPEG。生成图像的默认格式为 PNG。 // 还可以设置生成图像的尺寸、分辨率、平滑模式以及 JPEG 结果图像格式的质量级别。 PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 如果输入的 PS 文件是多页的，结果将是一组图像文件，命名方式为：[\"outputPath\" without extension][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // 启动转换过程 converter.process(opt); // 获取生成的字节数组 byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [dispose()](#dispose--) | IDisposable 的实现。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | 使用指定参数启动 PsConverter 处理。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


IDisposable 的实现。

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


使用指定参数启动 PsConverter 处理。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | 包含 PsConverter 指令的选项对象。 |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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

