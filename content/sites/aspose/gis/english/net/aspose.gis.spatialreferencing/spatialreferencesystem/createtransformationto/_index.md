---
title: SpatialReferenceSystem.CreateTransformationTo
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem method. Creates transformation from this SpatialReferenceSystem to another SpatialReferenceSystem
type: docs
weight: 180
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/
---
## SpatialReferenceSystem.CreateTransformationTo method

Creates transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`.

```csharp
public SpatialReferenceSystemTransformation CreateTransformationTo(SpatialReferenceSystem targetSrs)
```

| Parameter | Type | Description |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | Another `SpatialReferenceSystem`. |

### Return Value

Transformation from this `SpatialReferenceSystem` to another `SpatialReferenceSystem`.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Transformation between this `SpatialReferenceSystem` and argument is not supported. This can happen, because one of the projections is not supported, or one of the systems is [`VerticalSpatialReferenceSystem`](../../verticalspatialreferencesystem/) or [`LocalSpatialReferenceSystem`](../../localspatialreferencesystem/). |
| [TransformationException](../../transformationexception/) | Transformation is failed to be created because of wrong parameters inside `SpatialReferenceSystem`. |

### See Also

* method [TryCreateTransformationTo](../trycreatetransformationto/)
* class [SpatialReferenceSystemTransformation](../../spatialreferencesystemtransformation/)
* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


