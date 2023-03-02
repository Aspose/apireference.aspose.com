---
title: FeaturesSequence.SaveTo
second_title: Aspose.GIS for .NET API 参考
description: FeaturesSequence 方法. 将特征序列保存到图层
type: docs
weight: 50
url: /zh/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

将特征序列保存到图层。

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| destinationPath | String | 输出层的路径。 |
| destinationDriver | FileDriver | 输出层的格式驱动程序。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 任何论点都是`null`. |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 命名空间 [Aspose.Gis](../../featuressequence/)
* 部件 [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

将特征序列保存到图层。

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| destinationPath | AbstractPath | 输出层的路径。 |
| destinationDriver | FileDriver | 输出层的格式驱动程序。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 命名空间 [Aspose.Gis](../../featuressequence/)
* 部件 [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

将特征序列保存到图层。

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| destinationPath | String | 输出层的路径。 |
| destinationDriver | FileDriver | 输出层的格式驱动程序。 |
| options | SavingOptions | 保存过程的选项。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |
| NotSupportedException | 中指定的空间参考系统*options*不支持*destinationDriver*. |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 命名空间 [Aspose.Gis](../../featuressequence/)
* 部件 [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

将特征序列保存到图层。

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| destinationPath | AbstractPath | 输出层的路径。 |
| destinationDriver | FileDriver | 输出层的格式驱动程序。 |
| options | SavingOptions | 保存过程的选项。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 要素几何从源空间参考系统到目标空间参考系统的转换失败。 |
| NotSupportedException | 中指定的空间参考系统*options*不支持*destinationDriver*. |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 命名空间 [Aspose.Gis](../../featuressequence/)
* 部件 [Aspose.GIS](../../../)


