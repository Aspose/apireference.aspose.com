---
title: ProjectedSpatialReferenceSystemParameters.AddProjectionParameter
second_title: Aspose.GIS for .NET API Reference
description: ProjectedSpatialReferenceSystemParameters method. Adds projection parameter to this SRS. If parameter with such name already was added  update it.
type: docs
weight: 100
url: /net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/
---
## ProjectedSpatialReferenceSystemParameters.AddProjectionParameter method

Adds projection parameter to this SRS. If parameter with such name already was added - update it.

```csharp
public void AddProjectionParameter(string parameterName, double value)
```

| Parameter | Type | Description |
| --- | --- | --- |
| parameterName | String | Name of projection parameter. |
| value | Double | Value of parameter. Unit of value should be in [`LinearUnit`](../linearunit/) or [`AngularUnit`](../../geographicspatialreferencesystem/angularunit/) of [`Base`](../base/). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *parameterName* is null. |

### See Also

* class [ProjectedSpatialReferenceSystemParameters](../)
* namespace [Aspose.Gis.SpatialReferencing](../../projectedspatialreferencesystemparameters/)
* assembly [Aspose.GIS](../../../)


