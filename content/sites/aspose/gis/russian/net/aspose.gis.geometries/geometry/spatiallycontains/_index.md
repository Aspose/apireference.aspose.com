---
title: Geometry.SpatiallyContains
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Определяет содержит ли эта геометрия в пространстве указанную геометрию.
type: docs
weight: 360
url: /ru/net/aspose.gis.geometries/geometry/spatiallycontains/
---
## Geometry.SpatiallyContains method

Определяет, содержит ли эта геометрия в пространстве указанную геометрию.

```csharp
public bool SpatiallyContains(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия. |

### Возвращаемое значение

`true`если эта геометрия «пространственно содержит» другую геометрию.`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Одна из геометрий недействительна, поэтому операция не может быть завершена. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Примечания

Этот метод проверяет, содержит ли одна геометрия другую с точки зрения матрицы пересечения DE-9IM. Этот метод эквивалентен:

```csharp
other.Within(this);
```

### Смотрите также

* method [Within](../../igeometry/within/)
* method [Covers](../../igeometry/covers/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


