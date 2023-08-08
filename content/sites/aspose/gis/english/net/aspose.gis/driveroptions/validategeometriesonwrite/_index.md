---
title: DriverOptions.ValidateGeometriesOnWrite
second_title: Aspose.GIS for .NET API Reference
description: DriverOptions property. Determines if geometries should be validated when they are added to the layer. If set to true IsValid is called for each geometry when its added to the layer and if validation fails IsValid is false GisException is thrown
type: docs
weight: 90
url: /net/aspose.gis/driveroptions/validategeometriesonwrite/
---
## DriverOptions.ValidateGeometriesOnWrite property

Determines if geometries should be validated when they are added to the layer. If set to `true`, [`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) is called for each geometry when it's added to the layer, and if validation fails ([`IsValid`](../../../aspose.gis.geometries/geometry/isvalid/) is `false`), [`GisException`](../../gisexception/) is thrown.

```csharp
public bool ValidateGeometriesOnWrite { get; set; }
```

## Remarks

This is a creation option - it does not affect opening.

### See Also

* class [DriverOptions](../)
* namespace [Aspose.Gis](../../driveroptions/)
* assembly [Aspose.GIS](../../../)


