---
title: Image.CanSave
second_title: Aspose.CAD for .NET API Reference
description: Image method. Determines whether image can be saved to the specified file format represented by the passed save options
type: docs
weight: 120
url: /net/aspose.cad/image/cansave/
---
## Image.CanSave method

Determines whether image can be saved to the specified file format represented by the passed save options.

```csharp
public bool CanSave(ImageOptionsBase options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | ImageOptionsBase | The save options to use. |

### Return Value

`true` if image can be saved to the specified file format represented by the passed save options; otherwise, `false`.

## Examples

Checks whether export is possible to BMP with default options

```csharp
using (var image = Aspose.CAD.Image.Load("fileName.dwg"))
{
    if (image.CanSave(new BmpOptions()))
    {
        // export to BMP format is possible with this options
    }
}
```

### See Also

* class [ImageOptionsBase](../../imageoptionsbase/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


