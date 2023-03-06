---
title: Class TopoJsonDriver
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.TopoJson.TopoJsonDriver сорт. Драйвер для формата TopoJSON.
type: docs
weight: 700
url: /ru/net/aspose.gis.formats.topojson/topojsondriver/
---
## TopoJsonDriver class

Драйвер для формата TopoJSON.

```csharp
public class TopoJsonDriver : FileDriver
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.topojson/topojsondriver/cancreatedatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать наборы данных. |
| override [CanCreateLayers](../../aspose.gis.formats.topojson/topojsondriver/cancreatelayers/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать векторные слои. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать наборы данных. |
| override [CanOpenLayers](../../aspose.gis.formats.topojson/topojsondriver/canopenlayers/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать векторные слои. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Создает набор данных. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Создает набор данных. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_3)(AbstractPath, TopoJsonOptions) | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_9)(string, TopoJsonOptions) | Создает слой и открывает его для добавления новых объектов. |
| override [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis.formats.topojson/topojsondriver/createlayer/#createlayer_4)(AbstractPath, TopoJsonOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Открывает слой для редактирования. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Открывает слой для редактирования. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Открывает набор данных. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Открывает набор данных. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Открывает слой для чтения. |
| override [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_2)(AbstractPath, TopoJsonOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis.formats.topojson/topojsondriver/openlayer/#openlayer_5)(string, TopoJsonOptions) | Открывает слой для чтения. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.topojson/topojsondriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Определяет, поддерживается ли драйвером указанная система пространственной привязки. |

### Смотрите также

* class [FileDriver](../../aspose.gis/filedriver/)
* пространство имен [Aspose.Gis.Formats.TopoJson](../../aspose.gis.formats.topojson/)
* сборка [Aspose.GIS](../../)


