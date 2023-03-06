---
title: IGeometry.Intersects
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Определяет пересекает ли эта геометрия заданный экстент.
type: docs
weight: 270
url: /ru/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

Определяет, пересекает ли эта геометрия заданный экстент.

```csharp
public bool Intersects(Extent extent)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| extent | Extent | Степень. |

### Возвращаемое значение

`true` если эта геометрия пересекает экстент;`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |

### Смотрите также

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Определяет, пересекаются ли эта геометрия и указанная геометрия.

```csharp
public bool Intersects(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия. |

### Возвращаемое значение

`true` если эта геометрия «пространственно пересекает» другую геометрию.`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Одна из геометрий недействительна, поэтому операция не может быть завершена. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Примечания

Этот метод эквивалентен: Это отрицание[`Disjoint`](../disjoint/) . Видеть[`Disjoint`](../disjoint/) для более подробной информации.

```csharp
!this.Disjoint(other);
```

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


