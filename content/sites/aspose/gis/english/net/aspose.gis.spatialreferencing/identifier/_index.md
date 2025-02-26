---
title: Class Identifier
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.Identifier class. Represents an identifier  a reference to external description of an object. If you create a SRS from WKT Identifier corresponds to AUTHORITY keyword
type: docs
weight: 4610
url: /net/aspose.gis.spatialreferencing/identifier/
---
## Identifier class

Represents an identifier - a reference to external description of an object. If you create a SRS from WKT, `Identifier` corresponds to "AUTHORITY" keyword.

```csharp
public class Identifier : IEquatable<Identifier>
```

## Constructors

| Name | Description |
| --- | --- |
| [Identifier](identifier/)(string, string) | Create new instance. |

## Properties

| Name | Description |
| --- | --- |
| [AuthorityName](../../aspose.gis.spatialreferencing/identifier/authorityname/) { get; } | A name of authority, which gave an [`AuthorityUniqueIdentifier`](./authorityuniqueidentifier/). |
| [AuthorityUniqueIdentifier](../../aspose.gis.spatialreferencing/identifier/authorityuniqueidentifier/) { get; } | A unique way to represent an object within a [`AuthorityName`](./authorityname/). |

## Methods

| Name | Description |
| --- | --- |
| static [Epsg](../../aspose.gis.spatialreferencing/identifier/epsg/)(int) | Creates new Identifier that represents EPSG identifier with code *epsgCode*. |
| [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals)(Identifier) | Indicates whether the current object is equal to another object of the same type. |
| override [Equals](../../aspose.gis.spatialreferencing/identifier/equals/#equals_1)(object) | Determines whether the specified object is equal to the current object. |
| [GetEpsgCode](../../aspose.gis.spatialreferencing/identifier/getepsgcode/)() | If this object represents a valid EPSG identifier (e.g. - authority name is "EPSG" and authority unique identifier is integer) - return it. Otherwise - return -1. |
| override [GetHashCode](../../aspose.gis.spatialreferencing/identifier/gethashcode/)() | Serves as the default hash function. |
| [operator ==](../../aspose.gis.spatialreferencing/identifier/op_equality/) | Implements the operator ==. |
| [operator !=](../../aspose.gis.spatialreferencing/identifier/op_inequality/) | Implements the operator !=. |

## Examples

WGS 84 Spatial reference system have EPSG code 4326, so it might contain identifier:

```csharp
new  {  = "EPSG",  = 4326 };
```

WGS 84 Ellipsoid have EPSG code 7030, and it might contain identifier:

```csharp
new  {  = "EPSG",  = 7030 };
```

### See Also

* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


