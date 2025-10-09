---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid class. A coordinate precision grid inside a FileGDB layer
type: docs
weight: 1840
url: /net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

A coordinate precision grid inside a FileGDB layer.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Constructors

| Name | Description |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Gets or sets the origin of M coordinate. If set to `null` the default is used. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Gets or sets the scale of M coordinate. If set to `null` the default is used. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Gets or sets the origin of X coordinate. If set to `null` the default is used. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Gets or sets the scale of X and Y coordinates. If set to `null` the default is used. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Gets or sets the origin of Y coordinate. If set to `null` the default is used. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Gets or sets the origin of Z coordinate. If set to `null` the default is used. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Gets or sets the scale of Z coordinate. If set to `null` the default is used. |

## Methods

| Name | Description |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Creates new `FileGdbCoordinatePrecisionGrid` such that all values within a rectangle are representable. |

## Remarks

The coordinate precision grid defines the valid domain and resolution of coordinates in FileGDB layer. Origin defines the Path to coordinate precision grid in space. Scale defines the resolution (the larger scale is, the more precise values are written). Precision grid specifies the valid range of values for coordinates:

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

Every coordinate in the [`VectorLayer`](../../aspose.gis/vectorlayer/) must be within this range. Coordinates that are outside of the range may cause read errors later on and will be processed wrong by ArcGIS. If you don't specify any properties (keep them `null`) the default values are will be used. Default values depends on [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) of the [`VectorLayer`](../../aspose.gis/vectorlayer/). For geographic [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) defaults are:

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

For projected [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) defaults are:

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

where `XYTolerance`, `ZTolerance` and `MTolerance` are values from [`FileGdbOptions`](../filegdboptions/).

### See Also

* namespace [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* assembly [Aspose.GIS](../../)


