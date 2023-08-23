---
title: DwfImage.Layers
second_title: Aspose.CAD for .NET API Reference
description: DwfImage property. Gets DWF pages layers. Returns the enumerable collection of DWF layers. The DWF data can be assigned to a specific DWF layer which is a grouping drawing objects
type: docs
weight: 30
url: /net/aspose.cad.fileformats.dwf/dwfimage/layers/
---
## DwfImage.Layers property

Gets DWF pages layers. Returns the enumerable collection of DWF layers. The DWF data can be assigned to a specific DWF layer, which is a grouping drawing objects.

```csharp
public DwfLayersList Layers { get; }
```

## Examples

Exports specified layers.

```csharp
string file = "ExampleFile.dwf";
using (DwfImage image = (DwfImage) Aspose.CAD.Image.Load(file))
{
    foreach (var layer in image.Layers)
    {
        string outFile = "ExampleFile_" + layer + ".jpg";
        using (FileStream fs = new FileStream(outFile, FileMode.Create))
        {
            JpegOptions jpegOptions = new JpegOptions();
            CadRasterizationOptions options = new CadRasterizationOptions();
            options.Layouts = new string[] { image.Pages[0].Name };
            options.Layers = new[] { layer.Name.AsciiString };
            options.DrawType = CadDrawTypeMode.UseObjectColor;
            jpegOptions.VectorRasterizationOptions = options;
            image.Save(fs, jpegOptions);
        }
    }
}
```

### See Also

* class [DwfLayersList](../../dwflayerslist/)
* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


