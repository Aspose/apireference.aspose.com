---
title: FileFormatUtil.ExtensionToSaveFormat
linktitle: ExtensionToSaveFormat
articleTitle: ExtensionToSaveFormat
second_title: Aspose.Words for .NET
description: Effortlessly convert file name extensions to SaveFormat values with the FileFormatUtil ExtensionToSaveFormat method. Simplify your file management today!
type: docs
weight: 40
url: /net/aspose.words/fileformatutil/extensiontosaveformat/
---
## FileFormatUtil.ExtensionToSaveFormat method

Converts a file name extension into a [`SaveFormat`](../../saveformat/) value.

```csharp
public static SaveFormat ExtensionToSaveFormat(string extension)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extension | String | The file extension. Can be with or without a leading dot. Case-insensitive. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Throws if the parameter is `null`. |

## Remarks

If the extension cannot be recognized, returns Unknown.

## Examples

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

* enum [SaveFormat](../../saveformat/)
* class [FileFormatUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
