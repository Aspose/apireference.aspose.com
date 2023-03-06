---
title: IGeometry.ToLinearGeometry
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Получает приблизительную или эквивалентную некривую версию этой геометрии используя значение по умолчанию.толерантность .
type: docs
weight: 350
url: /ru/net/aspose.gis.geometries/igeometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` .

```csharp
public IGeometry ToLinearGeometry()
```

### Возвращаемое значение

Геометрия без кривых. Это эквивалент`ToLinearGeometry` с по умолчанию`толерантность` . По умолчанию`толерантность` определяется[`SpatialReferenceSystem`](../spatialreferencesystem/) этой геометрии:  Для проектируемого SRS Допуск составляет 0,001 метра (в единицах SRS) Для географического SRS допуск равен`1е-5` градусы (в единицах SRS) Для неизвестного SRS Допуск равен`1е-5` Подробнее о применяемых преобразованиях см.`ToLinearGeometry` спецификация.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| tolerance | Double | `толерантность`использовать. Результат гарантированно будет меньше`толерантность` вдали от изогнутой геометрии , если только количество точек, необходимых для линеаризации геометрии, не превышает максимальное для каждого квадранта, которое в настоящее время равно 10000 точек. |

### Возвращаемое значение

Геометрия без кривых. Применяются следующие преобразования: CircularString s линеаризованы (преобразованы вLineString с указанным*tolerance* )CompoundCurve присоединяются к`LineString` сCurvePolygon s превращаются вPolygon сMultiCurve s превращаются вMultiLineString сMultiSurface s превращаются вMultiPolygon с В результате[`HasCurveGeometry`](../hascurvegeometry/) выходной геометрии`false` .

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | `толерантность` меньше или равно`0` . |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


