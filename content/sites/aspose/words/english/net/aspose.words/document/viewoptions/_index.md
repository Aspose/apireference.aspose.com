---
title: Document.ViewOptions
linktitle: ViewOptions
articleTitle: ViewOptions
second_title: Aspose.Words for .NET
description: Discover the Document ViewOptions property to customize your Microsoft Word display settings for a tailored viewing experience.
type: docs
weight: 490
url: /net/aspose.words/document/viewoptions/
---
## Document.ViewOptions property

Provides options to control how the document is displayed in Microsoft Word.

```csharp
public ViewOptions ViewOptions { get; }
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

* class [ViewOptions](../../../aspose.words.settings/viewoptions/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
