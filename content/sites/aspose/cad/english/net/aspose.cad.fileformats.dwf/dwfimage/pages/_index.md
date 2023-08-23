---
title: DwfImage.Pages
second_title: Aspose.CAD for .NET API Reference
description: DwfImage property. Gets the DWF pages. Returns an array of all DWF pages that are contained in the DWF image. Each DWF page defines all its available graphical parameters and all the objects that are drawn on it
type: docs
weight: 40
url: /net/aspose.cad.fileformats.dwf/dwfimage/pages/
---
## DwfImage.Pages property

Gets the DWF pages. Returns an array of all DWF pages that are contained in the DWF image. Each DWF page defines all its available graphical parameters and all the objects that are drawn on it.

```csharp
public DwfPage[] Pages { get; }
```

## Examples

Retrieves image pages and changes it properties.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DwfImage image = (DwfImage) Image.Load(inStream))
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

    foreach (DwfWhipDrawable drawable in entities)
    {
        if (drawable is DwfWhipText)
        {
            ((DwfWhipText)drawable).Font.Name.Value.AsciiString = "Arial";
        }
    }

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

* class [DwfPage](../../dwfpage/)
* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


