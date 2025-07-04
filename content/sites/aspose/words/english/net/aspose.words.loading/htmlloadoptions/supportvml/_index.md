---
title: HtmlLoadOptions.SupportVml
linktitle: SupportVml
articleTitle: SupportVml
second_title: Aspose.Words for .NET
description: Discover how the HtmlLoadOptions SupportVml property enhances your web experience by enabling VML image support for improved graphics quality.
type: docs
weight: 70
url: /net/aspose.words.loading/htmlloadoptions/supportvml/
---
## HtmlLoadOptions.SupportVml property

Gets or sets a value indicating whether to support VML images.

```csharp
public bool SupportVml { get; set; }
```

## Examples

Shows how to support conditional comments while loading an HTML document.

```csharp
HtmlLoadOptions loadOptions = new HtmlLoadOptions();

// If the value is true, then we take VML code into account while parsing the loaded document.
loadOptions.SupportVml = supportVml;

// This document contains a JPEG image within "<!--[if gte vml 1]>" tags,
// and a different PNG image within "<![if !vml]>" tags.
// If we set the "SupportVml" flag to "true", then Aspose.Words will load the JPEG.
// If we set this flag to "false", then Aspose.Words will only load the PNG.
Document doc = new Document(MyDir + "VML conditional.htm", loadOptions);

if (supportVml)
    Assert.That(((Shape)doc.GetChild(NodeType.Shape, 0, true)).ImageData.ImageType, Is.EqualTo(ImageType.Jpeg));
else
    Assert.That(((Shape)doc.GetChild(NodeType.Shape, 0, true)).ImageData.ImageType, Is.EqualTo(ImageType.Png));
```

### See Also

* class [HtmlLoadOptions](../)
* namespace [Aspose.Words.Loading](../../../aspose.words.loading/)
* assembly [Aspose.Words](../../../)
