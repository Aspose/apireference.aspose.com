---
title: VectorLayer.NearestTo
second_title: Aspose.GIS för .NET API Referens
description: VectorLayer metod. Får den funktion som ligger närmast den angivna koordinaten.
type: docs
weight: 150
url: /sv/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Får den funktion som ligger närmast den angivna koordinaten.

```csharp
public Feature NearestTo(double x, double y)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| x | Double | X för koordinaten. |
| y | Double | Y för koordinaten. |

### Returvärde

Funktionen närmast den angivna koordinaten.

### Se även

* class [Feature](../../feature/)
* class [VectorLayer](../)
* namnutrymme [Aspose.Gis](../../vectorlayer/)
* hopsättning [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Får den funktion som ligger närmast den angivna punkten.

```csharp
public Feature NearestTo(IPoint point)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| point | IPoint | Punkten. |

### Returvärde

Det särdrag som ligger närmast den angivna punkten.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Poängen är`null`. |
| ArgumentException | Punkten är tom eller inte giltig. |

### Se även

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* namnutrymme [Aspose.Gis](../../vectorlayer/)
* hopsättning [Aspose.GIS](../../../)


