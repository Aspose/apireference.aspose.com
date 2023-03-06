---
title: FileDriver.CreateDataset
second_title: Aspose.GIS for .NET API 参考
description: FileDriver 方法. 创建数据集
type: docs
weight: 50
url: /zh/net/aspose.gis/filedriver/createdataset/
---
## CreateDataset(string) {#createdataset_2}

创建数据集。

```csharp
public Dataset CreateDataset(string path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 数据集的路径。 |

### 返回值

的实例[`Dataset`](../../dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 创建数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath) {#createdataset}

创建数据集。

```csharp
public Dataset CreateDataset(AbstractPath path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 数据集的路径。 |

### 返回值

的实例[`Dataset`](../../dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 创建数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateDataset(string, DriverOptions) {#createdataset_3}

创建数据集。

```csharp
public Dataset CreateDataset(string path, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 数据集的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`Dataset`](../../dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 创建数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateDataset(AbstractPath, DriverOptions) {#createdataset_1}

创建数据集。

```csharp
public virtual Dataset CreateDataset(AbstractPath path, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 数据集的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`Dataset`](../../dataset/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 创建数据集时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法打开数据集（请参阅[`CanOpenDatasets`](../canopendatasets/)). |
| InvalidOperationException | 数据集已经存在。 |

### 也可以看看

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)


