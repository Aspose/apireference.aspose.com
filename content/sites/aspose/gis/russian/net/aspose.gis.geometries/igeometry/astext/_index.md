---
title: IGeometry.AsText
second_title: Справочник по Aspose.GIS for .NET API
description: IGeometry метод. Преобразует эту геометрию в ее общеизвестное текстовое представление.
type: docs
weight: 120
url: /ru/net/aspose.gis.geometries/igeometry/astext/
---
## AsText() {#astext}

Преобразует эту геометрию в ее общеизвестное текстовое представление.

```csharp
public string AsText()
```

### Возвращаемое значение

Общеизвестное текстовое представление этой геометрии.

### Примечания

Вывод этого метода находится вIso вариант ВКТ.

### Смотрите также

* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Преобразует эту геометрию в ее общеизвестное текстовое представление.

```csharp
public string AsText(WktVariant variant)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| variant | WktVariant | Вариант общеизвестного текста для использования. |

### Возвращаемое значение

Общеизвестное текстовое представление этой геометрии.

### Исключения

| исключение | условие |
| --- | --- |
| NotSupportedException | Геометрия не поддерживается запрошенным вариантом WKT. Следующие геометрии поддерживаются толькоIsoВариант WKT: [`CircularString`](../../circularstring/)[`CompoundCurve`](../../compoundcurve/)[`CurvePolygon`](../../curvepolygon/)[`MultiCurve`](../../multicurve/)[`MultiSurface`](../../multisurface/) Все остальные геометрии поддерживаются любым вариантом WKT. |
| ArgumentOutOfRangeException | *variant* не является действительным[`WktVariant`](../../wktvariant/). |

### Смотрите также

* enum [WktVariant](../../wktvariant/)
* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Преобразует эту геометрию в ее общеизвестное текстовое представление.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| variant | WktVariant | Вариант общеизвестного текста для использования. |
| format | NumericFormat | Формат координат для преобразования в строку. См.[`NumericFormat`](../../../aspose.gis/numericformat/) чтобы получить это. |

### Возвращаемое значение

Общеизвестное текстовое представление этой геометрии.

### Исключения

| исключение | условие |
| --- | --- |
| NotSupportedException | Геометрия не может быть представлена в запрошенном варианте WKT. В настоящее время это происходит, когда [`HasCurveGeometry`](../hascurvegeometry/) геометрии`true` и вариант WKT is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* не является действительным[`WktVariant`](../../wktvariant/). |

### Смотрите также

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* interface [IGeometry](../)
* пространство имен [Aspose.Gis.Geometries](../../igeometry/)
* сборка [Aspose.GIS](../../../)


