---
title: Geometry.Overlaps
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Определяет перекрывается ли эта геометрия с указанной геометрией.
type: docs
weight: 290
url: /ru/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

Определяет, перекрывается ли эта геометрия с указанной геометрией.

```csharp
public bool Overlaps(IGeometry other)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | IGeometry | Геометрия. |

### Возвращаемое значение

`true` если эта геометрия «пространственно перекрывает» другую геометрию.`false` иначе.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Одна из геометрий недействительна, поэтому операция не может быть завершена. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) геометрий не эквивалентны. Вы можете использовать[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) для преобразования геометрии в одну и ту же систему отсчета пространственного . |

### Примечания

Этот метод проверяет, перекрываются ли геометрии с точки зрения матрицы пересечения DE-9IM. Две геометрии перекрываются, если они имеют некоторые, но не все общие внутренние точки, и пересечение геометрий имеет ту же размерность, что и сами геометрии. На двоихPoint геометрия или двеSurface геометрии this метод эквивалентен: На двоихLine геометрии этот метод эквивалентен: Для двух геометрий с неравными[`Dimension`](../../igeometry/dimension/) этот метод всегда возвращает`false`. Дополнительные сведения о DE-9IM и отношении «пространственное перекрытие» см. в Спецификации простых функций OpenGIS.

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


