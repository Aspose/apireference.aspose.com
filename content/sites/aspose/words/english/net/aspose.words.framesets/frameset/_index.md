---
title: Frameset Class
linktitle: Frameset
articleTitle: Frameset
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Framesets.Frameset class for seamless frame management in documents. Enhance your web pages with efficient frame integration!
type: docs
weight: 3500
url: /net/aspose.words.framesets/frameset/
---
## Frameset class

Represents a frames page or a single frame on a frames page.

To learn more, visit the [Programming with Documents](https://docs.aspose.com/words/net/programming-with-documents/) documentation article.

```csharp
public class Frameset
```

## Constructors

| Name | Description |
| --- | --- |
| [Frameset](frameset/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [ChildFramesets](../../aspose.words.framesets/frameset/childframesets/) { get; } | Gets the collection of child frames and frames pages. |
| [FrameDefaultUrl](../../aspose.words.framesets/frameset/framedefaulturl/) { get; set; } | Gets or sets the web page URL or document file name to display in this frame. |
| [IsFrameLinkToFile](../../aspose.words.framesets/frameset/isframelinktofile/) { get; set; } | Gets or sets a value indicating whether the web page or document file name specified in the [`FrameDefaultUrl`](./framedefaulturl/) property is an external resource the frame is linked with. |

## Remarks

If the [`ChildFramesets`](./childframesets/) property contains items, this instance is a frames page, otherwise it is a single frame.

## Examples

Shows how to access frames on-page.

```csharp
// Document contains several frames with links to other documents.
Document doc = new Document(MyDir + "Frameset.docx");

Assert.That(doc.Frameset.ChildFramesets.Count, Is.EqualTo(3));
// We can check the default URL (a web page URL or local document) or if the frame is an external resource.
Assert.That(doc.Frameset.ChildFramesets[0].ChildFramesets[0].FrameDefaultUrl, Is.EqualTo("https://file-examples-com.github.io/uploads/2017/02/file-sample_100kB.docx"));
Assert.That(doc.Frameset.ChildFramesets[0].ChildFramesets[0].IsFrameLinkToFile, Is.True);

Assert.That(doc.Frameset.ChildFramesets[1].FrameDefaultUrl, Is.EqualTo("Document.docx"));
Assert.That(doc.Frameset.ChildFramesets[1].IsFrameLinkToFile, Is.False);

// Change properties for one of our frames.
doc.Frameset.ChildFramesets[0].ChildFramesets[0].FrameDefaultUrl =
    "https://github.com/aspose-words/Aspose.Words-for-.NET/blob/master/Examples/Data/Absolute%20position%20tab.docx";
doc.Frameset.ChildFramesets[0].ChildFramesets[0].IsFrameLinkToFile = false;
```

### See Also

* namespace [Aspose.Words.Framesets](../../aspose.words.framesets/)
* assembly [Aspose.Words](../../)
