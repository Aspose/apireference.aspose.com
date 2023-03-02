---
title: VectorLayer.Convert
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 方法. 将图层转换为不同的格式
type: docs
weight: 200
url: /zh/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

将图层转换为不同的格式。

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| sourcePath | String | 要转换的层的路径。 |
| sourceDriver | FileDriver | 源层的格式驱动程序。 |
| destinationPath | String | 将作为转换结果创建的层的路径。 |
| destinationDriver | FileDriver | 目标层的格式驱动程序。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 任一条路径都是`null`. |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

将图层转换为不同的格式。

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| sourcePath | AbstractPath | 要转换的层的路径。 |
| sourceDriver | FileDriver | 源层的格式驱动程序。 |
| destinationPath | AbstractPath | 将作为转换结果创建的层的路径。 |
| destinationDriver | FileDriver | 目标层的格式驱动程序。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 任一条路径都是`null`. |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

将图层转换为不同的格式。

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| sourcePath | String | 要转换的层的路径。 |
| sourceDriver | FileDriver | 源层的格式驱动程序。 |
| destinationPath | String | 将作为转换结果创建的层的路径。 |
| destinationDriver | FileDriver | 目标层的格式驱动程序。 |
| options | ConversionOptions | 转换过程的选项。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 任一条路径都是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 中指定的空间参考系统*options*不支持*destinationDriver*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

将图层转换为不同的格式。

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| sourcePath | AbstractPath | 要转换的层的路径。 |
| sourceDriver | FileDriver | 源层的格式驱动程序。 |
| destinationPath | AbstractPath | 将作为转换结果创建的层的路径。 |
| destinationDriver | FileDriver | 目标层的格式驱动程序。 |
| options | ConversionOptions | 转换过程的选项。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 任一条路径都是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 中指定的空间参考系统*options*不支持*destinationDriver*. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


