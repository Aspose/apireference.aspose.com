---
title: DwfImage.RemoveElement
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Removes graphic element from specified page. Provides the ability to remove a graphic element from the image. To remove it you need to specify the page index in Pages array from which the element should be removed and the index of the element in Entities array
type: docs
weight: 120
url: /net/aspose.cad.fileformats.dwf/dwfimage/removeelement/
---
## DwfImage.RemoveElement method

Removes graphic element from specified page. Provides the ability to remove a graphic element from the image. To remove it, you need to specify the page index in [`Pages`](../pages/) array from which the element should be removed and the index of the element in [`Entities`](../../dwfpage/entities/) array.

```csharp
public void RemoveElement(int pageNumber, int elementIndex)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | Int32 | Index of page in [`Pages`](../pages/) array to remove element from. |
| elementIndex | Int32 | Index of element to be removed. |

## Examples

Removes last graphic element from the first page of the image.

```csharp
string fileName = "exampleFile";
string file = string.Format("{0}.dwf", fileName);
string outFile = string.Format("{0}.png", fileName);

using (FileStream inStream = new FileStream(file, FileMode.Open))
using (DwfImage image = (DwfImage) Image.Load(inStream))
using (FileStream stream = new FileStream(outFile, FileMode.Create))
{
    image.RemoveElement(0, image.Pages[0].Entities.Length-1);

    ImageOptionsBase options = new PngOptions();
    options.VectorRasterizationOptions = new CadRasterizationOptions
                                             {
                                                 DrawType = CadDrawTypeMode.UseObjectColor,
                                             };

    image.Save(stream, options);
}
```

### See Also

* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


