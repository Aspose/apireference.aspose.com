---
title: ISurface.ToLinearGeometry
second_title: Справочник по Aspose.GIS for .NET API
description: ISurface метод. Получает приблизительную или эквивалентную некривую версию этой геометрии используя значение по умолчанию.толерантность .
type: docs
weight: 30
url: /ru/net/aspose.gis.geometries/isurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` .

```csharp
public IPolygon ToLinearGeometry()
```

### Возвращаемое значение

А[`IPolygon`](../../ipolygon/) который приближается или эквивалентен этому`ISurface`. Это эквивалентно`ToLinearGeometry` с по умолчанию`толерантность` . По умолчанию`толерантность` значение s зависит от[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) этой геометрии:  Для проектируемого SRS Допуск составляет 0,001 метра (в единицах SRS) Для географического SRS допуск равен`1е-5` градусы (в единицах SRS) Для неизвестного SRS Допуск равен`1е-5` Подробнее о применяемых преобразованиях см.`ToLinearGeometry` спецификация.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [IPolygon](../../ipolygon/)
* interface [ISurface](../)
* пространство имен [Aspose.Gis.Geometries](../../isurface/)
* сборка [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| tolerance | Double | `толерантность`использовать. Результат гарантированно будет меньше`толерантность` вдали от изогнутой геометрии , если только количество точек, необходимых для линеаризации геометрии, не превышает максимальное значение для каждого квадранта, в настоящее время равное 10000 точек. |

### Возвращаемое значение

А[`IPolygon`](../../ipolygon/) который приближается или эквивалентен этому`ISurface` :  Если этот объект[`IPolygon`](../../ipolygon/) сам по себе результат эквивалентен этому объекту Если этот объект не[`IPolygon`](../../ipolygon/) линеаризуется и[`IPolygon`](../../ipolygon/) создан

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | `толерантность` меньше или равно`0` . |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [IPolygon](../../ipolygon/)
* interface [ISurface](../)
* пространство имен [Aspose.Gis.Geometries](../../isurface/)
* сборка [Aspose.GIS](../../../)


