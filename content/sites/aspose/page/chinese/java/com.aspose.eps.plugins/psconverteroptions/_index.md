---
title: "PsConverterOptions"
second_title: "Aspose.Page for Java API 参考"
description: "表示插件的选项基类。"
type: docs
weight: 11
url: /zh/java/com.aspose.eps.plugins/psconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class PsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

表示 [PsConverter](../../com.aspose.eps.plugins/psconverter) 插件选项的基类。
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
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getOperationName()](#getOperationName--) | 返回操作名称。 |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 获取用于保存操作结果的已添加目标集合。 |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | 获取在转换期间允许输出警告和消息的标志。 |
| [isSupressErrors()](#isSupressErrors--) | 返回指示在转换期间是否会抑制错误的值。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | 指定转换器应在其中查找输入文档字体的附加字体文件夹。 |
| [setDebug(boolean debug)](#setDebug-boolean-) | 指定在转换期间允许输出警告和消息的标志。 |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | 指定指示在转换期间是否抑制错误的标志。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


返回指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Returns:**
int - 指定图像压缩级别的值。
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


返回操作名称。

**Returns:**
java.lang.String
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


获取用于保存操作结果的已添加目标集合。

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

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

