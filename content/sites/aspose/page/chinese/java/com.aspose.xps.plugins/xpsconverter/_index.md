---
title: "XpsConverter"
second_title: "Aspose.Page for Java API 参考"
description: "表示 XpsConverter 插件。"
type: docs
weight: 10
url: /zh/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

表示 XpsConverter 插件。

此示例演示如何将 XPS 文档转换为 PDF 文档。

// 创建 XpsConverter XpsConverter converter = new XpsConverter(); // 创建 XpsConverterToPdfOptions 对象以将输出数据类型设置为文件 XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 设置输出文件路径 opt.addSaveDataSource(new FileDataSource(outputPath)); // 启动转换过程 ResultContainer results = converter.process(opt);

此示例演示如何将 XPS 文档转换为带文件输出的图像。

// 创建 XpsConverter XpsConverter converter = new XpsConverter(); // 创建 XpsConverterToImageOptions，目标图像格式为 JPEG。生成图像的默认格式为 PNG。 // 还可以设置生成图像的尺寸、分辨率、平滑模式以及 JPEG 图像格式的质量级别。 XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 如果输入的 XPS 文件是多页的，结果将是一组图像文件，命名方式为：[\"outputPath\"（不含扩展名）][页码（从 0 开始）].[来自 \"outputPath\" 的扩展名] opt.addSaveDataSource(new FileDataSource(outputPath)); // 启动转换过程 converter.process(opt);

此示例演示如何将 XPS 文档转换为字节数组输出的图像。

在字节数组输出数据源 (byte[][]) 中，每个字节数组包含一页的图像。因此，对于单页文档，结果将包含 [1][] 数组；对于多页文档，结果将包含 [输入 XPS 文档页数][] 数组。 // 创建 XpsConverter XpsConverter converter = new XpsConverter(); // 创建 XpsConverterToImageOptions，目标图像格式为 JPEG。生成图像的默认格式为 PNG。 // 还可以设置生成图像的尺寸、分辨率、平滑模式以及 JPEG 图像格式的质量级别。 XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // 添加输入文件路径 opt.addDataSource(new FileDataSource(inputPath)); // 如果输入的 XPS 文件是多页的，结果将是一组图像文件，命名方式为：[\"outputPath\"（不含扩展名）][页码（从 1 开始）].[来自 \"outputPath\" 的扩展名] opt.addSaveDataSource(new ByteArrayDataSource()); // 启动转换过程 converter.process(opt); // 获取生成的字节数组 byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## 构造函数

| 构造函数 | 描述 |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## 方法

| 方法 | 描述 |
| --- | --- |
| [dispose()](#dispose--) | IDisposable 的实现。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | 使用指定的参数启动 XpsConverter 处理。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
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


使用指定的参数启动 XpsConverter 处理。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | 一个包含 XpsConverter 指令的选项对象。 |

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

