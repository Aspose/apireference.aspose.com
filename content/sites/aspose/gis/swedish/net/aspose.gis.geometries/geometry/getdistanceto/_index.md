---
title: Geometry.GetDistanceTo
second_title: Aspose.GIS för .NET API Referens
description: Geometry metod. Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri.
type: docs
weight: 240
url: /sv/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

Beräknar det minsta avståndet mellan denna geometri och en specificerad geometri.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| other | IGeometry | En geometri att hitta avstånd till. |

### Returvärde

Om båda geometrierna inte är det[`IsEmpty`](../isempty/) - ett avstånd mellan de närmaste punkterna i geometrierna. Om minst en geometri är tom returneras -1.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) av geometrier är inte likvärdiga. Du kan använda[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) för att konvertera geometrier till samma rumsliga referenssystem. |

### Se även

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../geometry/)
* hopsättning [Aspose.GIS](../../../)


