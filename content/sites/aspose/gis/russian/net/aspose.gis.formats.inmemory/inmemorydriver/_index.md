---
title: Class InMemoryDriver
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Formats.InMemory.InMemoryDriver сорт. Драйвер для работы с данными в памяти.
type: docs
weight: 380
url: /ru/net/aspose.gis.formats.inmemory/inmemorydriver/
---
## InMemoryDriver class

Драйвер для работы с данными в памяти.

```csharp
public sealed class InMemoryDriver : FileDriver
```

## Характеристики

| Имя | Описание |
| --- | --- |
| override [CanCreateDatasets](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatedatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать наборы данных. |
| override [CanCreateLayers](../../aspose.gis.formats.inmemory/inmemorydriver/cancreatelayers/) { get; } | Получает значение, указывающее, может ли этот драйвер создавать векторные слои. |
| virtual [CanOpenDatasets](../../aspose.gis/filedriver/canopendatasets/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать наборы данных. |
| override [CanOpenLayers](../../aspose.gis.formats.inmemory/inmemorydriver/canopenlayers/) { get; } | Получает значение, указывающее, может ли этот драйвер открывать векторные слои. |

## Методы

| Имя | Описание |
| --- | --- |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string) | Создает набор данных. |
| virtual [CreateDataset](../../aspose.gis/filedriver/createdataset/)(AbstractPath, DriverOptions) | Создает набор данных. |
| [CreateDataset](../../aspose.gis/filedriver/createdataset/)(string, DriverOptions) | Создает набор данных. |
| [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer)() | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(AbstractPath, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions) | Создает слой и открывает его для добавления. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| override [CreateLayer](../../aspose.gis.formats.inmemory/inmemorydriver/createlayer/#createlayer_3)(AbstractPath, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления новых объектов. |
| [CreateLayer](../../aspose.gis/filedriver/createlayer/)(string, DriverOptions, SpatialReferenceSystem) | Создает слой и открывает его для добавления. |
| virtual [EditLayer](../../aspose.gis/filedriver/editlayer/)(AbstractPath, DriverOptions) | Открывает слой для редактирования. |
| [EditLayer](../../aspose.gis/filedriver/editlayer/)(string, DriverOptions) | Открывает слой для редактирования. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string) | Открывает набор данных. |
| virtual [OpenDataset](../../aspose.gis/filedriver/opendataset/)(AbstractPath, DriverOptions) | Открывает набор данных. |
| [OpenDataset](../../aspose.gis/filedriver/opendataset/)(string, DriverOptions) | Открывает набор данных. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(AbstractPath) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string) | Открывает слой для чтения. |
| override [OpenLayer](../../aspose.gis.formats.inmemory/inmemorydriver/openlayer/#openlayer_1)(AbstractPath, DriverOptions) | Открывает слой для чтения. |
| [OpenLayer](../../aspose.gis/filedriver/openlayer/)(string, DriverOptions) | Открывает слой для чтения. |
| override [SupportsSpatialReferenceSystem](../../aspose.gis.formats.inmemory/inmemorydriver/supportsspatialreferencesystem/)(SpatialReferenceSystem) | Определяет, поддерживается ли драйвером указанная система пространственной привязки. |

### Смотрите также

* class [FileDriver](../../aspose.gis/filedriver/)
* пространство имен [Aspose.Gis.Formats.InMemory](../../aspose.gis.formats.inmemory/)
* сборка [Aspose.GIS](../../)


