---
title: Class OsmXmlDriver
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Formats.OsmXml.OsmXmlDriver 班级. OSM XML 格式的驱动程序
type: docs
weight: 620
url: /zh/net/aspose.gis.formats.osmxml/osmxmldriver/
---
## OsmXmlDriver class

OSM XML 格式的驱动程序。

```csharp
public sealed class OsmXmlDriver : FileDriver
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.osmxml/osmxmldriver/cancreatedatasets/) { get; } | 获取一个值，指示此驱动程序是否可以创建数据集。 |
| override [CanCreateLayers](../../aspose.gis.formats.osmxml/osmxmldriver/cancreatelayers/) { get; } | 获取一个值，指示此驱动程序是否可以创建矢量图层。 |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | 获取一个值，指示此驱动程序是否可以打开数据集。 |
| override [CanOpenLayers](../../aspose.gis.formats.osmxml/osmxmldriver/canopenlayers/) { get; } | 获取一个值，指示此驱动程序是否可以打开矢量图层。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | 创建数据集。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | 创建数据集。 |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | 创建数据集。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | 创建数据集。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_7)(string, OsmXmlOptions) | 创建图层并打开它以添加新功能。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| override [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以添加新功能。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis.formats.osmxml/osmxmldriver/createlayer/#createlayer_8)(string, OsmXmlOptions, SpatialReferenceSystem) | 创建图层并打开它以添加新功能。 |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | 打开图层进行编辑。 |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | 打开图层进行编辑。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | 打开数据集。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | 打开数据集。 |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | 打开数据集。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | 打开数据集。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | 打开图层进行读取。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | 打开图层进行读取。 |
| override [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 开启一层读取。 |
| [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_2)(AbstractPath, OsmXmlOptions) | 开启一层读取。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | 打开图层进行读取。 |
| [OpenLayer](../../aspose.gis.formats.osmxml/osmxmldriver/openlayer/#openlayer_5)(string, OsmXmlOptions) | 开启一层读取。 |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.osmxml/osmxmldriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 确定驱动程序是否支持指定的空间参考系统。 |

### 也可以看看

* class [FileDriver](../../aspose.gis/filedriver/)
* 命名空间 [Aspose.Gis.Formats.OsmXml](../../aspose.gis.formats.osmxml/)
* 部件 [Aspose.GIS](../../)


