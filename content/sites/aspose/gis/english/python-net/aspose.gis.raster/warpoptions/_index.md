---
title: WarpOptions Class
type: docs
weight: 100
url: /python-net/aspose.gis.raster/warpoptions/
---

**Summary:** Options for raster warping.

**Module:** [aspose.gis.raster](/psd/python-net/aspose.gis.raster/)

**Full Name:** aspose.gis.raster.WarpOptions

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [WarpOptions()](#WarpOptions__1) | Initializes a new instance of the WarpOptions class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| cell_height | double | r/w | Specifies a new height of the raster cell (in target georeferenced units).<br/>            If the value is set to 0, the [WarpOptions.cell_height](/psd/python-net/aspose.gis.raster/warpoptions/) is automatically computed. The default value is "0". |
| cell_width | double | r/w | Specifies a new width of the raster cell (in target georeferenced units).<br/>            If the value is set to 0, the [WarpOptions.cell_width](/psd/python-net/aspose.gis.raster/warpoptions/) is automatically computed. The default value is "0". |
| default_spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | Specifies a value for a source spatial reference if that is missing. |
| height | int | r/w | Specifies output raster height in pixels and columns.<br/>            If the value is set to 0, the height is automatically computed. The default value is "0". |
| target_extent | [Extent](/psd/python-net/aspose.gis/extent) | r/w | Specifies bounds of raster layer to warp.<br/>            If set to <see langword="null" />, extent is calculated during warping to include all cells from raster. |
| target_spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | Specifies target spatial reference.<br/>            If set to <see langword="null" />, default or source spatial reference is used. |
| width | int | r/w | Specifies output raster width in pixels and columns.<br/>            If the value is set to 0, the width is automatically computed. The default value is "0". |


### Constructor: WarpOptions() {#WarpOptions__1}


```
 WarpOptions() 
```

Initializes a new instance of the WarpOptions class

