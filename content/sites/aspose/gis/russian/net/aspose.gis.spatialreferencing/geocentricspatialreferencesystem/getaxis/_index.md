---
title: GeocentricSpatialReferenceSystem.GetAxis
second_title: Справочник по Aspose.GIS for .NET API
description: GeocentricSpatialReferenceSystem метод. ПолучитьAxis который описывает размерность.
type: docs
weight: 100
url: /ru/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/
---
## GeocentricSpatialReferenceSystem.GetAxis method

Получить[`Axis`](../../axis/) который описывает размерность.

```csharp
public override Axis GetAxis(int dimension)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| dimension | Int32 | Количество измерений. |

### Возвращаемое значение

Ось, описывающая измерение.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | *dimension* меньше 0 или больше или равно[`DimensionsCount`](../dimensionscount/) |

### Смотрите также

* class [Axis](../../axis/)
* class [GeocentricSpatialReferenceSystem](../)
* пространство имен [Aspose.Gis.SpatialReferencing](../../geocentricspatialreferencesystem/)
* сборка [Aspose.GIS](../../../)


