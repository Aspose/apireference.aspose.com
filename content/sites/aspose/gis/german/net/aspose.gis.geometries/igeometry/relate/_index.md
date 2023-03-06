---
title: IGeometry.Relate
second_title: Aspose.GIS für .NET-API-Referenz
description: IGeometry methode. Bestimmt ob die DE9IMSchnittpunktmatrix dieser Geometrie und einer bestimmten Geometrie mit dem bereitgestellten Muster übereinstimmt.
type: docs
weight: 290
url: /de/net/aspose.gis.geometries/igeometry/relate/
---
## IGeometry.Relate method

Bestimmt, ob die DE-9IM-Schnittpunktmatrix dieser Geometrie und einer bestimmten Geometrie mit dem bereitgestellten Muster übereinstimmt.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | IGeometry | Eine Geometrie. |
| intersectionPatternMatrix | String | Ein Muster zum Abgleichen. Dies sollte eine Zeichenfolge mit einer Länge von 9 sein. Jedes Zeichen der Zeichenfolge repräsentiert die erwartete Abmessung einer Kreuzung: Zeichen 0 - zwischen Innenräumen der Geometrien.Buchstabe 1 - zwischen dem Inneren dieser Geometrie und der Grenze einer anderen Geometrie.Zeichen 2 - zwischen dem Inneren dieser Geometrie und dem Äußeren einer anderen Geometrie.Buchstabe 3 - zwischen der Grenze dieser Geometrie und dem Inneren einer anderen Geometrie.Zeichen 4 - zwischen Grenzen der Geometrien.Buchstabe 5 - zwischen der Grenze dieser Geometrie und dem Äußeren einer anderen Geometrie.Zeichen 6 - zwischen dem Äußeren dieser Geometrie und dem Inneren einer anderen Geometrie.Zeichen 7 - zwischen dem Äußeren dieser Geometrie und der Grenze einer anderen Geometrie.Zeichen 8 - zwischen den Außenseiten der Geometrien. Mögliche Werte für jedes Zeichen sind: * - beliebiger Wert;F - keine Kreuzung;T - jede Kreuzung;0 - Punktschnittpunkt (z. B. gemeinsamer Punkt);1 - Linienkreuzung (z. B. gemeinsames Liniensegment);2 - Gebietsschnittpunkt (z. B. gemeinsamer Teil eines Polygons); Zum Beispiel bedeutet ein Schnittpunktmuster "F0*******", dass es keinen Schnittpunkt zwischen den Geometrien geben sollte. Innenräume und der Schnittpunkt zwischen den Geometriegrenzen muss ein Punkt sein. Siehe OpenGIS Simple Features Specification für weitere Details zur Schnittpunktmatrix Muster. |

### Rückgabewert

`true` wenn diese Schnittpunktmatrix mit dem Muster übereinstimmt;`false` andernfalls.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | *other* Ist`null`. |
| ArgumentException | Eine der Geometrien ist ungültig, sodass der Vorgang nicht abgeschlossen werden kann. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) von Geometrien sind nicht gleichwertig. Sie können verwenden[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) um Geometrien in dasselbe räumliche Bezugssystem umzuwandeln. |

### Bemerkungen

Diese Methode erstellt die DE-9IM-Schnittpunktmatrix und gleicht sie mit dem Muster ab Siehe OpenGIS Simple Features Specification für weitere Details zur DE-9IM-Schnittpunktmatrix.

### Beispiele

Der folgende Code:  erkennt, ob Geometrien räumlich gleich sind.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### Siehe auch

* interface [IGeometry](../)
* namensraum [Aspose.Gis.Geometries](../../igeometry/)
* Montage [Aspose.GIS](../../../)


