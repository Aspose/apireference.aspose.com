---
title: Geometry.GetBuffer
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Вычисляет область буфера вокруг этой геометрии.
type: docs
weight: 210
url: /ru/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Вычисляет область буфера вокруг этой геометрии.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| distance | Double | Ширина буферной области. |
| quadrantSegments | Int32 | Количество сегментов, используемых для аппроксимации 90-градусной кривизны. Чем больше это число, тем лучше получается аппроксимация кривых. По умолчанию 30. |

### Возвращаемое значение

Геометрия, представляющая все точки, находящиеся в пределах заданного расстояния от этой геометрии. Тип результата:[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) или[`IMultiPolygon`](../../imultipolygon/) .

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |
| ArgumentOutOfRangeException | сегментов квадранта меньше или равно 0. |

### Смотрите также

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


