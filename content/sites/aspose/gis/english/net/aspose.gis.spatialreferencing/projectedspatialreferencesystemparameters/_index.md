---
title: Class ProjectedSpatialReferenceSystemParameters
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.SpatialReferencing.ProjectedSpatialReferenceSystemParameters class. Parameters to create projected SRS. Some of parameters have defaults. Some parameters have reasonable defaults so you dont have to assign only them. If you assign null to those parameters a default value will be used. ProjectionMethodName and Base dont have defaults  you have to assign some non null value to this properties
type: docs
weight: 4680
url: /net/aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/
---
## ProjectedSpatialReferenceSystemParameters class

Parameters to create projected SRS. Some of parameters have defaults. Some parameters have reasonable defaults, so you don't have to assign only them. If you assign `null` to those parameters, a default value will be used. [`ProjectionMethodName`](./projectionmethodname/) and [`Base`](./base/) don't have defaults - you have to assign some non `null` value to this properties.

```csharp
public class ProjectedSpatialReferenceSystemParameters
```

## Constructors

| Name | Description |
| --- | --- |
| [ProjectedSpatialReferenceSystemParameters](projectedspatialreferencesystemparameters/)() | Creates new instance. |

## Properties

| Name | Description |
| --- | --- |
| [AxisesOrder](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/axisesorder/) { get; set; } | Order of axises. Defaults to XY. |
| [Base](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) { get; set; } | Base geographic SRS (SRS to which projection is applied). You MUST set this property to not `null` value in order to create valid SRS, this property does not have any default. |
| [LinearUnit](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/linearunit/) { get; set; } | Units to be used in this SRS. Default is [`Meter`](../unit/meter/). |
| [Name](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/name/) { get; set; } | Name of projected SRS. Default is "Unnamed". |
| [ProjectionMethodIdentifier](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodidentifier/) { get; set; } | Identifier of projection method. There is no default value, you might set this parameter to not `null` value, if you want attach identifier to projection. If you do so - its up to you to ensure that identifier in consistent projection method name (projection method name will not change when you set this property). |
| [ProjectionMethodName](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) { get; set; } | Name of projection method. There is no default and you MUST set this parameter to not `null` value, since projected SRS with no projection name is useless. |
| [XAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/xaxis/) { get; set; } | Axis that describes X (horizontal) dimension. Defaults to axis with east direction. |
| [YAxis](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/yaxis/) { get; set; } | Axis that describes Y (vertical) dimension. Defaults to axis with north direction. |

## Methods

| Name | Description |
| --- | --- |
| [AddProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/addprojectionparameter/)(string, double) | Adds projection parameter to this SRS. If parameter with such name already was added - update it. |
| [GetProjectionParameter](../../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/getprojectionparameter/)(string) | Gets projection parameter with specified name. |

### See Also

* namespace [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* assembly [Aspose.GIS](../../)


