---
title: RasterLayer.Crop
second_title: Aspose.GIS for .NET API Reference
description: RasterLayer method. Crops the raster layer using a shape form and band mask.
type: docs
weight: 110
url: /net/aspose.gis.raster/rasterlayer/crop/
---
## Crop(IGeometry, double[]) {#crop}

Crops the raster layer using a shape form (and band mask).

```csharp
public RasterLayer Crop(IGeometry geometry, double[] masks = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| geometry | IGeometry | Geometry represented the shape form. |
| masks | Double[] | Mask for crop layer |

### Return Value

The cropped raster layer. If no intersections found returns `null`.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument cannot be null. Parameter name: geometry. |
| NotSupportedException | Argument cannot be different from polygon or surface. Parameter name: geometry. |
| InvalidOperationException | Original layer cannot be another CropRasterLayer. |
| [GisException](../../../aspose.gis/gisexception/) | Error while cropping the layer. |

### See Also

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [RasterLayer](../)
* namespace [Aspose.Gis.Raster](../../rasterlayer/)
* assembly [Aspose.GIS](../../../)

---

## Crop(double[]) {#crop_1}

Crops the raster layer using a band mask).

```csharp
public RasterLayer Crop(double[] masks)
```

| Parameter | Type | Description |
| --- | --- | --- |
| masks | Double[] | Mask for crop layer |

### Return Value

The cropped raster layer. If no intersections found returns `null`.

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException |  |

### See Also

* class [RasterLayer](../)
* namespace [Aspose.Gis.Raster](../../rasterlayer/)
* assembly [Aspose.GIS](../../../)


