---
title: Curve.ToLinearGeometry
second_title: Справочник по Aspose.GIS for .NET API
description: Curve метод. Получает приблизительную или эквивалентную некривую версию этой геометрии используя значение по умолчанию.толерантность .
type: docs
weight: 70
url: /ru/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя значение по умолчанию.`толерантность` .

```csharp
public ILineString ToLinearGeometry()
```

### Возвращаемое значение

А[`ILineString`](../../ilinestring/) которая аппроксимирует или эквивалентна этой кривой. Это эквивалентно[`ToLinearGeometry`](../../icurve/tolineargeometry/) с по умолчанию`толерантность` . По умолчанию`толерантность` значение s зависит от[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) этой геометрии:  Для проектируемого SRS Допуск составляет 0,001 метра (в единицах SRS) Для географического SRS допуск равен`1е-5` градусы (в единицах SRS) Для неизвестного SRS Допуск равен`1е-5` Подробнее о применяемых преобразованиях см.[`ToLinearGeometry`](../../icurve/tolineargeometry/) спецификация.

### Исключения

| исключение | условие |
| --- | --- |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* пространство имен [Aspose.Gis.Geometries](../../curve/)
* сборка [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Получает приблизительную или эквивалентную некривую версию этой геометрии, используя указанный`толерантность` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| tolerance | Double | `толерантность`использовать. Результат гарантированно будет меньше`толерантность` вдали от изогнутой геометрии , если только количество точек, необходимых для линеаризации геометрии, не превышает максимальное значение для каждого квадранта, в настоящее время равное 10000 точек. |

### Возвращаемое значение

А[`ILineString`](../../ilinestring/) которая приближается или эквивалентна этой кривой:  Если этот объект[`ILineString`](../../ilinestring/) сам по себе результат эквивалентен этому object Если этот объект[`ICircularString`](../../icircularstring/) результатом является циклическая строка, линеаризованная с указанным*tolerance* Если этот объект[`ICompoundCurve`](../../icompoundcurve/) - все кривые из него линеаризуются, а затем объединяются в[`ILineString`](../../ilinestring/)

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentOutOfRangeException | `толерантность` меньше или равно`0` . |
| InvalidOperationException | Эта геометрия недействительна, поэтому операция не может быть завершена. |

### Смотрите также

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* пространство имен [Aspose.Gis.Geometries](../../curve/)
* сборка [Aspose.GIS](../../../)


