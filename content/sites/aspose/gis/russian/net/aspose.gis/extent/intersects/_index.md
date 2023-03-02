---
title: Extent.Intersects
second_title: Справочник по Aspose.GIS for .NET API
description: Extent метод. Определяет пересекается ли этот экстент с аргументом.
type: docs
weight: 190
url: /ru/net/aspose.gis/extent/intersects/
---
## Intersects(Extent) {#intersects}

Определяет, пересекается ли этот экстент с аргументом.

```csharp
public bool Intersects(Extent extent)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| extent | Extent | Другая степень. |

### Возвращаемое значение

Значение, указывающее, пересекается ли этот экстент с аргументом.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) в этой степени и аргумент оба не`null` и не равны друг другу. |

### Смотрите также

* class [Extent](../)
* пространство имен [Aspose.Gis](../../extent/)
* сборка [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Определяет, пересекается ли этот экстент с аргументом.

```csharp
public bool Intersects(IGeometry geometry)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| geometry | IGeometry | Геометрия для проверки на пересечение |

### Возвращаемое значение

Значение, указывающее, пересекается ли этот экстент с аргументом.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) в этой степени и аргумент оба не`null` и не равны друг другу. |

### Смотрите также

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../)
* пространство имен [Aspose.Gis](../../extent/)
* сборка [Aspose.GIS](../../../)


