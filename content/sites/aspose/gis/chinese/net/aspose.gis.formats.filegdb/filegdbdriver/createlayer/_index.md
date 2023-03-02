---
title: FileGdbDriver.CreateLayer
second_title: Aspose.GIS for .NET API 参考
description: FileGdbDriver 方法. 创建图层并打开它以添加新功能
type: docs
weight: 60
url: /zh/net/aspose.gis.formats.filegdb/filegdbdriver/createlayer/
---
## CreateLayer(string, FileGdbOptions) {#createlayer_8}

创建图层并打开它以添加新功能。

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | FileGdbOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 该层已存在。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(string, FileGdbOptions, SpatialReferenceSystem) {#createlayer_9}

创建一个图层并打开它以进行追加。

```csharp
public VectorLayer CreateLayer(string path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | FileGdbOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 该层已存在。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

创建一个图层并打开它以进行追加。

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 该层已存在。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, FileGdbOptions, SpatialReferenceSystem) {#createlayer_3}

创建一个图层并打开它以进行追加。

```csharp
public VectorLayer CreateLayer(AbstractPath path, FileGdbOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | FileGdbOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 该层已存在。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [FileGdbOptions](../../filegdboptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileGdbDriver](../)
* 命名空间 [Aspose.Gis.Formats.FileGdb](../../filegdbdriver/)
* 部件 [Aspose.GIS](../../../)


