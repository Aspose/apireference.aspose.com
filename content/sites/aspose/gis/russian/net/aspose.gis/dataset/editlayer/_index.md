---
title: Dataset.EditLayer
second_title: Справочник по Aspose.GIS for .NET API
description: Dataset метод. Открывает слой с указанным именем для редактирования.
type: docs
weight: 90
url: /ru/net/aspose.gis/dataset/editlayer/
---
## Dataset.EditLayer method

Открывает слой с указанным именем для редактирования.

```csharp
public abstract VectorLayer EditLayer(string name, DriverOptions options = null, 
    SpatialReferenceSystem spatialReferenceSystem = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Имя слоя для редактирования. |
| options | DriverOptions | Открытые варианты. |
| spatialReferenceSystem | SpatialReferenceSystem | Пространственная система отсчета для новых геометрий. |

### Возвращаемое значение

Слой открыт для редактирования.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentException | Слой с указанным именем не существует; Объект параметров имеет неверный тип для этого набора данных. |
| ArgumentException | Объект параметров имеет неверный тип для этого набора данных. |
| ArgumentNullException | Имя`null`. |
| [GisException](../../gisexception/) | Ошибка чтения объекта из слоя. |
| IOException | Произошла ошибка ввода/вывода. |

### Смотрите также

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Dataset](../)
* пространство имен [Aspose.Gis](../../dataset/)
* сборка [Aspose.GIS](../../../)


