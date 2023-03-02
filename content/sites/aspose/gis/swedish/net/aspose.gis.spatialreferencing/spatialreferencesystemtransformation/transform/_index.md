---
title: SpatialReferenceSystemTransformation.Transform
second_title: Aspose.GIS för .NET API Referens
description: SpatialReferenceSystemTransformation metod. Transformerar geometri från källans rumsliga referenssystem till målet rumsliga referenssystem.
type: docs
weight: 40
url: /sv/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Transformerar geometri från källans rumsliga referenssystem till målet rumsliga referenssystem.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| geometry | IGeometry | Geometri att transformera. |

### Returvärde

Ny geometri i målspatialt referenssystem.

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Geometri är`null` . |
| ArgumentException | Geometrier[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) är inte`null` och motsvarar inte [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Transformationen misslyckades. |

### Se även

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* hopsättning [Aspose.GIS](../../../)


