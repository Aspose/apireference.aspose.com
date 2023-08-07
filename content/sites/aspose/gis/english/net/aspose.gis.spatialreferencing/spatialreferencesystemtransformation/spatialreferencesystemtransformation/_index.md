---
title: SpatialReferenceSystemTransformation.SpatialReferenceSystemTransformation
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystemTransformation constructor. Creates new instance
type: docs
weight: 10
url: /net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/spatialreferencesystemtransformation/
---
## SpatialReferenceSystemTransformation constructor

Creates new instance.

```csharp
public SpatialReferenceSystemTransformation(SpatialReferenceSystem sourceSrs, 
    SpatialReferenceSystem targetSrs)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourceSrs | SpatialReferenceSystem | Source [`SpatialReferenceSystem`](../../spatialreferencesystem/). |
| targetSrs | SpatialReferenceSystem | Target [`SpatialReferenceSystem`](../../spatialreferencesystem/). |

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException | Transformation between given spatial reference systems is not supported. |
| [TransformationException](../../transformationexception/) | Transformation is failed to be created because of wrong parameters inside SRS. |

### See Also

* class [SpatialReferenceSystem](../../spatialreferencesystem/)
* class [SpatialReferenceSystemTransformation](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* assembly [Aspose.GIS](../../../)


