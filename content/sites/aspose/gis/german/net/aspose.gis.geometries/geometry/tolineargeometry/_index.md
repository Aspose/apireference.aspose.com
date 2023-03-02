---
title: Geometry.ToLinearGeometry
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Ruft eine ungefähre oder äquivalente NichtKurvenVersion dieser Geometrie unter Verwendung der Vorgabe abToleranz .
type: docs
weight: 400
url: /de/net/aspose.gis.geometries/geometry/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` .

```csharp
public IGeometry ToLinearGeometry()
```

### Rückgabewert

Eine Geometrie, die keine Kurvengeometrien hat. Dies ist das Äquivalent von[`ToLinearGeometry`](../../igeometry/tolineargeometry/) with default`Toleranz` . Standard`Toleranz` ist definiert durch[`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) dieser Geometrie:  Für prognostizierte SRS beträgt die Toleranz 0,001 Meter (in SRS-Einheiten) Für die geografische SRS-Toleranz gilt`1e-5` Grad (in SRS-Einheiten) Für unbekannte SRS-Toleranz ist`1e-5` Weitere Einzelheiten darüber, welche Transformationen angewendet werden, finden Sie unter[`ToLinearGeometry`](../../igeometry/tolineargeometry/) Spezifikation.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_1}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` .

```csharp
public IGeometry ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tolerance | Double | Die`Toleranz`benutzen. Das Ergebnis ist garantiert kleiner als`Toleranz` weg von der gekrümmten Geometrie, es sei denn, die Anzahl der Punkte, die zum Linearisieren der Geometrie benötigt wird, überschreitet das Maximum pro Quadrant , das derzeit 10000 Punkten entspricht. |

### Rückgabewert

Eine Geometrie, die keine Kurvengeometrien hat. Die folgenden Transformationen werden angewendet: CircularString s werden linearisiert (transformiert inLineString s mit angegeben*tolerance* )CompoundCurve s werden beigetreten`Linienfolge` SCurvePolygon s werden umgewandelt inPolygon SMultiCurve s werden umgewandelt inMultiLineString SMultiSurface s werden umgewandelt inMultiPolygon S Als Ergebnis[`HasCurveGeometry`](../../igeometry/hascurvegeometry/) der Ausgangsgeometrie ist`false` .

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | `Toleranz` kleiner oder gleich ist`0` . |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


