---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS för .NET API Referens
description: SpatialReferenceSystem metod. Skapar transformation från dettaSpatialReferenceSystem till en annanSpatialReferenceSystem .
type: docs
weight: 180
url: /sv/net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Skapar transformation från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem` .

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Annan`SpatialReferenceSystem`. |

### Returvärde

Förvandling från detta`SpatialReferenceSystem` till en annan`SpatialReferenceSystem`.

### Undantag

| undantag | skick |
| --- | --- |
| NotSupportedException | Transformation mellan detta`SpatialReferenceSystem` och argument stöds inte. Detta kan hända eftersom en av projektionerna inte stöds, eller ett av systemen är[`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/) . |
| [TransformationException](../../transformationexception/) | Transformation kunde inte skapas på grund av felaktiga parametrar inuti`SpatialReferenceSystem` . |

### Se även

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* namnutrymme [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* hopsättning [Aspose.GIS](../../../)


