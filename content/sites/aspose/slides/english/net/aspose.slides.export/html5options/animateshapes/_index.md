---
title: AnimateShapes
second_title: Aspose.Sildes for .NET API Reference
description: Returns or sets shapes animation option. Read/write Boolean.
type: docs
weight: 20
url: /net/aspose.slides.export/html5options/animateshapes/
---
## Html5Options.AnimateShapes property

Returns or sets shapes animation option. Read/write Boolean.

```csharp
public bool AnimateShapes { get; set; }
```

### Examples

Example:

```csharp
[C#]
using (Presentation pres = new Presentation("demo.pptx"))
{
  pres.Save("demo-animate-shapes.html", SaveFormat.Html5, new Html5Options()
  {
      AnimateShapes = true
  });
}
```

### See Also

* class [Html5Options](../../html5options)
* namespace [Aspose.Slides.Export](../../html5options)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
