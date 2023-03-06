---
title: Class FileGdbDriver
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbDriver сорт. Драйвер для формата файловой базы геоданных ESRI.
type: docs
weight: 260
url: /ru/net/aspose.gis.formats.filegdb/filegdbdriver/
---
## FileGdbDriver class

Драйвер для формата файловой базы геоданных ESRI.

```csharp
public sealed class FileGdbDriver : FileDriver
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatedatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать наборы данных. |
| override [CanCreateLayers](../../aspose.gis.formats.filegdb/filegdbdriver/cancreatelayers/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать векторные слои. |
| override [CanOpenDatasets](../../aspose.gis.formats.filegdb/filegdbdriver/canopendatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать наборы данных. |
| override [CanOpenLayers](../../aspose.gis.formats.filegdb/filegdbdriver/canopenlayers/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать векторные слои. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Создает набор данных. |
| override [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_1)(AbstractPath, DriverOptions) | Создает набор данных. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_2)(AbstractPath, FileGdbOptions) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Создает набор данных. |
| [CreateDataset](../../aspose.gis.formats.filegdb/filegdbdriver/createdataset/#createdataset_5)(string, FileGdbOptions) | Создает набор данных. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_8)(string, FileGdbOptions) | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| override [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_2)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_3)(AbstractPath, FileGdbOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis.formats.filegdb/filegdbdriver/createlayer/#createlayer_9)(string, FileGdbOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Открывает слой для редактирования. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Открывает слой для редактирования. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Открывает набор данных. |
| override [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_1)(AbstractPath, DriverOptions) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_2)(AbstractPath, FileGdbOptions) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis.formats.filegdb/filegdbdriver/opendataset/#opendataset_5)(string, FileGdbOptions) | Открывает набор данных. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Открывает слой для чтения. |
| override [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_2)(AbstractPath, FileGdbOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis.formats.filegdb/filegdbdriver/openlayer/#openlayer_5)(string, FileGdbOptions) | Открывает слой для чтения. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.filegdb/filegdbdriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Определяет, поддерживается ли драйвером указанная система пространственной привязки. |

### Смотрите также

* class [FileDriver](../../aspose.gis/filedriver/)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* сборка [Aspose.GIS](../../)


