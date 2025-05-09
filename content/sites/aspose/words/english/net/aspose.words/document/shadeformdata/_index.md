---
title: Document.ShadeFormData
linktitle: ShadeFormData
articleTitle: ShadeFormData
second_title: Aspose.Words for .NET
description: Discover how to use the ShadeFormData property to enhance form visibility with gray shading, improving user experience and accessibility.
type: docs
weight: 400
url: /net/aspose.words/document/shadeformdata/
---
## Document.ShadeFormData property

Specifies whether to turn on the gray shading on form fields.

```csharp
public bool ShadeFormData { get; set; }
```

## Examples

Shows how to apply gray shading to form fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Write("Hello world! ");
builder.InsertTextInput("My form field", TextFormFieldType.Regular, "",
    "Text contents of form field, which are shaded in grey by default.", 0);

// We can turn the grey shading off, so the bookmarked text will blend in with the other text.
doc.ShadeFormData = useGreyShading;
doc.Save(ArtifactsDir + "Document.ShadeFormData.docx");
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
