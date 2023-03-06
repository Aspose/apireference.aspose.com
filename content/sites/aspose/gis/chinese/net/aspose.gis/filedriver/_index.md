---
title: Class FileDriver
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.FileDriver 班级. 基于特定文件格式的驱动程序
type: docs
weight: 180
url: /zh/net/aspose.gis/filedriver/
---
## FileDriver class

基于特定文件格式的驱动程序。

```csharp
public abstract class FileDriver : Driver
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| abstract [CanCreateDatasets](../../aspose.gis/filedriver/cancreatedatasets/) { get; } | 获取一个值，指示此驱动程序是否可以创建数据集。 |
| abstract [CanCreateLayers](../../aspose.gis/filedriver/cancreatelayers/) { get; } | 获取一个值，指示此驱动程序是否可以创建矢量图层。 |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | 获取一个值，指示此驱动程序是否可以打开数据集。 |
| abstract [CanOpenLayers](../../aspose.gis/filedriver/canopenlayers/) { get; } | 获取一个值，指示此驱动程序是否可以打开矢量图层。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset)(AbstractPath) | 创建数据集。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_2)(string) | 创建数据集。 |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | 创建数据集。 |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/#createdataset_3)(string, DriverOptions) | 创建数据集。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer)(AbstractPath) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_4)(string) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_1)(AbstractPath, DriverOptions) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_3)(AbstractPath, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_5)(string, DriverOptions) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_7)(string, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| abstract [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/#createlayer_6)(string, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer)(AbstractPath, DriverOptions) | 打开图层进行编辑。 |
| [EditLayer](../../aspose.gis/filedriver/editlayer/#editlayer_1)(string, DriverOptions) | 打开图层进行编辑。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset)(AbstractPath) | 打开数据集。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_2)(string) | 打开数据集。 |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | 打开数据集。 |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/#opendataset_3)(string, DriverOptions) | 打开数据集。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer)(AbstractPath) | 打开图层进行读取。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_2)(string) | 打开图层进行读取。 |
| abstract [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | 打开图层进行读取。 |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/#openlayer_3)(string, DriverOptions) | 打开图层进行读取。 |
| abstract [SupportsSpatialReferenceSystem](../../aspose.gis/filedriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | 确定驱动程序是否支持指定的空间参考系统。 |

### 也可以看看

* class [Driver](../driver/)
* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


