---
title: Geometry.GetDistanceTo
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Вычисляет минимальное расстояние между этой геометрией и указанной геометрией.
type: docs
weight: 240
url: /ru/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

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
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


