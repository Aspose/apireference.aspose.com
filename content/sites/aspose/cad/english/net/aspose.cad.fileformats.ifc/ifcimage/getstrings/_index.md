---
title: IfcImage.GetStrings
second_title: Aspose.CAD for .NET API Reference
description: IfcImage method. Gets all string values from image. Can be useful to get some text from the image
type: docs
weight: 90
url: /net/aspose.cad.fileformats.ifc/ifcimage/getstrings/
---
## IfcImage.GetStrings method

Gets all string values from image. Can be useful to get some text from the image

```csharp
public override string[] GetStrings()
```

### Return Value

The array with string values.

## Examples

Gets all string from the image.

```csharp
using (IfcImage ifcImage = (IfcImage)Image.Load(fileName))
{
    var strings = ifcImage.GetStrings()
}
```

### See Also

* class [IfcImage](../)
* namespace [Aspose.CAD.FileFormats.Ifc](../../../aspose.cad.fileformats.ifc/)
* assembly [Aspose.CAD](../../../)


