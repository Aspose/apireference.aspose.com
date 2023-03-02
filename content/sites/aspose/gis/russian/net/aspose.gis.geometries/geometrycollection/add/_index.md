---
title: GeometryCollection.Add
second_title: Справочник по Aspose.GIS for .NET API
description: GeometryCollection метод. Добавляет указанную геометрию в коллекцию.
type: docs
weight: 110
url: /ru/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Добавляет указанную геометрию в коллекцию.

```csharp
public void Add(IGeometry geometry)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| geometry | IGeometry | Добавляемая геометрия. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Коллекция не принимает геометрии этого типа. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) этой геометрии и[`SpatialReferenceSystem`](../spatialreferencesystem/) аргумента оба не `null` и не равны друг другу. |

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* пространство имен [Aspose.Gis.Geometries](../../geometrycollection/)
* сборка [Aspose.GIS](../../../)


