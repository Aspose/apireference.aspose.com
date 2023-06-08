---
title: Image.Size
second_title: Aspose.CAD for .NET API Reference
description: Image property. Gets the image size
type: docs
weight: 80
url: /net/aspose.cad/image/size/
---
## Image.Size property

Gets the image size.

```csharp
public Size Size { get; }
```

### Property Value

The image size.

## Examples

Processes a drawing if it is not empty

```csharp
var fileName = @"C:\path\drawing.dwg";
using (Aspose.CAD.Image drawing = Aspose.CAD.Image.Load(fileName))
{
    if (!drawing.Size.IsEmpty)
    {
        // ...
    }
}
```

### See Also

* struct [Size](../../size/)
* class [Image](../)
* namespace [Aspose.CAD](../../image/)
* assembly [Aspose.CAD](../../../)


