---
title: Geometry.GetConvexHull
second_title: Aspose.GIS voor .NET API-referentie
description: Geometry methode. Berekent de convexe romp van deze geometrie.
type: docs
weight: 230
url: /nl/net/aspose.gis.geometries/geometry/getconvexhull/
---
## Geometry.GetConvexHull method

Berekent de convexe romp van deze geometrie.

```csharp
public IGeometry GetConvexHull()
```

### Winstwaarde

Een geometrie die een convexe romp van deze geometrie vertegenwoordigt. Als deze geometrie geen punten heeft, is het resultaat[`Null`](../null/) . Als deze geometrie maar één punt heeft, dan is het resultaat dit punt. Als deze geometrie maar twee punten heeft, dan is het resultaat[`ILineString`](../../ilinestring/) met de punten. Als deze geometrie drie of meer punten heeft, dan is het resultaat[`ILinearRing`](../../ilinearring/) dat vertegenwoordigt een convexe romp rond alle geometriepunten.

### Zie ook

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* naamruimte [Aspose.Gis.Geometries](../../geometry/)
* montage [Aspose.GIS](../../../)


