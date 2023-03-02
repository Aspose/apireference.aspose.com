---
title: Curve.ToLinearGeometry
second_title: Aspose.GIS für .NET-API-Referenz
description: Curve methode. Ruft eine ungefähre oder äquivalente NichtKurvenVersion dieser Geometrie unter Verwendung der Vorgabe abToleranz .
type: docs
weight: 70
url: /de/net/aspose.gis.geometries/curve/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` .

```csharp
public ILineString ToLinearGeometry()
```

### Rückgabewert

A[`ILineString`](../../ilinestring/) die dieser Kurve entspricht oder ihr entspricht. Dies ist das Äquivalent von[`ToLinearGeometry`](../../icurve/tolineargeometry/) with default`Toleranz` . Standard`Toleranz` s Wert ist abhängig von[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dieser Geometrie:  Für prognostizierte SRS beträgt die Toleranz 0,001 Meter (in SRS-Einheiten) Für die geografische SRS-Toleranz gilt`1e-5` Grad (in SRS-Einheiten) Für unbekannte SRS-Toleranz ist`1e-5` Weitere Einzelheiten darüber, welche Transformationen angewendet werden, finden Sie unter[`ToLinearGeometry`](../../icurve/tolineargeometry/) Spezifikation.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* namensraum [Aspose.Gis.Geometries](../../curve/)
* Montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` .

```csharp
public ILineString ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tolerance | Double | Die`Toleranz`benutzen. Das Ergebnis ist garantiert kleiner als`Toleranz` weg von der gekrümmten Geometrie, es sei denn, die Anzahl der Punkte, die zum Linearisieren der Geometrie benötigt wird, überschreitet das Maximum pro Quadrant, entspricht derzeit 10000 Punkten. |

### Rückgabewert

A[`ILineString`](../../ilinestring/) die diese Kurve annähert oder ihr entspricht:  Wenn dieses Objekt ist[`ILineString`](../../ilinestring/) selbst das Ergebnis ist äquivalent zu diesem Objekt Wenn dieses Objekt ist[`ICircularString`](../../icircularstring/) das ergebnis ist die mit dem angegebenen linearisierte kreisförmige folge*tolerance* Wenn dieses Objekt ist[`ICompoundCurve`](../../icompoundcurve/) - Alle Kurven daraus werden linearisiert und dann zusammengefügt[`ILineString`](../../ilinestring/)

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | `Toleranz` kleiner oder gleich ist`0` . |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [ILineString](../../ilinestring/)
* class [Curve](../)
* namensraum [Aspose.Gis.Geometries](../../curve/)
* Montage [Aspose.GIS](../../../)


