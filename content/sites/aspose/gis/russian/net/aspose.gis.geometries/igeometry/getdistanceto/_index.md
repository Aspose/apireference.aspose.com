---
title: IGeometry.GetDistanceTo
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Вычисляет минимальное расстояние между этой геометрией и указанной геометрией.
type: docs
weight: 230
url: /ru/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

Вычисляет минимальное расстояние между этой геометрией и указанной геометрией.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия, до которой нужно найти расстояние. |

### Возвращаемое значение

Если обе геометрии не[`IsEmpty`](../isempty/) - расстояние между ближайшими точками геометрий. Если хотя бы одна геометрия пуста, возвращается -1.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


