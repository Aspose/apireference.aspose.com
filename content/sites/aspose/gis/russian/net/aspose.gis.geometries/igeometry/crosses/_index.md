---
title: IGeometry.Crosses
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Определяет пересекаются ли эта геометрия и указанная геометрия.
type: docs
weight: 160
url: /ru/net/aspose.gis.geometries/igeometry/crosses/
---
## IGeometry.Crosses method

Определяет, пересекаются ли эта геометрия и указанная геометрия.

```csharp
public bool Crosses(IGeometry other)
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

Этот метод проверяет, являются ли геометрии пересечениями с точки зрения матрицы пересечения DE-9IM. Две геометрии пересекаются, если они имеют некоторые, но не все общие внутренние точки и размер пересечения меньше, чем размер хотя бы одного из геометрии. То есть: два[`LineString`](../../linestring/) s крест, если они образуют букву «X», LineString и[`Polygon`](../../polygon/) cross, если LineString проходит через внутреннюю часть полигона. См. спецификацию простых функций OpenGIS для получения более подробной информации о DE-9IM и отношении «пространственно пересекает».

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


