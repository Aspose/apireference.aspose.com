---
title: RtfSaveOptions.SaveImagesAsWmf
linktitle: SaveImagesAsWmf
articleTitle: SaveImagesAsWmf
second_title: Aspose.Words für .NET
description: RtfSaveOptions SaveImagesAsWmf eigendom. WannWAHR alle Bilder werden als WMF. gespeichert in C#.
type: docs
weight: 50
url: /de/net/aspose.words.saving/rtfsaveoptions/saveimagesaswmf/
---
## RtfSaveOptions.SaveImagesAsWmf property

Wann`WAHR` alle Bilder werden als WMF. gespeichert

```csharp
public bool SaveImagesAsWmf { get; set; }
```

## Bemerkungen

Diese Option kann helfen, WordPad-Warnmeldungen zu vermeiden.

## Beispiele

Zeigt, wie alle Bilder in einem Dokument in das Windows-Metafile-Format konvertiert werden, während wir das Dokument als RTF speichern.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Jpeg image:");
Shape imageShape = builder.InsertImage(ImageDir + "Logo.jpg");

Assert.AreEqual(ImageType.Jpeg, imageShape.ImageData.ImageType);

builder.InsertParagraph();
builder.Writeln("Png image:");
imageShape = builder.InsertImage(ImageDir + "Transparent background logo.png");

Assert.AreEqual(ImageType.Png, imageShape.ImageData.ImageType);

// Erstellen Sie ein „RtfSaveOptions“-Objekt, um es an die „Save“-Methode des Dokuments zu übergeben, um zu ändern, wie wir es in einem RTF speichern.
RtfSaveOptions rtfSaveOptions = new RtfSaveOptions();

// Setzen Sie die Eigenschaft „SaveImagesAsWmf“ auf „true“, um alle Bilder im Dokument in WMF zu konvertieren, während wir es in RTF speichern.
// Dies hilft Lesern wie WordPad, unser Dokument zu lesen.
// Setzen Sie die Eigenschaft „SaveImagesAsWmf“ auf „false“, um das Originalformat aller Bilder im Dokument beizubehalten
// wie wir es in RTF speichern. Dadurch bleibt die Qualität der Bilder erhalten, allerdings auf Kosten der Kompatibilität mit älteren RTF-Readern.
rtfSaveOptions.SaveImagesAsWmf = saveImagesAsWmf;

doc.Save(ArtifactsDir + "RtfSaveOptions.SaveImagesAsWmf.rtf", rtfSaveOptions);

doc = new Document(ArtifactsDir + "RtfSaveOptions.SaveImagesAsWmf.rtf");

NodeCollection shapes = doc.GetChildNodes(NodeType.Shape, true);

if (saveImagesAsWmf)
{
    Assert.AreEqual(ImageType.Wmf, ((Shape)shapes[0]).ImageData.ImageType);
    Assert.AreEqual(ImageType.Wmf, ((Shape)shapes[1]).ImageData.ImageType);
}
else
{
    Assert.AreEqual(ImageType.Jpeg, ((Shape)shapes[0]).ImageData.ImageType);
    Assert.AreEqual(ImageType.Png, ((Shape)shapes[1]).ImageData.ImageType);
}
```

### Siehe auch

* class [RtfSaveOptions](../)
* namensraum [Aspose.Words.Saving](../../../aspose.words.saving/)
* Montage [Aspose.Words](../../../)
