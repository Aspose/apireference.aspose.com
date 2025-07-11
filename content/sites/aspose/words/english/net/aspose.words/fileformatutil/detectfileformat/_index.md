---
title: FileFormatUtil.DetectFileFormat
linktitle: DetectFileFormat
articleTitle: DetectFileFormat
second_title: Aspose.Words for .NET
description: Quickly identify document formats with FileFormatUtil's DetectFileFormat method. Get accurate format insights for efficient file management.
type: docs
weight: 30
url: /net/aspose.words/fileformatutil/detectfileformat/
---
## DetectFileFormat(*string*) {#detectfileformat_1}

Detects and returns the information about a format of a document stored in a disk file.

```csharp
public static FileFormatInfo DetectFileFormat(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | The file name. |

### Return Value

A [`FileFormatInfo`](../../fileformatinfo/) object that contains the detected information.

## Remarks

Even if this method detects the document format, it does not guarantee that the specified document is valid. This method only detects the document format by reading data that is sufficient for detection. To fully verify that a document is valid you need to load the document into a [`Document`](../../document/) object.

This method throws [`FileCorruptedException`](../../filecorruptedexception/) when the format is recognized, but the detection cannot complete because of corruption.

## Examples

Shows how to use the FileFormatUtil class to detect the document format and encryption.

```csharp
Document doc = new Document();

// Configure a SaveOptions object to encrypt the document
// with a password when we save it, and then save the document.
OdtSaveOptions saveOptions = new OdtSaveOptions(SaveFormat.Odt);
saveOptions.Password = "MyPassword";

doc.Save(ArtifactsDir + "File.DetectDocumentEncryption.odt", saveOptions);

// Verify the file type of our document, and its encryption status.
FileFormatInfo info = FileFormatUtil.DetectFileFormat(ArtifactsDir + "File.DetectDocumentEncryption.odt");

Assert.That(FileFormatUtil.LoadFormatToExtension(info.LoadFormat), Is.EqualTo(".odt"));
Assert.That(info.IsEncrypted, Is.True);
```

Shows how to use the FileFormatUtil class to detect the document format and presence of digital signatures.

```csharp
// Use a FileFormatInfo instance to verify that a document is not digitally signed.
FileFormatInfo info = FileFormatUtil.DetectFileFormat(MyDir + "Document.docx");

Assert.That(FileFormatUtil.LoadFormatToExtension(info.LoadFormat), Is.EqualTo(".docx"));
Assert.That(info.HasDigitalSignature, Is.False);

CertificateHolder certificateHolder = CertificateHolder.Create(MyDir + "morzal.pfx", "aw", null);
SignOptions signOptions = new SignOptions() { SignTime = DateTime.Now };
DigitalSignatureUtil.Sign(MyDir + "Document.docx", ArtifactsDir + "File.DetectDigitalSignatures.docx",
    certificateHolder, signOptions);

// Use a new FileFormatInstance to confirm that it is signed.
info = FileFormatUtil.DetectFileFormat(ArtifactsDir + "File.DetectDigitalSignatures.docx");

Assert.That(info.HasDigitalSignature, Is.True);

// We can load and access the signatures of a signed document in a collection like this.
Assert.That(DigitalSignatureUtil.LoadSignatures(ArtifactsDir + "File.DetectDigitalSignatures.docx").Count, Is.EqualTo(1));
```

### See Also

* class [FileFormatInfo](../../fileformatinfo/)
* class [FileFormatUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## DetectFileFormat(*Stream*) {#detectfileformat}

Detects and returns the information about a format of a document stored in a stream.

```csharp
public static FileFormatInfo DetectFileFormat(Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | The stream. |

### Return Value

A [`FileFormatInfo`](../../fileformatinfo/) object that contains the detected information.

## Remarks

The stream must be positioned at the beginning of the document.

When this method returns, the position in the stream is restored to the original position.

Even if this method detects the document format, it does not guarantee that the specified document is valid. This method only detects the document format by reading data that is sufficient for detection. To fully verify that a document is valid you need to load the document into a [`Document`](../../document/) object.

This method throws [`FileCorruptedException`](../../filecorruptedexception/) when the format is recognized, but the detection cannot complete because of corruption.

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

* class [FileFormatInfo](../../fileformatinfo/)
* class [FileFormatUtil](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
