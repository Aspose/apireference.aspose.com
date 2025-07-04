---
title: ViewOptions.ZoomType
linktitle: ZoomType
articleTitle: ZoomType
second_title: Aspose.Words for .NET
description: Discover the ViewOptions ZoomType property to easily adjust zoom levels based on window size, enhancing user experience and interface flexibility.
type: docs
weight: 60
url: /net/aspose.words.settings/viewoptions/zoomtype/
---
## ViewOptions.ZoomType property

Gets or sets a zoom value based on the size of the window.

```csharp
public ZoomType ZoomType { get; set; }
```

## Examples

Shows how to set a custom zoom factor, which older versions of Microsoft Word will apply to a document upon loading.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world!");

doc.ViewOptions.ViewType = ViewType.PageLayout;
doc.ViewOptions.ZoomPercent = 50;

Assert.That(doc.ViewOptions.ZoomType, Is.EqualTo(ZoomType.Custom));
Assert.That(doc.ViewOptions.ZoomType, Is.EqualTo(ZoomType.None));

doc.Save(ArtifactsDir + "ViewOptions.SetZoomPercentage.doc");
```

Shows how to set a custom zoom type, which older versions of Microsoft Word will apply to a document upon loading.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world!");

// Set the "ZoomType" property to "ZoomType.PageWidth" to get Microsoft Word
// to automatically zoom the document to fit the width of the page.
// Set the "ZoomType" property to "ZoomType.FullPage" to get Microsoft Word
// to automatically zoom the document to make the entire first page visible.
// Set the "ZoomType" property to "ZoomType.TextFit" to get Microsoft Word
// to automatically zoom the document to fit the inner text margins of the first page.
doc.ViewOptions.ZoomType = zoomType;

doc.Save(ArtifactsDir + "ViewOptions.SetZoomType.doc");
```

### See Also

* enum [ZoomType](../../zoomtype/)
* class [ViewOptions](../)
* namespace [Aspose.Words.Settings](../../../aspose.words.settings/)
* assembly [Aspose.Words](../../../)
