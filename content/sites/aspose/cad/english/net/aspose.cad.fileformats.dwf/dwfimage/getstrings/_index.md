---
title: DwfImage.GetStrings
second_title: Aspose.CAD for .NET API Reference
description: DwfImage method. Gets all string values from image. Provides an opportunity to get the values of all text graphic elements present in the image in the form of an array of strings
type: docs
weight: 110
url: /net/aspose.cad.fileformats.dwf/dwfimage/getstrings/
---
## DwfImage.GetStrings method

Gets all string values from image. Provides an opportunity to get the values of all text graphic elements present in the image in the form of an array of strings.

```csharp
public override string[] GetStrings()
```

### Return Value

The array with string values.

## Examples

Retrieves values of all text graphic elements an prints it out to the console.

```csharp
string file = "ExampleFile.dwf";
string[] result;
using (FileStream inStream = new FileStream(file, FileMode.Open))
using (Image image = Image.Load(inStream))
{
    result = image.GetStrings();
}

foreach (string s in result)
{
    Console.WriteLine(s);
}
```

### See Also

* class [DwfImage](../)
* namespace [Aspose.CAD.FileFormats.Dwf](../../../aspose.cad.fileformats.dwf/)
* assembly [Aspose.CAD](../../../)


