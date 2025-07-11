---
title: FieldInfo.InfoType
linktitle: InfoType
articleTitle: InfoType
second_title: Aspose.Words for .NET
description: Discover how to manage FieldInfo InfoType properties effortlessly. Easily set or retrieve document types for seamless integration in your projects.
type: docs
weight: 20
url: /net/aspose.words.fields/fieldinfo/infotype/
---
## FieldInfo.InfoType property

Gets or sets the type of the document property to insert.

```csharp
public string InfoType { get; set; }
```

## Examples

Shows how to work with INFO fields.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Set a value for the "Comments" built-in property and then insert an INFO field to display that property's value.
doc.BuiltInDocumentProperties.Comments = "My comment";
FieldInfo field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.Update();

Assert.That(field.GetFieldCode(), Is.EqualTo(" INFO  Comments"));
Assert.That(field.Result, Is.EqualTo("My comment"));

builder.Writeln();

// Setting a value for the field's NewValue property and updating
// the field will also overwrite the corresponding built-in property with the new value.
field = (FieldInfo)builder.InsertField(FieldType.FieldInfo, true);
field.InfoType = "Comments";
field.NewValue = "New comment";
field.Update();

Assert.That(field.GetFieldCode(), Is.EqualTo(" INFO  Comments \"New comment\""));
Assert.That(field.Result, Is.EqualTo("New comment"));
Assert.That(doc.BuiltInDocumentProperties.Comments, Is.EqualTo("New comment"));

doc.Save(ArtifactsDir + "Field.INFO.docx");
```

### See Also

* class [FieldInfo](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
