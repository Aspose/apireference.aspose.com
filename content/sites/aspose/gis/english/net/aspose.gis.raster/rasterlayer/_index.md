---
title: Class RasterLayer
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.Raster.RasterLayer class. Represents a raster layer
type: docs
weight: 3830
url: /net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Represents a raster layer.

```csharp
public abstract class RasterLayer : IDisposable
```

## Properties

| Name | Description |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Gets the number of bands in the raster layer. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Gets the raster bounds. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Gets cell or pixel size of the raster. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Gets the [`Driver`](./driver/) that instantiated this layer. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Gets the height of the raster in pixels. Also it is known as rows count. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Gets the values that represents background or 'no data' of the raster. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Gets a spatial reference system of raster. Can be `null` if it is unknown. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Gets x-coordinate of the raster upper left corner. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Gets y-coordinate of the raster upper left corner. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Gets the width of the raster in pixels. Also it is known as columns count. |

## Methods

| Name | Description |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Crops the raster layer using a band mask). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Crops the raster layer using a shape form (and band mask). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Releases the resources used by the `RasterLayer`. |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Gets a band by the specified index. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Calculates a spatial extent of this layer. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Converts the specified column and row to the spatial coordinate. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Calculate summary statistics consisting of count, sum, mean, min, max. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Reads the values in the specified cell. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Reads the values in the specified block as a 1-dimension array. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Reads and processes band values ​​in an expression. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Returns a string that represents the current object. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Warps the raster layer to another. |

### See Also

* namespace [Aspose.Gis.Raster](../../aspose.gis.raster/)
* assembly [Aspose.GIS](../../)


