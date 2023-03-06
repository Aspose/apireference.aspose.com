---
title: OsmXmlDriver.CreateLayer
second_title: Aspose.GIS for .NET API 参考
description: OsmXmlDriver 方法. 创建图层并打开它以添加新功能
type: docs
weight: 40
url: /zh/net/aspose.gis.formats.osmxml/osmxmldriver/createlayer/
---
## CreateLayer(string, OsmXmlOptions) {#createlayer_7}

创建图层并打开它以添加新功能。

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | OsmXmlOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| InvalidOperationException | 该层已存在。 |

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [OsmXmlOptions](../../osmxmloptions/)
* class [OsmXmlDriver](../)
* 命名空间 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

创建图层并打开它以添加新功能。

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

### 也可以看看

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* 命名空间 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(string, OsmXmlOptions, SpatialReferenceSystem) {#createlayer_8}

创建图层并打开它以添加新功能。

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | OsmXmlOptions | 特定于驱动程序的选项。 |
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
* class [OsmXmlOptions](../../osmxmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* 命名空间 [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* 部件 [Aspose.GIS](../../../)


