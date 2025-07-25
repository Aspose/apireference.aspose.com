---
title: DocumentBuilder.MoveToField
linktitle: MoveToField
articleTitle: MoveToField
second_title: Aspose.Words for .NET
description: Effortlessly navigate your documents with the DocumentBuilder MoveToField method, allowing quick cursor movement to any field for enhanced editing efficiency.
type: docs
weight: 570
url: /net/aspose.words/documentbuilder/movetofield/
---
## DocumentBuilder.MoveToField method

Moves the cursor to a field in the document.

```csharp
public void MoveToField(Field field, bool isAfter)
```

| Parameter | Type | Description |
| --- | --- | --- |
| field | Field | The field to move the cursor to. |
| isAfter | Boolean | When `true`, moves the cursor to be after the field end. When `false`, moves the cursor to be before the field start. |

## Examples

Shows how to move a document builder's node insertion point cursor to a specific field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a field using the DocumentBuilder and add a run of text after it.
Field field = builder.InsertField(" AUTHOR \"John Doe\" ");

// The builder's cursor is currently at end of the document.
Assert.That(builder.CurrentNode, Is.Null);

// Move the cursor to the field while specifying whether to place that cursor before or after the field.
builder.MoveToField(field, moveCursorToAfterTheField);

// Note that the cursor is outside of the field in both cases.
// This means that we cannot edit the field using the builder like this.
// To edit a field, we can use the builder's MoveTo method on a field's FieldStart
// or FieldSeparator node to place the cursor inside.
if (moveCursorToAfterTheField)
{
    Assert.That(builder.CurrentNode, Is.Null);
    builder.Write(" Text immediately after the field.");

    Assert.That(doc.GetText().Trim(), Is.EqualTo("\u0013 AUTHOR \"John Doe\" \u0014John Doe\u0015 Text immediately after the field."));
}
else
{
    Assert.That(builder.CurrentNode, Is.EqualTo(field.Start));
    builder.Write("Text immediately before the field. ");

    Assert.That(doc.GetText().Trim(), Is.EqualTo("Text immediately before the field. \u0013 AUTHOR \"John Doe\" \u0014John Doe\u0015"));
}
```

### See Also

* class [Field](../../../aspose.words.fields/field/)
* class [DocumentBuilder](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
