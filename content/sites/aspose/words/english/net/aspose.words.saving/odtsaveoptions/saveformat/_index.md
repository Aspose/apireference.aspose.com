---
title: OdtSaveOptions.SaveFormat
linktitle: SaveFormat
articleTitle: SaveFormat
second_title: Aspose.Words for .NET
description: Discover how the OdtSaveOptions SaveFormat property lets you easily save documents in Odt or Ott formats, ensuring compatibility and flexibility.
type: docs
weight: 60
url: /net/aspose.words.saving/odtsaveoptions/saveformat/
---
## OdtSaveOptions.SaveFormat property

Specifies the format in which the document will be saved if this save options object is used. Can be Odt or Ott.

```csharp
public override SaveFormat SaveFormat { get; set; }
```

## Examples

Shows how to encrypt a saved ODT/OTT document with a password, and then load it using Aspose.Words.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Writeln("Hello world!");

// Create a new OdtSaveOptions, and pass either "SaveFormat.Odt",
// or "SaveFormat.Ott" as the format to save the document in. 
OdtSaveOptions saveOptions = new OdtSaveOptions(saveFormat);
saveOptions.Password = "@sposeEncrypted_1145";

string extensionString = FileFormatUtil.SaveFormatToExtension(saveFormat);

// If we open this document with an appropriate editor,
// it will prompt us for the password we specified in the SaveOptions object.
doc.Save(ArtifactsDir + "OdtSaveOptions.Encrypt" + extensionString, saveOptions);

FileFormatInfo docInfo = FileFormatUtil.DetectFileFormat(ArtifactsDir + "OdtSaveOptions.Encrypt" + extensionString);

Assert.That(docInfo.IsEncrypted, Is.True);

// If we wish to open or edit this document again using Aspose.Words,
// we will have to provide a LoadOptions object with the correct password to the loading constructor.
doc = new Document(ArtifactsDir + "OdtSaveOptions.Encrypt" + extensionString,
    new LoadOptions("@sposeEncrypted_1145"));

Assert.That(doc.GetText().Trim(), Is.EqualTo("Hello world!"));
```

### See Also

* enum [SaveFormat](../../../aspose.words/saveformat/)
* class [OdtSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
