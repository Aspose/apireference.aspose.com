---
title: SpatialReferenceSystem.IsCompound
second_title: Aspose.GIS for .NET API Reference
description: SpatialReferenceSystem property. Returns whether this SRS is compound a union of two SRS. Following combinations of SRS in compound SRS are considered valid Geographic SRS  Vertical SRS in this case type of compound SRS will be Geographic. Projected SRS  Vertical SRS in this case type of compound SRS will be Projected. If combination of SRSs differs type of compound SRS will be Unknown
type: docs
weight: 130
url: /net/aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/
---
## SpatialReferenceSystem.IsCompound property

Returns whether this SRS is compound (a union of two SRS). Following combinations of SRS in compound SRS are considered valid: Geographic SRS + Vertical SRS, in this case type of compound SRS will be Geographic. Projected SRS + Vertical SRS, in this case type of compound SRS will be Projected. If combination of SRSs differs, type of compound SRS will be Unknown.

```csharp
public virtual bool IsCompound { get; }
```

## Remarks

In WKT this is COMPD_CS.

### See Also

* class [SpatialReferenceSystem](../)
* namespace [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* assembly [Aspose.GIS](../../../)


