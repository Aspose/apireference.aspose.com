---
title: DocSaveOptions.SaveFormat
linktitle: SaveFormat
articleTitle: SaveFormat
second_title: Aspose.Words for .NET
description: Discover the DocSaveOptions SaveFormat property to easily choose between Doc or Dot formats for seamless document saving. Optimize your workflow today!
type: docs
weight: 50
url: /net/aspose.words.saving/docsaveoptions/saveformat/
---
## DocSaveOptions.SaveFormat property

Specifies the format in which the document will be saved if this save options object is used. Can be Doc or Dot.

```csharp
public override SaveFormat SaveFormat { get; set; }
```

## Examples

Shows how to set save options for older Microsoft Word formats.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Write("Hello world!");

DocSaveOptions options = new DocSaveOptions(SaveFormat.Doc);

// Set a password which will protect the loading of the document by Microsoft Word or Aspose.Words.
// Note that this does not encrypt the contents of the document in any way.
options.Password = "MyPassword";

// If the document contains a routing slip, we can preserve it while saving by setting this flag to true.
options.SaveRoutingSlip = true;

doc.Save(ArtifactsDir + "DocSaveOptions.SaveAsDoc.doc", options);

// To be able to load the document,
// we will need to apply the password we specified in the DocSaveOptions object in a LoadOptions object.
Assert.Throws<IncorrectPasswordException>(() => doc = new Document(ArtifactsDir + "DocSaveOptions.SaveAsDoc.doc"));

LoadOptions loadOptions = new LoadOptions("MyPassword");
doc = new Document(ArtifactsDir + "DocSaveOptions.SaveAsDoc.doc", loadOptions);

Assert.That(doc.GetText().Trim(), Is.EqualTo("Hello world!"));
```

### See Also

* enum [SaveFormat](../../../aspose.words/saveformat/)
* class [DocSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
