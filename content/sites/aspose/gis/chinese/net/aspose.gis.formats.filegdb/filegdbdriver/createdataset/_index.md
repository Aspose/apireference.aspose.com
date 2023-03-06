---
title: FileGdbDriver.CreateDataset
second_title: Aspose.GIS for .NET API 参考
description: FileGdbDriver 方法. 创建数据集
type: docs
weight: 50
url: /zh/net/aspose.gis.formats.filegdb/filegdbdriver/createdataset/
---
## CreateDataset(string, FileGdbOptions) {#createdataset_5}

创建数据集。

```csharp
public Dataset CreateDataset(string path, FileGdbOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 数据集的路径。 |
| options | FileGdbOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../../aspose.gis/gisexception/) | 读取数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../../aspose.gis/dataset/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

创建数据集。

```csharp
public override Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 数据集的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../../aspose.gis/gisexception/) | 读取数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, FileGdbOptions) {#createdataset_2}

创建数据集。

```csharp
public Dataset CreateDataset(AbstractPath path, FileGdbOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 数据集的路径。 |
| options | FileGdbOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`Dataset`](../../../aspose.gis/dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../../aspose.gis/gisexception/) | 读取数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../../../aspose.gis/filedriver/canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../../aspose.gis/dataset/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)


