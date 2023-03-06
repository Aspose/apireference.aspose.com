---
title: Geometry.AsBinary
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Übersetzt diese Geometrie in ihre bekannte binäre Darstellung.
type: docs
weight: 110
url: /de/net/aspose.gis.geometries/geometry/asbinary/
---
## AsBinary() {#asbinary}

Übersetzt diese Geometrie in ihre bekannte binäre Darstellung.

```csharp
public byte[] AsBinary()
```

### Rückgabewert

Bekannte binäre Darstellung dieser Geometrie.

### Bemerkungen

Die Ausgabe dieser Methode ist inIso WKB-Variante.

### Siehe auch

* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## AsBinary(WkbVariant) {#asbinary_1}

Übersetzt diese Geometrie in ihre bekannte binäre Darstellung.

```csharp
public byte[] AsBinary(WkbVariant variant)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| variant | WkbVariant | Zu verwendende bekannte binäre Variante. |

### Rückgabewert

Bekannte binäre Darstellung dieser Geometrie.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| NotSupportedException | Geometrie kann in gewünschter WKB-Variante nicht dargestellt werden. Derzeit passiert dies when [`HasCurveGeometry`](../hascurvegeometry/) der Geometrie ist`true` und WKB-Variante is SimpleFeatureAccessOutdated . |
| ArgumentOutOfRangeException | *variant* ist nicht gültig[`WkbVariant`](../../wkbvariant/). |

### Siehe auch

* enum [WkbVariant](../../wkbvariant/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


