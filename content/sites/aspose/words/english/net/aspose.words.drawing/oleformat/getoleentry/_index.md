---
title: OleFormat.GetOleEntry
linktitle: GetOleEntry
articleTitle: GetOleEntry
second_title: Aspose.Words for .NET
description: Discover the OleFormat GetOleEntry method to efficiently retrieve OLE object data entries for enhanced data management and seamless integration.
type: docs
weight: 140
url: /net/aspose.words.drawing/oleformat/getoleentry/
---
## OleFormat.GetOleEntry method

Gets OLE object data entry.

```csharp
public MemoryStream GetOleEntry(string oleEntryName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| oleEntryName | String | Case-sensitive name of the OLE data stream. |

### Return Value

An OLE data stream or `null`.

## Examples

Shows how to insert linked and unlinked OLE objects.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Embed a Microsoft Visio drawing into the document as an OLE object.
builder.InsertOleObject(ImageDir + "Microsoft Visio drawing.vsd", "Package", false, false, null);

// Insert a link to the file in the local file system and display it as an icon.
builder.InsertOleObject(ImageDir + "Microsoft Visio drawing.vsd", "Package", true, true, null);

// Inserting OLE objects creates shapes that store these objects.
Shape[] shapes = doc.GetChildNodes(NodeType.Shape, true).OfType<Shape>().ToArray();

Assert.AreEqual(2, shapes.Length);
Assert.AreEqual(2, shapes.Count(s => s.ShapeType == ShapeType.OleObject));

// If a shape contains an OLE object, it will have a valid "OleFormat" property,
// which we can use to verify some aspects of the shape.
OleFormat oleFormat = shapes[0].OleFormat;

Assert.AreEqual(false, oleFormat.IsLink);
Assert.AreEqual(false, oleFormat.OleIcon);

oleFormat = shapes[1].OleFormat;

Assert.AreEqual(true, oleFormat.IsLink);
Assert.AreEqual(true, oleFormat.OleIcon);

Assert.True(oleFormat.SourceFullName.EndsWith(@"Images" + Path.DirectorySeparatorChar + "Microsoft Visio drawing.vsd"));
Assert.AreEqual("", oleFormat.SourceItem);

Assert.AreEqual("Microsoft Visio drawing.vsd", oleFormat.IconCaption);

doc.Save(ArtifactsDir + "Shape.OleLinks.docx");

// If the object contains OLE data, we can access it using a stream.
using (MemoryStream stream = oleFormat.GetOleEntry("\x0001CompObj"))
{
    byte[] oleEntryBytes = stream.ToArray();
    Assert.AreEqual(76, oleEntryBytes.Length);
}
```

### See Also

* class [OleFormat](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)
