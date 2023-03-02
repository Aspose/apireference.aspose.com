---
title: VectorLayer.NearestTo
second_title: Aspose.GIS voor .NET API-referentie
description: VectorLayer methode. Haalt het object op dat het dichtst bij de opgegeven coördinaat ligt.
type: docs
weight: 150
url: /nl/net/aspose.gis/vectorlayer/nearestto/
---
## NearestTo(double, double) {#nearestto_1}

Haalt het object op dat het dichtst bij de opgegeven coördinaat ligt.

```csharp
public Feature NearestTo(double x, double y)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | Double | X van de coördinaat. |
| y | Double | Y van de coördinaat. |

### Winstwaarde

Het object dat het dichtst bij de opgegeven coördinaat ligt.

### Zie ook

* class [Feature](../../feature/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)

---

## NearestTo(IPoint) {#nearestto}

Haalt het object op dat het dichtst bij het opgegeven punt ligt.

```csharp
public Feature NearestTo(IPoint point)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| point | IPoint | Het punt. |

### Winstwaarde

De dichtstbijzijnde feature bij het voorziene punt.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Punt is`null`. |
| ArgumentException | Punt is leeg of niet geldig. |

### Zie ook

* class [Feature](../../feature/)
* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [VectorLayer](../)
* naamruimte [Aspose.Gis](../../vectorlayer/)
* montage [Aspose.GIS](../../../)


