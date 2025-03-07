---
title: Field.IsDirty
linktitle: IsDirty
articleTitle: IsDirty
second_title: Aspose.Words for .NET
description: Manage the IsDirty property to ensure your field data stays accurate and up-to-date, enhancing document integrity and performance.
type: docs
weight: 40
url: /net/aspose.words.fields/field/isdirty/
---
## Field.IsDirty property

Gets or sets whether the current result of the field is no longer correct (stale) due to other modifications made to the document.

```csharp
public bool IsDirty { get; set; }
```

## Examples

Shows how to use special property for updating field result.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Give the document's built-in "Author" property value, and then display it with a field.
doc.BuiltInDocumentProperties.Author = "John Doe";
FieldAuthor field = (FieldAuthor)builder.InsertField(FieldType.FieldAuthor, true);

Assert.False(field.IsDirty);
Assert.AreEqual("John Doe", field.Result);

// Update the property. The field still displays the old value.
doc.BuiltInDocumentProperties.Author = "John & Jane Doe";

Assert.AreEqual("John Doe", field.Result);

// Since the field's value is out of date, we can mark it as "dirty".
// This value will stay out of date until we update the field manually with the Field.Update() method.
field.IsDirty = true;

using (MemoryStream docStream = new MemoryStream())
{
    // If we save without calling an update method,
    // the field will keep displaying the out of date value in the output document.
    doc.Save(docStream, SaveFormat.Docx);

    // The LoadOptions object has an option to update all fields
    // marked as "dirty" when loading the document.
    LoadOptions options = new LoadOptions();
    options.UpdateDirtyFields = updateDirtyFields;
    doc = new Document(docStream, options);

    Assert.AreEqual("John & Jane Doe", doc.BuiltInDocumentProperties.Author);

    field = (FieldAuthor)doc.Range.Fields[0];

    // Updating dirty fields like this automatically set their "IsDirty" flag to false.
    if (updateDirtyFields)
    {
        Assert.AreEqual("John & Jane Doe", field.Result);
        Assert.False(field.IsDirty);
    }
    else
    {
        Assert.AreEqual("John Doe", field.Result);
        Assert.True(field.IsDirty);
    }
}
```

### See Also

* class [Field](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)
