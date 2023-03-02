---
title: Geometry.GetConvexHull
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Вычисляет выпуклую оболочку этой геометрии.
type: docs
weight: 230
url: /ru/net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

Вычисляет выпуклую оболочку этой геометрии.

```csharp
public IGeometry GetConvexHull()
```

### Возвращаемое значение

Геометрия, представляющая выпуклую оболочку этой геометрии. Если эта геометрия не имеет точек, результатом будет[`Null`](../null/) . Если эта геометрия имеет только одну точку, результатом будет эта точка. Если эта геометрия имеет только две точки, результатом будет[`ILineString`](../../ilinestring/) с точками. Если эта геометрия имеет три или более точек, то результат[`ILinearRing`](../../ilinearring/) который представляет собой выпуклую оболочку вокруг всех точек геометрии.

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


