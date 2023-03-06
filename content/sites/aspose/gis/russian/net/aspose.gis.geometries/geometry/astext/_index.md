---
title: Geometry.AsText
second_title: Справочник по Aspose.GIS for .NET API
description: Geometry метод. Преобразует эту геометрию в ее общеизвестное текстовое представление.
type: docs
weight: 130
url: /ru/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Преобразует эту геометрию в ее общеизвестное текстовое представление.

```csharp
public string AsText()
```

### Возвращаемое значение

Общеизвестное текстовое представление этой геометрии.

### Примечания

Вывод этого метода находится вIso Вариант WKT. Числовой формат по умолчанию:[`General`](../../../aspose.gis/numericformat/general/) (с точностью "0").

### Смотрите также

* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
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
| NotSupportedException | Геометрия не может быть представлена в запрошенном варианте WKT. В настоящее время это происходит, когда [`HasCurveGeometry`](../hascurvegeometry/) геометрии`true` и вариант WKT is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* не является действительным[`WktVariant`](../../wktvariant/). |

### Примечания

Числовой формат по умолчанию:[`General`](../../../aspose.gis/numericformat/general/) (с точностью "0").

### Смотрите также

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
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
* class [Geometry](../)
* пространство имен [Aspose.Gis.Geometries](../../geometry/)
* сборка [Aspose.GIS](../../../)


