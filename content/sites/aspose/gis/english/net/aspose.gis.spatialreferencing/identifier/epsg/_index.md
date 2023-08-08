---
title: Identifier.Epsg
second_title: Aspose.GIS for .NET API Reference
description: Identifier method. Creates new Identifier that represents EPSG identifier with code epsgCode
type: docs
weight: 20
url: /net/aspose.gis.spatialreferencing/identifier/epsg/
---
## Identifier.Epsg method

Creates new Identifier that represents EPSG identifier with code *epsgCode*.

```csharp
public static Identifier Epsg(int epsgCode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| epsgCode | Int32 | Epsg code. |

### Return Value

New identifier with [`AuthorityName`](../authorityname/) "EPSG" and [`AuthorityUniqueIdentifier`](../authorityuniqueidentifier/)*epsgCode*. If *epsgCode* is less then 0 - return `null`;

### See Also

* class [Identifier](../)
* namespace [Aspose.Gis.SpatialReferencing](../../identifier/)
* assembly [Aspose.GIS](../../../)


