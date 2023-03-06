---
title: MultiSurface.ToLinearGeometry
second_title: Aspose.GIS für .NET-API-Referenz
description: MultiSurface methode. Ruft eine ungefähre oder äquivalente NichtKurvenVersion dieser Geometrie unter Verwendung der Vorgabe abToleranz .
type: docs
weight: 60
url: /de/net/aspose.gis.geometries/multisurface/tolineargeometry/
---
## ToLinearGeometry() {#tolineargeometry_4}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der Vorgabe ab`Toleranz` .

```csharp
public IMultiPolygon ToLinearGeometry()
```

### Rückgabewert

A[`IMultiPolygon`](../../imultipolygon/) die ungefähr oder gleichwertig ist[`IMultiSurface`](../../imultisurface/). Dies ist das Äquivalent zu[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) with default`Toleranz` . Standard`Toleranz` s Wert ist abhängig von[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) dieser Geometrie:  Für prognostizierte SRS beträgt die Toleranz 0,001 Meter (in SRS-Einheiten) Für die geografische SRS-Toleranz gilt`1e-5` Grad (in SRS-Einheiten) Für unbekannte SRS-Toleranz ist`1e-5` Weitere Einzelheiten darüber, welche Transformationen angewendet werden, finden Sie unter[`ToLinearGeometry`](../../imultisurface/tolineargeometry/) Spezifikation.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* namensraum [Aspose.Gis.Geometries](../../multisurface/)
* Montage [Aspose.GIS](../../../)

---

## ToLinearGeometry(double) {#tolineargeometry_5}

Ruft eine ungefähre oder äquivalente Nicht-Kurven-Version dieser Geometrie unter Verwendung der angegebenen ab`Toleranz` .

```csharp
public IMultiPolygon ToLinearGeometry(double tolerance)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tolerance | Double | Die`Toleranz`benutzen. Das Ergebnis ist garantiert kleiner als`Toleranz` weg von der gekrümmten Geometrie, es sei denn, die Anzahl der Punkte, die zum Linearisieren der Geometrie benötigt wird, überschreitet das Maximum pro Quadrant, entspricht derzeit 10000 Punkten. |

### Rückgabewert

A[`IMultiPolygon`](../../imultipolygon/) die ungefähr oder gleichwertig ist[`IMultiSurface`](../../imultisurface/) :  Wenn dieses Objekt ist[`IMultiPolygon`](../../imultipolygon/) selbst ist das Ergebnis äquivalent zu diesem Objekt Wenn dieses Objekt es nicht ist[`IMultiPolygon`](../../imultipolygon/) - alle Flächen sind linearisiert und neu`IMultiPolygon` wird erstellt

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentOutOfRangeException | `Toleranz` kleiner oder gleich ist`0` . |
| InvalidOperationException | Diese Geometrie ist so ungültig, dass der Vorgang nicht abgeschlossen werden kann. |

### Siehe auch

* interface [IMultiPolygon](../../imultipolygon/)
* class [MultiSurface](../)
* namensraum [Aspose.Gis.Geometries](../../multisurface/)
* Montage [Aspose.GIS](../../../)


