---
title: FileGdbCoordinatePrecisionGrid.XYScale
second_title: Справочник по Aspose.GIS for .NET API
description: FileGdbCoordinatePrecisionGrid свойство. Получает или задает масштаб координат X и Y. Если установленоnull используется значение по умолчанию.
type: docs
weight: 60
url: /ru/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/
---
## FileGdbCoordinatePrecisionGrid.XYScale property

Получает или задает масштаб координат X и Y. Если установлено`null` используется значение по умолчанию.

```csharp
public double? XYScale { get; set; }
```

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | Аргумент не положительный. |

### Примечания

Значение по умолчанию:`1e9` для[`VectorLayer`](../../../aspose.gis/vectorlayer/)с географическим[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) и`Масштаб XY = 1 / Допуск XY * 10` для[`VectorLayer`](../../../aspose.gis/vectorlayer/) с проекцией [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) .

### Смотрите также

* class [FileGdbCoordinatePrecisionGrid](../)
* пространство имен [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* сборка [Aspose.GIS](../../../)


