---
title: Document.OriginalFileName
linktitle: OriginalFileName
articleTitle: OriginalFileName
second_title: Aspose.Words for .NET
description: Retrieve the original file name of your document effortlessly with the Document OriginalFileName property. Enhance your workflow and organization today!
type: docs
weight: 300
url: /net/aspose.words/document/originalfilename/
---
## Document.OriginalFileName property

Gets the original file name of the document.

```csharp
public string OriginalFileName { get; }
```

## Remarks

Returns `null` if the document was loaded from a stream or created blank.

## Examples

Shows how to retrieve details of a document's load operation.

```csharp
Document doc = new Document(MyDir + "Document.docx");

Assert.That(doc.OriginalFileName, Is.EqualTo(MyDir + "Document.docx"));
Assert.That(doc.OriginalLoadFormat, Is.EqualTo(LoadFormat.Docx));
```

Shows how to use the FileFormatUtil methods to detect the format of a document.

```csharp
// Load a document from a file that is missing a file extension, and then detect its file format.
using (FileStream docStream = File.OpenRead(MyDir + "Word document with missing file extension"))
{
    FileFormatInfo info = FileFormatUtil.DetectFileFormat(docStream);
    LoadFormat loadFormat = info.LoadFormat;

    Assert.That(loadFormat, Is.EqualTo(LoadFormat.Doc));

    // Below are two methods of converting a LoadFormat to its corresponding SaveFormat.
    // 1 -  Get the file extension string for the LoadFormat, then get the corresponding SaveFormat from that string:
    string fileExtension = FileFormatUtil.LoadFormatToExtension(loadFormat);
    SaveFormat saveFormat = FileFormatUtil.ExtensionToSaveFormat(fileExtension);

    // 2 -  Convert the LoadFormat directly to its SaveFormat:
    saveFormat = FileFormatUtil.LoadFormatToSaveFormat(loadFormat);

    // Load a document from the stream, and then save it to the automatically detected file extension.
    Document doc = new Document(docStream);

    Assert.That(FileFormatUtil.SaveFormatToExtension(saveFormat), Is.EqualTo(".doc"));

    doc.Save(ArtifactsDir + "File.SaveToDetectedFileFormat" + FileFormatUtil.SaveFormatToExtension(saveFormat));
}
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
