---
title: IGeometry.Difference
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Вычитает указанную геометрию из этой геометрии.
type: docs
weight: 170
url: /ru/net/aspose.gis.geometries/igeometry/difference/
---
## IGeometry.Difference method

Вычитает указанную геометрию из этой геометрии.

```csharp
public IGeometry Difference(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия для вычитания. |

### Возвращаемое значение

Геометрия, представляющая разницу между этой геометрией и аргументом. Результирующая геометрия содержит набор точек, которые присутствуют в этой геометрии, но не присутствуют в аргументе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | *other* является`null`. |
| ArgumentException | Одна из геометрий недействительна, поэтому операция не может быть завершена. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


