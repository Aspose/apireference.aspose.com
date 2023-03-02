---
title: IGeometry.Within
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Определяет находится ли эта геометрия в пределах указанного экстента.
type: docs
weight: 380
url: /ru/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Определяет, находится ли эта геометрия в пределах указанного экстента.

```csharp
public bool Within(Extent extent)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| extent | Extent | Степень. |

### Возвращаемое значение

`true` если эта геометрия находится в пределах экстента;`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |

### Смотрите также

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Определяет, находится ли эта геометрия в пределах указанной геометрии.

```csharp
public bool Within(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия. |

### Возвращаемое значение

`true` если эта геометрия находится «пространственно внутри» другой геометрии.`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Одна из геометрий недействительна, поэтому операция не может быть завершена. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Примечания

Этот метод проверяет, находится ли одна геометрия внутри другой с точки зрения матрицы пересечения DE-9IM. Одна геометрия находится внутри другой, если другая геометрия содержит каждую точку геометрии, а геометрии пересекаются. Этот метод эквивалентен: См. спецификацию простых функций OpenGIS для получения более подробной информации о DE-9IM и отношении «пространственно внутри».

```csharp
this.Relate(other, "T*F**F***");
```

### Смотрите также

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


