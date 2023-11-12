---
title: DwfImage.UpdateSize
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Updates the image size. Provides forced calculation of image size parameters. This calculation must be performed before using the image size parameters after changing the graphic content of the image that affects the image size parameters
type: docs
weight: 120
url: /net/aspose.cad.fileformats.dwf/dwfimage/updatesize/
---
## DwfImage.UpdateSize method

Updates the image size. Provides forced calculation of image size parameters. This calculation must be performed before using the image size parameters after changing the graphic content of the image that affects the image size parameters.

```csharp
public void UpdateSize()
```

## Examples

Retrieves image pages, changes it properties and updates image size parameters.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (var image = (DwfImage) Image.Load(inStream))
using (FileStream stream = new FileStream(outFile, FileMode.Create))
{
    DwfWhipDrawable[] entities = image.Pages[0].Entities;
    foreach(DwfWhipDrawable drawable in entities)
    {
        if(drawable is DwfWhipPolyline)
        {
            ((DwfWhipPolyline) drawable).Points[0].X = -50;
            ((DwfWhipPolyline) drawable).Points[0].Y = -50;
            break;
        }
    }  

    image.UpdateSize();

    ImageOptionsBase options = new PngOptions();
    options.VectorRasterizationOptions = new CadRasterizationOptions
                                             {
                                                 PageWidth = (float)image.Pages[0].PaperWidth,
                                                 PageHeight = (float)image.Pages[0].PaperHeight,
                                                 DrawType = CadDrawTypeMode.UseObjectColor,
                                             };

    image.Save(stream, options);
}
```

### See Also

* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


