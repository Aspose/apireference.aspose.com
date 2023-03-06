---
title: VectorLayer.NearestTo
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorLayer methode. Ruft das Feature ab das der angegebenen Koordinate am nächsten liegt.
type: docs
weight: 150
url: /de/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Ruft das Feature ab, das der angegebenen Koordinate am nächsten liegt.

```csharp
public Feature NearestTo(double x, double y)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | Double | X der Koordinate. |
| y | Double | Y der Koordinate. |

### Rückgabewert

Das Feature, das der angegebenen Koordinate am nächsten liegt.

### Siehe auch

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Ruft das Feature ab, das dem angegebenen Punkt am nächsten liegt.

```csharp
public Feature NearestTo(IPoint point)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| point | IPoint | Der Punkt. |

### Rückgabewert

Das Feature, das dem angegebenen Punkt am nächsten liegt.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Fakt ist`null`. |
| ArgumentException | Punkt ist leer oder ungültig. |

### Siehe auch

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* namensraum [Aspose.Gis](../../vectorlayer/)
* Montage [Aspose.GIS](../../../)


