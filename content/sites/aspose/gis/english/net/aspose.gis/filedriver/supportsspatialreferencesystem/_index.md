---
title: FileDriver.SupportsSpatialReferenceSystem
second_title: Aspose.GIS for .NET API Reference
description: FileDriver method. Determines whether specified spatial reference system is supported by the driver.
type: docs
weight: 100
url: /net/aspose.gis/filedriver/supportsspatialreferencesystem/
---
## FileDriver.SupportsSpatialReferenceSystem method

Determines, whether specified spatial reference system is supported by the driver.

```csharp
public abstract bool SupportsSpatialReferenceSystem(SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Type | Description |
| --- | --- | --- |
| spatialReferenceSystem | SpatialReferenceSystem | Spatial reference system. |

### Return Value

Boolean value, indicating whether specified spatial reference system is supported by the driver. `null` is considered supported by any driver.

### Remarks

If spatial reference system is not supported, and you pass it to [`CreateLayer`](../createlayer/) method, a NotSupportedException will be thrown.

### See Also

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [FileDriver](../)
* namespace [Aspose.Gis](../../filedriver/)
* assembly [Aspose.GIS](../../../)


