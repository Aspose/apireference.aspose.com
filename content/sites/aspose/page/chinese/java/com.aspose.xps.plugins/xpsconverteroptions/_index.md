---
title: "XpsConverterOptions"
second_title: "Aspose.Page for Java API 参考"
description: "表示插件的选项基类。"
type: docs
weight: 11
url: /zh/java/com.aspose.xps.plugins/xpsconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class XpsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

表示 [XpsConverter](../../com.aspose.xps.plugins/xpsconverter) 插件的选项基类。
## 方法

| 方法 | 描述 |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | 向 XpsConverter 插件的数据集合添加新数据源。 |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | 向 XpsConverterOptions 插件的数据集合添加新数据源。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | 返回 XpsConverterOptions 插件的数据集合。 |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | 返回指定图像压缩级别的值。 |
| [getOperationName()](#getOperationName--) | 返回操作名称。 |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | 获取用于保存操作结果的已添加目标集合。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | 设置指定图像压缩级别的值。 |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


设置指定图像压缩级别的值。可用值为 0 到 100。指定的数字越低，压缩率越高，图像质量因此越低。0 值产生最低质量的图像，而 100 则产生最高质量的图像。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | int | 指定图像压缩级别的值。 |

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

