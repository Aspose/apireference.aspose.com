---
title: FieldSubject Class
linktitle: FieldSubject
articleTitle: FieldSubject
second_title: Aspose.Words for .NET
description: Discover the Aspose.Words.Fields.FieldSubject class for easy implementation of the SUBJECT field, enhancing document automation and formatting efficiency.
type: docs
weight: 2850
url: /net/aspose.words.fields/fieldsubject/
---
## FieldSubject class

Implements the SUBJECT field.

To learn more, visit the [Working with Fields](https://docs.aspose.com/words/net/working-with-fields/) documentation article.

```csharp
public class FieldSubject : Field
```

## Constructors

| Name | Description |
| --- | --- |
| [FieldSubject](fieldsubject/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DisplayResult](../../aspose.words.fields/field/displayresult/) { get; } | Gets the text that represents the displayed field result. |
| [End](../../aspose.words.fields/field/end/) { get; } | Gets the node that represents the field end. |
| [Format](../../aspose.words.fields/field/format/) { get; } | Gets a [`FieldFormat`](../fieldformat/) object that provides typed access to field's formatting. |
| [IsDirty](../../aspose.words.fields/field/isdirty/) { get; set; } | Gets or sets whether the current result of the field is no longer correct (stale) due to other modifications made to the document. |
| [IsLocked](../../aspose.words.fields/field/islocked/) { get; set; } | Gets or sets whether the field is locked (should not recalculate its result). |
| [LocaleId](../../aspose.words.fields/field/localeid/) { get; set; } | Gets or sets the LCID of the field. |
| [Result](../../aspose.words.fields/field/result/) { get; set; } | Gets or sets text that is between the field separator and field end. |
| [Separator](../../aspose.words.fields/field/separator/) { get; } | Gets the node that represents the field separator. Can be `null`. |
| [Start](../../aspose.words.fields/field/start/) { get; } | Gets the node that represents the start of the field. |
| [Text](../../aspose.words.fields/fieldsubject/text/) { get; set; } | Gets or sets the text of the subject. |
| virtual [Type](../../aspose.words.fields/field/type/) { get; } | Gets the Microsoft Word field type. |

## Methods

| Name | Description |
| --- | --- |
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/)() | Returns text between field start and field separator (or field end if there is no separator). Both field code and field result of child fields are included. |
| [GetFieldCode](../../aspose.words.fields/field/getfieldcode/)(*bool*) | Returns text between field start and field separator (or field end if there is no separator). |
| [Remove](../../aspose.words.fields/field/remove/)() | Removes the field from the document. Returns a node right after the field. If the field's end is the last child of its parent node, returns its parent paragraph. If the field is already removed, returns `null`. |
| [Unlink](../../aspose.words.fields/field/unlink/)() | Performs the field unlink. |
| [Update](../../aspose.words.fields/field/update/)() | Performs the field update. Throws if the field is being updated already. |
| [Update](../../aspose.words.fields/field/update/)(*bool*) | Performs a field update. Throws if the field is being updated already. |

## Remarks

Retrieves, and optionally sets, the document's subject, as recorded in the **Subject** property of the built-in document properties.

## Examples

Shows how to use the SUBJECT field.

```csharp
Document doc = new Document();

// Set a value for the document's "Subject" built-in property.
doc.BuiltInDocumentProperties.Subject = "My subject";

// Create a SUBJECT field to display the value of that built-in property.
DocumentBuilder builder = new DocumentBuilder(doc);
FieldSubject field = (FieldSubject)builder.InsertField(FieldType.FieldSubject, true);
field.Update();

Assert.That(field.GetFieldCode(), Is.EqualTo(" SUBJECT "));
Assert.That(field.Result, Is.EqualTo("My subject"));

// If we give the SUBJECT field's Text property value and update it, the field will
// overwrite the current value of the "Subject" built-in property with the value of its Text property,
// and then display the new value.
field.Text = "My new subject";
field.Update();

Assert.That(field.GetFieldCode(), Is.EqualTo(" SUBJECT  \"My new subject\""));
Assert.That(field.Result, Is.EqualTo("My new subject"));

Assert.That(doc.BuiltInDocumentProperties.Subject, Is.EqualTo("My new subject"));

doc.Save(ArtifactsDir + "Field.SUBJECT.docx");
```

### See Also

* class [Field](../field/)
* namespace [Aspose.Words.Fields](../../aspose.words.fields/)
* assembly [Aspose.Words](../../)
