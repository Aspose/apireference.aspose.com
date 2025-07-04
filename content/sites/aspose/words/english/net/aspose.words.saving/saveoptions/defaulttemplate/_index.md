---
title: SaveOptions.DefaultTemplate
linktitle: DefaultTemplate
articleTitle: DefaultTemplate
second_title: Aspose.Words for .NET
description: Manage your SaveOptions with ease! Set or get the default template path and filename for streamlined document processing. Optimize your workflow today!
type: docs
weight: 40
url: /net/aspose.words.saving/saveoptions/defaulttemplate/
---
## SaveOptions.DefaultTemplate property

Gets or sets path to default template (including filename). Default value for this property is **empty string** (Empty).

```csharp
public string DefaultTemplate { get; set; }
```

## Remarks

If specified, this path is used to load template when [`AutomaticallyUpdateStyles`](../../../aspose.words/document/automaticallyupdatestyles/) is `true`, but [`AttachedTemplate`](../../../aspose.words/document/attachedtemplate/) is empty.

## Examples

Shows how to set a default template for documents that do not have attached templates.

```csharp
Document doc = new Document();

// Enable automatic style updating, but do not attach a template document.
doc.AutomaticallyUpdateStyles = true;

Assert.That(doc.AttachedTemplate, Is.EqualTo(string.Empty));

// Since there is no template document, the document had nowhere to track style changes.
// Use a SaveOptions object to automatically set a template
// if a document that we are saving does not have one.
SaveOptions options = SaveOptions.CreateSaveOptions("Document.DefaultTemplate.docx");
options.DefaultTemplate = MyDir + "Business brochure.dotx";

doc.Save(ArtifactsDir + "Document.DefaultTemplate.docx", options);
```

### See Also

* class [SaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)
