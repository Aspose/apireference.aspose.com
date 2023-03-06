---
title: WarpOptions.CellHeight
second_title: Aspose.GIS for .NET API Reference
description: WarpOptions property. Specifies a new height of the raster cell in target georeferenced units. If the value is set to 0 the CellHeight is automatically computed. The default value is 0.
type: docs
weight: 20
url: /net/aspose.gis.raster/warpoptions/cellheight/
---
## WarpOptions.CellHeight property

Specifies a new height of the raster cell (in target georeferenced units). If the value is set to 0, the `CellHeight` is automatically computed. The default value is "0".

```csharp
public double CellHeight { get; set; }
```

### Remarks

If the cell height is set to 0, the value will be taken from the original cell height or computed from [`Height`](../height/). Note that `CellHeight` cannot be used with [`Height`](../height/).

### See Also

* class [WarpOptions](../)
* namespace [Aspose.Gis.Raster](../../warpoptions/)
* assembly [Aspose.GIS](../../../)


