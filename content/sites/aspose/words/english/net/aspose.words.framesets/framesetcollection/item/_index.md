---
title: FramesetCollection.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: Access specific frames with FramesetCollection. Easily retrieve frame pages by index for efficient web navigation and enhanced user experience.
type: docs
weight: 30
url: /net/aspose.words.framesets/framesetcollection/item/
---
## FramesetCollection indexer

Gets a frame or frames page at the specified index.

```csharp
public Frameset this[int index] { get; }
```

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

* class [Frameset](../../frameset/)
* class [FramesetCollection](../)
* namespace [Aspose.Words.Framesets](../../../aspose.words.framesets/)
* assembly [Aspose.Words](../../../)
