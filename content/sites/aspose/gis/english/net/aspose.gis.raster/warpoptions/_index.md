---
title: Class WarpOptions
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Raster.WarpOptions class. Options for raster warping
type: docs
weight: 3870
url: /net/aspose.gis.raster/warpoptions/
---
## WarpOptions class

Options for raster warping.

```csharp
public class WarpOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [WarpOptions](warpoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [CellHeight](../../aspose.gis.raster/warpoptions/cellheight/) { get; set; } | Specifies a new height of the raster cell (in target georeferenced units). If the value is set to 0, the [`CellHeight`](./cellheight/) is automatically computed. The default value is "0". |
| [CellWidth](../../aspose.gis.raster/warpoptions/cellwidth/) { get; set; } | Specifies a new width of the raster cell (in target georeferenced units). If the value is set to 0, the [`CellWidth`](./cellwidth/) is automatically computed. The default value is "0". |
| [DefaultSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/defaultspatialreferencesystem/) { get; set; } | Specifies a value for a source spatial reference if that is missing. |
| [Height](../../aspose.gis.raster/warpoptions/height/) { get; set; } | Specifies output raster height in pixels and columns. If the value is set to 0, the height is automatically computed. The default value is "0". |
| [TargetExtent](../../aspose.gis.raster/warpoptions/targetextent/) { get; set; } | Specifies bounds of raster layer to warp. If set to `null`, extent is calculated during warping to include all cells from raster. |
| [TargetSpatialReferenceSystem](../../aspose.gis.raster/warpoptions/targetspatialreferencesystem/) { get; set; } | Specifies target spatial reference. If set to `null`, default or source spatial reference is used. |
| [Width](../../aspose.gis.raster/warpoptions/width/) { get; set; } | Specifies output raster width in pixels and columns. If the value is set to 0, the width is automatically computed. The default value is "0". |

### See Also

* namespace [Aspose.Gis.Raster](../../aspose.gis.raster/)
* assembly [Aspose.GIS](../../)


