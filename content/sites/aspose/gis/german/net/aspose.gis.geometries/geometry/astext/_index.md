---
title: Geometry.AsText
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Übersetzt diese Geometrie in ihre bekannte Textdarstellung.
type: docs
weight: 130
url: /de/net/aspose.gis.geometries/geometry/astext/
---
## AsText() {#astext}

Übersetzt diese Geometrie in ihre bekannte Textdarstellung.

```csharp
public string AsText()
```

### Rückgabewert

Bekannte Textdarstellung dieser Geometrie.

### Bemerkungen

Die Ausgabe dieser Methode ist inIso WKT-Variante. Das numerische Standardformat ist[`General`](../../../aspose.gis/numericformat/general/) (mit "0" Genauigkeit).

### Siehe auch

* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## AsText(WktVariant) {#astext_1}

Übersetzt diese Geometrie in ihre bekannte Textdarstellung.

```csharp
public string AsText(WktVariant variant)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| variant | WktVariant | Bekannte Textvariante zu verwenden. |

### Rückgabewert

Bekannte Textdarstellung dieser Geometrie.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| NotSupportedException | Geometrie kann in gewünschter WKT-Variante nicht dargestellt werden. Derzeit passiert dies when [`HasCurveGeometry`](../hascurvegeometry/) der Geometrie ist`true` und WKT-Variante is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ist nicht gültig[`WktVariant`](../../wktvariant/). |

### Bemerkungen

Das numerische Standardformat ist[`General`](../../../aspose.gis/numericformat/general/) (mit "0" Genauigkeit).

### Siehe auch

* enum [WktVariant](../../wktvariant/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## AsText(WktVariant, NumericFormat) {#astext_2}

Übersetzt diese Geometrie in ihre bekannte Textdarstellung.

```csharp
public string AsText(WktVariant variant, NumericFormat format)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| variant | WktVariant | Bekannte Textvariante zu verwenden. |
| format | NumericFormat | Koordinatenformat für die Konvertierung in Zeichenfolge. Siehe die[`NumericFormat`](../../../aspose.gis/numericformat/) es bekommen. |

### Rückgabewert

Bekannte Textdarstellung dieser Geometrie.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| NotSupportedException | Geometrie kann in gewünschter WKT-Variante nicht dargestellt werden. Derzeit passiert dies when [`HasCurveGeometry`](../hascurvegeometry/) der Geometrie ist`true` und WKT-Variante is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ist nicht gültig[`WktVariant`](../../wktvariant/). |

### Siehe auch

* enum [WktVariant](../../wktvariant/)
* class [NumericFormat](../../../aspose.gis/numericformat/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


