---
title: Class Dataset
second_title: Справочник по Aspose.GIS for .NET API
description: Aspose.Gis.Dataset сорт. Набор данных  это наборVectorLayer экземпляры.
type: docs
weight: 80
url: /ru/net/aspose.gis/dataset/
---
## Dataset class

Набор данных — это набор[`VectorLayer`](../vectorlayer/) экземпляры.

```csharp
public abstract class Dataset : IDisposable
```

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [CanCreateLayers](../../aspose.gis/dataset/cancreatelayers/) { get; } | Получает значение, указывающее, может ли этот набор данных создавать векторные слои. |
| virtual [CanRemoveLayers](../../aspose.gis/dataset/canremovelayers/) { get; } | Получает значение, указывающее, может ли этот набор данных удалять векторные слои. |
| abstract [Driver](../../aspose.gis/dataset/driver/) { get; } | Получает[`Driver`](./driver/) который создал этот набор данных. |
| abstract [LayersCount](../../aspose.gis/dataset/layerscount/) { get; } | Получает количество слоев в этом наборе данных. |

## Методы

| Имя | Описание |
| --- | --- |
| static [Create](../../aspose.gis/dataset/create/#create)(AbstractPath, FileDriver) | Создает набор данных. |
| static [Create](../../aspose.gis/dataset/create/#create_2)(string, FileDriver) | Создает набор данных. |
| static [Create](../../aspose.gis/dataset/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | Создает набор данных. |
| static [Create](../../aspose.gis/dataset/create/#create_3)(string, FileDriver, DriverOptions) | Создает набор данных. |
| static [Open](../../aspose.gis/dataset/open/#open)(AbstractPath, FileDriver) | Открывает набор данных. |
| static [Open](../../aspose.gis/dataset/open/#open_2)(IDbConnection, DatabaseDriver) | Открывает набор данных. |
| static [Open](../../aspose.gis/dataset/open/#open_3)(string, FileDriver) | Открывает набор данных. |
| static [Open](../../aspose.gis/dataset/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | Открывает набор данных. |
| static [Open](../../aspose.gis/dataset/open/#open_4)(string, FileDriver, DriverOptions) | Открывает набор данных. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer)() | Создает новый векторный слой и открывает его для добавления. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_2)(SpatialReferenceSystem) | Создает новый векторный слой и открывает его для добавления. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_1)(DriverOptions, SpatialReferenceSystem) | Создает новый векторный слой и открывает его для добавления. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_4)(string, SpatialReferenceSystem) | Создает новый векторный слой с указанным именем и открывает его для добавления. |
| virtual [CreateLayer](../../aspose.gis/dataset/createlayer/#createlayer_3)(string, DriverOptions, SpatialReferenceSystem) | Создает новый векторный слой с указанным именем и открывает его для добавления. |
| [Dispose](../../aspose.gis/dataset/dispose/)() | Освобождает ресурсы, используемые`Dataset` . |
| abstract [EditLayer](../../aspose.gis/dataset/editlayer/)(string, DriverOptions, SpatialReferenceSystem) | Открывает слой с указанным именем для редактирования. |
| abstract [GetLayerName](../../aspose.gis/dataset/getlayername/)(int) | Получает имя слоя по указанному индексу. |
| abstract [OpenLayer](../../aspose.gis/dataset/openlayer/)(string, DriverOptions) | Открывает для чтения слой с указанным именем. |
| abstract [OpenLayerAt](../../aspose.gis/dataset/openlayerat/)(int, DriverOptions) | Открывает слой по указанному индексу для чтения. |
| virtual [RemoveLayer](../../aspose.gis/dataset/removelayer/)(string) | Удаляет векторный слой с указанным именем. |
| virtual [RemoveLayerAt](../../aspose.gis/dataset/removelayerat/)(int) | Удаляет векторный слой по указанному индексу. |

### Смотрите также

* пространство имен [Aspose.Gis](../../aspose.gis/)
* сборка [Aspose.GIS](../../)


