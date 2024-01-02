---
title: DwfImage.GetElementCount
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Gets count of graphic elements from specified page. Provides the ability to determine the number of graphic elements on a specific image page. To get this value you need to specify the page index in the array Pages the number of elements of which you want to get
type: docs
weight: 100
url: /net/aspose.cad.fileformats.dwf/dwfimage/getelementcount/
---
## DwfImage.GetElementCount method

Gets count of graphic elements from specified page. Provides the ability to determine the number of graphic elements on a specific image page. To get this value, you need to specify the page index in the array [`Pages`](../pages/), the number of elements of which you want to get.

```csharp
public int GetElementCount(int pageNumber)
```

| Parameter | Type | Description |
| --- | --- | --- |
| pageNumber | Int32 | Index of page to get count of graphic elements from. |

### Return Value

Count of graphic elements in specified page.

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
    image.RemoveElement(0, image.GetElementCount(0)-1);

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


