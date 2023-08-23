---
title: DwfImage.AddElement
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Adds graphic element to specified page. Provides an opportunity to add a new graphic element to the existing ones in the image. To add it you need to create a new graphic element and specify the index of the page in Pages array to which the element should be added
type: docs
weight: 60
url: /net/aspose.cad.fileformats.dwf/dwfimage/addelement/
---
## DwfImage.AddElement method

Adds graphic element to specified page. Provides an opportunity to add a new graphic element to the existing ones in the image. To add it, you need to create a new graphic element and specify the index of the page in [`Pages`](../pages/) array to which the element should be added.

```csharp
public void AddElement(int pageNumber, DwfWhipDrawable element)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | Int32 | Index of the page in [`Pages`](../pages/) array to add element to. |
| element | DwfWhipDrawable | Element to be added. |

## Examples

Adds a new text graphic element to the first page of the image.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);

using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DwfImage image = (DwfImage) Image.Load(inStream))
using (FileStream stream = new FileStream(outFile, FileMode.Create))
{
    DwfWhipText text = new DwfWhipText();
    text.Text = new DwfString("TEXT");
    text.Color = Color.Red;
    text.Position = new DwfWhipLogicalPoint(4000, 4000);
    text.Font = new DwfWhipFont();
    text.Font.Name = new DwfWhipOptionFontName();
    text.Font.Name.Value = new DwfString("times new roman");
    text.Font.Height = new DwfWhipOptionFontHeight();
    text.Font.Height.Value = 2000;
    text.IsVisible = true;
    image.AddElement(0, text);

    ImageOptionsBase options = new PngOptions();
    options.VectorRasterizationOptions = new CadRasterizationOptions
                                             {
                                                 DrawType = CadDrawTypeMode.UseObjectColor,
                                             };

    image.Save(stream, options);
}
```

### See Also

* class [DwfWhipDrawable](../../../aspose.cad.fileformats.dwf.whip.objects.drawable/dwfwhipdrawable/)
* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


