---
title: Surface.ToLinearGeometry
second_title: Aspose.GIS für .NET-API-Referenz
description: Surface methode. Ruft eine ungefähre oder äquivalente NichtKurvenVersion dieser Geometrie unter Verwendung der Vorgabe abToleranz .
type: docs
weight: 40
url: /de/net/aspose.gis.geometries/surface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_2}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` .

```csharp
public IPolygon ToLinearGeometry()
```

### Rückgabewert

A[`IPolygon`](../../ipolygon/) die ungefähr oder gleichwertig ist`IOberfläche`. Dies ist das Äquivalent zu[`ToLinearGeometry`](../../isurface/tolineargeometry/) with default`Toleranz` . Standard`Toleranz` s Wert ist abhängig von[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dieser Geometrie:  Für prognostizierte SRS beträgt die Toleranz 0,001 Meter (in SRS-Einheiten) Für die geografische SRS-Toleranz gilt`1e-5` Grad (in SRS-Einheiten) Für unbekannte SRS-Toleranz ist`1e-5` Weitere Einzelheiten darüber, welche Transformationen angewendet werden, finden Sie unter[`ToLinearGeometry`](../../isurface/tolineargeometry/) Spezifikation.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* namensraum [Aspose.Gis.Geometries](../../surface/)
* Montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_3}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` .

```csharp
public IPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tolerance | Double | Die`Toleranz`benutzen. Das Ergebnis ist garantiert kleiner als`Toleranz` weg von der gekrümmten Geometrie, es sei denn, die Anzahl der Punkte, die zum Linearisieren der Geometrie benötigt wird, überschreitet das Maximum pro Quadrant, entspricht derzeit 10000 Punkten. |

### Rückgabewert

A[`IPolygon`](../../ipolygon/) die ungefähr oder gleichwertig ist`IOberfläche` :  Wenn dieses Objekt ist[`IPolygon`](../../ipolygon/) selbst ist das Ergebnis äquivalent zu diesem Objekt Wenn dieses Objekt es nicht ist[`IPolygon`](../../ipolygon/) es ist linearisiert und[`IPolygon`](../../ipolygon/) wird erstellt

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | `Toleranz` kleiner oder gleich ist`0` . |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IPolygon](../../ipolygon/)
* class [Surface](../)
* namensraum [Aspose.Gis.Geometries](../../surface/)
* Montage [Aspose.GIS](../../../)


