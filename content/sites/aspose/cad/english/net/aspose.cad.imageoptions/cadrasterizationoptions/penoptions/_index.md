---
title: CadRasterizationOptions.PenOptions
second_title: Aspose.CAD for .NET API Reference
description: CadRasterizationOptions property. Gets or sets the pen options
type: docs
weight: 110
url: /net/aspose.cad.imageoptions/cadrasterizationoptions/penoptions/
---
## CadRasterizationOptions.PenOptions property

Gets or sets the pen options.

```csharp
public PenOptions PenOptions { get; set; }
```

### Property Value

The pen options.

## Examples

Sets up "squared" pen

```csharp
using (CadImage cadImage = (CadImage)Image.Load(GetPath(fileName)))
{
    JpegOptions options = new JpegOptions();
    var rasterizationOptions = new CadRasterizationOptions();
    rasterizationOptions.PenOptions = new PenOptions() { StartCap = LineCap.Square, EndCap = LineCap.Square };
    options.VectorRasterizationOptions = rasterizationOptions;
    cadImage.Save(outFile, options);
}
```

### See Also

* class [PenOptions](../../penoptions/)
* class [CadRasterizationOptions](../)
* namespace [Aspose.CAD.ImageOptions](../../cadrasterizationoptions/)
* assembly [Aspose.CAD](../../../)


